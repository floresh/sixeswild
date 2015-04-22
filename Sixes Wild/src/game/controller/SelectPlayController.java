package game.controller;

import game.boundary.Application;
import game.entities.*;

public class SelectPlayController {

	Model model;
	Application application;
	
	public SelectPlayController (Model m, Application app) {
		this.model = m;
		this.application = app;
	}
}
