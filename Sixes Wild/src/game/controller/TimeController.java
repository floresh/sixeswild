package game.controller;

import java.util.Timer;
import java.util.TimerTask;

import game.boundary.Application;
import game.boundary.LevelView;
import game.entities.*;

/**
 * 
 * @author hfloreshuerta
 *
 */
public class TimeController {
	String gameMode;
	LevelView frame;
	
	Timer timer = new Timer();
	TimerTask timerTask;
	
	public TimeController(String gameModeString, LevelView levelView) {
		this.frame = levelView;
		this.gameMode = gameModeString;
		
		if(gameMode == "Lightning")
			timerTask = new LightningTimer(frame);
		else
			timerTask = new GameTimer(frame);
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
