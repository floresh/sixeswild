package game.boundary;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * 
 * @author Li Li
 *
 */
public class LevelView extends JFrame{
	public LevelView() {
		setResizable(false);
		JPanel panel = new BoardView();
		panel.setBounds(224, 66, 384, 369);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("PAUSE");
		btnNewButton.setBounds(35, 37, 97, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setBounds(35, 75, 97, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("QUIT");
		btnNewButton_2.setBounds(35, 113, 97, 25);
		panel.add(btnNewButton_2);
		
		JLabel lblSpecialMoves = new JLabel("SPECIAL MOVES");
		lblSpecialMoves.setFont(new Font("Serif", Font.PLAIN, 13));
		lblSpecialMoves.setBounds(36, 173, 96, 25);
		panel.add(lblSpecialMoves);
		
		JButton btnNewButton_3 = new JButton("RESHUFFLE");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_3.setBounds(35, 211, 97, 25);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SWAP");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_4.setBounds(35, 259, 97, 25);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("DELETE");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_5.setBounds(35, 305, 97, 25);
		panel.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("SCORE: ");
		lblNewLabel.setBounds(201, 79, 56, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TIME: ");
		lblNewLabel_1.setBounds(201, 41, 56, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Potential Title");
		lblNewLabel_2.setBounds(553, 41, 56, 16);
		panel.add(lblNewLabel_2);
		
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}