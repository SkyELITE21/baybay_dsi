package com.SkyELITE21.baybay_dsi;

import android.content.*;
import com.SkyELITE21.baybay_dsi.game_engine.*;
import com.SkyELITE21.framework.*;
import com.SkyELITE21.framework.Graphics.*;

public class SplashLoadingScreen extends Screen {
	private Context context;
	public SplashLoadingScreen(Game game,Context context) {
		super(game);
		this.context = context;
	}

	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();
		Assets.splash= g.newImage("splash.jpg", ImageFormat.RGB565);


		game.setScreen(new LoadingScreen(game,context));

	}
	
	@Override
	public void paint(float deltaTime) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}

	@Override
	public void backButton() {

	}
}
