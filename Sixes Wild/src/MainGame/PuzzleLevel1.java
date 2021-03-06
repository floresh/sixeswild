package MainGame;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Window.Type;

public class PuzzleLevel1 extends JFrame{
	public PuzzleLevel1() {
		setTitle("Puzzle Level 1");
		
		JButton btnNewButton = new JButton("PAUSE");
		btnNewButton.setBounds(12, 143, 97, 25);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(12, 181, 97, 25);
		
		JButton btnNewButton_2 = new JButton("QUIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new GameModeScreen();
			//	dispose();
			}
		});
		btnNewButton_2.setBounds(12, 219, 97, 25);
		
		JButton btnNewButton_3 = new JButton("RESHUFFLE");
		btnNewButton_3.setBounds(511, 143, 116, 25);
		
		JButton btnNewButton_4 = new JButton("REMOVE");
		btnNewButton_4.setBounds(511, 181, 116, 25);
		
		JButton btnNewButton_5 = new JButton("SWAP");
		btnNewButton_5.setBounds(511, 219, 116, 25);
		getContentPane().setLayout(null);
		getContentPane().add(btnNewButton);
		getContentPane().add(btnNewButton_1);
		getContentPane().add(btnNewButton_2);
		getContentPane().add(btnNewButton_3);
		getContentPane().add(btnNewButton_4);
		getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("Score: 0");
		lblNewLabel.setBounds(270, 13, 56, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Time Elapsed: 100");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(228, 43, 130, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Special Moves");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(511, 114, 106, 16);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3x");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(443, 147, 56, 16);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2x");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(443, 185, 56, 16);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("5x");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(443, 223, 56, 16);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setIcon(new ImageIcon(PuzzleLevel1.class.getResource("/images/board.png")));
		lblNewLabel_6.setBounds(146, 72, 353, 362);
		getContentPane().add(lblNewLabel_6);
		
		setSize(660, 540);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
}
}