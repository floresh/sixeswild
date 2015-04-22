package game.controller;

import game.entities.*;

public class PauseController {
	Model model;
	SixesWild application;
	
	public PauseController(SixesWild app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
