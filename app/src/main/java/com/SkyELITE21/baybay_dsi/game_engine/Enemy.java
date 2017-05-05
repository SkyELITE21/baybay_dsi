package com.SkyELITE21.baybay_dsi.game_engine;
import android.graphics.*;

public class Enemy
{
	public static int HEALTH,LEVEL,MAXHP,X,Y,TRIBE;
	private int dmg,centerX,centerY;
	private Rect rect;
	private boolean boss;
	public Enemy()
	{
		rect = new Rect();
	}

	public void setCenterX(int i)
	{
		// TODO: Implement this method
		this.centerX = i;
	}
	public void setCenterY(int i)
	{
		this.centerY = i;
	}
	public int getCenterX()
	{
		return this.centerX;
	}
	public int getCenterY()
	{
		return this.centerY;
	}

	public Rect getRect()
	{
		// TODO: Implement this method
		return this.rect;
	}
	public void setDamage(int i)
	{
		this.dmg = i;
	}
	public void setTribe(int i)
	{
		this.TRIBE = i;
	}
	public void setLevel(int i)
	{
		this.LEVEL = i;
	}
	public boolean isBoss()
	{
		return boss;
	}
	public void setBoss(boolean b)
	{
		this.boss = b;
	}
	public void setHealth(int i)
	{
		this.HEALTH = i;
	}
	public void setMaxHealth(int i)
	{
		this.MAXHP = i;
	}
	public int getHealth()
	{
		
		return this.HEALTH;
	}
	public int getLevel()
	{
		return this.LEVEL;
	}
	public int getMaxHealth()
	{
		return this.MAXHP;
	}
	public int getTribe()
	{
		return this.TRIBE;
	}
	public int getDamage()
	{
		return this.dmg;
	}
	private static void setMaxHealth()
	{
		int hp = LEVEL * 10 + 5;
		MAXHP = hp;
	}
	private static void setHealth()
	{
		HEALTH = MAXHP;
	}
	public void setX(int x)
	{
		this.X = x;
	}
	public void setY(int y)
	{
		this.Y = y;
	}
	public int getX()
	{
		return this.X;
	}
	public int getY()
	{
		return this.Y;
	}
	public void attack(Player player)
	{
		player.setHealth(player.getHealth() - getDamage());
	}
}
