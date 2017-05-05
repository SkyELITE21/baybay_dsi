package com.SkyELITE21.sdf;

import android.util.*;
import java.io.*;
import java.util.*;
import org.xmlpull.v1.*;
import android.os.*;
import java.util.logging.*;
import javax.xml.*;

public class DataSaver
{
	private String save_name,app_dir;
	private int mode,type;
	public static final int MODE_INTERNAL = 0,MODE_APP = 1, MODE_EXTERNAL = 2,TYPE_DATA = 0,TYPE_SETTINGS = 1,TYPE_CACHE = 2;
	public DataSaver(String app_dir,int type,String save_name,int mode)
	{
		this.save_name = save_name;
		this.app_dir = app_dir;
		this.mode = mode;
		this.type = type;
	}
	private File getDir()
	{
		File dir = null,dir2 = null,dir3 = null;
		if(mode == MODE_INTERNAL)
		{
			dir = new File(Environment.getExternalStorageDirectory(),app_dir);
			if(dir.exists() == false)
			{
				dir.mkdir();
			}
		}
		else if(mode == MODE_APP)
		{
			dir = new File(Environment.getDataDirectory(),app_dir);
			if(dir.exists() == false)
			{
				dir.mkdir();
			}
		}
		else if(mode == MODE_EXTERNAL)
		{
			dir = new File(Environment.getExternalStoragePublicDirectory(Environment.MEDIA_MOUNTED),app_dir);
			if(dir.exists() == false)
			{
				dir.mkdir();
			}
		}
		dir2 = new File(dir,"files");
		if(dir2.exists() == false)
		{
			dir2.mkdir();
		}
		if(type == TYPE_DATA)
		{
			dir3 = new File(dir2,"data");
			if(dir3.exists() == false)
			{
				dir3.mkdir();
			}
			return dir3;
		}
		else if(type == TYPE_CACHE)
		{
			dir3 = new File(dir2,"cache");
			if(dir3.exists() == false)
			{
				dir3.mkdir();
			}
			return dir3;
		}
		else if(type == TYPE_SETTINGS)
		{
			dir3 = new File(dir2,"settings");
			if(dir3.exists() == false)
			{
				dir3.mkdir();
			}
			return dir3;
		}
		return dir3;
	}
	private File getFile()throws IOException
	{
		File file = new File(getDir(),save_name + ".xml");
		if(file.exists() == false)
		{
			file.createNewFile();
		}
		return file;
	}
	private InputStream getInputStream() throws IOException
	{
		FileInputStream fis = new FileInputStream(getFile());
		InputStream is = fis;
		return is;
	}
	public String getStringValue(String tag,String id) throws XmlPullParserException,IOException
	{
		return parseXml(getInputStream(),tag,id);
	}
	public int getIntValue(String tag,String id) throws XmlPullParserException,IOException
	{
		return Integer.parseInt(parseXml(getInputStream(),tag,id));
	}
	public boolean getBooleanValue(String tag,String id) throws XmlPullParserException,IOException
	{
		return Boolean.parseBoolean(parseXml(getInputStream(),tag,id));
	}
	public long getLongValue(String tag,String id) throws XmlPullParserException, IOException
	{
		return Long.parseLong(parseXml(getInputStream(),tag,id));
	}
	public short getShortValue(String tag,String id) throws XmlPullParserException, IOException
	{
		return Short.parseShort(parseXml(getInputStream(),tag,id));
	}
	public double getDoubleValue(String tag,String id) throws XmlPullParserException, IOException
	{
		return Double.parseDouble(parseXml(getInputStream(),tag,id));
	}
	public float getFloatValue(String tag,String id) throws XmlPullParserException, IOException
	{
		return Float.parseFloat(parseXml(getInputStream(),tag,id));
	}
	public byte getByteValue(String tag,String id) throws XmlPullParserException, IOException
	{
		return Byte.parseByte(parseXml(getInputStream(),tag,id));
	}
	
	private String parseXml(InputStream in,String tag, String id)throws XmlPullParserException, IOException {
		try {
			XmlPullParser parser = Xml.newPullParser();
			parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
			parser.setInput(in, null);
			parser.nextTag();
			return readBlock(parser,tag,id);
		} finally {
			in.close();
		}
	}
	private String readBlock(XmlPullParser parser, String tag, String id) throws XmlPullParserException, IOException {
		String block = null,ns = null;
		parser.require(XmlPullParser.START_TAG, ns, tag);
		while (parser.next() != XmlPullParser.END_TAG)
		{
			if (parser.getEventType() != XmlPullParser.START_TAG) {
				continue;
			}
			String name = parser.getName();
			// Starts by looking for the entry tag
			if (name.equals("value")) {
				block = readValue(parser,id);
			} else {
				skip(parser);
			}
			
		}
		return block;
	}
	private String readValue(XmlPullParser parser,String id) throws XmlPullParserException, IOException
	{
		String value = null, id_value, next_tag;
		id_value = parser.getAttributeValue(null,"id");
		if(id_value == id)
		value = readText(parser);
		else while(id_value != id)
		{
			parser.nextTag();
			next_tag = parser.getName();
			if(next_tag.equals("value"))readValue(parser,id);
			else continue;
		}
		return value;
	}
	private String readText(XmlPullParser parser) throws IOException, XmlPullParserException {
		String result = "";
		if (parser.next() == XmlPullParser.TEXT) {
			result = parser.getText();
			parser.nextTag();
		}
		return result;
	}
	private void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
		if (parser.getEventType() != XmlPullParser.START_TAG) {
			throw new IllegalStateException();
		}
		int depth = 1;
		while (depth != 0) {
			switch (parser.next()) {
				case XmlPullParser.END_TAG:
					depth--;
					break;
				case XmlPullParser.START_TAG:
					depth++;
					break;
			}
		}
	}
	private String readLine(int pos) throws IOException
	{
		FileReader fr = new FileReader(getFile());
		BufferedReader br = new BufferedReader(fr);
		String line1,a[];
		if(pos == 0)
		{
			line1 =  br.readLine();
			br.close();
			return line1;
		}
		else 
		{
			a = (String[]) br.lines().toArray();
			br.close();
			return line1 = a[pos];
		}
	}
	public void saveValue(String tag, String id, String value)throws IOException
	{
		String xml_tag,start_tag,end_tag;
		xml_tag = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		start_tag = "<" + tag + ">";
		end_tag = "</" + tag + ">";
		FileWriter fw = new FileWriter(getFile());
		BufferedWriter bw = new BufferedWriter(fw);
		if(readLine(0).equals(null))
		{
			bw.write(xml_tag);
			newLine(start_tag + end_tag,bw);
			newValueLine(bw,id,value);
			bw.close();
		}
		else
		{
			newValueLine(bw,id,value);
			bw.close();
		}
	}
	private void newValueLine(BufferedWriter bw,String id,String value) throws IOException
	{
		String start_tag,end_tag,id_value,whole;
		start_tag = "<value";
		id_value = " id=\"" + id + "\">";
		end_tag = "</value>";
		whole = start_tag + id_value + value + end_tag;
		bw.newLine();
		bw.write(whole);
	}
	private void newLine(String data, BufferedWriter bw) throws IOException
	{
		bw.newLine();
		bw.write(data);
	}
}
