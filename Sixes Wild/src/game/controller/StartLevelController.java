package game.controller;

import game.boundary.Application;
import game.entities.*;

public class StartLevelController {

	Model model;
	Application application;
	
	public StartLevelController (Model m, Application app) {
		this.model = m;
		this.application = app;
	}
}
