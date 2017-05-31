package com.SkyELITE21.baybay_dsi.game.world;
import com.SkyELITE21.baybay_dsi.engine.*;
import com.SkyELITE21.baybay_dsi.entities.*;

public abstract class World extends Map
{
	protected Player player;
	public World(int time,int midPointY)
	{
		super(time,midPointY);
		player = getPlayer();
	}
}
