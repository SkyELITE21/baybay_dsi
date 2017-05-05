package com.SkyELITE21.baybay_dsi.game_engine;
import android.util.*;
import com.SkyELITE21.baybay_dsi.*;
import com.SkyELITE21.framework.*;
import java.io.*;
import com.SkyELITE21.framework.implementation.*;

public class Map extends AndroidGame
{
	public static String map;
	private int resources;
	boolean firstTimeCreate = true;
	public Map(){}
	public Map(int resource){this.resources = resource;}
	@Override
	public Screen getInitScreen() {

		if (firstTimeCreate) {
			Assets.load(this);
			firstTimeCreate = false;
		}

		InputStream is = getResources().openRawResource(resources);
		map = convertStreamToString(is);

		return new SplashLoadingScreen(this,this.getApplicationContext());

	}

	@Override
	public void onBackPressed() {
		getCurrentScreen().backButton();
	}

	private static String convertStreamToString(InputStream is) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append((line + "\n"));
			}
		} catch (IOException e) {
			Log.w("LOG", e.getMessage());
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				Log.w("LOG", e.getMessage());
			}
		}
		return sb.toString();
	}

	@Override
	public void onResume() {
		super.onResume();

		Assets.theme.play();

	}

	@Override
	public void onPause() {
		super.onPause();
		Assets.theme.pause();

	}
}
