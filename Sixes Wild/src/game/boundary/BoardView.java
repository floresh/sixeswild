package game.boundary;

import game.controller.Move;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Li Li
 *
 */
public class BoardView extends JPanel implements MouseListener, MouseMotionListener{
	
	final JLabel[][] labelArr = new JLabel[9][9];
	int srcX = 200;
	int srcY = 175;
	int xDrag = 0;
	int yDrag = 0;
	boolean dragable;
	Move[] selectionCheck = new Move[5]; //An array of legal selections
	int tileSize = 50;
	
	public BoardView() {	
		setLayout(null);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		draw();
			}
	//To Do
	public void draw(){
		for(int row = 0; row <= 8; row++){
			for(int col = 0; col <= 8; col++){
				labelArr[row][col] = new JLabel("mnmn");
				labelArr[row][col].setIcon(new ImageIcon(BoardView.class.getResource("/images/1.png")));
				labelArr[row][col].setBounds(600,600,50,50);
				labelArr[row][col].setBounds(200+(10*row)+(row*labelArr[row][col].getWidth()),175+(10*col)+(col*labelArr[row][col].getWidth()), 50,50);
				
				add(labelArr[row][col]);
			}
		}
	}
	
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
		
	}
	@Override
	public void mousePressed(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();
		
		if((x >= srcX && x <= srcX + tileSize) && (y >= srcY && y <= srcY + tileSize) ){
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
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent me) {
		if(dragable){

		}
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}
	

