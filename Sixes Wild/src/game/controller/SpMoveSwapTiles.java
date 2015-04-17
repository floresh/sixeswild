package game.controller;

import MainGame.Application;
import MainGame.Model;

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
