package game.controller;

import game.entities.*;

public class Move {
	Model model;
	SixesWild application;
	
	public Move(SixesWild app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
