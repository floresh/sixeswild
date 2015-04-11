import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;


public class GameModeScreen extends JFrame{
	public GameModeScreen() {
		
		JButton btnNewButton = new JButton("BACK");
		
		JButton btnNewButton_1 = new JButton("PUZZLE");
		
		JButton btnNewButton_2 = new JButton("ELIMINATION");
		
		JButton btnNewButton_3 = new JButton("LIGHTNING");
		
		JButton btnNewButton_4 = new JButton("RELEASE");
		
		JButton btnNewButton_5 = new JButton("USER MADE");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addComponent(btnNewButton)
					.addContainerGap(570, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(175)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
					.addGap(95)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
					.addGap(215))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(275)
					.addComponent(btnNewButton_5)
					.addContainerGap(321, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(105)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_4))
					.addGap(40)
					.addComponent(btnNewButton_5)
					.addGap(100))
		);
		getContentPane().setLayout(groupLayout);
	}
}

