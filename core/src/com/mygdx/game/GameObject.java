package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Daniel on 3/27/2014.
 * This is the base class for all the objects in the game.
 */
public class GameObject {
    protected Vector2 position, velocity;
    protected Texture texture;
    protected float rotation;
    protected Rectangle boundBox;

    /* Getters and Setters */

    public Vector2 getPosition() {
        return position;
    }
    public void setPosition(Vector2 position) {
        this.position = position;
    }
    public Vector2 getVelocity() {
        return velocity;
    }
    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }
    public void setTexture(Texture texture) {
        this.texture = texture;
    }
    public Texture getTexture() { return texture; }
    public Rectangle getBoundBox() {
        return boundBox;
    }
    public void setBoundBox(Rectangle boundBox) {
        this.boundBox = boundBox;
    }

    public void Update(float time)
    {
        boundBox = new Rectangle(position.x, position.y, texture.getWidth(), texture.getHeight());
    }

    public void Draw(SpriteBatch spriteBatch, float time)
    {
        spriteBatch.begin();
        spriteBatch.draw(texture ,position.x, position.y);
        spriteBatch.end();
    }



}
