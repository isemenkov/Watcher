package Watcher.Game;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public interface IGameFieldManager {

	public void draw(Graphics2D g);
	public void keyPressed(KeyEvent e);
	public void keyReleased(KeyEvent e);
	
}
