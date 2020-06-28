package Watcher.Game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;


public class GameFieldManagerDecorator implements IGameFieldManager {

	private GameFieldManager gameFieldManager = null;
	
	public GameFieldManagerDecorator() {
		gameFieldManager = new GameFieldManager();
	}
	
	public void draw(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		gameFieldManager.draw(g);
		
		Rectangle playerRect = gameFieldManager.player.getRect();
		Point2D center = new Point2D.Float(playerRect.x + 32, playerRect.y + 32);
		float radius = 130;
		Point2D focus = new Point2D.Float(playerRect.x + 32, playerRect.y + 32);
		float[] dist = {0.0f, 0.7f, 0.9f, 0.95f};
		Color[] colors = {new Color(255, 255, 255, 0), new Color(255, 255, 255, 32), new Color(255, 255, 255, 128), new Color(0, 0, 0, 249)};
		
		RadialGradientPaint paint = new RadialGradientPaint(center, radius, focus, dist, colors, CycleMethod.NO_CYCLE);
		g.setPaint(paint);
		g.fillRect(0, 0, 832, 600);
	}
	
	public void keyPressed(KeyEvent e) {
		gameFieldManager.keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e) {
		gameFieldManager.keyReleased(e);
	}
	
}
