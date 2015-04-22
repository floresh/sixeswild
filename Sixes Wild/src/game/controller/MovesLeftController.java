package game.controller;

import game.entities.*;

public class MovesLeftController {
	Model model;
	SixesWild application;
	
	public MovesLeftController(SixesWild app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
