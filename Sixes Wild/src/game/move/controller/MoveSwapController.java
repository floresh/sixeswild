package game.move.controller;

import game.boundary.BoardView;
import game.boundary.CellView;
import game.boundary.LevelView;
import game.entities.Cell;
import game.entities.Location;
import game.entities.Tile;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MoveSwapController extends MouseAdapter{
//Blahddddd
	BoardView bv;
	ArrayList<Cell> cells = new ArrayList<Cell>();
	Cell cell1;
	Cell cell2;
	
	public MoveSwapController(BoardView bv) {
		this.bv = bv;
	}

	public void MousePressed (MouseEvent me){
		if(!(cells.size() == 2)){
		Object src = me.getSource();
		CellView cellView = (CellView) src;		
		Cell cell = cellView.getCell();
		cells.add(cell);
	}
	}
	
	public void MouseReleased (MouseEvent me){
		if(cells.size() == 2) {
			SpMoveSwapTiles m = new SpMoveSwapTiles(bv);
			cell1 = cells.get(0);
			cell2 = cells.get(1);
			m.doMove(cell1, cell2);
			cells.clear();
		}
		
	}
}


