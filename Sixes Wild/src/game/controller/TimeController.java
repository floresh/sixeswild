package game.controller;

import java.util.Timer;
import java.util.TimerTask;

import game.boundary.Application;
import game.entities.*;

/**
 * 
 * @author hfloreshuerta
 *
 */
public class TimeController {
	Model model;
	Application application;
	
	Timer timer = new Timer();
	TimerTask timerTask;
	
	public TimeController(Application app, Model m, String gameMode) {
		this.model = m;
		this.application = app;
		
		if(gameMode == "Lightning")
			timerTask = new LightningTimer(application, model);
		else
			timerTask = new GameTimer(application, model);
	}
	
	public boolean stop() {
		timer.cancel();
		return true;
	}
	
	public boolean play() {
		timer.schedule(timerTask, 1000);
		return false;
	}
}
