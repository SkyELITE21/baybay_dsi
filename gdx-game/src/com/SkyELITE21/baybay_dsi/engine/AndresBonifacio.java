package com.SkyELITE21.baybay_dsi.engine;
import com.SkyELITE21.baybay_dsi.entities.*;

public class AndresBonifacio extends Player
{
	
	public AndresBonifacio(float x, float y, int width, int height)
	{
		super(x,y,width,height);
		this.NAME = "Andres Bonifacio";
		this.setTribe(Player.Tribe.Luzon);
		this.setCharacter(Player.CHARACTER.Andres);
		this.setRole(Player.Role.Range);
	}
}
