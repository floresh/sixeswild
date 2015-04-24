package game.boundary;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoardView extends JPanel{
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
}
