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
	
	public BoardView(Board board , MoveController mover) {	
		this.mover =mover;
		this.board = board;
		setLayout(null);
		initialize();
		draw();
	}

	void initialize () {
		SelectionController ma = new SelectionController(this, mover);
		MoveDeleteController mdc = new MoveDeleteController(this);
		MoveSwapController msc = new MoveSwapController(this);
		
		if(Main.model.getCurrentLevel().getMoveSwap() == true){
		for(int row = 0; row < 9; row++){
			for(int col = 0; col <9; col++){
				labelArr[row][col] = new CellView(board.cells[row][col]);
				labelArr[row][col].addMouseListener(msc);
				add(labelArr[row][col]);
			}
		}
	}
		else if(Main.model.getCurrentLevel().getDeleteMoveState() == true){
			for(int row = 0; row < 9; row++){
				for(int col = 0; col <9; col++){
					labelArr[row][col] = new CellView(board.cells[row][col]);
					labelArr[row][col].addMouseListener(mdc);
					add(labelArr[row][col]);
		}
	}
		}
		else {
			for(int row = 0; row < 9; row++){
				for(int col = 0; col <9; col++){
					labelArr[row][col] = new CellView(board.cells[row][col]);
					labelArr[row][col].addMouseListener(ma);
					add(labelArr[row][col]);
		}
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
	

