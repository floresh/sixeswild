package game.controller;

import game.boundary.Application;
import game.entities.Model;

public class MovesLeftController {
	Model model;
	Application application;
	
	public MovesLeftController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
