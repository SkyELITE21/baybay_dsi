package com.SkyELITE21.baybay_dsi.constants;

public class Accessory
{
	public static final abstract class RING
	{
		public static final int RING_OF_MAGIC = 0;
		public static final int[] RING_EFFECT = EFFECT.MAGIC_PENETRATION;
	}
	public static final abstract class NECKLACE
	{
		public final static int NECKLACE_OF_LETHALITY = 1;
		public static final int[] NECKLACE_EFFECT = EFFECT.ARMOR_PENETRATION;
	}
	public static final abstract class BRACELET
	{
		public static final int BRACELET_OF_HEALTH = 2,
		BRACELET_OF_SP = 3,
		BRACELET_OF_SPEED = 4,
		BRACELET_OF_DEFENSE = 5,
		BRACELET_OF_MAGIC_DEFENSE = 6;
		
		public static final int[] EFFECT_BY_BRACELET[] = 
		{
			EFFECT.NONE,
			EFFECT.NONE,
			EFFECT.HEALTH,
			EFFECT.SP,
			EFFECT.SPEED,
			EFFECT.DEFENSE,
			EFFECT.MAGIC_RESIST
		};
	}
	public static final abstract class EFFECT
	{
		public static final int[]
		NONE =
		{
			0,
			0,
			0,
			0,
			0,
			0
		},
		ARMOR_PENETRATION =
		{
			10,
			20,
			30,
			40,
			50,
			60
		}
		,MAGIC_PENETRATION = 
		{
			10,
			20,
			30,
			40,
			50,
			60
		}
		,DEFENSE = 
		{
			20,
			40,
			60,
			80,
			100,
			120
		}
		,MAGIC_RESIST = 
		{
			5,
			10,
			15,
			20,
			25,
			30
		}
		,SPEED = 
		{
			1,
			2,
			3,
			4,
			5,
			6
		}
		,HEALTH = 
		{
			15,
			30,
			45,
			60,
			75,
			90
		}
		,SP = 
		{
			20,
			30,
			50,
			60,
			80,
			90
		};
		public final static int
		I = 0,
		II = 1,
		III = 2,
		IV = 3,
		V = 4,
		VI = 5;
	}
}
