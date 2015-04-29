package game.controller;

import game.boundary.LevelView;
import game.main.Main;

import java.util.TimerTask;

/**
 * 
 * @author hfloreshuerta
 *
 */
public class GameTimer extends TimerTask {
	LevelView frame;
	
	public GameTimer(LevelView levelView) {
		this.frame = levelView;
	}

	@Override
	public void run() {
		int time = Main.model.getCurrentLevel().getTime() + 1;
		Main.model.getCurrentLevel().setTime(time);
		
		frame.refreshTimer();
	}

}
