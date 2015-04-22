package game.controller;

import game.entities.*;

public class ContinueController {
	Model model;
	SixesWild application;
	
	public ContinueController(SixesWild app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
