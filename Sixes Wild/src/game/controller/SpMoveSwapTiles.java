package game.controller;

import game.entities.*;

public class SpMoveSwapTiles {
	Model model;
	SixesWild application;
	
	public SpMoveSwapTiles(SixesWild app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
