package Watcher.GameMap.Map;

import java.awt.Point;
import java.awt.Rectangle;

import Watcher.GameMap.EntityFactory;
import Watcher.GameMap.GameMap;
import Watcher.GameMap.MapContainer;


public class Map0 extends GameMap {

	public Map0() {
		MapContainer.clearMap();
		
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(0));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(1));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(2));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(3));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(4));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(5));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(6));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(1), getPos(0));
		EntityFactory.createEmptyBlock("Grass", getPos(1), getPos(1));
		EntityFactory.createEmptyBlock("Grass", getPos(1), getPos(2));
		EntityFactory.createEmptyBlock("Grass", getPos(1), getPos(3));
		EntityFactory.createFullBlock("HardWoodBox", getPos(1), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(1), getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(1), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(1), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(1), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(2), getPos(0));
		EntityFactory.createEmptyBlock("Dirt", getPos(2), getPos(1));
		EntityFactory.createEmptyBlock("Grass", getPos(2), getPos(2));
		EntityFactory.createEmptyBlock("Grass", getPos(2), getPos(3));
		EntityFactory.createEmptyBlock("Grass", getPos(2), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(2), getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(2), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(2), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(2), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(3), getPos(0));
		EntityFactory.createEmptyBlock("Dirt", getPos(3), getPos(1));
		EntityFactory.createFullBlock("BrickWall", getPos(3), getPos(2));
		EntityFactory.createEmptyBlock("Grass", getPos(3), getPos(3));
		EntityFactory.createEmptyBlock("Grass", getPos(3), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(3), getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(3), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(3), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(3), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(4), getPos(0));
		EntityFactory.createEmptyBlock("Dirt", getPos(4), getPos(1));
		EntityFactory.createFullBlock("BrickWall", getPos(4), getPos(2));
		EntityFactory.createEmptyBlock("Grass", getPos(4), getPos(3));
		EntityFactory.createEmptyBlock("Grass", getPos(4), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(4), getPos(5));
		EntityFactory.createFullBlock("HardWoodBox", getPos(4), getPos(6));
		EntityFactory.createEmptyBlock("Dirt", getPos(4), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(4), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(5), getPos(0));
		EntityFactory.createEmptyBlock("Dirt", getPos(5), getPos(1));
		EntityFactory.createFullBlock("BrickWall", getPos(5), getPos(2));
		EntityFactory.createEmptyBlock("Dirt", getPos(5), getPos(3));
		EntityFactory.createEmptyBlock("Dirt", getPos(5), getPos(4));
		EntityFactory.createEmptyBlock("Dirt", getPos(5), getPos(5));
		EntityFactory.createEmptyBlock("Dirt", getPos(5), getPos(6));
		EntityFactory.createEmptyBlock("Dirt", getPos(5), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(5), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(6), getPos(0));
		EntityFactory.createEmptyBlock("Dirt", getPos(6), getPos(1));
		EntityFactory.createEmptyBlock("Sand", getPos(6), getPos(2));
		EntityFactory.createEmptyBlock("Dirt", getPos(6), getPos(3));
		EntityFactory.createFullBlock("BrickWall", getPos(6), getPos(4));
		EntityFactory.createFullBlock("BrickWall", getPos(6), getPos(5));
		EntityFactory.createEmptyBlock("Dirt", getPos(6), getPos(6));
		EntityFactory.createEmptyBlock("Dirt", getPos(6), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(6), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(7), getPos(0));
		EntityFactory.createFullBlock("HardWoodBox", getPos(7), getPos(1));
		EntityFactory.createEmptyBlock("Sand", getPos(7), getPos(2));
		EntityFactory.createEmptyBlock("Sand", getPos(7), getPos(3));
		EntityFactory.createEmptyBlock("Sand", getPos(7), getPos(4));
		EntityFactory.createFullBlock("BrickWall", getPos(7), getPos(5));
		EntityFactory.createEmptyBlock("Dirt", getPos(7), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(7), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(7), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(8), getPos(0));
		EntityFactory.createEmptyBlock("Sand", getPos(8), getPos(1));
		EntityFactory.createEmptyBlock("Sand", getPos(8), getPos(2));
		EntityFactory.createEmptyBlock("Sand", getPos(8), getPos(3));
		EntityFactory.createEmptyBlock("Dirt", getPos(8), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(8), getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(8), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(8), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(8), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(9), getPos(0));
		EntityFactory.createEmptyBlock("Sand", getPos(9), getPos(1));
		EntityFactory.createEmptyBlock("Dirt", getPos(9), getPos(2));
		EntityFactory.createEmptyBlock("Sand", getPos(9), getPos(3));
		EntityFactory.createEmptyBlock("Dirt", getPos(9), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(9), getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(9), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(9), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(9), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(10), getPos(0));
		EntityFactory.createEmptyBlock("Dirt", getPos(10), getPos(1));
		EntityFactory.createEmptyBlock("Dirt", getPos(10), getPos(2));
		EntityFactory.createEmptyBlock("Dirt", getPos(10), getPos(3));
		EntityFactory.createEmptyBlock("Grass", getPos(10), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(10), getPos(5));
		EntityFactory.createFullBlock("HardWoodBox", getPos(10), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(10), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(10), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(11), getPos(0));
		EntityFactory.createEmptyBlock("Grass", getPos(11), getPos(1));
		EntityFactory.createEmptyBlock("Grass", getPos(11), getPos(2));
		EntityFactory.createEmptyBlock("Grass", getPos(11), getPos(3));
		EntityFactory.createEmptyBlock("Grass", getPos(11), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(11), getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(11), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(11), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(11), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(0));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(1));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(2));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(3));
		EntityFactory.createEmptyBlock("Grass", getPos(12), getPos(4));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(5));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(6));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(8));
		
		EntityFactory.createMovingBlock("WoodBox", getPos(2), getPos(3) + 32);
		EntityFactory.createMovingBlock("WoodBox", getPos(3), getPos(6) - 16);
		EntityFactory.createMovingBlock("WoodBox", getPos(4), getPos(5));
		EntityFactory.createMovingBlock("WoodBox", getPos(6) + 16, getPos(6));
		EntityFactory.createMovingBlock("WoodBox", getPos(8), getPos(5));
		EntityFactory.createMovingBlock("WoodBox", getPos(8), getPos(3) + 16);
		EntityFactory.createMovingBlock("WoodBox", getPos(9), getPos(2) + 32);
		
		EntityFactory.createFullBlock("HardWoodBox", getPos(4) + 32, getPos(3));
		
		EntityFactory.createEntryPoint(
				new Rectangle(getPos(13), getPos(4), 1, 64), 
				"Watcher.GameMap.Map.Map1", 
				new Point(getPos(0), getPos(4)));
	}
}
