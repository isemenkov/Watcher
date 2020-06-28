package Watcher;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public static IScreen gameScreen = null;
	
	public GamePanel() {
		addKeyListener(new GameKeyboardListener());
		setDoubleBuffered(true);
		setFocusable(true);
	}
	
	public void paint(Graphics g) {
		if(gameScreen != null) {
			gameScreen.paint((Graphics2D)g);
		}
	}
	
	private class GameKeyboardListener extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			if(gameScreen != null) {
				gameScreen.keyPressed(e);
			}
		}
		
		public void keyReleased(KeyEvent e) {
			if(gameScreen != null) {
				gameScreen.keyReleased(e);
			}
		}
		
	}

}
