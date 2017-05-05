package com.SkyELITE21.baybay_dsi.game_engine;

import com.SkyELITE21.framework.*;

public class Assets
{
	public static Image menu, splash, background, character, character2, character3, heliboy, heliboy2, heliboy3, heliboy4, heliboy5;
	public static Image tiledirt, tilegrassTop, tilegrassBot, tilegrassLeft, tilegrassRight, characterJump, characterDown;
	public static Image button;
	public static Sound click;
	public static Music theme;

	public static void load(Map sampleGame) {
		// TODO Auto-generated method stub
		theme = sampleGame.getAudio().createMusic("gameOn.mp3");
		theme.setLooping(true);
		theme.setVolume(0.85f);
		theme.play();
	}
}
