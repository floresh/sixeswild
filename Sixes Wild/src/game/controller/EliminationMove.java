package game.controller;

import MainGame.Application;
import MainGame.Model;

public class EliminationMove {
	Model model;
	Application application;
	
	public EliminationMove(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
