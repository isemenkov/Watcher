package Watcher.GameMap.Entity;

import Watcher.GameMap.MapEntity;

public class Sand extends MapEntity {

	public Sand() {
		setTexture("/res/sand1.jpg");
		setSize(64, 64);
	}

	public boolean isEmpty() {
		return true;
	}
	
}
