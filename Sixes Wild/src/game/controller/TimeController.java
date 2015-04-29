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
	LevelView frame;
	String gameMode;
	
	Timer timer = new Timer();
	TimerTask timerTask;
	
	public TimeController(String gameModeString, LevelView levelView) {
		this.frame = levelView;
		this.gameMode = gameModeString;
	}
	
	public boolean stop() {
		timer.cancel();
		return true;
	}
	
	public boolean play() {
		if(this.gameMode == "Lightning")
			timerTask = new LightningTimer(frame);
		else
			timerTask = new GameTimer(frame);
		
		timer.schedule(timerTask, 0, 1000);
		return false;
	}
}
