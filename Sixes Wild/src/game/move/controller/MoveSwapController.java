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

/**
 * 
 * @author Li Li
 *
 */
public class MoveSwapController extends MouseAdapter{

	BoardView bv;
	ArrayList<Cell> cells = new ArrayList<Cell>();
	Cell cell1;
	Cell cell2;
	
	public MoveSwapController(BoardView bv) {
		this.bv = bv;
	}

	@Override
	public void mousePressed (MouseEvent me){
		if(!(cells.size() == 2)){
		Object src = me.getSource();
		CellView cellView = (CellView) src;		
		Cell cell = cellView.getCell();
		cells.add(cell);
	}
	}
	
	@Override
	public void mouseReleased (MouseEvent me){
		if(cells.size() == 2) {
			SpMoveSwapTiles m = new SpMoveSwapTiles(bv);
			cell1 = cells.get(0);
			cell2 = cells.get(1);
			m.doMove(cell1, cell2);
			cells.clear();
		}
		
	}
}


