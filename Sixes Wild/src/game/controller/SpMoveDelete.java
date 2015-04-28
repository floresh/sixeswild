package game.controller;

import game.entities.Board;
import game.entities.Location;

public class SpMoveDelete {
	
	MovesLeftController movesLeft;
	Board board;
	Location location;
	
	
	public SpMoveDelete(MovesLeftController movesLeft , Board board  ){
		
		this.board = board;
		this.movesLeft = movesLeft;
		
			
	}
	
	public boolean process(Location location){
		 
	this.location= location;
	int row = location.getRow();
	int column = location.getColumn();
	board.cells[row][column].setIsEmpty(true);
	
	board.gravity();
	
	return movesLeft.process();
	
	
	}
	
	

}
