package game.move.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import game.boundary.BoardView;
import game.boundary.CellView;
import game.entities.Cell;
import game.entities.Location;

public class SpMoveDelete implements ActionListener{
	
	BoardView boardView;
	Location location;
	
	
	public SpMoveDelete(BoardView boardView){
		this.boardView = boardView;
			
	}
	
	public void register() {
		boardView.setActiveListener((MouseListener) this);
		boardView.setActiveMotionListener((MouseMotionListener) this);
	}

	public void MousePressed (MouseEvent me){
		Object src = me.getSource();
		CellView cellView = (CellView) src;		
		Cell cell = cellView.getCell();
		doMove(cell);
		boardView.getBoard().gravity();
	}

	public boolean doMove(Cell cell){
		cell.setIsEmpty(true);
		return true;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
