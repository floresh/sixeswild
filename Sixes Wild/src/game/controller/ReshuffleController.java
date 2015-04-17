package game.controller;

import MainGame.Application;
import MainGame.Model;

public class ReshuffleController {
	Model model;
	Application application;
	
	public ReshuffleController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
