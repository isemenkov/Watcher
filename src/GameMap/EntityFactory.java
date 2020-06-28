package Watcher.GameMap;

import java.awt.Point;
import java.awt.Rectangle;


public class EntityFactory {

	static private MapEntity createEntity(String entityName, int x, int y) {
		try {
			Class<?> instance = Class.forName("Watcher.GameMap.Entity." + entityName);
			MapEntity entity = (MapEntity)instance.newInstance();
			entity.setPos(x, y);
			return entity;		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			e1.printStackTrace();
			return null;
		}
	}
	
	public static void createEmptyBlock(String entityName, int x, int y) {
		MapContainer.addEmptyBlock(createEntity(entityName, x, y));
	}
	
	public static void createFullBlock(String entityName, int x, int y) {
		MapContainer.addEmptyBlock(createEntity(entityName, x, y));
	}
	
	public static void createMovingBlock(String entityName, int x, int y) {
		MapContainer.addEmptyBlock(createEntity(entityName, x, y));
	}
	
	public static void createEntryPoint(Rectangle rect, String newMap, Point playerPos) {
		MapContainer.addEntryPoint(rect, newMap, playerPos);
	}
}
