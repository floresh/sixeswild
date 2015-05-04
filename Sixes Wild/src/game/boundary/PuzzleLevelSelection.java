package game.boundary;
//
import game.controller.ReturnToPreviousMenuController;
import game.controller.SelectLevelController;
import game.entities.Level;
import game.entities.PuzzleLevel;
import game.main.Main;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
/**
 * 
 * @author Jake, hfloreshuerta
 * 
 * Frame for level selection in puzzle game mode
 */
public class PuzzleLevelSelection extends JFrame {
	/** TODO what is index used for */
	int index = 0;
	/** Displays level number selected by user */
	public JLabel lblLevelSelected;
	
	Level level;
	
	public void setLevel(String levelName){
		level = Main.getLevels().getLevel(levelName);
	}

	public PuzzleLevelSelection() {
		super("Puzzle Level Selection");

		JButton btnNewButton = new JButton("BACK");
		btnNewButton
				.addActionListener(new ReturnToPreviousMenuController(this));
		
		lblLevelSelected = new JLabel("None");
		lblLevelSelected.setFont(new Font("Old English Text MT", Font.PLAIN, 72));

		JButton button1 = new JButton("1");
		button1.setEnabled(Main.model.unlockedLevels[0][0]);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = Main.getLevels().getLevel("Level 1");
			}
		});

		JButton button2 = new JButton("2");
		button2.setEnabled(Main.model.unlockedLevels[0][1]);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = Main.getLevels().getLevel("Level 2");
			}
		});

		JButton button3 = new JButton("3");
		button3.setEnabled(Main.model.unlockedLevels[0][2]);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = Main.getLevels().getLevel("Level 3");
			}
		});

		JButton button4 = new JButton("4");
		button4.setEnabled(Main.model.unlockedLevels[0][3]);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = Main.getLevels().getLevel("Level 4");
			}
		});

		JButton playButton = new JButton("PLAY");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level.getBoard().initialize();
				LevelView gameView = new LevelView(level);
				gameView.setTitle("Puzzle " + lblLevelSelected.getText());
				dispose();
			}
		});
		
		
		JLabel lblCurrentLevel = new JLabel("Current Level:");
		lblCurrentLevel.setFont(new Font("Tahoma", Font.PLAIN, 26));

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(146)
							.addComponent(lblLevelSelected, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCurrentLevel, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton)
									.addGap(101)
									.addComponent(button1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
							.addGap(35)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(button3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(button4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(319)
							.addComponent(playButton, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(196, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addComponent(button3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addComponent(button4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(151)
					.addComponent(lblCurrentLevel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLevelSelected, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(playButton, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addGap(131))
		);
		getContentPane().setLayout(groupLayout);
		setSize(800, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
