package game.controller;

import game.boundary.BoardView;
import game.boundary.CellView;
import game.entities.Cell;
import game.entities.Location;
import game.entities.Model;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingUtilities;
//
public class SelectionController extends MouseAdapter{
	/** Needed for controller behavior **/
	BoardView bv;
	ArrayList<Cell> cells = new ArrayList<Cell>();


	public SelectionController(BoardView view) {
		bv = view;
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
		doMove();
		for (int i = 0; i < cells.size();i++){
			cells.get(i).setSelected(false);
		}
		cells.clear();
	}

	public ArrayList<Cell> selectedCellsList(){
		return cells;
	}

	public int getSize(){

		return cells.size();

	}

	public void deleteCells(){
		cells.clear();
	}

	public boolean doMove() {
		Cell next;
		int total = 0;
		int subtotal = 0;
		int size = getSize();

		if(!isLegal(size)) { return false; }

		for(int i = 0; i < size; i++) {
			next = cells.get(i);

			subtotal += next.getTile().getValue();

			total += next.getTile().getValue();
			total *= next.getTile().getMultiplier();
		}

		if(subtotal != 6) { return false; }
		for(int i = 0; i < size; i++){
			int col = cells.get(i).getLocation().getColumn();
			int row = cells.get(i).getLocation().getRow();
			bv.getBoard().cells[row][col].setIsEmpty(true);
		}

		//movesLeft.process();
		//updateScore.process(total);

		bv.getBoard().gravity();
		bv.draw();
		return true;
	}

	public boolean isLegal(int size) {
		if(size > 6) { return false; }

		int total = 0;
		ArrayList<Location> locations = new ArrayList<Location>();

		for(int i = 0; i < size; i++) {
			locations.add(cells.get(i).getLocation());
			total += cells.get(i).getTile().getValue();
		}
		if(total != 6) { return false; }
		else{

			Location l1, l2;
			int r1,r2,c1,c2;
			boolean funtimes = false;
			
			for(int i = 1; i < size; i++) {
				l1 = locations.get(i);
				l2 = locations.get(i-1);
				r1=l1.getRow(); r2=l2.getRow();
				c1=l1.getColumn(); c2=l2.getColumn();

				if(l1 == l2 || ((r1+1 == r2 || r1-1 == r2) && (c1 == c2)) ||
						((c1+1 == c2 || c1-1 == c2) && (r1 == r2))) {
					System.out.println(l1);
					System.out.println(l2);
					System.out.println(r1);
					System.out.println(r2);
					System.out.println(c1);
					System.out.println(c2);
					funtimes = true;
				}
			}
			
			return funtimes;

		}
	}
}

