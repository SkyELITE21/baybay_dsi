package com.SkyELITE21.android.storage;
import java.io.*;
import com.SkyELITE21.android.storage.utils.exceptions.*;
import com.SkyELITE21.android.storage.utils.*;

public class File extends java.io.File
{
	public File(java.io.File file, String file2)
	{
		super(file,file2);
	}
	public File(String file, String file2)
	{
		super(file,file2);
	}

	@Override
	public boolean createNewFile() throws EStore
	{
		EStore es = new EStore();
		boolean bool = false;
		try
		{
			if (super.createNewFile())
			{
				return bool = true;
			}
			else
			{
				bool = false;
				throw es;
			}
		}
		catch (IOException e)
		{}
		return bool;
	}
	
}
