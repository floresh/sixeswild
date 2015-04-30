package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import game.boundary.Application;
import game.boundary.BoardView;
import game.boundary.LevelView;
import game.entities.*;

public class ResetBoardController implements ActionListener {
	
	Level level;	
	BoardView boardView;
	int time;
	int score;
	int movesLeft;
	public ResetBoardController(Level level , BoardView bv) {
		
		this.level = level;
		boardView = bv;
		time = level.getTime();
		score = level.getScore();
		movesLeft = level.getMovesLeft();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		boardView.getBoard().initialize();
		boardView.draw();
		
		level.setScore(score);
		level.setTime(time);
		level.setMovesLeft(movesLeft);
		
		
		
	}
}
