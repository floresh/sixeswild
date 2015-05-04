package game.move.controller;

import game.boundary.BoardView;
import game.entities.Board;
import game.entities.Cell;
import game.entities.Location;
import game.entities.Tile;

public class SpMoveSwapTiles {
	BoardView bv;
	Cell cell;
	Cell cell2;
	
	public SpMoveSwapTiles(BoardView bv) {
		this.bv = bv;
	}
	
	public boolean doMove(Cell cell, Cell cell2) {
		Tile temp = cell.getTile();
		cell.setTile(cell2.getTile());
		cell2.setTile(temp);
		return true;
	}
}
