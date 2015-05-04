package game.move.controller;

import game.boundary.BoardView;
import game.boundary.CellView;
import game.boundary.LevelView;
import game.entities.Cell;
import game.entities.Tile;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * 
 * @author Li Li
 *
 */
public class MoveDeleteController extends MouseAdapter{

	BoardView bv;
	ArrayList<Cell> cells = new ArrayList<Cell>();
	LevelView lv;
	Tile tile;
	MoveController mover;
	SelectionController sc = new SelectionController(bv, mover);
	DeleteButtonController dBC;
	
	public MoveDeleteController(BoardView bv , DeleteButtonController dBC) {
		this.dBC = dBC;
		this.bv = bv;
	}
	@Override
	public void mouseClicked(MouseEvent me){
		System.out.println("Please");
		Object src = me.getSource();
		CellView cellView = (CellView) src;		
		Cell cell = cellView.getCell();
		SpMoveDelete m = new SpMoveDelete(bv);
		m.doMove(cell);
		dBC.done();
		//bv.setActiveListener(new SelectionController(bv, mover));
		
	}
//	@Override
//	public void mousePressed (MouseEvent me){
//		System.out.println("Please");
//		Object src = me.getSource();
//		CellView cellView = (CellView) src;		
//		Cell cell = cellView.getCell();
//		if(!cell.isSelected()){
//			cells.add(cell);
//			cell.setSelected(true);
//		}
//		System.out.println("please");	
//	}
//	
//	@Override
//	public void mouseReleased (MouseEvent me){
//		//if((!(cells.get(0) == null)) && (cells.size() == 1)) {
//			SpMoveDelete m = new SpMoveDelete(bv);
//			m.doMove(cells.get(0));
//			cells.get(0).setSelected(false);
//			cells.clear();
//			bv.setActiveListener(new SelectionController(bv, mover));
//	//	}
//		
//	}
}


