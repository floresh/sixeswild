package game.boundary;

import javax.swing.JPanel;

public class BoardPreviewView extends JPanel{
	public BoardPreviewView() {
		setLayout(null);

		JPanel panel = new BoardView(null);
		panel.setBounds(-187, -165, 807, 735);
		add(panel);


	}
}
