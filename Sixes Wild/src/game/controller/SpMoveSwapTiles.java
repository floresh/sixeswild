package game.controller;

import game.boundary.Application;
import game.entities.Model;
import game.entities.Tile;

public class SpMoveSwapTiles {
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
		Tile temp = tile1;
		tile1 = tile2;
		tile2 = temp;
		
		movesLeft.process();
		
		return true;
	}
}
