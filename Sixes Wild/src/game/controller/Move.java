package game.controller;

import java.util.ArrayList;

import javax.swing.event.MouseInputAdapter;

import game.boundary.Application;
import game.entities.*;

public class Move{
	//have individual rows and columns instead?  otherwise we have two instances of arrays of cells one in here and one in the board.
	Model model;
	Application application;
	ArrayList<Cell> cells;
	public int srcRow;
	public int srcCol;
	public int destRow;
	public int destCol;
	
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
		
		model.getCurrentLevel().getBoard().gravity();
		
		//TODO refresh boundary
		
		
		return true;
	}
	// A possible way to check if the move is legal is to check if the second tile we select has the same x or y as the 
	// first one and the third tile has to have the same x or y as the other two and etc till we reach 6 tiles.  Having
	// separate row and column parameters would help greatly in writing this function.
	public boolean legalSelection(int x, int y) {
		return false;
		
	}
}
