package game.controller;

import game.boundary.Application;
import game.boundary.GameModeScreen;
import game.entities.Model;

public class SelectPlayController {
	public SelectPlayController(Application application, Model model) {
		application.setCurrentFrame(new GameModeScreen(application, model));
	}	
}
