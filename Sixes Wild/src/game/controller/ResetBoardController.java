package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
	int dm;
	int sm;
	int rm;
	
	public ResetBoardController(LevelView lv) {
		
		this.level = lv.getLevel();
		boardView = lv.getBoardView();
		time = level.getTime();
		score = level.getScore();
		movesLeft = level.getMaxMoves();
		this.levelView = lv;
		dm = level.getDeletsLeft();
		sm = level.getSwapsLeft();
		rm = level.getReshufflesLeft();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Resets the board and refreshes all of the displayed data on levelView
		
		boardView.getBoard().initialize();
		boardView.draw();
		
		level.setScore(0);
		level.setTime(0);
		level.setMovesLeft(movesLeft);		
		levelView.getScoreLabel().setText("0");
		levelView.getProgressBar().setValue(0);
		levelView.getMovesLeftLabel().setText(((Integer)movesLeft).toString());
		level.setDeletesLeft(dm);
		level.setSwapsLeft(sm);
		level.setReshufflesLeft(rm);
		
	}
}
