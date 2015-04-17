package game.controller;

import MainGame.Application;
import MainGame.Model;

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
