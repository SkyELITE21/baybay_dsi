package com.SkyELITE21.baybay_dsi.game_engine;
import android.graphics.*;

public class Player
{
	private Rect rect;
	private int centerX,centerY;
	public static int HEALTH,SP,XP,LEVEL,MAXHP,MAXSP,MAXXP,HELM,ARMOR,ACCESSORY,WEAPON,TRIBE,CPLAYER,X,Y;
	public static String SS,NAME;
	public static long COINS;
	public Player()
	{
		rect = new Rect();
	}

	public Rect getRect()
	{
		return this.rect;
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
	public void setCurrentPlayer(int i)
	{
		this.CPLAYER = i;
	}
	public void setMaxHealth(int i)
	{
		this.MAXHP = i;
	}
	public void setMaxSP(int i)
	{
		this.MAXSP = i;
	}
	public void setMaxXP(int i)
	{
		this.MAXXP = i;
	}
	public void setSP(int i)
	{
		this.SP = i;
	}
	public void setXP(int i)
	{
		this.XP = i;
	}
	public void setLevel(int i)
	{
		this.LEVEL = i;
	}
	public void setCoins(long l)
	{
		this.COINS = l;
	}
	public void setSS(String s)
	{
		this.SS = s;
	}
	public void setTribe(int i)
	{
		this.TRIBE = i;
	}
	public void setHelm(int i)
	{
		this.HELM = i;
	}
	public void setArmor(int i)
	{
		this.ARMOR = i;
	}
	public void setAccessory(int i)
	{
		this.ACCESSORY = i;
	}
	public void setWeapon(int i)
	{
		this.WEAPON = i;
	}
	public int getCurrentPlayer()
	{
		return this.CPLAYER;
	}
	public int getMaxHealth()
	{
		return this.MAXHP;
	}
	public int getMaxSP()
	{
		return this.MAXSP;
	}
	public int getMaxXP()
	{
		return this.MAXXP;
	}
	public int getSP()
	{
		return this.SP;
	}
	public int getXP()
	{
		return this.XP;
	}
	public int getLevel()
	{
		return this.LEVEL;
	}
	public long getCoins()
	{
		return this.COINS;
	}
	public String getSS()
	{
		return this.SS;
	}
	public int getTribe()
	{
		return this.TRIBE;
	}
	public int getHelm()
	{
		return this.HELM;
	}
	public int getArmor()
	{
		return this.ARMOR;
	}
	public int getAccessory()
	{
		return this.ACCESSORY;
	}
	public int getWeapon()
	{
		return this.WEAPON;
	}
	public void setHealth(int i)
	{
		this.HEALTH = i;
	}
	public int getHealth()
	{
		return this.HEALTH;
	}
	private int getDamage()
	{
		int weaponDmg = 0,tribeDmg = 0,dmgpLevel;
		if(this.TRIBE == 0)
		{
			tribeDmg = 20;
		}
		else if(this.TRIBE == 1)
		{
			tribeDmg = 5;
		}
		else if(this.TRIBE == 2)
		{
			tribeDmg = 10;
		}
		if(this.WEAPON == 0 && this.TRIBE == 0)
		{
			weaponDmg = 10;
		}
		else if(this.WEAPON == 0 && this.TRIBE == 1)
		{
			weaponDmg = 10;
		}
		else if(this.WEAPON == 0 && this.TRIBE == 2)
		{
			weaponDmg = 5;
		}
		dmgpLevel = this.LEVEL * 2 + 1;
		return dmgpLevel + tribeDmg + weaponDmg;
	}
	public void basicAttack(Enemy enemy)
	{
		enemy.setHealth(enemy.getHealth() - getDamage());
	}
	public void ultimateAttack(Enemy enemy)
	{
		int udmg = getLevel() * 5 + 10;
		int spusage = getLevel() * 20;
		if(getSP() < spusage)
		{
			basicAttack(enemy);
		}
		else
		{
			enemy.setHealth(enemy.getHealth() -(udmg + getDamage()));
			setSP(getSP() - spusage);
		}
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
}
