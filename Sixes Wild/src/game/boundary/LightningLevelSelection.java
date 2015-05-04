package game.boundary;
import game.controller.ReturnToPreviousMenuController;
import game.controller.SelectLevelController;
import game.entities.Level;
import game.entities.Model;
import game.main.Main;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
/**
 * 
 * @author Jake
 * Level Selection for lightning game mode
 */

public class LightningLevelSelection extends JFrame{
	/** Displays level number selected by user */
	public JLabel lblLevelSelected;
	
	public LightningLevelSelection() {
		super("Lightning Level Selection");

		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBounds(30, 44, 63, 25);
		btnNewButton.addActionListener(new ReturnToPreviousMenuController(this));
		
		lblLevelSelected = new JLabel("None");
		lblLevelSelected.setFont(new Font("Old English Text MT", Font.PLAIN, 72));
		lblLevelSelected.setBounds(145, 236, 440, 192);
		getContentPane().add(lblLevelSelected);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(194, 44, 48, 46);
		btnNewButton_1.setEnabled(Main.model.unlockedLevels[2][0]);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addActionListener(new SelectLevelController(this, "Level 1"));
		
		JButton button = new JButton("2");
		button.setBounds(277, 44, 48, 46);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setEnabled(Main.model.unlockedLevels[2][1]);
		button.addActionListener(new SelectLevelController(this, "Level 2"));
		
		JButton button_1 = new JButton("3");
		button_1.setBounds(361, 44, 48, 46);
		button_1.setEnabled(Main.model.unlockedLevels[2][2]);
		button_1.addActionListener(new SelectLevelController(this, "Level 3"));
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(443, 44, 48, 46);
		button_2.setEnabled(Main.model.unlockedLevels[2][3]);
		button_2.addActionListener(new SelectLevelController(this, "Level 4"));
		
		JButton btnNewButton_2 = new JButton("PLAY");
		btnNewButton_2.setBounds(630, 645, 79, 25);
		btnNewButton_2.setEnabled(Main.model.unlockedLevels[2][0]);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						Level level = Main.model.getCurrentLevel();
						LevelView gameView = new LevelView(level);
						gameView.setTitle("Lightning " + lblLevelSelected.getText());
						dispose();
					}
				});
		getContentPane().setLayout(null);
		getContentPane().add(btnNewButton);
		getContentPane().add(btnNewButton_1);
		getContentPane().add(button);
		getContentPane().add(button_1);
		getContentPane().add(button_2);
		getContentPane().add(btnNewButton_2);
		
		JLabel label_1 = new JLabel("Current Level:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_1.setBounds(57, 201, 184, 28);
		getContentPane().add(label_1);
		
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
