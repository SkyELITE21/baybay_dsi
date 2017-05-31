package com.SkyELITE21.baybay_dsi.constants;

public final abstract class Helm
{
	public static final abstract class TYPE_RANGE
	{
		//Helm ids range from 0 - 6
		public static final int CLOTH = 0,
		COPPER = 1,
		BRONZE = 2,
		IRON = 3,
		STEEL = 4,
		MYTHRIL = 5,
		LEGENDARY = 6;
		//Helm defense
		public static final int[] DEFENSE =
		{
			1,
			9,
			18,
			27,
			36,
			45,
			54
		};
		//Helm effect type
		public static final int HELM_EFFECT_TYPE[][] = 
		{
			EFFECT.SPEED,
			EFFECT.SPEED,
			EFFECT.SPEED,
			EFFECT.DAMAGE,
			EFFECT.DAMAGE,
			EFFECT.DAMAGE
		};
		//Helm effect multiplier
		public static final int HELM_EFFECT_MULTIPLIER[] = 
		{
			EFFECT.X1,
			EFFECT.X2,
			EFFECT.X3,
			EFFECT.I,
			EFFECT.II,
			EFFECT.III
		};
	}
	public static final abstract class TYPE_MAGE
	{
		//Helm ids range from 7 - 13
		public static final int CLOTH = 0,
		COPPER = 1,
		BRONZE = 2,
		IRON = 3,
		STEEL = 4,
		MYTHRIL = 5,
		LEGENDARY = 6;
		//Helm defense
		public static final int[] DEFENSE =
		{
			1,
			5,
			15,
			25,
			35,
			45,
			50
		};
		//Helm effect type
		public static final int HELM_EFFECT_TYPE[][] = 
		{
			EFFECT.SPEED,
			EFFECT.SPEED,
			EFFECT.SPEED,
			EFFECT.DAMAGE,
			EFFECT.DAMAGE,
			EFFECT.DAMAGE
		};
		//Helm effect multiplier
		public static final int HELM_EFFECT_MULTIPLIER[] = 
		{
			EFFECT.X1,
			EFFECT.X2,
			EFFECT.X3,
			EFFECT.I,
			EFFECT.II,
			EFFECT.III
		};
	}
	public static final abstract class TYPE_WARRIOR
	{
		//Helm ids range from 14 - 20
		public static final int CLOTH = 0,
		COPPER = 1,
		BRONZE = 2,
		IRON = 3,
		STEEL = 4,
		MYTHRIL = 5,
		LEGENDARY = 6;
		//Helm defense
		public static final int[] DEFENSE =
		{
			1,
			10,
			20,
			30,
			40,
			50,
			60
		};
		//Helm effect type
		public static final int HELM_EFFECT_TYPE[][] = 
		{
			EFFECT.SPEED,
			EFFECT.SPEED,
			EFFECT.SPEED,
			EFFECT.DAMAGE,
			EFFECT.DAMAGE,
			EFFECT.DAMAGE
		};
		//Helm effect multiplier
		public static final int HELM_EFFECT_MULTIPLIER[] = 
		{
			EFFECT.X1,
			EFFECT.X2,
			EFFECT.X3,
			EFFECT.I,
			EFFECT.II,
			EFFECT.III
		};
	}
	public static final abstract class EFFECT
	{
		public static final int NONE[] = 
		{
			0,
			0,
			0
		},
		SPEED[] = 
		{
			1,
			2,
			3
		},
		DAMAGE[] =
		{
			5,
			10,
			15
		};
		public static final int X1 = 0,
		X2 = 1,
		X3 = 2,
		I = 0,
		II = 1,
		III = 2;
	}
} 
