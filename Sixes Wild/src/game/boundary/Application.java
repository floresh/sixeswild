package game.boundary;

import javax.swing.JFrame;

import game.entities.Model;

public class Application {
	Model model;
	JFrame currentFrame;
	
	public Application(Model model) {
		this.model = model;
		this.currentFrame = new SplashScreen();
	}
	
	public JFrame getCurrentFrame() { return currentFrame; }
	public boolean setCurrentFrame(JFrame frame) { 
		currentFrame = frame;
		return true;
	}
}
