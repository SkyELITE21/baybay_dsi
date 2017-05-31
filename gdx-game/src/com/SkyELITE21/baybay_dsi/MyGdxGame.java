package com.SkyELITE21.baybay_dsi;

import android.content.*;
import com.SkyELITE21.android.storage.*;
import com.SkyELITE21.baybay_dsi.engine.*;
import com.SkyELITE21.baybay_dsi.entities.*;
import com.SkyELITE21.baybay_dsi.storage.*;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import android.graphics.*;
import android.graphics.Color;
import com.SkyELITE21.android.lang.*;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;

public class MyGdxGame implements ApplicationListener
{
	private static String package_name;
	Texture texture;
	SpriteBatch batch;
	LapuLapu lapulapu;
	Store store;
	Store.Editor storee;
	ProtectedStore pstore;
	ProtectedStore.Editor pstoree;
	Canvas canvas;
	Paint paint;
	Locale locale;
	OrthographicCamera guicam;
	TextureRegion leftRegion,rightRegion;
	Vector3 touchPoint;
	Rectangle wleftBounds = new Rectangle(0, 0, 80, 80);
	Rectangle wrightBounds = new Rectangle(80, 0, 80, 80);

	@Override
	public void create()
	{
		/*store = Variables.getSettings();
		pstore = Variables.getPlayerData();
		locale = Variables.getLocaleFor(getLocale());*/
		guicam = new OrthographicCamera(480, 320);
		guicam.position.set(480/2F, 320/2F, 0);
		canvas = new Canvas();
		paint = new Paint();
		texture = new Texture(Gdx.files.internal("android.jpg"));
		batch = new SpriteBatch();
		/*if(getPlayer() == 0)
		{
			lapulapu = new LapuLapu();
		}*/
	}

	@Override
	public void render()
	{        
	    Gdx.gl.glClearColor(1, 1, 1, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		paint.setColor(Color.BLACK);
		batch.begin();
		batch.draw(texture, Gdx.graphics.getWidth() / 4, 0, 
				   Gdx.graphics.getWidth() / 2, Gdx.graphics.getWidth() / 2);
		batch.draw(leftRegion, wleftBounds.x, wleftBounds.y, wleftBounds.width, wleftBounds.height);
		batch.draw(rightRegion, wrightBounds.x, wrightBounds.y, wrightBounds.width, wrightBounds.height);
		batch.end();
		for (int i=0; i<5; i++){
			if (!Gdx.input.isTouched(i)) continue;
			guicam.unproject(touchPoint.set(Gdx.input.getX(i),Gdx.input.getY(i),0));
			if (wleftBounds.contains(touchPoint.x, touchPoint.y)){
				//Move your player to the left!
			}else if (wrightBounds.contains(touchPoint.x, touchPoint.y)){
				//Move your player to the right!
			}
		}
	}

	@Override
	public void dispose()
	{
	}

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
	
	private int getMap()
	{
		return pstore.getStoredInt("current_map");
	}
	private int getPlayer()
	{
		return pstore.getStoredInt("current_player");
	}
	private int getLocale()
	{
		return store.getStoredInt("locale");
	}
	private Storage getStorage(String pkg)
	{
		this.package_name = pkg;
		return new Storage(pkg);
	}
}
