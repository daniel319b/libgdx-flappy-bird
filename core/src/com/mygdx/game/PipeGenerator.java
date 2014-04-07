package com.mygdx.game;

import java.util.Random;

/**
 * Created by Daniel on 3/28/2014.
 * This is the pipe generator class, it handles the random pipe generation.
 */
public class PipeGenerator {

    public final static int VERTICAL_PIPE_GAP = 140;
    public final static int HORIZONTAL_PIPE_GAP = 60;
    public final static int MAX_PIPE_LENGTH = 80;
    public final static int MIN_PIPE_LENGTH = 10;

    public PipeGenerator()
    {

    }

    public Pipe GeneratePipe()
    {
        Random rnd = new Random();
        int length = MIN_PIPE_LENGTH + rnd.nextInt(MAX_PIPE_LENGTH);
        return new Pipe();
    }
}
