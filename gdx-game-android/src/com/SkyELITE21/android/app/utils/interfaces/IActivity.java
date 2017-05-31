package com.SkyELITE21.android.app.utils.interfaces;
import com.SkyELITE21.android.storage.*;
import com.SkyELITE21.android.lang.*;

public interface IActivity
{
	public static final int TYPE_DATA = 0,TYPE_SETTINGS = 1,TYPE_TMP = 2,TYPE_CACHE = 3;
	public com.SkyELITE21.android.storage.Store getStore(String str,int type)
	public com.SkyELITE21.android.storage.Store.Editor getStoreEditor(Store store)
	public com.SkyELITE21.android.storage.ProtectedStore getProtectedStore(String str,int type)
	public com.SkyELITE21.android.storage.ProtectedStore.Editor getProtectedStoreEditor(ProtectedStore store)
	public Locale getLocale(int locale)
}
