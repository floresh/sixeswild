package game.controller;


import game.boundary.Application;
import game.entities.*;

public class SpMoveReshuffleBoard {
	Model model;
	Application application;
	
	MovesLeftController movesLeft = new MovesLeftController(application, model);
	
	public SpMoveReshuffleBoard(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		model.getLevel().getBoard().randomize();
		
		movesLeft.process();
		
		return true;
	}
}
