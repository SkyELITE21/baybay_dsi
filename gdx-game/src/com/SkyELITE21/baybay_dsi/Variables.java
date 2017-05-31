package com.SkyELITE21.baybay_dsi;
import com.SkyELITE21.android.lang.*;
import com.SkyELITE21.android.storage.*;
import com.SkyELITE21.baybay_dsi.storage.*;

public class Variables
{
	private static final String pkg_name = "com.SkyELITE21.baybay_dsi";
	public static Store getSettings()
	{
		return new S(pkg_name,pkg_name,Storage.TYPE_SETTINGS);
	}
	public static Store.Editor getSettingsEditor()
	{
		return getSettings().edit();
	}
	public static ProtectedStore getPlayerData()
	{
		return new PS(pkg_name,pkg_name,Storage.TYPE_DATA);
	}
	public static ProtectedStore.Editor getPlayerDataEditor()
	{
		return getPlayerData().edit();
	}
	public static Locale getLocaleFor(int locale)
	{
		return new L(pkg_name,locale);
	}
	private static class S extends Store
	{
		public S(String pkg,String str,int type)
		{
			super(pkg,str,type);
		}
	}
	private static class PS extends ProtectedStore
	{
		public PS(String pkg,String str,int type)
		{
			super(pkg,str,type);
		}
	}
	private static class L extends Locale
	{
		public L(String pkg,int loc)
		{
			super(pkg,loc);
		}
	}
}
