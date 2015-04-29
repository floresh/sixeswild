package game.controller;

import game.boundary.Application;
import game.boundary.LevelView;
import game.entities.Model;

public class StartLevelController {
	Model model;
	String gameMode;
	Application application;
	
	public StartLevelController(Application app, Model m, String gameModeString) {
		this.model = m;
		this.application = app;
		this.gameMode = gameModeString;
	}
	
	/*
	 * TODO
	 * -open levle view
	 * -start timer
	 */
}
