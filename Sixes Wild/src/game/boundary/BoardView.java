package game.boundary;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import game.controller.SelectionController;
import game.entities.Board;
import game.entities.Cell;
import game.entities.Model;
import game.move.controller.MoveController;


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
		SelectionController ma = new SelectionController(model/*, this*/);
		MoveController mc = new MoveController(model);
		
		for(int row = 0; row < 9; row++){
			for(int col = 0; col <9; col++){
				labelArr[row][col] = new CellView(board.cells[row][col]);
				labelArr[row][col].addMouseListener(ma);
				labelArr[row][col].addMouseListener(mc);
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
	
	
	/**	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}*/
	/**	@Override
	public void mousePressed(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();

		if((x >= srcX && x <= srcX + tileSize) && (y >= srcY && y <= srcY + 

tileSize) ){
			dragable = true;
			xDrag = x - srcX;
			yDrag = y - srcY;
		}
		else{
		dragable = false;
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println(xDrag);
		System.out.println(yDrag);
		System.out.println(dragable);;
	}
	 */
	
	public Board getBoard(){
		return board;
	}

}
	

