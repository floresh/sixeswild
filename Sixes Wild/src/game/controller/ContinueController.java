package game.controller;

import MainGame.Application;
import MainGame.Model;

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
