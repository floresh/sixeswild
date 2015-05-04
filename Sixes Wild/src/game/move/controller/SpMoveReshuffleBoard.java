package game.move.controller;


import java.util.ArrayList;
import java.util.Collections;

import game.boundary.Application;
import game.boundary.BoardView;
import game.boundary.LevelView;
import game.controller.MovesLeftController;
import game.entities.*;

public class SpMoveReshuffleBoard {
	Model model;
	Application application;
	BoardView bv;
    Level level;
	
	//MovesLeftController movesLeft = new MovesLeftController(level);
	//Blah
	public SpMoveReshuffleBoard(BoardView bv) {
		this.bv = bv;
	}

	public boolean doMove() {
		ArrayList<Tile> tiles = model.getCurrentLevel().getBoard().getTiles();
		Collections.shuffle(tiles);
		model.getCurrentLevel().getBoard().setTiles(tiles);
		bv.draw();
	//	movesLeft.process();	
		return true;
	}
}
