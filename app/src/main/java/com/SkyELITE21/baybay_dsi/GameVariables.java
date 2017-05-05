package com.SkyELITE21.baybay_dsi;
import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;
import com.SkyELITE21.framework.*;
import java.util.*;

public class GameVariables extends Activity
{
	private static Game pgame;
	ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		
	}
	public static void passGame(Game game)
	{
		pgame = game;
	}
	private void launchGame(Game game)
	{
		game.setScreen(new MainGame(game));
	}
	private SharedPreferences getSharedPreferences(Context context,String save_name,String type,int mode)
	{
		return context.getSharedPreferences(save_name + "_" + type,mode);
	}
	private SharedPreferences.Editor getSharedPreferencesEditor(Context context,String save_name,String type,int mode)
	{
		return getSharedPreferences(context,save_name,type,mode).edit();
	}
	private SharedPreferences.Editor getSharedPreferencesEditor(SharedPreferences shared)
	{
		return shared.edit();
	}
	private int getPlayerHealth(SharedPreferences shared)
	{
		return shared.getInt("player_health",0);
	}
	private int getPlayerMaxHealth(SharedPreferences shared)
	{
		return shared.getInt("player_maxhealth",0);
	}
	private int getPlayerSkillPoints(SharedPreferences shared)
	{
		return shared.getInt("player_skillpoints",0);
	}
	private int getPlayerMaxSkillPoints(SharedPreferences shared)
	{
		return shared.getInt("player_maxskillpoints",0);
	}
	private int getPlayerLevel(SharedPreferences shared)
	{
		return shared.getInt("player_level",0);
	}
	private int getPlayerXP(SharedPreferences shared)
	{
		return shared.getInt("player_xp",0);
	}
	private int getPlayerMaxXP(SharedPreferences shared)
	{
		return shared.getInt("player_maxxp",0);
	}
	private long getPlayerCoins(SharedPreferences shared)
	{
		return shared.getLong("player_coins",0);
	}
	private String getPlayerUltimate(SharedPreferences shared)
	{
		return shared.getString("player_ultimate",null);
	}
	private int getCurrentPlayer(SharedPreferences shared)
	{
		return shared.getInt("current_player",0);
	}
	private String getCurrentMap(SharedPreferences shared)
	{
		return shared.getString("current_map",null);
	}
	private int getPlayerHelmet(SharedPreferences shared)
	{
		return shared.getInt("player_helm",0);
	}
	private int getPlayerChestplate(SharedPreferences shared)
	{
		return shared.getInt("player_armor",0);
	}
	private int getPlayerAccessory(SharedPreferences shared)
	{
		return shared.getInt("player_accessory",0);
	}
	private int getPlayerWeapon(SharedPreferences shared)
	{
		return shared.getInt("player_weapon",0);
	}
	private int getPlayerTribe(SharedPreferences shared)
	{
		return shared.getInt("player_tribe",0);
	}
	private int getTime(SharedPreferences shared)
	{
		return shared.getInt("time",0);
	}
}
