package game.controller;

import game.boundary.Application;
import game.entities.Model;

public class SelectLevelController {
	Model model;
	String gameMode;
	
	
	public SelectLevelController(Application app, Model m) {
		this.model = m;
	
	}
	
	private void process() {
		
		model.getCurrentLevel().initilizeBoard();
		
		/*
		 * TODO
		 * -load level
		 * -show level preview
		 */
	}
}
