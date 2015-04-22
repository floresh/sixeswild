package game.controller;

import game.entities.*;

public class ResetBoardController {
	Model model;
	SixesWild application;
	
	public ResetBoardController(SixesWild app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
