package game.controller;

import game.model.Model;
import MainGame.Application;

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
