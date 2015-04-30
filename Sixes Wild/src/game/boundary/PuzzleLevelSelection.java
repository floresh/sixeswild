package game.boundary;

import game.controller.ReturnToPreviousMenuController;
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

public class PuzzleLevelSelection extends JFrame {
	int index = 0;

	public PuzzleLevelSelection() {
		super("Puzzle Level Selection");

		JButton btnNewButton = new JButton("BACK");
		btnNewButton
				.addActionListener(new ReturnToPreviousMenuController(this));

		JButton button1 = new JButton("1");
		button1.setEnabled(Main.model.unlockedLevels[0][0]);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = 0;
			}
		});

		JButton button2 = new JButton("2");
		button2.setEnabled(Main.model.unlockedLevels[0][1]);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = 1;
			}
		});

		JButton button3 = new JButton("3");
		button3.setEnabled(Main.model.unlockedLevels[0][2]);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = 2;
			}
		});

		JButton button4 = new JButton("4");
		button4.setEnabled(Main.model.unlockedLevels[0][3]);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = 3;
			}
		});

		JButton playButton = new JButton("PLAY");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//TODO hack to work around loading
				Level level = new PuzzleLevel();
				Main.model.setCurrentLevel(level);
				new LevelView(level);
				dispose();
				
				
				
//				try {
//					Main.model.setCurrentLevel(Main.getLoadedLevels().get(index));
//				} catch (ArrayIndexOutOfBoundsException ex) {
//					System.err.println("Index out of bounds");
//				}
//				Main.model.getCurrentLevel().getBoard().initialize(Main.model.getCurrentLevel().getTileFrequencies(), Main.model.getCurrentLevel().getModifierFrequencies());
//				System.out.println(Main.model.getCurrentLevel().getBoard().cells[1][1].getTile().getValue());
				
				
			
			}
		});

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(30)
										.addComponent(btnNewButton)
										.addGap(101)
										.addComponent(button1,
												GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addGap(35)
										.addComponent(button2,
												GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addGap(36)
										.addComponent(button3,
												GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addGap(34)
										.addComponent(button4,
												GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
						.addGroup(
								Alignment.TRAILING,
								groupLayout
										.createSequentialGroup()
										.addContainerGap(379, Short.MAX_VALUE)
										.addComponent(playButton,
												GroupLayout.PREFERRED_SIZE, 79,
												GroupLayout.PREFERRED_SIZE)
										.addGap(73)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(44)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																btnNewButton)
														.addComponent(
																button1,
																GroupLayout.PREFERRED_SIZE,
																46,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																groupLayout
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				button2,
																				GroupLayout.PREFERRED_SIZE,
																				46,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				button3,
																				GroupLayout.PREFERRED_SIZE,
																				46,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																button4,
																GroupLayout.PREFERRED_SIZE,
																46,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED,
												262, Short.MAX_VALUE)
										.addComponent(playButton).addGap(83)));
		getContentPane().setLayout(groupLayout);
		setSize(800, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
