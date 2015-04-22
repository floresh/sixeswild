package game.controller;

import java.util.ArrayList;

import game.boundary.Application;
import game.entities.*;

public class Move {
	Model model;
	Application application;
	ArrayList<Cell> cells;
	
	ScoreController updateScore = new ScoreController(application, model);
	MovesLeftController movesLeft = new MovesLeftController(application, model);
	
	public Move(Application app, Model m, ArrayList<Cell> cells) {
		this.model = m;
		this.application = app;
		this.cells = cells;
	}
	
	public boolean process() {
		Cell next;
		int size = cells.size();
		int total = 0;
		int subtotal = 0;
		
		
		if(size > 6) { return false; }
		
		for(int i = 0; i < size; i++) {
			next = cells.get(i);
			
			subtotal += next.getTile().getValue();
			
			total += next.getTile().getValue();
			total *= next.getTile().getMultiplier();
		}
		
		if(subtotal != 6) { return false; }
		
		movesLeft.process();
		updateScore.process(total);
		
		model.getLevel().getBoard().gravity();
		
		
		return true;
	}
}
