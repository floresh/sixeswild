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

	SwapButtonController sbc;
	BoardView bv;
	ArrayList<Cell> cells = new ArrayList<Cell>();
	Cell cell1;
	Cell cell2;
	
	public MoveSwapController(BoardView bv , SwapButtonController sbc) {
		this.bv = bv;
		this.sbc = sbc;
	}

	@Override
	public void mouseClicked(MouseEvent me){
		System.out.println("thank you");
		Object src = me.getSource();
		CellView cellView = (CellView) src;		
		Cell cell = cellView.getCell();
		sbc.swap(cell);
		//bv.setActiveListener(new SelectionController(bv, mover));
		
	}
}


