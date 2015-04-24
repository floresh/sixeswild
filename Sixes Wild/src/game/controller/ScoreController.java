package game.controller;

import game.boundary.Application;
import game.entities.Model;

public class ScoreController {
	Model model;
	Application application;
	
	public ScoreController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process(int score) {
		int currentScore = model.getCurrentLevel().getScore();
		model.getCurrentLevel().setScore(currentScore + score);
		return true;
	}

}
