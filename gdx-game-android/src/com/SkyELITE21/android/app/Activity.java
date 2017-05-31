package com.SkyELITE21.android.app;
import android.content.*;
import com.SkyELITE21.android.app.utils.interfaces.*;
import com.SkyELITE21.android.lang.*;
import com.SkyELITE21.android.storage.*;

public class Activity extends android.app.Activity implements IActivity
{
	protected final String packageName()
	{
		return getApplicationInfo().packageName;
	}
	@Override
	public com.SkyELITE21.android.storage.Store.Editor getStoreEditor(Store store)
	{
		// TODO: Implement this method
		return store.edit();
	}

	@Override
	public com.SkyELITE21.android.storage.Store getStore(String str, int type)
	{
		// TODO: Implement this method
		String pkg = getApplicationInfo().packageName;
		return new privStore(pkg,str,type);
	}

	@Override
	public ProtectedStore getProtectedStore(String str, int type)
	{
		String pkg = getApplicationInfo().packageName;
		return new privProtectedStore(pkg,str,type);
	}

	@Override
	public ProtectedStore.Editor getProtectedStoreEditor(ProtectedStore proected_store)
	{
		// TODO: Implement this method
		return proected_store.edit();
	}

	@Override
	public Locale getLocale(int locale)
	{
		// TODO: Implement this method
		return new privLocale(packageName(),locale);
	}

	private class privStore extends com.SkyELITE21.android.storage.Store
	{
		private privStore(String pkg,String str,int type)
		{
			super(pkg,str,type);
		}
	}
	private class privProtectedStore extends com.SkyELITE21.android.storage.ProtectedStore
	{
		private privProtectedStore(String pkg,String str,int type)
		{
			super(pkg,str,type);
		}
	}
	private class privLocale extends Locale
	{
		private privLocale(String pkg,int locale)
		{
			super(pkg,locale);
		}
	}
}
