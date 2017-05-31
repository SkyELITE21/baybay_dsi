package com.SkyELITE21.baybay_dsi.storage;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;

public class Assets
{
	public static Texture gui_t,bg_t,playerL_t,playerWL_t,playerA_t,playerWA_t,playerE_t,playerWE_t;
	public static TextureRegion[] gui,bg,playerL_tr[],playerA_tr[],playerE_tr[],playerWL_tr[],playerWA_tr[],playerWE_tr[];
	public static Animation[] playerL,playerA,playerE,playerWL,playerWA,playerWE;
	public static void load()
	{
		gui_t = new Texture(Gdx.files.internal("gui/texture.png"));
		playerL_t = new Texture(Gdx.files.internal("player/l_texture.png"));
		playerA_t = new Texture(Gdx.files.internal("player/a_texture.png"));
		playerE_t = new Texture(Gdx.files.internal("player/e_texture.png"));
		playerWL_t = new Texture(Gdx.files.internal("player/wl_texture.png"));
		playerWA_t = new Texture(Gdx.files.internal("player/wa_texture.png"));
		playerWE_t = new Texture(Gdx.files.internal("player/we_texture.png"));
		gui = new TextureRegion[]
		{
			new TextureRegion(gui_t,0,0,50,50),
			new TextureRegion(gui_t,50,0,50,50),
			new TextureRegion(gui_t,100,0,50,50),
			new TextureRegion(gui_t,150,0,50,50),
			new TextureRegion(gui_t,200,0,50,50),
			new TextureRegion(gui_t,250,0,50,50)
		};
		playerL_tr = new TextureRegion[][]
		{
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
		};
		playerA_tr = new TextureRegion[][]
		{
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
		};
		playerE_tr = new TextureRegion[][]
		{
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
		};
		playerL = new Animation[]
		{
			new Animation(0.06f, playerL_tr[0]),
			new Animation(0.06f, playerL_tr[1]),
			new Animation(0.06f, playerL_tr[2]),
			new Animation(0.06f, playerL_tr[3]),
			new Animation(0.06f, playerL_tr[4]),
			new Animation(0.06f, playerL_tr[5]),
			new Animation(0.06f, playerL_tr[6]),
			new Animation(0.06f, playerL_tr[7])
		};
		playerA = new Animation[]
		{
			new Animation(0.06f, playerA_tr[0]),
			new Animation(0.06f, playerA_tr[1]),
			new Animation(0.06f, playerA_tr[2]),
			new Animation(0.06f, playerA_tr[3]),
			new Animation(0.06f, playerA_tr[4]),
			new Animation(0.06f, playerA_tr[5]),
			new Animation(0.06f, playerA_tr[6]),
			new Animation(0.06f, playerA_tr[7])
		};
		playerE = new Animation[]
		{
			new Animation(0.06f, playerE_tr[0]),
			new Animation(0.06f, playerE_tr[1]),
			new Animation(0.06f, playerE_tr[2]),
			new Animation(0.06f, playerE_tr[3]),
			new Animation(0.06f, playerE_tr[4]),
			new Animation(0.06f, playerE_tr[5]),
			new Animation(0.06f, playerE_tr[6]),
			new Animation(0.06f, playerE_tr[7])
		};
		playerWL_tr = new TextureRegion[][]
		{
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
		};
		playerWA_tr = new TextureRegion[][]
		{
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
		};
		playerWE_tr = new TextureRegion[][]
		{
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
			new TextureRegion[]
			{
				new TextureRegion(playerL_t,0,0,50,50),
				new TextureRegion(playerL_t,50,0,50,50),
				new TextureRegion(playerL_t,100,0,50,50)
			},
		};
		playerWL = new Animation[]
		{
			new Animation(0.06f, playerL_tr[0]),
			new Animation(0.06f, playerL_tr[1]),
			new Animation(0.06f, playerL_tr[2]),
			new Animation(0.06f, playerL_tr[3]),
			new Animation(0.06f, playerL_tr[4]),
			new Animation(0.06f, playerL_tr[5]),
			new Animation(0.06f, playerL_tr[6]),
			new Animation(0.06f, playerL_tr[7])
		};
		playerWA = new Animation[]
		{
			new Animation(0.06f, playerA_tr[0]),
			new Animation(0.06f, playerA_tr[1]),
			new Animation(0.06f, playerA_tr[2]),
			new Animation(0.06f, playerA_tr[3]),
			new Animation(0.06f, playerA_tr[4]),
			new Animation(0.06f, playerA_tr[5]),
			new Animation(0.06f, playerA_tr[6]),
			new Animation(0.06f, playerA_tr[7])
		};
		playerWE = new Animation[]
		{
			new Animation(0.06f, playerE_tr[0]),
			new Animation(0.06f, playerE_tr[1]),
			new Animation(0.06f, playerE_tr[2]),
			new Animation(0.06f, playerE_tr[3]),
			new Animation(0.06f, playerE_tr[4]),
			new Animation(0.06f, playerE_tr[5]),
			new Animation(0.06f, playerE_tr[6]),
			new Animation(0.06f, playerE_tr[7])
		};
	}
	public static void unload()
	{
		dispose();
		playerL = null;
		playerA = null;
		playerE = null;
		playerL_tr = null;
		playerA_tr = null;
		playerE_tr = null;
		playerL_t = null;
		playerA_t = null;
		playerE_t = null;
		playerWL = null;
		playerWA = null;
		playerWE = null;
		playerWL_tr = null;
		playerWA_tr = null;
		playerWE_tr = null;
		playerWL_t = null;
		playerWA_t = null;
		playerWE_t = null;
		gui_t = null;
		gui = null;
		bg = null;
		bg_t = null;
		System.gc();
	}
	private static void dispose()
	{
		gui_t.dispose();
		bg_t.dispose();
		playerL_t.dispose();
		playerA_t.dispose();
		playerE_t.dispose();
		playerWL_t.dispose();
		playerWA_t.dispose();
		playerWE_t.dispose();
	}
	
	public static class GUI
	{
		public final static int PAD_UP = 0,
		PAD_DOWN = 2,
		PAD_LEFT = 3,
		PAD_RIGHT = 1,
		BUTTON_NORMAL_ATTACK = 4,
		BUTTON_SPECIAL_ATTACK = 5,
		SIZE = 6,FOR_LOOP_SIZE = 5;
	}
	public static class PLAYER
	{
		public final static int SIZE = 8,FOR_LOOP_SIZE = 7;
		public final static int ILN = 0,
		ILE = 1,
		ILS = 2,
		ILW = 3,
		ILNE = 4,
		ILNW = 5,
		ILSE = 6,
		ILSW = 7;
		public final static int WLN = 0,
		WLE = 1,
		WLS = 2,
		WLW = 3,
		WLNE = 4,
		WLNW = 5,
		WLSE = 6,
		WLSW = 7;
		public final static int IAN = 0,
		IAE = 1,
		IAS = 2,
		IAW = 3,
		IANE = 4,
		IANW = 5,
		IASE = 6,
		IASW = 7;
		public final static int WAN = 0,
		WAE = 1,
		WAS = 2,
		WAW = 3,
		WANE = 4,
		WANW = 5,
		WASE = 6,
		WASW = 7;
		public final static int IEN = 0,
		IEE = 1,
		IES = 2,
		IEW = 3,
		IENE = 4,
		IENW = 5,
		IESE = 6,
		IESW = 7;
		public final static int WEN = 0,
		WEE = 1,
		WES = 2,
		WEW = 3,
		WENE = 4,
		WENW = 5,
		WESE = 6,
		WESW = 7;
	}
}
