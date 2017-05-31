package com.SkyELITE21.baybay_dsi.entities;

import com.badlogic.gdx.math.*;
import com.SkyELITE21.baybay_dsi.constants.*;

public class Player extends Entity
{
	protected int XP,MAX_XP,HELM,CHESTPLATE,WEAPON,ULTIMATE,ACCESSORY,ACCESSORY_LEVEL;
	protected long COINS;
	protected String NAME;
	protected Player.Tribe tribe;
	protected Player.CHARACTER character;
	protected Player.Role role;
	private boolean isADmgMagic = false;
	private int magicDamage = 0;
	private Vector2 position;
	private Vector2 velocity;
	private Vector2 acceleration;
	private boolean idle = true,direction[] = {false,false,false,false,false,false,false,false};
	private int width;
	private int height;
	public Player(float x, float y, int width, int height)
	{
		this.width = width;
		this.height = height;
		position = new Vector2(x, y);
		velocity = new Vector2(0, 0);
		acceleration = new Vector2(0, 0);
	}
	public enum CHARACTER{LapuLapu,Andres,Emilio}
	public enum Tribe{Luzon,Visayan,Mindanaoan}
	public enum Role{Range,Mage,Warrior}
	public void setCharacter(Player.CHARACTER character)
	{
		this.character = character;
	}
	public Player.CHARACTER getCharacter()
	{
		return character;
	}
	public void setTribe(Player.Tribe tribe)
	{
		this.tribe = tribe;
	}
	public Player.Tribe getTribe()
	{
		return tribe;
	}
	public void setRole(Player.Role role)
	{
		this.role = role;
	}
	public Player.Role getRole()
	{
		return role;
	}
	public String getName()
	{
		return this.NAME;
	}
	public void moveRight(float distance)
	{
		position.x += distance;
		idle = false;
		direction[2] = true;
	}
	public void moveLeft(float distance)
	{
		position.x -= distance;
		idle = false;
		direction[6] = true;
	}
	public void moveUp(float distance)
	{
		position.y += distance;
		idle = false;
		direction[0] = true;
	}
	public void moveDown(float distance)
	{
		position.y -= distance;
		idle = false;
		direction[4] = true;
	}
	public void moveUpRight(float distance)
	{
		float dst2 = distance * distance;
		float dst2o2 = dst2 / 2f;
		float x = (float) Math.sqrt((double)dst2o2),
		y = x;
		moveUp(y);
		moveRight(x);
		idle = false;
		direction[0] = false;
		direction[1] = true;
		direction[2] = false;
	}
	public void moveUpLeft(float distance)
	{
		float dst2 = distance * distance;
		float dst2o2 = dst2 / 2f;
		float x = (float) Math.sqrt((double)dst2o2),
			y = x;
		moveUp(y);
		moveLeft(x);
		idle = false;
		direction[0] = false;
		direction[7] = true;
		direction[6] = false;
	}
	public void moveDownRight(float distance)
	{
		float dst2 = distance * distance;
		float dst2o2 = dst2 / 2f;
		float x = (float) Math.sqrt((double)dst2o2),
			y = x;
		moveDown(y);
		moveRight(x);
		idle = false;
		direction[4] = false;
		direction[3] = true;
		direction[2] = false;
	}
	public void moveDownLeft(float distance)
	{
		float dst2 = distance * distance;
		float dst2o2 = dst2 / 2f;
		float x = (float) Math.sqrt((double)dst2o2),
			y = x;
		moveDown(y);
		moveLeft(x);
		idle = false;
		direction[4] = false;
		direction[5] = true;
		direction[6] = false;
	}
	public boolean isIdle()
	{
		return idle;
	}
	public boolean isMovingUpLeft()
	{
		return direction[7];
	}
	public boolean isMovingLeft()
	{
		return direction[6];
	}
	public boolean isMovingDownLeft()
	{
		return direction[5];
	}
	public boolean isMovingDown()
	{
		return direction[4];
	}
	public boolean isMovingDownRight()
	{
		return direction[3];
	}
	public boolean isMovingRight()
	{
		return direction[2];
	}
	public boolean isMovingUpRight()
	{
		return direction[1];
	}
	public boolean isMovingUp()
	{
		return direction[0];
	}
	public void setHelmet(int id)
	{
		this.HELM = id;
	}
	public void setChesplate(int id)
	{
		this.CHESTPLATE = id;
	}
	public void setWeapon(int id)
	{
		this.WEAPON = id;
	}
	public void setAccessory(int id)
	{
		this.ACCESSORY = id;
	}
	public void setUltimate(int id)
	{
		this.ULTIMATE = id;
	}
	public void setCoins(long amount)
	{
		this.COINS = amount;
	}
	public void setXP(int xp)
	{
		this.XP = xp;
	}
	public void setMaxXP(int max)
	{
		this.MAX_XP = max;
	}
	public int getHelmet()
	{
		return this.HELM;
	}
	public int getChestplate()
	{
		return this.CHESTPLATE;
	}
	public int getWeapon()
	{
		return this.WEAPON;
	}
	public int getAccessory()
	{
		return this.ACCESSORY;
	}
	public int getUltimate()
	{
		return this.ULTIMATE;
	}
	public long getCoins()
	{
		return this.COINS;
	}
	public int getXP()
	{
		return this.XP;
	}
	public int getMaxXP()
	{
		return this.MAX_XP;
	}
	public void setAccessoryLevel(int level)
	{
		this.ACCESSORY_LEVEL = level;
	}
	public int getAccessoryLevel()
	{
		return this.ACCESSORY_LEVEL;
	}
	public void update(float delta)
	{
		velocity.add(acceleration.cpy().scl(delta));
		if(velocity.x > 200)
		{
			velocity.x = 200;
		}
		if(velocity.y > 200)
		{
			velocity.y = 200;
		}
		position.add(velocity);
	}
	public void attack(Entity entity)
	{
		if(isADmgMagic)
		{
			entity.setHP(entity.getHP() - magicDamage);
			entity.setHP(entity.getHP() - getOverAllDamage(entity));
		}
		else
		{
			entity.setHP(entity.getHP() - getOverAllDamage(entity));
		}
	}
	public int getBaseDamage()
	{
		int basedmg = (getLevel() * 2) + 1;
		return basedmg;
	}
	public int getWeaponDamage()
	{
		int weapondmg = 0;
		if(role == Player.Role.Range)
		{
			weapondmg = Weapon.TYPE_RANGE.DAMAGE[WEAPON] +
			Weapon.TYPE_RANGE.WEAPON_EFFECT[Weapon.TYPE_RANGE.WEAPON_EFFECT_MULTIPLIER[WEAPON]];
		}
		else if(role == Player.Role.Mage)
		{
			weapondmg = Weapon.TYPE_MAGE.DAMAGE[WEAPON] +
			Weapon.TYPE_MAGE.WEAPON_EFFECT[Weapon.TYPE_MAGE.WEAPON_EFFECT_MULTIPLIER[WEAPON]];
		}
		else if(role == Player.Role.Warrior)
		{
			weapondmg = Weapon.TYPE_WARRIOR.DAMAGE[WEAPON] +
				Weapon.TYPE_WARRIOR.WEAPON_EFFECT[Weapon.TYPE_WARRIOR.WEAPON_EFFECT_MULTIPLIER[WEAPON]];
		}
		return weapondmg;
	}
	public int[]getHelmetEffect()
	{
		if(role == Player.Role.Range)
		{
			return Helm.TYPE_RANGE.HELM_EFFECT_TYPE[HELM];
		}
		else if(role == Player.Role.Mage)
		{
			return Helm.TYPE_MAGE.HELM_EFFECT_TYPE[HELM];
		}
		else if(role == Player.Role.Warrior)
		{
			return Helm.TYPE_WARRIOR.HELM_EFFECT_TYPE[HELM];
		}
		else return null;
	}
	public int[] getChestplateEffect()
	{
		if(role == Player.Role.Range)
		{
			return Chestplate.TYPE_RANGE.CHESTPLATE_EFFECT;
		}
		else if(role == Player.Role.Mage)
		{
			return Chestplate.TYPE_MAGE.CHESTPLATE_EFFECT;
		}
		else if(role == Player.Role.Warrior)
		{
			return Chestplate.TYPE_WARRIOR.CHESTPLATE_EFFECT;
		}
		else return null;
	}
	public int[] getAccessoryEffect()
	{
		if(ACCESSORY == Accessory.RING.RING_OF_MAGIC)
		{
			return Accessory.RING.RING_EFFECT;
		}
		else if(ACCESSORY == Accessory.NECKLACE.NECKLACE_OF_LETHALITY)
		{
			return Accessory.NECKLACE.NECKLACE_EFFECT;
		}
		else if(ACCESSORY == Accessory.BRACELET.BRACELET_OF_SPEED ||
				ACCESSORY == Accessory.BRACELET.BRACELET_OF_SP ||
				ACCESSORY == Accessory.BRACELET.BRACELET_OF_MAGIC_DEFENSE ||
				ACCESSORY == Accessory.BRACELET.BRACELET_OF_HEALTH ||
				ACCESSORY == Accessory.BRACELET.BRACELET_OF_DEFENSE)
		{
			return Accessory.BRACELET.EFFECT_BY_BRACELET[ACCESSORY];
		}
		else return null;
	}
	public int getOverAllDamage(Entity entity)
	{
		int odmg = 0,hdmg = 0,admg = 0;
		int wdmg = getWeaponDamage();
		if(getHelmetEffect() == Helm.EFFECT.DAMAGE)
		{
			if(role == Player.Role.Range)
			{
				hdmg = getHelmetEffect()[Helm.TYPE_RANGE.HELM_EFFECT_MULTIPLIER[HELM]];
			}
			else if(role == Player.Role.Mage)
			{
				hdmg = getHelmetEffect()[Helm.TYPE_MAGE.HELM_EFFECT_MULTIPLIER[HELM]];
			}
			else if(role == Player.Role.Warrior)
			{
				hdmg = getHelmetEffect()[Helm.TYPE_WARRIOR.HELM_EFFECT_MULTIPLIER[HELM]];
			}
			else hdmg = 0;
		}
		if(getAccessoryEffect() == Accessory.EFFECT.ARMOR_PENETRATION ||
		getAccessoryEffect() == Accessory.EFFECT.MAGIC_PENETRATION)
		{
			admg = getAccessoryEffect()[ACCESSORY_LEVEL];
			if(getAccessoryEffect() == Accessory.EFFECT.MAGIC_PENETRATION)
			{
				isADmgMagic = true;
				magicDamage = admg;
			}
			else
			{
				isADmgMagic = false;
				magicDamage = 0;
			}
		}
		if(isADmgMagic)
		{
			odmg = (hdmg + wdmg) - entity.getDefense();
		}
		else
		{
			odmg = (hdmg + wdmg + admg) - entity.getDefense();
		}
		return odmg;
	}
	public float getX()
	{
		return this.position.x;
	}
	public float getY()
	{
		return this.position.y;
	}
	public int getHeight()
	{
		return this.height;
	}
	public int getWidth()
	{
		return this.width;
	}
}
