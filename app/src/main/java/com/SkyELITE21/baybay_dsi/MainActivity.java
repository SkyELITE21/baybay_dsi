package com.SkyELITE21.baybay_dsi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import com.SkyELITE21.framework.*;

public class MainActivity extends Activity 
{
	Button a,b,c,d;
	String t;
	SharedPreferences sp;
	SharedPreferences.Editor spe;
	private static Game pgame;
	public static final String app_pkg = "com.SkyELITE21.baybay_dsi",
	TYPE_DATA = "data",TYPE_SETTINGS="settings",TYPE_TMP="tmp";
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		a = (Button)findViewById(R.id.playGame);
		b = (Button)findViewById(R.id.aboutGame);
		c = (Button)findViewById(R.id.gameSettings);
		sp = getSharedPreferences(this,this.app_pkg,this.TYPE_DATA,this.MODE_PRIVATE);
		spe = getSharedPreferencesEditor(sp);
		a.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					launchActivity(GameVariables.class);
				}
				
			
		});
		b.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					launchActivity(AboutGame.class);
				}


			});
		c.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					
				}


			});
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
	public static void passGame(Game game)
	{
		pgame = game;
	}
	private void launchActivity(Class c0)
	{
		startActivity(new Intent(this,c0));
		finish();
	}
}
