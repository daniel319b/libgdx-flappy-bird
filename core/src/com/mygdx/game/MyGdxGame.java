package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class MyGdxGame extends BaseGame {
	Texture img;
	Bird bird;


    @Override
    public void LoadContent()
    {
        img = new Texture("badlogic.jpg");
        bird = new Bird();
    }

    @Override
    public void Update()
    {
        bird.Update(1);
    }

    @Override
    public void Draw()
    {
        spriteBatch.begin();
        spriteBatch.draw(img, 0,0);
        spriteBatch.end();
        bird.Draw(spriteBatch, 1);
    }
}
