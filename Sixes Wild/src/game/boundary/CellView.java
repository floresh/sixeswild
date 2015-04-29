package game.boundary;





import game.entities.Board;
import game.entities.Cell;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CellView extends JLabel implements MouseListener, MouseMotionListener {
	Cell cell;
	public CellView(Cell cell) {
		this.cell = cell;
		
		int row = cell.getLocation().getRow();
		int column= cell.getLocation().getColumn();	
		
		setBounds(column*50,row*50,50,50);
		int value = cell.getTile().getValue();
		setText(Integer.toString(value));
		setLayout(null);
		if(cell.getIsEnabled()){
		switch (value){
		 case 1:  value = 1;
		 setIcon(new ImageIcon(BoardView.class.getResource("/images/1.png")));
         break;
		 case 2:  value= 2;
		 setIcon(new ImageIcon(BoardView.class.getResource("/images/2resized (2).png")));
         break;
		 case 3:  value = 3;
		 setIcon(new ImageIcon(BoardView.class.getResource("/images/3resized (1).png")));
         break;
		 case 4:  value = 4;
		 setIcon(new ImageIcon(BoardView.class.getResource("/images/4resized.png")));
         break;
		 case 5:  value= 5;
		 setIcon(new ImageIcon(BoardView.class.getResource("/images/5resized.png")));
         break;
		 case 6:  value = 6;
		 setIcon(new ImageIcon(BoardView.class.getResource("/images/6resized.png")));
         break;
		}
		
		}
	
	}
	
	
	public Cell getCell(){
		return cell;
	}
	
	
	


	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
