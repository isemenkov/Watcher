package Watcher.GameMap.Entity;

import Watcher.GameMap.MapEntity;

public class WoodBox extends MapEntity {
	
	public WoodBox() {
		setTexture("/res/woodbox1.jpg");
		setSize(64, 64);
	}

	public boolean isMoving() {
		return true;
	}
	
	public void move(int dx, int dy) {
		rect.x += dx;
		rect.y += dy;
	}
	
}
