package com.SkyELITE21.android.app;

import android.content.*;
import android.os.*;

public class Splash extends Activity
{
	
	public void displaySplashThenLaunch(long ms,int res,Class clazz)
	{
		final Class clazz2 = clazz;
		setContentView(res);
		new Handler().postDelayed(new Runnable(){
				@Override
				public void run() {
					startActivity(new Intent(getApplicationContext(),clazz2));
					finish();
				}
			}, ms);
	}
	public void launchAfter(long ms,Class clazz)
	{
		final Class clazz2 = clazz;
		new Handler().postDelayed(new Runnable(){
				@Override
				public void run() {
					startActivity(new Intent(getApplicationContext(),clazz2));
					finish();
				}
			}, ms);
	}
}
