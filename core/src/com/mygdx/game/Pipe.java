package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Daniel on 3/28/2014.
 * This class represents a pipe in the game.
 */
public class Pipe extends GameObject {

    public static final int PIPE_SPEED = 100;

    public int length;

    ShapeRenderer shapeRenderer;

    public Pipe()
    {
        //texture = new Texture("pipe.png");
        velocity = new Vector2(-PIPE_SPEED, 0);
        length = 10;
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    public void Update(float dt)
    {
        position.add(velocity.cpy().scl(dt));
        boundBox = new Rectangle(position.x, position.y, 20, length);
       // super.Update(dt);
    }

    @Override
    public void Draw(SpriteBatch sb, float time)
    {
//        sb.begin();
//
//        sb.end();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(0, 1, 0, 1);
        shapeRenderer.rect(position.x, position.y, 20, length);
        shapeRenderer.end();
    }
}
