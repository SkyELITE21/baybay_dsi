package com.SkyELITE21.baybay_dsi.game_engine;
import android.graphics.*;

public class Weapon
{
	private Rect r;
	int x,y;
	public Weapon(int x,int y)
	{
		this.x = x;
		this.y = y;
		r = new Rect(0,0,0,0);
	}
}
