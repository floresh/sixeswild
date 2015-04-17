package game.controller;

import MainGame.Application;
import MainGame.Model;

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
