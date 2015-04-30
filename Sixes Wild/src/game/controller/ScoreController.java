package game.controller;

import game.boundary.Application;
import game.entities.Model;

public class ScoreController {
	Model model;
	
	public ScoreController(Model m) {
		this.model = m;
	}
	
	public boolean process(int score) {
		int currentScore = model.getCurrentLevel().getScore();
		model.getCurrentLevel().setScore(currentScore + score);
		return true;
	}

}
