package game.boundary;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LevelView extends JFrame{
	public LevelView() {
		JPanel panel = new BoardView();
		panel.setBounds(224, 66, 384, 369);
		getContentPane().add(panel);
		
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}