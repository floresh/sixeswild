package game.move.controller;


import java.util.ArrayList;
import java.util.Collections;

import game.boundary.Application;
import game.controller.MovesLeftController;
import game.entities.*;

public class SpMoveReshuffleBoard {
	Model model;
	Application application;
	Board board;
    Level level;
	
	MovesLeftController movesLeft = new MovesLeftController(level);
	
	public SpMoveReshuffleBoard(Board board) {
		this.board = board;
	}

	public boolean doMove() {
		ArrayList<Tile> tiles = model.getCurrentLevel().getBoard().getTiles();
		Collections.shuffle(tiles);
		model.getCurrentLevel().getBoard().setTiles(tiles);
		
		movesLeft.process();
		
		//TODO refresh boundary
		
		return true;
	}
}
