package game.controller;

import game.entities.*;

public class EliminationMove {
	Model model;
	SixesWild application;
	
	public EliminationMove(SixesWild app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
