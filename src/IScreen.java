package Watcher;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public interface IScreen {

	public void paint(Graphics2D g);
	public void keyPressed(KeyEvent e);
	public void keyReleased(KeyEvent e);
	
}
