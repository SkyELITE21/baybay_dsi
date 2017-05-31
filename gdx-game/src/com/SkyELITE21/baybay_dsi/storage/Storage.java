package com.SkyELITE21.baybay_dsi.storage;

import android.content.*;
import com.SkyELITE21.android.lang.*;
import com.SkyELITE21.android.storage.*;
import com.SkyELITE21.baybay_dsi.storage.i.*;

public class Storage implements IStorage
{
	private String pkg;
	public Storage(String package_name)
	{
		this.pkg = package_name;
	}
	@Override
	public Store getStore(String str,int type)
	{
		return new S(pkg,str,type);
	}
	@Override
	public ProtectedStore getProtectedStore(String str,int type)
	{
		return new PS(pkg,str,type);
	}
	@Override
	public Store.Editor getStoreEditor(Store store)
	{
		return store.edit();
	}
	@Override
	public ProtectedStore.Editor getProtectedStoreEditor(ProtectedStore store)
	{
		return store.edit();
	}

	@Override
	public Locale getLocale(int locale)
	{
		return new L(pkg,locale);
	}
	private class S extends Store
	{
		public S(String pkg, String str, int type)
		{
			super(pkg,str,type);
		}
	}
	private class PS extends ProtectedStore
	{
		public PS(String pkg, String str, int type)
		{
			super(pkg,str,type);
		}
	}
	private class L extends Locale
	{
		public L(String pkg, int loc)
		{
			super(pkg,loc);
		}
	}
}
