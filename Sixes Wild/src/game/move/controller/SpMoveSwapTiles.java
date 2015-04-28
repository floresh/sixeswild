package game.move.controller;

import game.boundary.Application;
import game.controller.Move;
import game.controller.MovesLeftController;
import game.entities.Model;
import game.entities.Tile;

public class SpMoveSwapTiles extends Move{
	Model model;
	Application application;
	
	MovesLeftController movesLeft = new MovesLeftController(application, model);
	
	Tile tile1, tile2;
	
	public SpMoveSwapTiles(Application app, Model m, Tile tile1, Tile tile2) {
		this.model = m;
		this.application = app;
		this.tile1 = tile1;
		this.tile2 = tile2;
	}
	
	public boolean process() {
		
		// these are local variables, this method does nothing.
		Tile temp = tile1;
		tile1 = tile2;
		tile2 = temp;
		
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