package game.controller;

import game.boundary.Application;
import game.entities.*;

public class SelectLevelController {

	Model model;
	Application application;
	
	public SelectLevelController (Model m, Application app) {
		this.model = m;
		this.application = app;
	}
}
