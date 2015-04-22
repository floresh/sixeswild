package game.controller;

import game.entities.*;

public class ExitLevelController {
	Model model;
	SixesWild application;
	
	public ExitLevelController(SixesWild app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
