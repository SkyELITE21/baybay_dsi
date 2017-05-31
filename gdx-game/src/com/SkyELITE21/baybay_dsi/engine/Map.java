package com.SkyELITE21.baybay_dsi.engine;
import com.SkyELITE21.baybay_dsi.entities.*;

public abstract class Map
{
	protected final int time;
	private int midPointY;
	public final static int PRE_COLONIAL = 0, COLONIAL = 1, POST_COLONIAL = 2;
	public Map(int time,int midPointY)
	{
		this.time = time;
		this.midPointY = midPointY;
	}
	public Player getPlayer()
	{
		if(time == PRE_COLONIAL)
		{
			return new LapuLapu(0f,midPointY - 5,50,50);
		}
		else if(time == COLONIAL)
		{
			return new AndresBonifacio(0f,midPointY - 5,50,50);
		}
		else if(time == POST_COLONIAL)
		{
			return new EmilioAguinaldo(0f,midPointY - 5,50,50);
		}
		else return null;
	}
	public abstract void update(float delta)
	public abstract void dispose()
	public abstract void create()
	public abstract void resume()
	public abstract void pause()
}
