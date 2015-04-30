package game.controller;

import game.boundary.BoardView;
import game.boundary.CellView;
import game.entities.Cell;
import game.entities.Model;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

public class SelectionController extends MouseAdapter{
	/** Needed for controller behavior **/
	Model model;
	BoardView bv;
	ArrayList<Cell> cells = new ArrayList<Cell>();
	int size;

	public SelectionController(Model model/*, BoardView bv*/){
		this.model = model;
	//	this.bv = bv;
		}
	
	/** Set up press events but no motion events. */
	public void register() {
		bv.setActiveListener(this);
		bv.setActiveMotionListener(this);
	}

	public void mouseEntered(MouseEvent me) {
		if(SwingUtilities.isLeftMouseButton(me)){
		Object src = me.getSource();
		CellView cellView = (CellView) src;
		Cell cell = cellView.getCell();
		if(!cell.isSelected()){
			cells.add(cell);
			cell.setSelected();
		}
		System.out.println(cells);
	}
	}

	public ArrayList<Cell> selectedCellsList(){
		return cells;
	}
	
	public int getSize(){
		return ;
	}
}

