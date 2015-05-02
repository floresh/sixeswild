package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import game.boundary.Application;
import game.boundary.BoardView;
import game.boundary.LevelView;
import game.entities.*;

/**
 * 
 * @author Andrew, Jake
 *
 */
public class ResetBoardController implements ActionListener {
	LevelView levelView;
	Level level;	
	BoardView boardView;
	int time;
	int score;
	int movesLeft;
	public ResetBoardController(LevelView lv) {
		
		this.level = lv.getLevel();
		boardView = lv.getBoardView();
		time = level.getTime();
		score = level.getScore();
		movesLeft = level.getMovesLeft();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		boardView.getBoard().initialize();
		boardView.draw();
		
		level.setScore(0);
		level.setTime(0);
		level.setMovesLeft(movesLeft);		
	}
}
