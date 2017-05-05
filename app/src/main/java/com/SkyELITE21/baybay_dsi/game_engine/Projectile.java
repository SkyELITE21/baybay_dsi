package com.SkyELITE21.baybay_dsi.game_engine;

import android.graphics.Rect;


public class Projectile {

	private int x, y, speedX,dmg;
	private boolean visible;

	private Rect r;

	public Projectile(int startX, int startY){
		x = startX;
		y = startY;
		speedX = 7;
		visible = true;

		r = new Rect(0, 0, 0, 0);
	}
	
	public void setDamage(int i)
	{
		this.dmg = i;
	}
	
	public int getDamage()
	{
		return this.dmg;
	}

	public void update(Player player,Enemy enemy){
		x += speedX;
		r.set(x, y, x+10, y+5);
		if (x > 800){
			visible = false;
			r = null;
		}
		if (visible){
			checkCollision(player,enemy);
		}

	}

	private void checkCollision(Player player,Enemy enemy) {

		if (Rect.intersects(r, player.getRect())){
			visible = false;

			if (player.getHealth() > 0) {
				player.setHealth(player.getHealth() - getDamage());
			}
			if (player.getHealth() == 0) {
				player.setCenterX(-100);


			}

		}
		if (Rect.intersects(r, enemy.getRect())){
			visible = false;

			if (enemy.getHealth() > 0) {
				enemy.setHealth(enemy.getHealth() - getDamage());
			}
			if (enemy.getHealth() == 0) {
				enemy.setCenterX(-100);


			}

		}
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeedX() {
		return speedX;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}


}
