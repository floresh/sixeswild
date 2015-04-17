package game.controller;

import game.model.Model;
import MainGame.Application;

public class SpMoveSwapTiles {
	Model model;
	Application application;
	
	public SpMoveSwapTiles(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
