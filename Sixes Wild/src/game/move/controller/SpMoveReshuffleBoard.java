package game.move.controller;


import java.util.ArrayList;
import java.util.Collections;

import game.boundary.Application;
import game.controller.Move;
import game.controller.MovesLeftController;
import game.entities.*;

public class SpMoveReshuffleBoard extends Move{
	Model model;
	Application application;
	
	MovesLeftController movesLeft = new MovesLeftController(application, model);
	
	public SpMoveReshuffleBoard(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		ArrayList<Tile> tiles = model.getCurrentLevel().getBoard().getTiles();
		Collections.shuffle(tiles);
		model.getCurrentLevel().getBoard().setTiles(tiles);
		
		movesLeft.process();
		
		//TODO refresh boundary
		
		return true;
	}

	@Override
	public boolean doMove() {
		// TODO Auto-generated method stub
		return false;
	}
}
