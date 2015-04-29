package game.controller;

import game.boundary.Application;
import game.entities.*;

public class ExitLevelController {
	Model model;
	Application application;
	
	public ExitLevelController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		
		/*
		 * TODO
		 * -save persistent data
		 * 		-high-score
		 * 		-unlocked levels
		 * -go back to level selection screen
		 */
		
		return false;
	}
}
