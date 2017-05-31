package com.SkyELITE21.baybay_dsi;
import android.os.*;
import android.util.*;
import com.SkyELITE21.android.app.*;
import com.SkyELITE21.android.storage.Store;
import java.io.*;
import com.SkyELITE21.android.lang.*;
import android.content.res.*;

public class LocaleExtract
{
	private static String wholeLocale;
	private static InputStream is;
	private static int loc;
	Store store;
	public static void extract(Store store,Resources res,String pkg_name)
	{
		// TODO: Implement this method
		loc = store.getStoredInt("locale");
		if(loc==0 || loc==1)
		{
			is = res.openRawResource(R.raw.en_us);
			wholeLocale = getLocale(is);
		}
		else if(loc==2)
		{
			is = res.openRawResource(R.raw.tl_ph);
			wholeLocale = getLocale(is);
		}
		extractLocaleToPublic(pkg_name);
	}
	private static String getLocale(InputStream is)
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append((line + "\n"));
			}
		} catch (IOException e) {
			Log.w("LOG", e.getMessage());
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				Log.w("LOG", e.getMessage());
			}
		}
		return sb.toString();
	}

	private static void extractLocaleToPublic(String pkg_name)
	{
		FileWriter fw;
		BufferedWriter bw;
		try
		{
			fw = new FileWriter(getFile(pkg_name));
			bw = new BufferedWriter(fw);
			bw.write(wholeLocale);
			bw.close();
		}
		catch(IOException e)
		{}
	}
	private static File getDir(String pkg_name)
	{
		File dir,dir2,dir3,dir4,dir5;
		dir = new File(Environment.getExternalStorageDirectory(),"Android");
		dir2 = new File(dir,"data");
		dir3 = new File(dir2,pkg_name);
		if(dir3.exists() == false)dir3.mkdir();
		dir4 = new File(dir3,"files");
		if(dir4.exists() == false)dir4.mkdir();
		dir5 = new File(dir4,".language");
		if(dir5.exists() == false)dir5.mkdir();
		return dir5;
	}
	private static File getFile(String pkg_name)
	{
		File dir,file;
		dir = getDir(pkg_name);
		file = new File(dir,getName() + ".sld");
		try
		{
			if (file.exists() == false)file.createNewFile();
		}
		catch (IOException e)
		{}
		return file;
	}
	private static String getName()
	{
		String locale = null;
		if(loc == Locale.LOCALE_DEFAULT)
		{
			locale = "en_US";
		}
		else if(loc == Locale.LOCALE_EN_US)
		{
			locale = "default";
		}
		else if(loc == Locale.LOCALE_TL_PH)
		{
			locale = "tl_PH";
		}
		return locale;
	}
}
