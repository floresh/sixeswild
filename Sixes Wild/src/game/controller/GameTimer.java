package game.controller;

import game.boundary.Application;
import game.entities.Model;

import java.util.TimerTask;

public class GameTimer extends TimerTask {
	Model model;
	Application application;
	
	public GameTimer(Application app, Model m) {
		this.model = m;
		this.application = app;
	}

	@Override
	public void run() {
		int time = model.getLevel().getTime() + 1;
		model.getLevel().setTime(time);
	}

}
