package com.SkyELITE21.android.storage.utils.interfaces;
import com.SkyELITE21.android.storage.*;

public interface IStore
{
	
	public String getStoredString(String str)
	public int getStoredInt(String str)
	public boolean getStoredBoolean(String str)
	public long getStoredLong(String str)
	public short getStoredShort(String str)
	public byte getStoredByte(String str)
	public float getStoredFloat(String str)
	public double getStoredDouble(String str)
	public String[] getStoredStringArray(String str)
	public Store.Editor edit()
	public interface IEditor
	{
		public void storeString(String str,String str2)
		public void storeInt(String str,int p0)
		public void storeBoolean(String str,boolean bool)
		public void storeLong(String str,long p0)
		public void storeShort(String str,short p0)
		public void storeByte(String str,byte p0)
		public void storeFloat(String str,float p0)
		public void storeDouble(String str,double p0)
		public void storeStringArray(String str,String str2[])
	}
}
