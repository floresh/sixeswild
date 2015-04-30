package game.boundary;
import java.awt.event.MouseListener;

import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import game.controller.SelectionController;
import game.entities.Board;
import game.entities.Cell;
import game.entities.Model;


/**
 * 
 * @author Li Li
 *
 */
public class BoardView extends JPanel{

	Board board;
	final CellView[][] labelArr = new CellView[9][9];
	MouseListener activeListener;
	MouseMotionListener activeMotionListener;
	Model model;
	
	
	/** Properly register new listener (and unregister old one if present). */
	public void setActiveListener(MouseListener ml) {
		this.removeMouseListener(activeListener);
		activeListener = ml;
		if (ml != null) { 
			this.addMouseListener(ml);
		}
	}
	/** Properly register new motion listener (and unregister old one if present). */
	public void setActiveMotionListener(MouseMotionListener mml) {
		this.removeMouseMotionListener(activeMotionListener);
		activeMotionListener = mml;
		if (mml != null) {
			this.addMouseMotionListener(mml);
		}
	}
	
	public BoardView(Board board) {	
		this.board = board;
		setLayout(null);
		initialize();
		draw();
	}

	void initialize () {
		SelectionController ma = new SelectionController(this);
		
		for(int row = 0; row < 9; row++){
			for(int col = 0; col <9; col++){
				labelArr[row][col] = new CellView(board.cells[row][col]);
				labelArr[row][col].addMouseListener(ma);
				add(labelArr[row][col]);
			}
		}
	}
	
	public void draw(){
		for(int row = 0; row < 9; row++){
			for(int col = 0; col <9; col++){
				labelArr[row][col].refresh();
		
			}
		}
	}
	

	
	public Board getBoard(){
		return board;
	}

}
	

