package game.move.controller;

import game.boundary.Application;
import game.controller.MovesLeftController;
import game.entities.Board;
import game.entities.Model;
import game.entities.Tile;

public class SpMoveSwapTiles {
	Board board;



	Tile tile1, tile2;
	
	public SpMoveSwapTiles(Board board) {
		this.board = board;
	}
	
	public boolean doMove() {
		
		// these are local variables, this method does nothing.
		Tile temp = tile1;
		tile1 = tile2;
		tile2 = temp;
		

		
		//TODO refresh boundary
		
		return true;
	}
}
