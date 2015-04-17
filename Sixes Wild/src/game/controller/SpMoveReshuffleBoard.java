package game.controller;

import game.model.Model;
import MainGame.Application;

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
