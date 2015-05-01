package game.move.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import game.boundary.BoardView;
import game.boundary.CellView;
import game.controller.MovesLeftController;
import game.entities.Board;
import game.entities.Cell;
import game.entities.Location;

public class SpMoveDelete implements ActionListener {
	
	BoardView bv;
	Location location;
	
	
	public SpMoveDelete(BoardView view){
		this.bv = view;
			
	}
	
	public void register() {
		bv.setActiveListener(this);
		bv.setActiveMotionListener(this);
	}
	
	public void MousePressed (MouseEvent me){
		Object src = me.getSource();
		CellView cellView = (CellView) src;		
		Cell cell = cellView.getCell();
		doMove(cell);
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
