package game.controller;

import game.boundary.Application;
import game.entities.*;

public class SelectGameModeController {
	
	Model model;
	Application application;

	public SelectGameModeController (Model m, Application app) {
		
		this.model = m;
		this.application = app;
}
}