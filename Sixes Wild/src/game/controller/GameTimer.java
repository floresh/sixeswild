package game.controller;

import game.boundary.Application;
import game.boundary.LevelView;
import game.entities.Model;
import game.main.Main;

import java.util.TimerTask;

import javax.swing.JFrame;

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
		int time;
		if(frame.getLevel().getGameMode() != "Lightning"){
			time = Main.model.getCurrentLevel().getTime() - 1;
		}
		else{
			time = Main.model.getCurrentLevel().getTime() + 1;
		}
		
		Main.model.getCurrentLevel().setTime(time);
		
	//	if(time == -1){
	//		new EndGameController(frame);
	//	}
		frame.refreshTimer();
	}

}
