package com.SkyELITE21.baybay_dsi.constants;

public final abstract class Chestplate
{
	public static final abstract class TYPE_RANGE
	{
		//Chestplate ids range from 0 - 6
		public static final int CLOTH = 0,
		COPPER = 1,
		BRONZE = 2,
		IRON = 3,
		STEEL = 4,
		MYTHRIL = 5,
		LEGENDARY = 6;
		//Chestplate defense
		public static final int[] DEFENSE =
		{
			2,
			18,
			36,
			54,
			72,
			90,
			108
		};
		//Chestplate effect type
		public static final int CHESTPLATE_EFFECT[] = EFFECT.MAGIC_RESIST;
		//Chestplate effect multiplier
		public static final int CHESTPLATE_EFFECT_MULTIPLIER[] = 
		{
			EFFECT.I,
			EFFECT.II,
			EFFECT.III,
			EFFECT.IV,
			EFFECT.V,
			EFFECT.VI
		};
	}
	public static final abstract class TYPE_MAGE
	{
		//Chestplate ids range from 7 - 13
		public static final int CLOTH = 7,
		COPPER = 8,
		BRONZE = 9,
		IRON = 10,
		STEEL = 11,
		MYTHRIL = 12,
		LEGENDARY = 13;
		//Chestplate defense
		public static final int[] DEFENSE =
		{
			2,
			10,
			30,
			50,
			70,
			90,
			100
		};
		//Chestplate effect type
		public static final int CHESTPLATE_EFFECT[] = EFFECT.MAGIC_PENETRATION;
		//Chestplate effect multiplier
		public static final int CHESTPLATE_EFFECT_MULTIPLIER[] = 
		{
			EFFECT.I,
			EFFECT.II,
			EFFECT.III,
			EFFECT.IV,
			EFFECT.V,
			EFFECT.VI
		};
	}
	public static final abstract class TYPE_WARRIOR
	{
		//Chestplate ids range from 14 - 20
		public static final int CLOTH = 14,
		COPPER = 15,
		BRONZE = 16,
		IRON = 17,
		STEEL = 18,
		MYTHRIL = 19,
		LEGENDARY = 20;
		//Chestplate defense
		public static final int[] DEFENSE =
		{
			2,
			20,
			40,
			60,
			80,
			100,
			120
		};
		//Chestplate effect type
		public static final int CHESTPLATE_EFFECT[] = EFFECT.MAGIC_RESIST;
		//Chestplate effect multiplier
		public static final int CHESTPLATE_EFFECT_MULTIPLIER[] = 
		{
			EFFECT.I,
			EFFECT.II,
			EFFECT.III,
			EFFECT.IV,
			EFFECT.V,
			EFFECT.VI
		};
	}
	public static final abstract class EFFECT
	{
		public static final int NONE[] = 
		{
			0,
			0,
			0,
			0,
			0,
			0
		},
		MAGIC_RESIST[] = 
		{
			10,
			20,
			30,
			40,
			50,
			60
		},
		MAGIC_PENETRATION[] =
		{
			10,
			15,
			20,
			25,
			30,
			35
		};
		public static final int
		I = 0,
		II = 1,
		III = 2,
		IV = 3,
		V = 4,
		VI = 5;
	}
}
