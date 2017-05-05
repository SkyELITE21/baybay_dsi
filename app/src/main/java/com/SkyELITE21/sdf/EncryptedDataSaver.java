package com.SkyELITE21.sdf;
import java.io.*;
import java.util.*;
import org.xmlpull.v1.*;

public class EncryptedDataSaver extends DataSaver
{
	public EncryptedDataSaver(String app_dir,int type,String save_name,int mode)
	{
		super(app_dir,type,save_name,mode);
	}

	@Override
	public void saveValue(String tag, String id, String value) throws IOException
	{
		// TODO: Implement this method
		Hash htag = new Hash(tag), hid = new Hash(id), hvalue = new Hash(value);
		super.saveValue(htag.HASHED_STRING, hid.HASHED_STRING, hvalue.HASHED_STRING);
	}

	@Override
	public long getLongValue(String tag, String id) throws XmlPullParserException, IOException
	{
		// TODO: Implement this method
		Hash hlong;
		hlong = new Hash(super.getLongValue(tag, id));
		return hlong.HASHED_LONG;
	}

	@Override
	public int getIntValue(String tag, String id) throws XmlPullParserException, IOException
	{
		// TODO: Implement this method
		return super.getIntValue(tag, id);
	}

	@Override
	public float getFloatValue(String tag, String id) throws XmlPullParserException, IOException
	{
		// TODO: Implement this method
		return super.getFloatValue(tag, id);
	}

	@Override
	public boolean getBooleanValue(String tag, String id) throws XmlPullParserException, IOException
	{
		// TODO: Implement this method
		return super.getBooleanValue(tag, id);
	}

	@Override
	public short getShortValue(String tag, String id) throws XmlPullParserException, IOException
	{
		// TODO: Implement this method
		return super.getShortValue(tag, id);
	}

	@Override
	public double getDoubleValue(String tag, String id) throws XmlPullParserException, IOException
	{
		// TODO: Implement this method
		return super.getDoubleValue(tag, id);
	}

	@Override
	public String getStringValue(String tag, String id) throws XmlPullParserException, IOException
	{
		// TODO: Implement this method
		Hash hstring;
		hstring = new Hash(super.getStringValue(tag, id));
		return hstring.HASHED_STRING;
	}

	@Override
	public byte getByteValue(String tag, String id) throws XmlPullParserException, IOException
	{
		// TODO: Implement this method
		return super.getByteValue(tag, id);
	}
	
}
