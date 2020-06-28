package Watcher.GameMap.Entity;

import Watcher.GameMap.MapEntity;

public class Grass extends MapEntity {

	public Grass() {
		setTexture("/res/grass1.jpg");
		setSize(64, 64);
	}
	
	public boolean isEmpty() {
		return true;
	}
}
