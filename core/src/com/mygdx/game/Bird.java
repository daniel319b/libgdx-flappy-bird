package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Daniel on 3/27/2014.
 * This class represents the bird in the game.
 */
public class Bird extends GameObject {

    Vector2 acceleration;
    public Bird()
    {
        texture = ContentManager.GetTexture("square.png");
        position = new Vector2(10,90);
        velocity =  new Vector2();
        acceleration = new Vector2(0, -24f);
    }
    @Override
    public void Update(float time)
    {
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
            position.x -= 3;
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            position.x += 3;


        if(Gdx.input.justTouched() || Gdx.input.isKeyPressed(Input.Keys.SPACE))
            velocity.y = 500;

        //velocity.add(acceleration.scl(time));
        //velocity.y += acceleration.y * time;
        //position.add(velocity.scl(time));
        velocity.add(acceleration).cpy().scl(time);
        position.add(velocity.cpy().scl(time));
        super.Update(time);
    }


}
