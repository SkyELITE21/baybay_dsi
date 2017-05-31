package com.SkyELITE21.baybay_dsi.game;
import com.SkyELITE21.baybay_dsi.game.world.*;
import com.SkyELITE21.baybay_dsi.entities.*;

public class GameWorld extends World
{
	
	public GameWorld(int time,int midPointY)
	{
		super(time,midPointY);
	}

	@Override
	public void update(float delta)
	{
		player.update(delta);
	}

	@Override
	public void dispose()
	{
		// TODO: Implement this method
	}

	@Override
	public void create()
	{
	}

	@Override
	public void resume()
	{
		// TODO: Implement this method
	}

	@Override
	public void pause()
	{
		// TODO: Implement this method
	}
	
}
