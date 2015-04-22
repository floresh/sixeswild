package game.controller;

import game.entities.*;

public class SpMoveReshuffleBoard {
	Model model;
	SixesWild application;
	
	public SpMoveReshuffleBoard(SixesWild app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
