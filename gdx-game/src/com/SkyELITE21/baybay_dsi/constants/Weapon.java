package com.SkyELITE21.baybay_dsi.constants;

public final abstract class Weapon
{
	public static final abstract class TYPE_RANGE
	{
		//WEAPON ids range from 0 - 6
		public static final int STONE_ARROW = 0,
		COPPER_ARROW = 1,
		BRONZE_ARROW = 2,
		IRON_ARROW = 3,
		STEEL_ARROW = 4,
		MYTHRIL_ARROW = 5,
		LEGENDARY_ARROW = 6;
		//WEAPON DAMAGE
		public static final int[] DAMAGE =
		{
			15,
			25,
			45,
			65,
			85,
			105,
			125
		};
		//WEAPON effect type
		public static final int WEAPON_EFFECT[] = EFFECT.ARMOR_PENETRATION;
		//WEAPON effect multiplier
		public static final int WEAPON_EFFECT_MULTIPLIER[] = 
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
		//WEAPON ids range from 7 - 13
		public static final int WOODEN_STAFF = 0,
		COPPER_STAFF = 1,
		BRONZE_STAFF = 2,
		IRON_STAFF = 3,
		STEEL_STAFF = 4,
		MYTHRIL_STAFF = 5,
		LEGENDARY_STAFF = 6;
		//WEAPON DAMAGE
		public static final int[] DAMAGE =
		{
			20,
			35,
			40,
			55,
			60,
			75,
			80
		};
		//WEAPON effect type
		public static final int WEAPON_EFFECT[] = EFFECT.MAGIC_PENETRATION;
		//WEAPON effect multiplier
		public static final int WEAPON_EFFECT_MULTIPLIER[] = 
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
		//WEAPON ids range from 14 - 20
		public static final int STONE_DAGGER = 0,
		COPPER_KNIFE = 1,
		BRONZE_HATCHET = 2,
		IRON_AXE = 3,
		STEEL_SHORTSWORD = 4,
		MYTHRIL_LONGSWORD = 5,
		LEGENDARY_BLADE = 6;
		//WEAPON DAMAGE
		public static final int[] DAMAGE =
		{
			10,
			20,
			30,
			40,
			50,
			60,
			70
		};
		//WEAPON effect type
		public static final int WEAPON_EFFECT[] = EFFECT.HEALTH;
		//WEAPON effect multiplier
		public static final int WEAPON_EFFECT_MULTIPLIER[] = 
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
		public static final int HEALTH[] = 
		{
			10,
			20,
			30,
			40,
			50,
			60
		},
		ARMOR_PENETRATION[] = 
		{
			15,
			20,
			35,
			40,
			45,
			50
		},
		MAGIC_PENETRATION[] =
		{
			5,
			10,
			15,
			20,
			25,
			30
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
