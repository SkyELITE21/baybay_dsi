package com.SkyELITE21.gdx.storage;
import com.badlogic.gdx.files.*;
import com.badlogic.gdx.*;
import java.io.*;

public class Data
{
	public static final int DEFAULT = 0,CACHE = 1;
	private static final String EXTENSION = ".sdt";
	private static final int DATA = 2, SETTINGS = 3, TMP = 4, CUSTOM = 5;
	private String fileName,customPath,filePath,pkgName;
	private boolean hidden;
	public Data(String str,String pkg,int mode,boolean hidden)
	{
		this.fileName = str;
		this.pkgName = pkg;
		this.hidden = hidden;
		if(mode == DEFAULT)
		{
			filePath = "files";
		}
		else if(mode == CACHE)
		{
			filePath = "cache";
		}
		else if(mode == DATA)
		{
			filePath = "data";
		}
		else if(mode == SETTINGS)
		{
			filePath = "settings";
		}
		else if(mode == TMP)
		{
			filePath = "tmp";
		}
		this.customPath = null;
	}
	public Data(String str,String pkg,String dir,int mode, boolean hidden)
	{
		this.fileName = str;
		this.pkgName = pkg;
		this.customPath = dir;
		this.hidden = hidden;
		if(mode == DEFAULT)
		{
			filePath = "files";
		}
		else if(mode == CACHE)
		{
			filePath = "cache";
		}
		else if(mode == DATA)
		{
			filePath = "data";
		}
		else if(mode == SETTINGS)
		{
			filePath = "settings";
		}
		else if(mode == TMP)
		{
			filePath = "tmp";
		}
		else if(mode == CUSTOM)
		{
			filePath = dir;
		}
	}
	private FileHandle getFH()
	{
		Files files = Gdx.files;
		FileHandle dir, dir2, file;
		File dirf, dir2f, filef;
		dir = files.external(pkgName);
		dirf = dir.file();
		if(dirf.exists() == false)dirf.mkdir();
		dir2 = files.external(pkgName + "/" + filePath);
		dir2f = dir2.file();
		if(dir2f.exists() == false)dir2f.mkdir();
		if (hidden)
		{
			file = files.external(pkgName + "/" + filePath + "/." + fileName + EXTENSION);
			filef = file.file();
			try
			{
				if (filef.exists() == false)filef.createNewFile();
			}
			catch (IOException e)
			{}
			return file;
		}
		else
		{
			file = files.external(pkgName + "/" + filePath + "/" + fileName + EXTENSION);
			filef = file.file();
			try
			{
				if (filef.exists() == false)filef.createNewFile();
			}
			catch (IOException e)
			{}
			return file;
		}
	}
	private BufferedReader getReader()
	{
		return new BufferedReader(new InputStreamReader(getFH().read()));
	}
	private BufferedWriter getWriter()
	{
		return new BufferedWriter(new OutputStreamWriter(getFH().write(false)));
	}
	public void writeString(String str)
	{
		
	}
}
