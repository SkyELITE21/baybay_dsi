package com.SkyELITE21.android.storage.utils;
import com.SkyELITE21.android.storage.utils.interfaces.*;
import java.util.zip.*;
import com.SkyELITE21.android.storage.*;
import com.SkyELITE21.android.storage.utils.exceptions.*;
import java.io.*;

public class Zip extends ZipFile implements IZip
{
	private com.SkyELITE21.android.storage.File FILE;
	public Zip(com.SkyELITE21.android.storage.File file) throws IOException
	{
		super(file);
		this.FILE = file;
	}

	public ZipEntry getEntry()
	{
		return super.getEntry(getName());
	}

	public InputStream getInputStream() throws IOException
	{
		// TODO: Implement this method
		return super.getInputStream(getEntry());
	}

	@Override
	public com.SkyELITE21.android.storage.File compress() throws EStore
	{
		OutputStream os = ;
		try
		{
			FileOutputStream fos = new FileOutputStream(FILE);
			os = fos;
		}
		catch (FileNotFoundException e)
		{}
		ZipOutputStream zos = new ZipOutputStream(os);
		return null;
	}

	@Override
	public com.SkyELITE21.android.storage.File decompress() throws EStore
	{
		// TODO: Implement this method
		return null;
	}
	
}
