package Watcher.GameMap.Entity;

import Watcher.GameMap.MapEntity;

public class Stone extends MapEntity {

	public Stone() {
		setTexture("/res/stone1.jpg");
		setSize(64, 64);
	}
	
	public boolean isEmpty() {
		return true;
	}
	
}
