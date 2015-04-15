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

public class PuzzleLevel1 extends JFrame{
	private JTextField txtScore;
	private JTextField txtTime;
	private JTextField txtSpecialMoves;
	public PuzzleLevel1() {
		
		txtScore = new JTextField();
		txtScore.setBounds(246, 13, 116, 22);
		txtScore.setText("Score: 0");
		txtScore.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setBounds(246, 43, 116, 22);
		txtTime.setText("Time: 99");
		txtTime.setColumns(10);
		
		JButton btnNewButton = new JButton("PAUSE");
		btnNewButton.setBounds(12, 143, 97, 25);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(12, 181, 97, 25);
		
		JButton btnNewButton_2 = new JButton("QUIT");
		btnNewButton_2.setBounds(12, 219, 97, 25);
		
		JButton btnNewButton_3 = new JButton("RESHUFFLE");
		btnNewButton_3.setBounds(511, 143, 116, 25);
		
		JButton btnNewButton_4 = new JButton("REMOVE");
		btnNewButton_4.setBounds(511, 181, 116, 25);
		
		JButton btnNewButton_5 = new JButton("SWAP");
		btnNewButton_5.setBounds(511, 219, 116, 25);
		getContentPane().setLayout(null);
		getContentPane().add(txtScore);
		getContentPane().add(txtTime);
		getContentPane().add(btnNewButton);
		getContentPane().add(btnNewButton_1);
		getContentPane().add(btnNewButton_2);
		getContentPane().add(btnNewButton_3);
		getContentPane().add(btnNewButton_4);
		getContentPane().add(btnNewButton_5);
		
		txtSpecialMoves = new JTextField();
		txtSpecialMoves.setHorizontalAlignment(SwingConstants.CENTER);
		txtSpecialMoves.setText("SPECIAL MOVES");
		txtSpecialMoves.setBounds(511, 108, 116, 22);
		getContentPane().add(txtSpecialMoves);
		txtSpecialMoves.setColumns(10);
		
		
}
}