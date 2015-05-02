package game.move.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import game.boundary.Application;
import game.controller.MovesLeftController;
import game.entities.Board;
import game.entities.Model;
import game.entities.Tile;

public class SpMoveSwapTiles extends MouseAdapter{
	Board board;
	Tile tile1, tile2;
	ArrayList<Tile> tiles;
	
	public SpMoveSwapTiles(Board board) {
		this.board = board;
	}
	
	public boolean MousePressed(MouseEvent me){
		
		
		return true;
		
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
