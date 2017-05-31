package com.SkyELITE21.baybay_dsi.engine;
import com.SkyELITE21.baybay_dsi.entities.*;

public final class LapuLapu extends Player
{
	public LapuLapu(float x, float y, int width, int height)
	{
		super(x,y,width,height);
		this.NAME = "Lapu Lapu";
		this.setTribe(Tribe.Visayan);
		this.setCharacter(CHARACTER.LapuLapu);
		this.setRole(Player.Role.Mage);
	}
}
