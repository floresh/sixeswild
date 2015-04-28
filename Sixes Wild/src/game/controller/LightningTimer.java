package game.controller;

import game.boundary.Application;
import game.entities.Model;

import java.util.TimerTask;

public class LightningTimer extends TimerTask {
	Model model;
	Application application;
	boolean lose;
	
	public LightningTimer(Application app, Model m) {
		this.model = m;
		this.application = app;
		lose = false;
	}

	@Override
	public void run() {
		int time = model.getCurrentLevel().getTime() - 1;
		model.getCurrentLevel().setTime(time);
		
		if(time == 0) {
			lose = true;
		}
	}
	
	public boolean getLose(){
		return lose;
	}

}
