package com.SkyELITE21.baybay_dsi.engine;
import com.SkyELITE21.baybay_dsi.entities.*;

public class EmilioAguinaldo extends Player
{
	
	public EmilioAguinaldo(float x, float y, int width, int height)
	{
		super(x,y,width,height);
		this.NAME = "Emilio Aguinaldo";
		this.setTribe(Player.Tribe.Luzon);
		this.setCharacter(Player.CHARACTER.Emilio);
		this.setRole(Player.Role.Warrior);
	}
}
