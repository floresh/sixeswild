package game.controller;

import java.util.Timer;
import java.util.TimerTask;

import game.boundary.LevelView;

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
	}
	
	public boolean stop() {
		timerTask.cancel();
		return true;
	}
	
	public boolean play() {
		if(gameMode == "Lightning")
			timerTask = new LightningTimer(frame);
		else
			timerTask = new GameTimer(frame);
		
		timer.schedule(timerTask, 1000, 1000);
		return false;
	}
}
