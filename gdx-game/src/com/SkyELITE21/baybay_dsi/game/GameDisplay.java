package com.SkyELITE21.baybay_dsi.game;
import com.badlogic.gdx.*;
import com.SkyELITE21.baybay_dsi.*;

public class GameDisplay implements Screen
{
	
	private GameWorld world;
	private Renderer renderer;
	private float runTime;
	
	public GameDisplay() {

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);
        int midPointY = (int) (gameHeight / 2);
		int time = Variables.getPlayerData().getStoredInt("time_period");
        world = new GameWorld(time,midPointY);
        renderer = new Renderer(world, (int) gameHeight, midPointY);
    }

	@Override
	public void render(float delta)
	{
		runTime += delta;
		world.update(delta);
		renderer.render(runTime);
	}

	@Override
	public void resize(int p1, int p2)
	{
		// TODO: Implement this method
	}

	@Override
	public void show()
	{
		Gdx.app.log("BAYBAY","show");
	}

	@Override
	public void hide()
	{
		Gdx.app.log("BAYBAY","hide");
	}

	@Override
	public void pause()
	{
		Gdx.app.log("BAYBAY","pause");
	}

	@Override
	public void resume()
	{
		Gdx.app.log("BAYBAY","resume");
	}

	@Override
	public void dispose()
	{
		// TODO: Implement this method
	}
	
}
