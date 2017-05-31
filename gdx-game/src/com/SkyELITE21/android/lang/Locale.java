package com.SkyELITE21.android.lang;

import android.content.*;
import android.content.res.*;
import java.io.*;
import android.util.*;
import android.os.*;
/* In using Locale. You must extract it first to public storage.
Not extracting it will result to translation error!*/
public abstract class Locale
{
	public static final int LOCALE_EN_US = 1, LOCALE_TL_PH = 2;
	private static int loc;
	public final static double VERSION = 1.0;
	private static String PKG_NAME,head = "<sld version=\"" + VERSION + "\">"
	, end = "</sld>";

	public static final int LOCALE_DEFAULT = 0;
	public Locale(String pkg,int locale)
	{
		this.PKG_NAME = pkg;
		this.loc = locale;
	}
	
	private File getDir()
	{
		File dir,dir2,dir3,dir4,dir5;
		dir = new File(Environment.getExternalStorageDirectory(),"Android");
		dir2 = new File(dir,"data");
		dir3 = new File(dir2,PKG_NAME);
		if(dir3.exists() == false)dir3.mkdir();
		dir4 = new File(dir3,"files");
		if(dir4.exists() == false)dir4.mkdir();
		dir5 = new File(dir4,".language");
		if(dir5.exists() == false)dir5.mkdir();
		return dir5;
	}
	private File getFile()
	{
		File dir,file;
		dir = getDir();
		file = new File(dir,getName() + ".sld");
		try
		{
			if (file.exists() == false)file.createNewFile();
		}
		catch (IOException e)
		{}
		return file;
	}
	private String getName()
	{
		String locale = null;
		if(loc == LOCALE_EN_US)
		{
			locale = "en_US";
		}
		else if(loc == LOCALE_TL_PH)
		{
			locale = "tl_PH";
		}
		return locale;
	}
	private BufferedReader getBufferedReader() throws IOException
	{
		return new BufferedReader(new FileReader(getFile()));
	}
	private String read(long p0) throws IOException
	{
		String c = ;
		BufferedReader br = getBufferedReader();
		if(p0 == 0)
		{
			c = br.readLine();
			br.close();
		}
		else
		{
			br.skip(p0);
			c = br.readLine();
			br.close();
		}
		return c;
	}
	public String translate(String str)
	{
		String r = "",headtag,fr = "";
		int i = head.length() + 1,length;
		headtag = "<£" + " name=\""+str+"\">";
		try
		{
			while(read(i).contains(headtag) == false && read(i).contains(end) == false)
			{
				length = read(i).length() + 1;
				i = i + length;
			}
			r =  read(i);
			if(r.contains(end))
			{
				return fr = "";
			}
			else
			{
				return fr = r.substring(r.indexOf(headtag) + str.length() + 11,r.indexOf("</£>"));
			}
		}
		catch (IOException e)
		{}
		return fr;
	}
}
