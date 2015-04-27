package game.boundary;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Li Li
 *
 */
public class BoardView extends JPanel {
	final JLabel[][] labelArr = new JLabel[9][9];
	public BoardView() {	
		setLayout(null);
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
	//To Do Should this be in level view?
	public void repaint(){
	}
	}
	

