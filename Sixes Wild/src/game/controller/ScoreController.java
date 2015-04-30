package game.controller;

import game.boundary.Application;
import game.entities.Level;
import game.entities.Model;

public class ScoreController {
	Level level;
	
	public ScoreController(Level l) {
		this.level = l;
	}
	
	public boolean process(int score) {
		int currentScore = level.getScore();
		level.setScore(currentScore + score);
		return true;
	}

}
