package game.controller;

import game.boundary.Application;
import game.model.Model;

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