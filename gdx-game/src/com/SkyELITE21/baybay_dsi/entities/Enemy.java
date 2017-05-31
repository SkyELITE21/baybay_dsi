package com.SkyELITE21.baybay_dsi.entities;

public abstract class Enemy extends Entity
{
	private int HP,MAX_HP,SP,MAX_SP;
	public Enemy()
	{}
	enum ENEMY{Magellan,Philip,Amerigo}
	enum CLASS{Range,Mage,Warrior}
	@Override
	public void setHP(int hp)
	{
		this.HP = hp;
	}
	@Override
	public void setMaxHP(int max_hp)
	{
		this.MAX_HP = max_hp;
	}
	@Override
	public void setSP(int sp)
	{
		this.SP = sp;
	}
	@Override
	public void setMaxSP(int max_sp)
	{
		this.MAX_SP = max_sp;
	}

	public abstract void update()
	public abstract void attack(Entity entity)
}
