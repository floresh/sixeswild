package game.move.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import game.boundary.Application;
import game.boundary.BoardView;
import game.boundary.CellView;
import game.controller.Move;
import game.controller.MovesLeftController;
import game.controller.ScoreController;
import game.controller.SelectionController;
import game.entities.*;

public class MoveController extends SelectionController{
	//Now called move controller from move
	Model model;
	BoardView bv;
	ArrayList<Cell> cells;
	ArrayList<Boolean> validCheck;
	
	ScoreController updateScore = new ScoreController(model);
	MovesLeftController movesLeft = new MovesLeftController(model);
	
	public MoveController(Model m, ArrayList<Cell> cells) {
		super(m);
		this.model = m;
		this.cells = cells;

	}
	
	public boolean doMove() {
		Cell next;
		int total = 0;
		int subtotal = 0;
		
		
		if(!isValid()) { return false; }
		
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
		bv.draw();
		return true;
	}
//Board.cell.setIsEmpty(True)

	public boolean isValid(){
		int size = cells.size();

		if((size <= 6)){
			for(int cells.)
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isAdjacent(Cell otherCell) {
		
		return 
		
	}
}
