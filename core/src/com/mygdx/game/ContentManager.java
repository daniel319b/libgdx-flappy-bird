package com.mygdx.game;


import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

/**
 * Created by Daniel on 3/28/2014.
 * A helper class for managing content efficiently.
 */
public class ContentManager {

    public static HashMap<String, Texture> textures;

    public static Texture GetTexture(String textureName)
    {
        //lazy initialization
        if(textures == null) textures = new HashMap<String, Texture>();
        if(textures.containsKey(textureName)) return textures.get(textureName);
        Texture t = new Texture(textureName);
        textures.put(textureName,t);
        return t;
    }
}
