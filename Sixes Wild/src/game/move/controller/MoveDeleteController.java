package game.move.controller;

import game.boundary.BoardView;
import game.boundary.CellView;
import game.boundary.LevelView;
import game.entities.Cell;
import game.entities.Model;
import game.entities.Tile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MoveDeleteController extends MouseAdapter{
//Blahddddd
	BoardView bv;
	ArrayList<Cell> cells = new ArrayList<Cell>();
	LevelView lv;
	Tile tile;
	MoveController mover;
	SelectionController sc = new SelectionController(bv, mover);
	
	public MoveDeleteController(BoardView bv) {
		this.bv = bv;
	}

//	public void register() {
//		bv.setActiveListener(this);
//		bv.setActiveMotionListener(this);
//	}
	
	public void MousePressed (MouseEvent me){
		Object src = me.getSource();
		CellView cellView = (CellView) src;		
		Cell cell = cellView.getCell();
		cells.add(cell);
		System.out.println("hi");
	}
	
	public void MouseReleased (MouseEvent me){
		//if((!(cells.get(0) == null)) && (cells.size() == 1)) {
			SpMoveDelete m = new SpMoveDelete(bv);
			m.doMove(cells.get(0));
			cells.get(0).setIsEmpty(false);
			cells.clear();
			lv.getBoardView().setActiveListener(sc);
	//	}
		
	}
}


