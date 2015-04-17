package game.controller;

import game.model.Model;
import MainGame.Application;

public class ExitLevelController {
	Model model;
	Application application;
	
	public ExitLevelController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
