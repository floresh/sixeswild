package game.move.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import game.boundary.BoardView;
import game.boundary.CellView;
import game.boundary.LevelView;
import game.entities.Cell;
import game.entities.Location;
import game.main.Main;

public class SpMoveDelete implements ActionListener {
	
	LevelView levelView;
	Location location;
	
	
	public SpMoveDelete(LevelView levelView){
		this.levelView = levelView;
			
	}
	
	public void MousePressed (MouseEvent me){
		Object src = me.getSource();
		CellView cellView = (CellView) src;		
		Cell cell = cellView.getCell();
		doMove(cell);
		levelView.getBoardView().getBoard().gravity();
	}

	public boolean doMove(Cell cell){
		cell.setIsEmpty(true);
		return true;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
