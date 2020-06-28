package Watcher.GameMap;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class MapEntity {

	protected Image img = null;
	protected Rectangle rect = new Rectangle();
	
	protected void setSize(int width, int height) {
		rect.width = width;
		rect.height = height;
	}
	
	public void setPos(int x, int y) {
		rect.x = x;
		rect.y = y;
	}
	
	protected void setTexture(String resPath) {
		img = new ImageIcon(getClass().getResource(resPath)).getImage();
	}
	
	public void draw(Graphics2D g) {
		g.drawImage(img, rect.x, rect.y, rect.x + rect.width, rect.y + rect.height, 0, 0, 64, 64, null);
	}
	public Rectangle getRect() {
		return rect;
	}
	public boolean isEmpty() {
		return false;
	}
	public boolean isMoving() {
		return false;
		
	}
	public void move(int dx, int dy) { }
}
