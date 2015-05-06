package game.move.controller;

import game.boundary.LevelView;
import game.entities.Board;
import game.entities.Cell;
import game.entities.Tile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

/**
 * 
 * @author Li Li, Davis
 *
 */
public class SwapButtonController implements ActionListener{

	private LevelView lv;
	Board board;
	MouseListener oldMl;
	MouseMotionListener oldMML;
	private int left;
	ArrayList<Cell> cells = new ArrayList<Cell>();

	public SwapButtonController(LevelView lv){
		this.lv = lv;
		board  = lv.getLevel().getBoard();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		left = lv.getLevel().getSwapsLeft();
		if(left>0){
			 oldMl = lv.getBoardView().getActiveListener();
			oldMML = lv.getBoardView().getActiveMouseMotionListener();
		
		MoveSwapController msc = new MoveSwapController(lv.getBoardView(),this);
	//	lv.getLevel().setMoveSwap(true);
		lv.getBoardView().setActiveListener(msc);
		lv.getBoardView().setActiveMotionListener(msc);
		}	
	}
	
	public void swap(Cell cell){
		
		if (cell.getIsEnabled()){
		cells.add(cell);
		}
		
		if(cells.size()>1){
			int r1 = cells.get(0).getLocation().getRow();
			int c1 = cells.get(0).getLocation().getColumn();
			int r2 = cells.get(1).getLocation().getRow();
			int c2 = cells.get(1).getLocation().getColumn();
			Tile swap = cells.get(0).getTile();
			board.cells[r1][c1].setTile(cells.get(1).getTile());
			board.cells[r2][c2].setTile(swap);
			cells.clear();
			
		
			lv.getBoardView().draw();
			
			lv.getBoardView().setActiveListener(oldMl);
			lv.getBoardView().setActiveMotionListener(oldMML);
			lv.getLevel().setSwapsLeft(left-1);
			lv.updateSpMoves();
			
		}
	}
}