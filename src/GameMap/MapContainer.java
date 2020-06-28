package Watcher.GameMap;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MapContainer {
	
	private static List<MapEntity> emptyBlocks = new ArrayList<MapEntity>();
	private static List<MapEntity> movingBlocks = new ArrayList<MapEntity>();
	private static List<MapEntity> fullBlocks = new ArrayList<MapEntity>();
	
	private static List<MapEntity> map = new ArrayList<MapEntity>();
	private static List<GameMapData> entryPoints = new ArrayList<GameMapData>();
	
	public static List<MapEntity> getMap() {
		
		Iterator<MapEntity> e = emptyBlocks.iterator();
		while(e.hasNext()) {
			map.add(e.next());
		}
		
		Iterator<MapEntity> f = fullBlocks.iterator();
		while(f.hasNext()) {
			map.add(f.next());
		}
		
		Iterator<MapEntity> m = movingBlocks.iterator();
		while(m.hasNext()) {
			map.add(m.next());
		}
		
		return map;
	}
	
	public static void addEmptyBlock(MapEntity entity) {
		emptyBlocks.add(entity);
	}
	
	public static void addMovingBlock(MapEntity entity) {
		movingBlocks.add(entity);
	}
	
	public static void addFullBlock(MapEntity entity) {
		fullBlocks.add(entity);
	}
	
	public static void addEntryPoint(Rectangle rect, String newMap, Point playerPos) {
		entryPoints.add(new GameMapData(rect, newMap, playerPos));
	}
	
	public static List<GameMapData> getEntryPoints() { 
		return entryPoints; 
	}
	
	public static void clearMap() {
		emptyBlocks.clear();
		movingBlocks.clear();
		fullBlocks.clear();
		map.clear();
		entryPoints.clear();
	}
	
}
