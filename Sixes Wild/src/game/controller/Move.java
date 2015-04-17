package game.controller;

import game.model.Model;
import MainGame.Application;

public class Move {
	Model model;
	Application application;
	
	public Move(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
