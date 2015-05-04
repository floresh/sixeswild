package game.move.controller;

import game.entities.Board;
import game.entities.Cell;
import game.entities.Location;
import game.entities.Tile;

public class SpMoveSwapTiles {
	Board board;
	Cell cell;
	Cell cell2;
	Location location;
	
	public SpMoveSwapTiles(Board board) {
		this.board = board;
	}
	
	public boolean doMove() {
		//Blah
		// these are local variables, this method does nothing.
		Tile temp = cell.getTile();
		cell.setTile(cell2.getTile());
		cell2.setTile(temp);
		
		
		return true;
	}
}
