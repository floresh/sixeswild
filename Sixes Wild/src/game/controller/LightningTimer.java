package game.controller;

import game.boundary.Application;
import game.entities.Model;

import java.util.TimerTask;

/**
 * 
 * @author hfloreshuerta
 *
 */
public class LightningTimer extends TimerTask {
	Model model;
	Application application;
	
	public LightningTimer(Application app, Model m) {
		this.model = m;
		this.application = app;
	}

	@Override
	public void run() {
		int time = model.getCurrentLevel().getTime() - 1;
		model.getCurrentLevel().setTime(time);
		
		if(time == 0) {
			// end game
		}
	}
}
