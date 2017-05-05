package com.SkyELITE21.baybay_dsi.game_engine;

import com.SkyELITE21.baybay_dsi.game_engine.*;
import java.util.*;

public class Minion
{
	public Minion()
	{
		
	}
	public Ranger getRanger(int X, int Y)
	{
		return new Ranger(X,Y);
	}
	public Mage getMage(int X,int Y)
	{
		return new Mage(X,Y);
	}
	public Melee getMelee(int X, int Y)
	{
		return new Melee(X,Y);
	}
	public Tank getTank(int X,int Y)
	{
		return new Tank(X,Y);
	}
	public class Ranger extends Enemy
	{
		private ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
		public Ranger(int X, int Y)
		{
			setBoss(false);
			setX(X);
			setY(Y);
			setHealth(10);
			setMaxHealth(10);
			setDamage(20);
		}

		@Override
		public void attack(Player player)
		{
			Projectile p = new Projectile(getCenterX() + 50, getCenterY() - 25);
			int dmg = getDamage();
			p.setDamage(dmg);
			projectiles.add(p);
		}
	}
	public class Mage extends Enemy
	{
		private ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
		public Mage(int X, int Y)
		{
			setBoss(false);
			setX(X);
			setY(Y);
			setHealth(10);
			setMaxHealth(10);
			setDamage(20);
		}

		@Override
		public void attack(Player player)
		{
			Projectile p = new Projectile(getCenterX() + 50, getCenterY() - 25);
			int dmg = getDamage();
			p.setDamage(dmg);
			projectiles.add(p);
		}
		
	}
	public class Melee extends Enemy
	{
		public Melee(int X, int Y)
		{
			setBoss(false);
			setX(X);
			setY(Y);
			setHealth(20);
			setMaxHealth(20);
			setDamage(10);
		}
	}
	public class Tank extends Enemy
	{
		public Tank(int X, int Y)
		{
			setBoss(false);
			setX(X);
			setY(Y);
			setHealth(30);
			setMaxHealth(30);
			setDamage(5);
		}
	}
	public class LuzonTribe
	{
		public LuzonTribe()
		{
			
		}
	}
	public class VisayanTribe
	{
		public VisayanTribe()
		{

		}
	}
	public class MindanaoTribe
	{
		public MindanaoTribe()
		{

		}
	}
}
