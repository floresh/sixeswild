package game.move.controller;

import game.boundary.BoardView;
import game.boundary.CellView;
import game.entities.Cell;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingUtilities;
/**
 * 
 * @author Li, Andrew, Jake
 *
 */

public class SelectionController extends MouseAdapter{
	/** Needed for controller behavior **/
	BoardView bv;
	ArrayList<Cell> cells = new ArrayList<Cell>();
	MoveController move;


	public SelectionController(BoardView view, MoveController mover) {
		bv = view;
		move = mover;
	}

	/** Set up press events but no motion events. */
	public void register() {
		bv.setActiveListener(this);
		bv.setActiveMotionListener(this);
	}

	public void mousePressed(MouseEvent me){
	
		Object src = me.getSource();
		CellView cellView = (CellView) src;		
		Cell cell = cellView.getCell();
//		cell.setIsEmpty(true);
//		bv.getBoard().gravity();
//		bv.draw();
		
		if(!cell.isSelected()){
			cells.add(cell);
			cell.setSelected(true);
		}
		System.out.println(cells);
	
	}
	
	public void mouseEntered(MouseEvent me) {
		if(SwingUtilities.isLeftMouseButton(me)){
			Object src = me.getSource();
			CellView cellView = (CellView) src;
			Cell cell = cellView.getCell();
			if(!cell.isSelected()){
				cells.add(cell);
				cell.setSelected(true);
			}
			System.out.println(cells);
		}
	}

	public void mouseReleased(MouseEvent me){
		move.doMove(cells);
		for (int i = 0; i < cells.size();i++){
			cells.get(i).setSelected(false);
			
		}
		cells.clear();
		bv.draw();
	}

	public ArrayList<Cell> selectedCellsList(){
		return cells;
	}

	public int getSize(){

		return cells.size();

	}
	}

