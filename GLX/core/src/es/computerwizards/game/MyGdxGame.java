package es.computerwizards.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img, jet;
        private BitmapFont font;
        private Sprite sprite;
        private Pixmap pixmap;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		// img = new Texture("badlogic.jpg");
                
                font = new BitmapFont();
                font.setColor(Color.RED);
                
                jet = new Texture("image.png");
                // sprite = new Sprite(jet);
                
                pixmap = new Pixmap(256,128,Pixmap.Format.RGBA8888);
                pixmap.setColor(Color.RED);
                pixmap.fill();
                pixmap.setColor(Color.BLACK);
                pixmap.drawLine(0, 0, pixmap.getWidth()/2, pixmap.getHeight()-1);
                pixmap.drawLine( 0, pixmap.getWidth()/2, pixmap.getHeight()-1,0);
                img = new Texture(pixmap);
                pixmap.dispose();
                sprite = new Sprite(img);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
                
		batch.begin();
		//batch.draw(img, 100, 110);
                // font.draw(batch, "Hello World", 200, 200);
                sprite.setPosition(0, 0);
                
                sprite.draw(batch);
                
                sprite.setPosition(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);
                
                sprite.draw(batch);
		batch.end();
	}
}
