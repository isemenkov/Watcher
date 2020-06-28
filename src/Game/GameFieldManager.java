package Watcher.Game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import Watcher.GameMap.GameMap;
import Watcher.GameMap.GameMapData;
import Watcher.GameMap.MapContainer;
import Watcher.GameMap.MapEntity;
import Watcher.GameMap.Map.Map0;


public class GameFieldManager implements IGameFieldManager {
	private static boolean showDebugRectangle = false;
	private static Rectangle debugRectangle;
	
	public Player player = null;
	
	private List<MapEntity> fieldItems;
	private GameMap map;
	
	public GameFieldManager() {
		if(showDebugRectangle) {
			debugRectangle = new Rectangle(0, 0, 0, 0);
		}
	
		player = new Player();
		map = new Map0();
		fieldItems = MapContainer.getMap();
	}
	
	public void draw(Graphics2D g) {
		
		Iterator<MapEntity> i = fieldItems.iterator();
		while(i.hasNext()) {
			MapEntity e = i.next();
			e.draw(g);
			
			if(showDebugRectangle) {
				g.setColor(Color.red);
				Rectangle rect = e.getRect();
				g.drawRect(rect.x, rect.y, rect.width, rect.height);
			}
		}
		
		if(showDebugRectangle) {
			g.setColor(Color.yellow);
			Rectangle playerPos = player.getRect();
			g.drawRect(playerPos.x, playerPos.y, playerPos.width, playerPos.height);
			g.setColor(Color.white);
			g.drawRect(debugRectangle.x, debugRectangle.y, debugRectangle.width, debugRectangle.height);
		}
		
		player.draw(g);
	}
	
	public void keyPressed(KeyEvent e) {
		
		Rectangle playerPos = player.getRect();
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_RIGHT) {
			
			playerPos.x += 45;
			playerPos.y += 13;
			playerPos.width = 5;
			playerPos.height = 48;
			
			if(showDebugRectangle) {
				debugRectangle = playerPos;
			}
			
			MapEntity nextBlock = searchEntity(playerPos);
			if(nextBlock == null) {
				player.goRight();
			} else if(nextBlock.isEmpty()) {
				player.goRight();
			} else if(nextBlock.isMoving()) {
				Rectangle movePos = player.getRect();
				Rectangle movingPos = nextBlock.getRect();
				movePos.x += 112;
				movePos.y = movingPos.y;
				movePos.width = 1;
				movePos.height = 64;
				
				if(showDebugRectangle) {
					debugRectangle = movePos;
				}
				
				MapEntity nextnextBlock = searchEntity(movePos);
				if(nextnextBlock == null || nextnextBlock.isEmpty()) {
					nextBlock.move(Player.playerSpeed, 0);
				player.goRight();
				}
			}
		} else
		if(key == KeyEvent.VK_LEFT) {
			playerPos.x += 5;
			playerPos.y += 13;
			playerPos.width = 5;
			playerPos.height = 48;
			
			if(showDebugRectangle) {
				debugRectangle = playerPos;
			}
			
			MapEntity nextBlock = searchEntity(playerPos);
			if(nextBlock == null) {
				player.goLeft();
			} else if(nextBlock.isEmpty()) {
				player.goLeft();
			} else if(nextBlock.isMoving()) {
				Rectangle movePos = player.getRect();
				Rectangle movingPos = nextBlock.getRect();
				movePos.x -= 60;
				movePos.y = movingPos.y;
				movePos.width = 1;
				movePos.height = 64;
				
				if(showDebugRectangle) {
					debugRectangle = movePos;
				}
				
				MapEntity nextnextBlock = searchEntity(movePos);
				if(nextnextBlock == null || nextnextBlock.isEmpty()) {
					nextBlock.move(-Player.playerSpeed, 0);
					player.goLeft();
				}
			}
		} else
		if(key == KeyEvent.VK_UP) {
			playerPos.x += 10;
			playerPos.y += 5;
			playerPos.width = 37;
			playerPos.height = 5;
			
			if(showDebugRectangle) {
				debugRectangle = playerPos;
			}
			
			MapEntity nextBlock = searchEntity(playerPos);
			if(nextBlock == null) {
				player.goTop();
			} else if(nextBlock.isEmpty()) {
				player.goTop();
			} else if(nextBlock.isMoving()) {
				Rectangle movePos = player.getRect();
				Rectangle movingPos = nextBlock.getRect();
				movePos.x = movingPos.x;
				movePos.y -= 60;
				movePos.width = 64;
				movePos.height = 1;
				
				if(showDebugRectangle) {
					debugRectangle = movePos;
				}
				
				MapEntity nextnextBlock = searchEntity(movePos);
				if(nextnextBlock == null || nextnextBlock.isEmpty()) {
					nextBlock.move(0, -Player.playerSpeed);
					player.goTop();
				}
			}
		} else
		if(key == KeyEvent.VK_DOWN) {
			playerPos.x += 10;
			playerPos.y += 60;
			playerPos.width = 37;
			playerPos.height = 5;
			
			if(showDebugRectangle) {
				debugRectangle = playerPos;
			}
			
			MapEntity nextBlock = searchEntity(playerPos);
			if(nextBlock == null) {
				player.goBottom();
			} else if(nextBlock.isEmpty()) {
				player.goBottom();
			} else if(nextBlock.isMoving()) {
				Rectangle movePos = player.getRect();
				Rectangle movingPos = nextBlock.getRect();
				movePos.x = movingPos.x;
				movePos.y += 128;
				movePos.width = 64;
				movePos.height = 1;
				
				if(showDebugRectangle) {
					debugRectangle = movePos;
				}
				
				MapEntity nextnextBlock = searchEntity(movePos);
				if(nextnextBlock == null || nextnextBlock.isEmpty()) {
					nextBlock.move(0, Player.playerSpeed);
					player.goBottom();
				}
			}
		}
		
		Rectangle playerRect = player.getRect();
		Iterator<GameMapData> i = MapContainer.getEntryPoints().iterator();
		while(i.hasNext()) {
			GameMapData mapData = i.next();
			if(playerRect.intersects(mapData.entryPoint)) {
				try {
					Class<?> newMap = Class.forName(mapData.newMap);
					GameMap gameMap = (GameMap)newMap.newInstance();
					fieldItems = MapContainer.getMap();
					player.move(mapData.playerPos.x, mapData.playerPos.y);
				}
				catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {	
					e1.printStackTrace();
				}
			}
		}
	}
	
	public void keyReleased(KeyEvent e) { }
	
	private MapEntity searchEntity(Rectangle rect) {
		Iterator<MapEntity> i = fieldItems.iterator();
		while(i.hasNext()) {
			MapEntity wall = i.next();
			Rectangle wallRect = wall.getRect();
			if(!wall.isEmpty() && rect.intersects(wallRect))
				return wall;
		}
		return null;
	}
	
}
