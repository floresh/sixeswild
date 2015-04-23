package game.controller;

import game.boundary.Application;
import game.boundary.EliminationLevelSelection;
import game.boundary.LightningLevelSelection;
import game.boundary.PuzzleLevelSelection;
import game.boundary.ReleaseLevelSelection;
import game.entities.Model;

public class SelectGameModeController {
	Model model;
	Application application;
	
	public SelectGameModeController(Application app, Model m, String level) {
		this.model = m;
		this.application = app;
		
		process(level);
	}
	
	private boolean process(String level) {
		switch(level) {
		case "Puzzle":
			application.setCurrentFrame(new PuzzleLevelSelection(application, model));
			return true;
		case "Lightning":
			application.setCurrentFrame(new LightningLevelSelection(application, model));
			return true;
		case "Release":
			application.setCurrentFrame(new ReleaseLevelSelection(application, model));
			return true;
		case "Elimination":
			application.setCurrentFrame(new EliminationLevelSelection(application, model));
			return true;
		}
		return false;
	}
	
	/* TODO
	 * -if available, load first level
	 * 		and preview first level
	 */
}
