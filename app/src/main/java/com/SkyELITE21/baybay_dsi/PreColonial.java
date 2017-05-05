package com.SkyELITE21.baybay_dsi;
import com.SkyELITE21.framework.*;
import com.SkyELITE21.baybay_dsi.game_engine.*;

public class PreColonial extends Screen
{
	Minion m1;
	Enemy r1,r2;
	LapuLapu l;
	
	public PreColonial(Game game)
	{
		super(game);
		m1 = new Minion();
		r1 = m1.getRanger(100,100);
		r2 = m1.getRanger(100,100);
		l = new LapuLapu(100,100);
	}

	@Override
	public void update(float deltaTime)
	{
		// TODO: Implement this method
	}

	@Override
	public void paint(float deltaTime)
	{
		// TODO: Implement this method
	}

	@Override
	public void pause()
	{
		// TODO: Implement this method
	}

	@Override
	public void resume()
	{
		// TODO: Implement this method
	}

	@Override
	public void dispose()
	{
		// TODO: Implement this method
	}

	@Override
	public void backButton()
	{
		// TODO: Implement this method
	}
	
}
