package game.controller;


import game.boundary.LevelView;
import game.entities.Model;

public class StartLevelController {
	Model model;
	String gameMode;

	
	public StartLevelController( Model m, String gameModeString) {
		this.model = m;
	
		this.gameMode = gameModeString;
	}
	
	/*
	 * TODO
	 * -open level view
	 */
}
