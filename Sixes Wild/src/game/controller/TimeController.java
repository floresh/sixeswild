package game.controller;

import game.boundary.Application;
import game.entities.*;

public class TimeController {
	Model model;
	Application application;
	
	public TimeController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
