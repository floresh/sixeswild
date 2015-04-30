package game.boundary;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;

import javax.swing.JProgressBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import game.controller.ReturnToPreviousMenuController;
import game.controller.SelectLevelController;
import game.controller.SelectPlayController;
import game.entities.Model;
import game.main.Main;

import javax.swing.JLabel;

/**
 * 
 * @author Jake
 *
 */
public class ReleaseLevelSelection extends JFrame{
	public JLabel lblLevelSelected;
	public ReleaseLevelSelection() {
		super("Release Level Selection");
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ReturnToPreviousMenuController(this));
		
		lblLevelSelected = new JLabel("None");
		lblLevelSelected.setFont(new Font("Old English Text MT", Font.PLAIN, 72));
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setEnabled(Main.model.unlockedLevels[3][0]);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addActionListener(new SelectLevelController(this, "Level 1"));
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setEnabled(Main.model.unlockedLevels[3][1]);
		button.addActionListener(new SelectLevelController(this, "Level 2"));
		
		JButton button_1 = new JButton("3");
		button_1.setEnabled(Main.model.unlockedLevels[3][2]);
		button_1.addActionListener(new SelectLevelController(this, "Level 3"));
		
		JButton button_2 = new JButton("4");
		button_2.setEnabled(Main.model.unlockedLevels[3][3]);
		button_2.addActionListener(new SelectLevelController(this, "Level 4"));
		
		JButton btnNewButton_2 = new JButton("PLAY");
		btnNewButton_2.setEnabled(Main.model.unlockedLevels[3][0]);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel label_1 = new JLabel("Current Level:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(btnNewButton)
					.addGap(101)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(291, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(630, Short.MAX_VALUE)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(73))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(65)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(88)
							.addComponent(lblLevelSelected, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(189, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(107)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(lblLevelSelected, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
					.addComponent(btnNewButton_2)
					.addGap(83))
		);
		getContentPane().setLayout(groupLayout);
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
