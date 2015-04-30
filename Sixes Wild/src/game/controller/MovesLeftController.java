package game.controller;

import game.boundary.Application;
import game.entities.*;

public class MovesLeftController {
	Model model;
	
	public MovesLeftController(Model m) {
		this.model = m;

	}
	
	public boolean process() {
		int movesLeft = model.getCurrentLevel().getMovesLeft();
		model.getCurrentLevel().setMovesLeft(movesLeft - 1);
		
		if(movesLeft == 1) {
			//TODO: end game
		}
		
		return true;
	}
}
