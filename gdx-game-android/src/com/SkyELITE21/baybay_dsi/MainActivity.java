package com.SkyELITE21.baybay_dsi;

import android.content.*;
import android.os.*;
import com.SkyELITE21.android.app.utils.interfaces.*;
import com.SkyELITE21.android.lang.*;
import com.SkyELITE21.android.storage.*;
import com.badlogic.gdx.backends.android.*;

public class MainActivity extends AndroidApplication implements IActivity{
	private String pkg;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		pkg = getApplicationInfo().packageName;
        Store store = getStore(pkg,TYPE_SETTINGS);
		ProtectedStore pstore = getProtectedStore(pkg,TYPE_DATA);
		Store.Editor storee = getStoreEditor(store);
		ProtectedStore.Editor pstoree = getProtectedStoreEditor(pstore);
		if(store.getStoredString("is_first").length() == 0)
		{
			storee.storeString("is_first","no");
			storee.storeInt("locale",Locale.LOCALE_DEFAULT);
			pstoree.storeInt("current_player",0);
			pstoree.storeInt("current_map",0);
			LocaleExtract.extract(store,getResources(),pkg);
		}
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        initialize(new MyGdxGame(), cfg);
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
