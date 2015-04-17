package game.controller;

import MainGame.Application;
import MainGame.Model;

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
