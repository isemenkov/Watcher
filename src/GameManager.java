package Watcher;

import javax.swing.JFrame;


public class GameManager {

	public static JFrame mainFrame = null;
	
	public static void repaint() {
		mainFrame.repaint();
	}
	
	public static void main(String[] args) {
		
		mainFrame = new JFrame();
		mainFrame.setTitle("Game");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.setSize(832, 600);
		
		GamePanel gamePanel = new GamePanel();
		mainFrame.add(gamePanel);
		
		GamePanel.gameScreen = new GameScreen();
		
		mainFrame.setVisible(true);
	}

}
