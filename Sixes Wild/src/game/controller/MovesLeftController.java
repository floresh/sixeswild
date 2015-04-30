package game.controller;

import game.boundary.Application;
import game.entities.*;

public class MovesLeftController {
	Level level;
	
	public MovesLeftController(Level level) {
		this.level = level;

	}
	
	public boolean process() {
		int movesLeft = level.getMovesLeft();
		level.setMovesLeft(movesLeft - 1);
		
		if(movesLeft == 1) {
			//TODO: end game
		}
		
		return true;
	}
}
