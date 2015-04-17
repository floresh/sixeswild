package game.controller;

import game.model.Model;
import MainGame.Application;

public class ResetBoardController {
	Model model;
	Application application;
	
	public ResetBoardController(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
