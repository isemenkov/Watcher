package Watcher;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

//import Watcher.Game.GameFieldManager;
import Watcher.Game.GameFieldManagerDecorator;
import Watcher.Game.IGameFieldManager;

public class GameScreen implements IScreen {
	
	private IGameFieldManager gameField;
	
	public GameScreen() {
		gameField = new GameFieldManagerDecorator();
	}
	
	//@Override
	public void paint(Graphics2D g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 832, 600);
		
		gameField.draw(g);
	}

	//@Override
	public void keyPressed(KeyEvent e) {
		gameField.keyPressed(e);
		GameManager.repaint();
	}

	//@Override
	public void keyReleased(KeyEvent e) {
		gameField.keyReleased(e);
		GameManager.repaint();
	}
}
