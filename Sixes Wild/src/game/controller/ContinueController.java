package game.controller;

import game.model.Model;
import MainGame.Application;

public class ContinueController {
	Model model;
	Application application;
	
	public ContinueController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
