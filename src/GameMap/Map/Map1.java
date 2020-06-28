package Watcher.GameMap.Map;

import java.awt.Point;
import java.awt.Rectangle;

import Watcher.GameMap.EntityFactory;
import Watcher.GameMap.GameMap;
import Watcher.GameMap.MapContainer;

public class Map1 extends GameMap {

	public Map1() {
		MapContainer.clearMap();
		
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(0));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(1));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(2));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(3));
		EntityFactory.createEmptyBlock("Grass", getPos(0), getPos(4));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(5));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(6));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(0), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(1), getPos(0));
		EntityFactory.createEmptyBlock("Sand", getPos(1), getPos(1));
		EntityFactory.createEmptyBlock("Dirt", getPos(1), getPos(2));
		EntityFactory.createEmptyBlock("Grass", getPos(1), getPos(3));
		EntityFactory.createEmptyBlock("Grass", getPos(1), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(1), getPos(5));
		EntityFactory.createEmptyBlock("Dirt", getPos(1), getPos(6));
		EntityFactory.createEmptyBlock("Dirt", getPos(1), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(1), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(2), getPos(0));
		EntityFactory.createEmptyBlock("Sand", getPos(2), getPos(1));
		EntityFactory.createEmptyBlock("Dirt", getPos(2), getPos(2));
		EntityFactory.createEmptyBlock("Dirt", getPos(2), getPos(3));
		EntityFactory.createFullBlock("HardWoodBox", getPos(2), getPos(2) + 16);
		EntityFactory.createEmptyBlock("Grass", getPos(2), getPos(4));
		EntityFactory.createEmptyBlock("Dirt", getPos(2), getPos(5));
		EntityFactory.createEmptyBlock("Dirt", getPos(2), getPos(6));
		EntityFactory.createFullBlock("BrickWall", getPos(2), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(3), getPos(0));
		EntityFactory.createEmptyBlock("Sand", getPos(3), getPos(1));
		EntityFactory.createEmptyBlock("Sand", getPos(3), getPos(2));
		EntityFactory.createEmptyBlock("Dirt", getPos(3), getPos(3));
		EntityFactory.createEmptyBlock("Dirt", getPos(3), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(3), getPos(5));
		EntityFactory.createEmptyBlock("Dirt", getPos(3), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(3), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(3), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(4), getPos(0));
		EntityFactory.createEmptyBlock("Sand", getPos(4), getPos(1));
		EntityFactory.createEmptyBlock("Sand", getPos(4), getPos(2));
		EntityFactory.createEmptyBlock("Sand", getPos(4), getPos(3));
		EntityFactory.createEmptyBlock("Dirt", getPos(4), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(4), getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(4), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(4), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(4), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(5), getPos(0));
		EntityFactory.createEmptyBlock("Sand", getPos(5), getPos(1));
		EntityFactory.createEmptyBlock("Sand", getPos(5), getPos(2));
		EntityFactory.createEmptyBlock("BrickWall", getPos(5), getPos(3));
		EntityFactory.createEmptyBlock("BrickWall", getPos(5), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(5), getPos(5));
		EntityFactory.createFullBlock("HardWoodBox", getPos(4) + 16, getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(5), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(5), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(5), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(6), getPos(0));
		EntityFactory.createEmptyBlock("Sand", getPos(6), getPos(1));
		EntityFactory.createEmptyBlock("Dirt", getPos(6), getPos(2));
		EntityFactory.createEmptyBlock("Grass", getPos(6), getPos(3));
		EntityFactory.createEmptyBlock("BrickWall", getPos(6), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(6), getPos(5));
		EntityFactory.createFullBlock("HardWoodBox", getPos(5) + 16, getPos(5));
		EntityFactory.createEmptyBlock("Dirt", getPos(6), getPos(6));
		EntityFactory.createEmptyBlock("Grass", getPos(6), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(6), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(7), getPos(0));
		EntityFactory.createEmptyBlock("Grass", getPos(7), getPos(1));
		EntityFactory.createEmptyBlock("Grass", getPos(7), getPos(2));
		EntityFactory.createFullBlock("HardWoodBox", getPos(7), getPos(2));
		EntityFactory.createEmptyBlock("Grass", getPos(7), getPos(3));
		EntityFactory.createEmptyBlock("Dirt", getPos(7), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(7), getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(7), getPos(6));
		EntityFactory.createEmptyBlock("HardWoodBox", getPos(7), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(7), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(8), getPos(0));
		EntityFactory.createEmptyBlock("Dirt", getPos(8), getPos(1));
		EntityFactory.createEmptyBlock("Grass", getPos(8), getPos(2));
		EntityFactory.createEmptyBlock("Dirt", getPos(8), getPos(3));
		EntityFactory.createEmptyBlock("Dirt", getPos(8), getPos(4));
		EntityFactory.createEmptyBlock("Dirt", getPos(8), getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(8), getPos(6));
		EntityFactory.createEmptyBlock("Dirt", getPos(8), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(8), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(9), getPos(0));
		EntityFactory.createEmptyBlock("Dirt", getPos(9), getPos(1));
		EntityFactory.createEmptyBlock("Dirt", getPos(9), getPos(2));
		EntityFactory.createEmptyBlock("Dirt", getPos(9), getPos(3));
		EntityFactory.createEmptyBlock("Dirt", getPos(9), getPos(4));
		EntityFactory.createEmptyBlock("Grass", getPos(9), getPos(5));
		EntityFactory.createEmptyBlock("Grass", getPos(9), getPos(6));
		EntityFactory.createEmptyBlock("Dirt", getPos(9), getPos(7));
		EntityFactory.createEmptyBlock("Dirt", getPos(9), getPos(8));
		EntityFactory.createFullBlock("BrickWall", getPos(9), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(10), getPos(0));
		EntityFactory.createEmptyBlock("Dirt", getPos(10), getPos(1));
		EntityFactory.createEmptyBlock("Dirt", getPos(10), getPos(2));
		EntityFactory.createEmptyBlock("Sand", getPos(10), getPos(3));
		EntityFactory.createEmptyBlock("Dirt", getPos(10), getPos(4));
		EntityFactory.createEmptyBlock("Dirt", getPos(10), getPos(5));
		EntityFactory.createEmptyBlock("HardWoodBox", getPos(9) + 32, getPos(5));
		EntityFactory.createEmptyBlock("Dirt", getPos(10), getPos(6));
		EntityFactory.createEmptyBlock("Dirt", getPos(10), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(10), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(11), getPos(0));
		EntityFactory.createFullBlock("HardWoodBox", getPos(11), getPos(1));
		EntityFactory.createFullBlock("Sand", getPos(11), getPos(2));
		EntityFactory.createFullBlock("Sand", getPos(11), getPos(3));
		EntityFactory.createFullBlock("Sand", getPos(11), getPos(4));
		EntityFactory.createFullBlock("Dirt", getPos(11), getPos(5));
		EntityFactory.createFullBlock("Dirt", getPos(11), getPos(6));
		EntityFactory.createFullBlock("Grass", getPos(11), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(11), getPos(8));
		
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(0));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(1));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(2));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(3));
		EntityFactory.createEmptyBlock("BrickWall", getPos(12), getPos(4));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(5));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(6));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(7));
		EntityFactory.createFullBlock("BrickWall", getPos(12), getPos(8));

		EntityFactory.createFullBlock("HardWoodBox", getPos(2), getPos(7));
		EntityFactory.createFullBlock("Tree", getPos(2) + 16, getPos(4) + 32);
		
		EntityFactory.createMovingBlock("WoodBox", getPos(3), getPos(1) + 32);
		EntityFactory.createMovingBlock("WoodBox", getPos(3), getPos(2) + 32);
		EntityFactory.createMovingBlock("WoodBox", getPos(4), getPos(6));
		EntityFactory.createMovingBlock("WoodBox", getPos(6) + 48, getPos(1));
		EntityFactory.createMovingBlock("WoodBox", getPos(7), getPos(4));
		EntityFactory.createMovingBlock("WoodBox", getPos(9), getPos(6));
		EntityFactory.createMovingBlock("WoodBox", getPos(10) + 32, getPos(5));
		EntityFactory.createMovingBlock("WoodBox", getPos(8), getPos(3) + 48);
		EntityFactory.createMovingBlock("WoodBox", getPos(11), getPos(2));
		
		EntityFactory.createEntryPoint(
				new Rectangle(getPos(0), getPos(4), 1, 64), 
				"Watcher.GameMap.Map.Map0", 
				new Point(getPos(12), getPos(4)));
	}
	
}
