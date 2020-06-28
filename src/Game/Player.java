package Watcher.Game;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Watcher.GameMap.MapEntity;


public class Player extends MapEntity {
	
	private int x;
	private int y;
	
	private PlayerCanvas playerCanvas;
	
	public static final int playerSpeed = 2;
 	
	public Player() {
		x = 64;
		y = 64;
		playerCanvas = new PlayerCanvas();
	}
	
	private class PlayerCanvas {
		private final int FIRST_TOP = 1;
		private final int LAST_TOP = 9;
		private final int FIRST_LEFT = 10;
		private final int LAST_LEFT = 18;
		private final int FIRST_BOTTOM = 19;
		private final int LAST_BOTTOM = 27;
		private final int FIRST_RIGHT = 28;
		private final int LAST_RIGHT = 36;
		
		public int playerPos = FIRST_RIGHT;
		
		private Image img = null;
		
		public PlayerCanvas() {
			img = new ImageIcon(getClass().getResource("/res/professor.png")).getImage();
			
		}
		
		private int getImgXPos() {
			int xpos;
			
			switch (playerPos) {
			case 9 :
			case 18 :
			case 27 :
			case 36 :
				xpos = 512;
				break;
			default:
				xpos = ((playerPos % 9) - 1) * 64;
			}
			return xpos;
		}
		
		private int getImgYPos() {
			int ypos;
			
			switch (playerPos) {
			case 9 :
				ypos = 0;
				break;
			case 18 :
				ypos = 64;
				break;
			case 27 : 
				ypos = 128;
				break;
			case 36 :
				ypos = 192;
				break;
			default:
				ypos = ((int)playerPos / 9) * 64;	
			}
			return ypos;
		}
		
		public void drawPlayer(Graphics2D g) {
			g.drawImage(img, x, y, x + 64, y + 64, 
					getImgXPos(), 
					getImgYPos(), 
					getImgXPos() + 64, 
					getImgYPos() + 64, 
					null);
		}
		
		private void incrementPos() {
			if(playerPos >= FIRST_TOP && playerPos <= LAST_TOP) {
				switch(playerPos) {
				case LAST_TOP :
					playerPos = FIRST_TOP;
					break;
				default:
					playerPos++;
				}
			} else if(playerPos >= FIRST_LEFT && playerPos <= LAST_LEFT) {
				switch(playerPos) {
				case LAST_LEFT :
					playerPos = FIRST_LEFT;
					break;
				default:
					playerPos++;	
				}
			} else if(playerPos >= FIRST_BOTTOM && playerPos <= LAST_BOTTOM) {
				switch(playerPos) {
				case LAST_BOTTOM :
					playerPos = FIRST_BOTTOM;
					break;
				default:
					playerPos++;
				}
			} else {
				switch(playerPos) {
				case LAST_RIGHT :
					playerPos = FIRST_RIGHT;
					break;
				default:
					playerPos++;
				}
			}
		}
		
		public void goRight() {
			if(playerPos >= FIRST_RIGHT && playerPos <= LAST_RIGHT) {
				incrementPos();
			} else {
				playerPos = FIRST_RIGHT;
			}
		}
		
		public void goLeft() {
			if(playerPos >= FIRST_LEFT && playerPos <= LAST_LEFT) {
				incrementPos();
			} else {
				playerPos = FIRST_LEFT;
			}
		}
		
		public void goTop() {
			if(playerPos >= FIRST_TOP && playerPos <= LAST_TOP) {
				incrementPos();
			} else {
				playerPos = FIRST_TOP;
			}
		}
		
		public void goBottom() {
			if(playerPos >= FIRST_BOTTOM && playerPos <= LAST_BOTTOM) {
				incrementPos();
			} else {
				playerPos = FIRST_BOTTOM;
			}
		}
	}
	
	public void draw(Graphics2D g) {
		playerCanvas.drawPlayer(g);
	}
	
	public Rectangle getRect() {
		return new Rectangle(x, y, 64, 64);
	}
	
	public void goRight() {
		playerCanvas.goRight();
		x += playerSpeed;
	}
	
	public void goLeft() {
		playerCanvas.goLeft();
		x -= playerSpeed;
	}
	
	public void goTop() {
		playerCanvas.goTop();
		y -= playerSpeed;
	}
	
	public void goBottom() {
		playerCanvas.goBottom();
		y += playerSpeed;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public Point getCurrentPosition() {
		return new Point(x, y);
	}

	@Override
	public boolean isMoving() {
		return false;
	}

	@Override
	public void move(int dx, int dy) {	
		x = dx;
		y = dy;
	}
}
