package game.controller;

import game.boundary.Application;
import game.entities.*;

public class MovesLeftController {
	Model model;
	Application application;
	
	public MovesLeftController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		int movesLeft = model.getLevel().getMovesLeft();
		model.getLevel().setMovesLeft(movesLeft - 1);
		
		if(movesLeft == 1) {
			//TODO: end game
		}
		
		return true;
	}
}
