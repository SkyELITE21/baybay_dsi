package com.SkyELITE21.baybay_dsi;
import com.SkyELITE21.baybay_dsi.storage.*;
import com.badlogic.gdx.*;
import com.SkyELITE21.baybay_dsi.game.*;

public class BDSIGame extends Game
{

	@Override
	public void create()
	{
		Assets.load();
		setScreen(new GameDisplay());
	}

	@Override
	public void dispose()
	{
		Assets.unload();
		super.dispose();
	}
}
