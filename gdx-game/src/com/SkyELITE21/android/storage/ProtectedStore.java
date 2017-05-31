package com.SkyELITE21.android.storage;
import android.os.*;
import com.SkyELITE21.android.storage.utils.*;
import com.SkyELITE21.android.storage.utils.exceptions.*;
import com.SkyELITE21.android.storage.utils.interfaces.*;
import java.io.*;
import java.text.*;
import java.util.*;

public abstract class ProtectedStore implements IProtectedStore
{
	private Crypto crypto;
	private int TYPE;
	public final static double VERSION = 1.0;
	public final static String STRING = "§",INT = "*",LONG ="|",BOOLEAN ="?",
	SHORT = "`",BYTE = "~",FLOAT = "•",DOUBLE = "°",
	ARRAY = "∆";
	private String SAVE_NAME,PKG_NAME,EXTENSION = ".sps", head = "<sps version=\"" + VERSION + "\">"
	, end = "</sps>";
	public ProtectedStore(String pkg_name,String str,int type)
	{
		this.PKG_NAME = pkg_name;
		this.SAVE_NAME = str;
		this.TYPE = type;
		this.crypto = new Crypto();
	}

	private File getDir()
	{
		File dir1 = new File(Environment.getExternalStorageDirectory(),"Android");
		File dir2 = new File(dir1,"data");
		File dir3 = new File(dir2,PKG_NAME);
		File dir4 = new File(dir3,"files");
		File dir5 = new File(dir4,getNameByType(TYPE));
		if(dir3.exists() == false)
		{
			dir3.mkdir();
		}
		if(dir4.exists() == false)
		{
			dir4.mkdir();
		}
		if(dir5.exists() == false)
		{
			dir5.mkdir();
		}
		return dir5;
	}
	private File getFile() throws EStore
	{
		File file = new File(getDir(),SAVE_NAME + EXTENSION);
		if(file.exists() == false)
		{
			file.createNewFile();
			writeStart();
		}
		return file;
	}
	private void writeStart()
	{
		try
		{
			edit().write(edit().appendInNewLine(head, end));
		}
		catch (IOException e)
		{}
	}
	private String getNameByType(int type)
	{
		if(type == 0)
		{
			return "data";
		}
		else if(type == 1)
		{
			return "settings";
		}
		else if(type == 2)
		{
			return ".tmp";
		}
		else if(type == 3)
		{
			return ".cache";
		}
		else return null;
	}

	@Override
	public ProtectedStore.Editor edit()
	{
		// TODO: Implement this method
		try
		{
			return new Editor(getFile());
		}
		catch (EStore e)
		{
			return null;
		}
	}

	@Override
	public String getStoredString(String str)
	{
		String r = "",tag,fr = "";
		int i = head.length() + 1,length;
		tag = "<"+STRING+" name=\""+str+"\">";
		try
		{
			while(read(i).contains(tag) == false && read(i).contains(end) == false)
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
				String tmp = r.substring(r.indexOf("<"+STRING+" name=\""+str+"\">") + str.length() + 11,r.indexOf("</"+STRING+">"));
				return fr = crypto.decrypt(tmp);
			}
		}
		catch (IOException e)
		{}
		return fr;
	}

	@Override
	public int getStoredInt(String str)
	{
		String r = null,tag;
		int fr = 0;
		int i = head.length() + 1,length;
		tag = "<"+INT+" name=\""+str+"\">";
		try
		{
			while(read(i).contains(tag) == false && read(i).contains(end) == false)
			{
				length = read(i).length() + 1;
				i = i + length;
			}
			r =  read(i);
			if(r.contains(end))
			{
				return fr = 0;
			}
			else
			{
				String tmp = r.substring(r.indexOf("<"+INT+" name=\""+str+"\">") + str.length() + 11,r.indexOf("</"+INT+">"));
				return fr = Integer.parseInt(crypto.decrypt(tmp));
			}
		}
		catch (IOException e)
		{}
		return fr;
	}

	@Override
	public boolean getStoredBoolean(String str)
	{
		String r = null,tag;
		boolean fr = false;
		int i = head.length() + 1,length;
		tag = "<"+BOOLEAN+" name=\""+str+"\">";
		try
		{
			while(read(i).contains(tag) == false && read(i).contains(end) == false)
			{
				length = read(i).length() + 1;
				i = i + length;
			}
			r =  read(i);
			if(r.contains(end))
			{
				return fr = false;
			}
			else
			{
				String tmp = r.substring(r.indexOf("<"+BOOLEAN+" name=\""+str+"\">") + str.length() + 11,r.indexOf("</"+BOOLEAN+">"));
				return fr = Boolean.parseBoolean(crypto.decrypt(tmp));
			}
		}
		catch (IOException e)
		{}
		return fr;
	}

	@Override
	public long getStoredLong(String str)
	{
		String r = null,tag;
		long fr = 0;
		int i = head.length() + 1,length;
		tag = "<"+LONG+" name=\""+str+"\">";
		try
		{
			while(read(i).contains(tag) == false && read(i).contains(end) == false)
			{
				length = read(i).length() + 1;
				i = i + length;
			}
			r =  read(i);
			if(r.contains(end))
			{
				return fr = 0;
			}
			else
			{
				String tmp = r.substring(r.indexOf("<"+LONG+" name=\""+str+"\">") + str.length() + 11,r.indexOf("</"+LONG+">"));
				return fr = Long.parseLong(crypto.decrypt(tmp));
			}
		}
		catch (IOException e)
		{}
		return fr;
	}

	@Override
	public short getStoredShort(String str)
	{
		String r = null,tag;
		short fr = 0;
		int i = head.length() + 1,length;
		tag = "<"+SHORT+" name=\""+str+"\">";
		try
		{
			while(read(i).contains(tag) == false && read(i).contains(end) == false)
			{
				length = read(i).length() + 1;
				i = i + length;
			}
			r =  read(i);
			if(r.contains(end))
			{
				return fr = 0;
			}
			else
			{
				String tmp = r.substring(r.indexOf("<"+SHORT+" name=\""+str+"\">") + str.length() + 11,r.indexOf("</"+SHORT+">"));
				return fr = Short.parseShort(crypto.decrypt(tmp));
			}
		}
		catch (IOException e)
		{}
		return fr;
	}

	@Override
	public byte getStoredByte(String str)
	{
		String r = null,tag;
		byte fr = 0;
		int i = head.length() + 1,length;
		tag = "<"+BYTE+" name=\""+str+"\">";
		try
		{
			while(read(i).contains(tag) == false && read(i).contains(end) == false)
			{
				length = read(i).length() + 1;
				i = i + length;
			}
			r =  read(i);
			if(r.contains(end))
			{
				return fr = 0;
			}
			else
			{
				String tmp = r.substring(r.indexOf("<"+BYTE+" name=\""+str+"\">") + str.length() + 11,r.indexOf("</"+BYTE+">"));
				return fr = Byte.parseByte(crypto.decrypt(tmp));
			}
		}
		catch (IOException e)
		{}
		return fr;
	}

	@Override
	public float getStoredFloat(String str)
	{
		String r = null,tag;
		float fr = 0;
		int i = head.length() + 1,length;
		tag = "<"+FLOAT+" name=\""+str+"\">";
		try
		{
			while(read(i).contains(tag) == false && read(i).contains(end) == false)
			{
				length = read(i).length() + 1;
				i = i + length;
			}
			r =  read(i);
			if(r.contains(end))
			{
				return fr = 0;
			}
			else
			{
				String tmp = r.substring(r.indexOf("<"+FLOAT+" name=\""+str+"\">") + str.length() + 11,r.indexOf("</"+FLOAT+">"));
				return fr = Float.parseFloat(crypto.decrypt(tmp));
			}
		}
		catch (IOException e)
		{}
		return fr;
	}

	@Override
	public double getStoredDouble(String str)
	{
		String r = null,tag;
		double fr = 0;
		int i = head.length() + 1,length;
		tag = "<"+DOUBLE+" name=\""+str+"\">";
		try
		{
			while(read(i).contains(tag) == false && read(i).contains(end) == false)
			{
				length = read(i).length() + 1;
				i = i + length;
			}
			r =  read(i);
			if(r.contains(end))
			{
				return fr = 0;
			}
			else
			{
				String tmp = r.substring(r.indexOf("<"+DOUBLE+" name=\""+str+"\">") + str.length() + 11,r.indexOf("</"+DOUBLE+">"));
				return fr = Double.parseDouble(crypto.decrypt(tmp));
			}
		}
		catch (IOException e)
		{}
		return fr;
	}

	@Override
	public String[] getStoredStringArray(String str)
	{
		String r = null,tag,endtag,separator,a = "";
		String[] fr = {};
		int i = head.length() + 1,length;
		tag = "<"+ARRAY+" name=\""+str+"\">";
		separator = ARRAY + ",";
		endtag = "</" + ARRAY + ">";
		try
		{
			while(read(i).contains(tag) == false && read(i).contains(end) == false)
			{
				length = read(i).length() + 1;
				i = i + length;
			}
			r =  read(i);
			if(r.contains(end))
			{
				return fr = new String[]{};
			}
			else
			{
				r = r.substring(r.indexOf("<"+ARRAY+" name=\""+str+"\">") + str.length() + 11,r.indexOf("</"+ARRAY+">"));
				StringCharacterIterator sci = new StringCharacterIterator(r);
				sci.setIndex(r.indexOf(tag) + tag.length() + separator.length());
				ArrayList<String> ars = new ArrayList();
				int nindex = 0;
				while((sci.getIndex() == r.indexOf(endtag)) == false)
				{
					while(String.valueOf(sci.current()).equals(ARRAY) == false)
					{
						nindex = sci.getIndex() + 1;
						if(a.length() > 0)a = edit().append(a,String.valueOf(sci.current()));
						else a = String.valueOf(sci.current());
						sci.setIndex(nindex);
					}
					ars.add(a);
				}
				return fr = (String[]) ars.toArray();
			}
		}
		catch (IOException e)
		{}
		return fr;
	}
	private FileReader getFileReader() throws EStore, FileNotFoundException
	{
		return new FileReader(getFile());
	}
	private BufferedReader getBufferedReader()
	{
		BufferedReader br = null;
		try
		{
			return new BufferedReader(getFileReader());
		}
		catch (FileNotFoundException e)
		{ return br; }
		catch (EStore e)
		{ return br; }
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

	public class Editor implements IEditor
	{
		private File FILE;
		public Editor(File file)
		{
			this.FILE = file;
		}
		@Override
		public void storeString(String str, String str2)
		{
			// TODO: Implement this method
			String a = "",b = "<" + STRING + " name=\"" + str + "\">",str3 = "<" + STRING + " name=\"" + str + "\">" + crypto.encrypt(str2) + "</" + STRING + ">";
			try
			{
				int length = head.length();
				long i = length + 1,skip;
				if(read(0).contains(head) && read(i).contains(end))
				{
					String c =  appendInNewLine(head,str3);
					write(appendInNewLine(c,end));
				}
				else
				{
					while(read(i).equals(end) == false)
					{
						skip = read(i).length() + 1;
						if(i>0 && read(i).contains(b) == false)
						{
							if(a.length()>0)a = appendInNewLine(a,read(i));
							else a = read(i);
							i = i + skip;
						}
						else if(i>0 && read(i).contains(b) == true)
						{
							if(a.length()>0)a = appendInNewLine(a,str3);
							else a = str3;
							i = i + skip;
						}
					}
					if(a.contains(b)==true)
					{
						String c = appendInNewLine(head,a);
						write(appendInNewLine(c,end));
					}
					else
					{
						String c = appendInNewLine(head,a);
						String d = appendInNewLine(c,str3);
						write(appendInNewLine(d,end));
					}
				}
			}
			catch (IOException e)
			{}
		}

		@Override
		public void storeInt(String str, int p0)
		{
			String a = "",b = "<" + INT + " name=\"" + str + "\">",str3 = "<" + INT + " name=\"" + str + "\">" + crypto.encrypt(String.valueOf(p0)) + "</" + INT + ">";
			try
			{
				int length = head.length();
				long i = length + 1,skip;
				if(read(0).contains(head) && read(i).contains(end))
				{
					String c =  appendInNewLine(head,str3);
					write(appendInNewLine(c,end));
				}
				else
				{
					while(read(i).equals(end) == false)
					{
						skip = read(i).length() + 1;
						if(i>0 && read(i).contains(b) == false)
						{
							if(a.length()>0)a = appendInNewLine(a,read(i));
							else a = read(i);
							i = i + skip;
						}
						else if(i>0 && read(i).contains(b) == true)
						{
							if(a.length()>0)a = appendInNewLine(a,str3);
							else a = str3;
							i = i + skip;
						}
					}
					if(a.contains(b)==true)
					{
						String c = appendInNewLine(head,a);
						write(appendInNewLine(c,end));
					}
					else
					{
						String c = appendInNewLine(head,a);
						String d = appendInNewLine(c,str3);
						write(appendInNewLine(d,end));
					}
				}
			}
			catch (IOException e)
			{}
		}

		@Override
		public void storeBoolean(String str, boolean bool)
		{
			String a = "",b = "<" + BOOLEAN + " name=\"" + str + "\">",str3 = "<" + BOOLEAN + " name=\"" + str + "\">" + crypto.encrypt(String.valueOf(bool)) + "</" + BOOLEAN + ">";
			try
			{
				int length = head.length();
				long i = length + 1,skip;
				if(read(0).contains(head) && read(i).contains(end))
				{
					String c =  appendInNewLine(head,str3);
					write(appendInNewLine(c,end));
				}
				else
				{
					while(read(i).equals(end) == false)
					{
						skip = read(i).length() + 1;
						if(i>0 && read(i).contains(b) == false)
						{
							if(a.length()>0)a = appendInNewLine(a,read(i));
							else a = read(i);
							i = i + skip;
						}
						else if(i>0 && read(i).contains(b) == true)
						{
							if(a.length()>0)a = appendInNewLine(a,str3);
							else a = str3;
							i = i + skip;
						}
					}
					if(a.contains(b)==true)
					{
						String c = appendInNewLine(head,a);
						write(appendInNewLine(c,end));
					}
					else
					{
						String c = appendInNewLine(head,a);
						String d = appendInNewLine(c,str3);
						write(appendInNewLine(d,end));
					}
				}
			}
			catch (IOException e)
			{}
		}

		@Override
		public void storeLong(String str, long p0)
		{
			String a = "",b = "<" + LONG + " name=\"" + str + "\">",str3 = "<" + LONG + " name=\"" + str + "\">" + crypto.encrypt(String.valueOf(p0)) + "</" + LONG + ">";
			try
			{
				int length = head.length();
				long i = length + 1,skip;
				if(read(0).contains(head) && read(i).contains(end))
				{
					String c =  appendInNewLine(head,str3);
					write(appendInNewLine(c,end));
				}
				else
				{
					while(read(i).equals(end) == false)
					{
						skip = read(i).length() + 1;
						if(i>0 && read(i).contains(b) == false)
						{
							if(a.length()>0)a = appendInNewLine(a,read(i));
							else a = read(i);
							i = i + skip;
						}
						else if(i>0 && read(i).contains(b) == true)
						{
							if(a.length()>0)a = appendInNewLine(a,str3);
							else a = str3;
							i = i + skip;
						}
					}
					if(a.contains(b)==true)
					{
						String c = appendInNewLine(head,a);
						write(appendInNewLine(c,end));
					}
					else
					{
						String c = appendInNewLine(head,a);
						String d = appendInNewLine(c,str3);
						write(appendInNewLine(d,end));
					}
				}
			}
			catch (IOException e)
			{}
		}

		@Override
		public void storeShort(String str, short p0)
		{
			String a = "",b = "<" + SHORT + " name=\"" + str + "\">",str3 = "<" + SHORT + " name=\"" + str + "\">" + crypto.encrypt(String.valueOf(p0)) + "</" + SHORT + ">";
			try
			{
				int length = head.length();
				long i = length + 1,skip;
				if(read(0).contains(head) && read(i).contains(end))
				{
					String c =  appendInNewLine(head,str3);
					write(appendInNewLine(c,end));
				}
				else
				{
					while(read(i).equals(end) == false)
					{
						skip = read(i).length() + 1;
						if(i>0 && read(i).contains(b) == false)
						{
							if(a.length()>0)a = appendInNewLine(a,read(i));
							else a = read(i);
							i = i + skip;
						}
						else if(i>0 && read(i).contains(b) == true)
						{
							if(a.length()>0)a = appendInNewLine(a,str3);
							else a = str3;
							i = i + skip;
						}
					}
					if(a.contains(b)==true)
					{
						String c = appendInNewLine(head,a);
						write(appendInNewLine(c,end));
					}
					else
					{
						String c = appendInNewLine(head,a);
						String d = appendInNewLine(c,str3);
						write(appendInNewLine(d,end));
					}
				}
			}
			catch (IOException e)
			{}
		}

		@Override
		public void storeByte(String str, byte p0)
		{
			String a = "",b = "<" + BYTE + " name=\"" + str + "\">",str3 = "<" + BYTE + " name=\"" + str + "\">" + crypto.encrypt(String.valueOf(p0)) + "</" + BYTE + ">";
			try
			{
				int length = head.length();
				long i = length + 1,skip;
				if(read(0).contains(head) && read(i).contains(end))
				{
					String c =  appendInNewLine(head,str3);
					write(appendInNewLine(c,end));
				}
				else
				{
					while(read(i).equals(end) == false)
					{
						skip = read(i).length() + 1;
						if(i>0 && read(i).contains(b) == false)
						{
							if(a.length()>0)a = appendInNewLine(a,read(i));
							else a = read(i);
							i = i + skip;
						}
						else if(i>0 && read(i).contains(b) == true)
						{
							if(a.length()>0)a = appendInNewLine(a,str3);
							else a = str3;
							i = i + skip;
						}
					}
					if(a.contains(b)==true)
					{
						String c = appendInNewLine(head,a);
						write(appendInNewLine(c,end));
					}
					else
					{
						String c = appendInNewLine(head,a);
						String d = appendInNewLine(c,str3);
						write(appendInNewLine(d,end));
					}
				}
			}
			catch (IOException e)
			{}
		}

		@Override
		public void storeFloat(String str, float p0)
		{
			String a = "",b = "<" + FLOAT + " name=\"" + str + "\">",str3 = "<" + FLOAT + " name=\"" + str + "\">" + crypto.encrypt(String.valueOf(p0)) + "</" + FLOAT + ">";
			try
			{
				int length = head.length();
				long i = length + 1,skip;
				if(read(0).contains(head) && read(i).contains(end))
				{
					String c =  appendInNewLine(head,str3);
					write(appendInNewLine(c,end));
				}
				else
				{
					while(read(i).equals(end) == false)
					{
						skip = read(i).length() + 1;
						if(i>0 && read(i).contains(b) == false)
						{
							if(a.length()>0)a = appendInNewLine(a,read(i));
							else a = read(i);
							i = i + skip;
						}
						else if(i>0 && read(i).contains(b) == true)
						{
							if(a.length()>0)a = appendInNewLine(a,str3);
							else a = str3;
							i = i + skip;
						}
					}
					if(a.contains(b)==true)
					{
						String c = appendInNewLine(head,a);
						write(appendInNewLine(c,end));
					}
					else
					{
						String c = appendInNewLine(head,a);
						String d = appendInNewLine(c,str3);
						write(appendInNewLine(d,end));
					}
				}
			}
			catch (IOException e)
			{}
		}

		@Override
		public void storeDouble(String str, double p0)
		{
			String a = "",b = "<" + DOUBLE + " name=\"" + str + "\">",str3 = "<" + DOUBLE + " name=\"" + str + "\">" + crypto.encrypt(String.valueOf(p0)) + "</" + DOUBLE + ">";
			try
			{
				int length = head.length();
				long i = length + 1,skip;
				if(read(0).contains(head) && read(i).contains(end))
				{
					String c =  appendInNewLine(head,str3);
					write(appendInNewLine(c,end));
				}
				else
				{
					while(read(i).equals(end) == false)
					{
						skip = read(i).length() + 1;
						if(i>0 && read(i).contains(b) == false)
						{
							if(a.length()>0)a = appendInNewLine(a,read(i));
							else a = read(i);
							i = i + skip;
						}
						else if(i>0 && read(i).contains(b) == true)
						{
							if(a.length()>0)a = appendInNewLine(a,str3);
							else a = str3;
							i = i + skip;
						}
					}
					if(a.contains(b)==true)
					{
						String c = appendInNewLine(head,a);
						write(appendInNewLine(c,end));
					}
					else
					{
						String c = appendInNewLine(head,a);
						String d = appendInNewLine(c,str3);
						write(appendInNewLine(d,end));
					}
				}
			}
			catch (IOException e)
			{}
		}

		@Override
		public void storeStringArray(String str, String[] str2)
		{
			String a = "",b = "<" + ARRAY + " name=\"" + str + "\">",aa = "",separator = ARRAY + ",";
			int al = 0;
			while(al < str2.length)
			{
				if(aa.length() > 0)
					aa = append(aa,append(separator,str2[al]));
				else aa = append(separator,str2[al]);
				al++;
			}
			String str3 = aa;
			String str4 = "<" + ARRAY + " name=\"" + str + "\">" + str3 + "</" + ARRAY + ">";
			try
			{
				int length = head.length();
				long i = length + 1,skip;
				if(read(0).contains(head) && read(i).contains(end))
				{
					String c =  appendInNewLine(head,str4);
					write(appendInNewLine(c,end));
				}
				else
				{
					while(read(i).equals(end) == false)
					{
						skip = read(i).length() + 1;
						if(i>0 && read(i).contains(b) == false)
						{
							if(a.length()>0)a = appendInNewLine(a,read(i));
							else a = read(i);
							i = i + skip;
						}
						else if(i>0 && read(i).contains(b) == true)
						{
							if(a.length()>0)a = appendInNewLine(a,str4);
							else a = read(i);
							i = i + skip;
						}
					}
					if(a.contains(b)==true)
					{
						String c = appendInNewLine(head,a);
						write(appendInNewLine(c,end));
					}
					else
					{
						String c = appendInNewLine(head,a);
						String d = appendInNewLine(c,str4);
						write(appendInNewLine(d,end));
					}
				}
			}
			catch (IOException e)
			{}
		}
		
		public void removeStored(String type,String str)
		{
			String a = "",b = "<" + type + " name=\"" + str + "\">";
			try
			{
				int length = head.length();
				long i = length + 1,skip;
				if(read(0).contains(head) && read(i).contains(end))
				{
					String c =  appendInNewLine(head,end);
					write(c);
				}
				else
				{
					while(read(i).equals(end) == false)
					{
						skip = read(i).length() + 1;
						if(i>0 && read(i).contains(b) == false)
						{
							if(a.length()>0)a = appendInNewLine(a,read(i));
							else a = read(i);
							i = i + skip;
						}
						else if(i>0 && read(i).contains(b) == true)
						{
							i = i + skip;
						}
					}
					String c = appendInNewLine(head,a);
					String d = appendInNewLine(c,end);
					write(d);
				}
			}
			catch (IOException e)
			{}
		}

		private FileWriter getFileWriter() throws IOException
		{
			return new FileWriter(FILE);
		}
		private BufferedWriter getBufferedWriter() throws IOException
		{
			return new BufferedWriter(getFileWriter());
		}
		private String append(String str, String str2)
		{
			return str + str2;
		}
		private String appendInNewLine(String str, String str2)
		{
			return str + "\n" + str2;
		}
		private void write(String obj) throws IOException
		{
			BufferedWriter bw = getBufferedWriter();
			bw.write(obj);
			bw.close();
		}
	}
}
