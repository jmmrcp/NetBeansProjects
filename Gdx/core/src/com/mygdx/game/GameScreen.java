/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author jose
 */
public class GameScreen extends AbstractScreen {
    private SpriteBatch batch;
    private Texture texture;
    

    public GameScreen(Main main) {
        super(main);
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("pongcampo.png"));
    }

    @Override
    public void render(float f) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        
        batch.draw(texture, 0, 0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        batch.end();
    }    
}
