package com.SkyELITE21.baybay_dsi.entities;

public abstract class Entity
{
	private int Defense;
	protected int HP,MAX_HP,SP,MAX_SP, LEVEL;
	public Entity()
	{}
	
	public void setHP(int hp)
	{
		this.HP = hp;
	}
	
	public void setMaxHP(int max_hp)
	{
		this.MAX_HP = max_hp;
	}
	
	public void setSP(int sp)
	{
		this.SP = sp;
	}
	
	public void setMaxSP(int max_sp)
	{
		this.MAX_SP = max_sp;
	}
	
	public void setLevel(int lvl)
	{
		this.LEVEL = lvl;
	}
	
	public int getHP()
	{
		return this.HP;
	}
	
	public int getMaxHP()
	{
		return this.MAX_HP;
	}
	
	public int getSP()
	{
		return this.SP;
	}
	
	public int getMaxSP()
	{
		return this.MAX_SP;
	}
	
	public int getLevel()
	{
		return this.LEVEL;
	}
	public void setDefense(int defense)
	{
		this.Defense = defense;
	}
	public int getDefense()
	{
		return this.Defense;
	}
}
