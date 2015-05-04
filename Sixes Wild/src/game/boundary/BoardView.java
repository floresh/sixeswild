package game.boundary;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;



import game.entities.Board;
import game.entities.Model;
import game.main.Main;
import game.move.controller.MoveController;
import game.move.controller.MoveDeleteController;
import game.move.controller.MoveSwapController;
import game.move.controller.SelectionController;



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
	MoveController mover;

	public BoardView(Board board , MoveController mover) {	
		this.mover =mover;
		this.board = board;
		setLayout(null);
		initialize();
		draw();
	}

	
	/** Properly register new listener (and unregister old one if present). */
	public void setActiveListener(MouseListener ml) {
		for(int row = 0; row < 9; row++){
			for(int col = 0; col <9; col++){
				//labelArr[row][col] = new CellView(board.cells[row][col]);
				labelArr[row][col].removeMouseListener(activeListener);
				labelArr[row][col].addMouseListener(ml);
				add(labelArr[row][col]);
			}
		}
		activeListener = ml;
	}
	
	/** Properly register new motion listener (and unregister old one if present). */
	public void setActiveMotionListener(MouseMotionListener mml) {
		for(int row = 0; row < 9; row++){
			for(int col = 0; col <9; col++){
				//labelArr[row][col] = new CellView(board.cells[row][col]);
				labelArr[row][col].removeMouseMotionListener(activeMotionListener);
				labelArr[row][col].addMouseMotionListener(mml);
				add(labelArr[row][col]);
			}
		}
		activeMotionListener = mml;
	}
	
	void initialize () {
		SelectionController ma = new SelectionController(this, mover);
		activeListener = ma;
		activeMotionListener = ma;
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
	public MouseListener getActiveListener(){
		
		return activeListener;
	
	}
	
	public MouseMotionListener getActiveMouseMotionListener(){
		return 	activeMotionListener;
	}

	
	public Board getBoard(){
		return board;
	}

}
	

