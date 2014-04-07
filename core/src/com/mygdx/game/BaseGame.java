package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Daniel on 3/27/2014.
 * Base game class
 */
public class BaseGame extends ApplicationAdapter {

    protected SpriteBatch spriteBatch;

    @Override
    public void create ()
    {
        spriteBatch = new SpriteBatch();
        LoadContent();
    }

    @Override
    public void render()
    {
        //cornflower blue.
        Gdx.gl.glClearColor(100 / 255.0f,149 / 255.0f , 237/255.0f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Update();
        Draw();
    }

    public void LoadContent()
    {

    }

    public void Update()
    {

    }

    public void Draw()
    {

    }
}
