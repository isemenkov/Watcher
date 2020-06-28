package Watcher.GameMap;

public class GameMap {
	
	protected int getPos(int index) {
		if(index == 0) {
			return 0;
		} else {
			return index * 64;
		}
	}
	
}
