package game.controller;

import game.boundary.Application;
import game.entities.Model;

public class EndGameController {
	Model model;
	Application application;
	
	public EndGameController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}

}
