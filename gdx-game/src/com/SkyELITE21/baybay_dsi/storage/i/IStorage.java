package com.SkyELITE21.baybay_dsi.storage.i;

public interface IStorage
{
	public static final int TYPE_DATA = 0,TYPE_SETTINGS = 1,TYPE_TMP = 2,TYPE_CACHE = 3;
	public com.SkyELITE21.android.storage.Store getStore(String str,int type)
	public com.SkyELITE21.android.storage.Store.Editor getStoreEditor(com.SkyELITE21.android.storage.Store store)
	public com.SkyELITE21.android.storage.ProtectedStore getProtectedStore(String str,int type)
	public com.SkyELITE21.android.storage.ProtectedStore.Editor getProtectedStoreEditor(com.SkyELITE21.android.storage.ProtectedStore store)
	public com.SkyELITE21.android.lang.Locale getLocale(int locale)
}
