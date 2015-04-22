package game.controller;

import game.entities.*;

public class TimeController {
	Model model;
	SixesWild application;
	
	public TimeController(SixesWild app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
