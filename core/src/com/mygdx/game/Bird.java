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
        texture = new Texture("square.png");
        position = new Vector2(10,80);
        velocity =  new Vector2();
        acceleration = new Vector2(0, -0.3f);
    }
    @Override
    public void Update(float time)
    {
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
            position.x -= 3;
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            position.x += 3;


        if(Gdx.input.justTouched() || Gdx.input.isKeyPressed(Input.Keys.SPACE))
            velocity.y = 7;

        velocity.add(acceleration);
        position.add(velocity);
    }


}
