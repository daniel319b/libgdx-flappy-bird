package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.TimeUtils;

import java.util.ArrayList;
import java.util.Random;

public class MyGdxGame extends BaseGame {
	Bird bird;
    ArrayList<Pipe> pipes;

    float lastPipesSpawnTime;
    Pipe p1, p2;
    Random rnd = new Random();

    @Override
    public void LoadContent()
    {
        bird = new Bird();
        pipes = new ArrayList<Pipe>();

        spawnPipes();
    }

    @Override
    public void Update()
    {
        bird.Update(Gdx.graphics.getDeltaTime());

        for (Pipe pipe : pipes) {
            pipe.Update(Gdx.graphics.getDeltaTime());
            if(pipe.boundBox.overlaps(bird.boundBox))
                gameOver();
        }

        if(TimeUtils.nanosToMillis(TimeUtils.nanoTime()) - lastPipesSpawnTime > 1500 )
            spawnPipes();

    }

    @Override
    public void Draw()
    {
        bird.Draw(spriteBatch, Gdx.graphics.getDeltaTime());

        for (Pipe pipe : pipes)
        {
            pipe.Draw(spriteBatch, 1);
        }

    }

    private void gameOver()
    {

    }

    private void spawnPipes()
    {
        p1 = new Pipe();
        p1.length = 130 + rnd.nextInt(200);
        p1.position = new Vector2(Gdx.graphics.getWidth() - 5, Gdx.graphics.getHeight() - p1.length);


        p2 = new Pipe();
        p2.length =  (int)p1.position.y - PipeGenerator.VERTICAL_PIPE_GAP;
        p2.position = new Vector2(Gdx.graphics.getWidth() - 5, 5);

        pipes.add(p1);
        pipes.add(p2);
        lastPipesSpawnTime = TimeUtils.nanosToMillis(TimeUtils.nanoTime());
    }
}
