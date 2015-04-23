package game.controller;

import game.boundary.Application;
import game.entities.Model;

public class SelectLevelController {
	Model model;
	String gameMode;
	Application application;
	
	public SelectLevelController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	private void process() {
		/*
		 * TODO
		 * -load level
		 * -show level preview
		 */
	}
}
