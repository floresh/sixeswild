package game.boundary;

import game.controller.PauseController;
import game.controller.SelectGameModeController;
import game.entities.Board;
import game.main.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;

/**
 * 
 * @author Li Li, Jake
 *
 */
public class LevelView extends JFrame{
	
	Board board;
	
	public LevelView() {
		setResizable(false);


		
		
		JPanel panel = new JPanel();

		board = Main.model.getCurrentLevel().getBoard();
		
		JPanel boardView = new BoardView();



		panel.setBounds(224, 66, 384, 369);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("PAUSE");
		btnNewButton.addActionListener(new PauseController(this));
	
		btnNewButton.setBounds(35, 37, 97, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setBounds(35, 75, 97, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("QUIT");
		btnNewButton_2.setBounds(35, 113, 97, 25);
		panel.add(btnNewButton_2);
		
		JLabel lblSpecialMoves = new JLabel("SPECIAL MOVES");
		lblSpecialMoves.setBounds(36, 173, 96, 25);
		lblSpecialMoves.setFont(new Font("Serif", Font.PLAIN, 13));
		panel.add(lblSpecialMoves);
		
		JButton btnNewButton_3 = new JButton("RESHUFFLE");
		btnNewButton_3.setBounds(35, 211, 97, 25);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SWAP");
		btnNewButton_4.setBounds(35, 259, 97, 25);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("DELETE");
		btnNewButton_5.setBounds(35, 305, 97, 25);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("SCORE: ");
		lblNewLabel.setBounds(201, 79, 56, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TIME: ");
		lblNewLabel_1.setBounds(201, 41, 56, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sixes Wild");
		lblNewLabel_2.setBounds(396, 37, 161, 71);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel_2);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(57, 357, 56, 357);
		progressBar.setValue(0);
		progressBar.setOrientation(SwingConstants.VERTICAL);
		panel.add(progressBar);
		
		BoardView panel_1 = new BoardView();
		panel_1.setBounds(255, 229, 450, 450);
		panel.add(panel_1);
		
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//Potential method for pressing the special moves/other buttons on level view screen
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
