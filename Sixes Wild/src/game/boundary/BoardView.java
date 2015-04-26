package game.boundary;

import game.controller.Move;
import game.entities.Board;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Li Li
 *
 */
public class BoardView extends JPanel implements MouseListener, ActionListener{
	Board board;
	
	public BoardView() {
		setLayout(null);
		final JLabel[][] labelArr = new JLabel[9][9];
		 
		for(int i = 0; i<=8;i++){
			for(int j =0; j<=8;j++){
				labelArr[i][j] = new JLabel("mnmn");
				labelArr[i][j].setIcon(new ImageIcon(BoardView.class.getResource("/images/1.png")));
				labelArr[i][j].setBounds(600,600,50,50);
				labelArr[i][j].setBounds(200+(10*i)+(i*labelArr[i][j].getWidth()),175+(10*j)+(j*labelArr[i][j].getWidth()), 50,50);
				
				add(labelArr[i][j]);
			}
	}
	}
	
	public void makeMove() {
		board.gravity();
	}
	
	public void mousePressed (MouseEvent me) {
		System.out.println("mousepresed");
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent arg0) {
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

