package game.controller;

import game.boundary.Application;
import game.model.Model;

public class PauseController {
	Model model;
	Application application;
	
	public PauseController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
