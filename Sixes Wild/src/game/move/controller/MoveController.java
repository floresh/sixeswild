package game.move.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.event.MouseInputAdapter;

import game.boundary.Application;
import game.boundary.CellView;
import game.controller.MovesLeftController;
import game.controller.ScoreController;
import game.entities.*;

public class MoveController extends Move implements MouseListener, MouseMotionListener{
	//have individual rows and columns instead?  otherwise we have two instances of arrays of cells one in here and one in the board.
	Model model;
	Application application;
	ArrayList<Cell> cells;
	ArrayList<CellView> selectedCells;
	
	ScoreController updateScore = new ScoreController(application, model);
	MovesLeftController movesLeft = new MovesLeftController(application, model);
	
	public MoveController(Application app, Model m, ArrayList<Cell> cells) {
		this.model = m;
		this.application = app;
		this.cells = cells;
		selectedCells = new ArrayList<CellView>();

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
	
	public void selectTile(CellView cellView){
		selectedCells.add(cellView);
		cellView.getCell().getTile().setSelected();
	}
	
	//Checks if the move is valid.
	public boolean legalSelection() {
		return false;
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse pressed");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean doMove() {
		// TODO Auto-generated method stub
		return false;
	}
}
