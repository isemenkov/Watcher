package Watcher.GameMap.Entity;

import Watcher.GameMap.MapEntity;


public class Dirt extends MapEntity {
	
	public Dirt() {
		setTexture("/res/dirt1.jpg");
		setSize(64, 64);
	}
	
	public boolean isEmpty() {
		return true;
	}
}
