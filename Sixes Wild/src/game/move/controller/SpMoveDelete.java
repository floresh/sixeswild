package game.move.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import game.controller.Move;
import game.controller.MovesLeftController;
import game.entities.Board;
import game.entities.Location;
import game.entities.Model;

public class SpMoveDelete extends Move{
	
	MovesLeftController movesLeft;
	Board board;
	Location location;
	
	
	public SpMoveDelete(Board board){
		this.board = board;
			
	}
	
	public boolean doMove(){

	int row = location.getRow();
	int column = location.getColumn();
	board.cells[row][column].setIsEmpty(true);
	
	board.gravity();
	
	return movesLeft.process();
	
	
	}
}
