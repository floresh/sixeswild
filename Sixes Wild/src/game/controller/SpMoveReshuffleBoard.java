package game.controller;

import game.boundary.Application;
import game.model.Model;

public class SpMoveReshuffleBoard {
	Model model;
	Application application;
	
	public SpMoveReshuffleBoard(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}