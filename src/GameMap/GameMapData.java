package Watcher.GameMap;

import java.awt.Point;
import java.awt.Rectangle;

public class GameMapData {
	public Rectangle entryPoint;
	public String newMap;
	public Point playerPos;
	
	public GameMapData(Rectangle p, String map, Point pos) {
		entryPoint = p;
		newMap = map;
		playerPos = pos;
	}
}
