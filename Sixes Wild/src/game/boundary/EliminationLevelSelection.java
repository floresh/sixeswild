package game.boundary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EliminationLevelSelection extends JFrame {
	public EliminationLevelSelection() {
		super("Elimination Level Selection");
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GameModeScreen();
				dispose();
			}
		});

		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setEnabled(false);

		JButton button_1 = new JButton("3");
		button_1.setEnabled(false);

		JButton button_2 = new JButton("4");
		button_2.setEnabled(false);

		JButton btnNewButton_2 = new JButton("PLAY");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LevelView();
				dispose();
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
										.addComponent(btnNewButton_1,
												GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addGap(35)
										.addComponent(button,
												GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addGap(36)
										.addComponent(button_1,
												GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addGap(34)
										.addComponent(button_2,
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
										.addComponent(btnNewButton_2,
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
																btnNewButton_1,
																GroupLayout.PREFERRED_SIZE,
																46,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																groupLayout
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				button,
																				GroupLayout.PREFERRED_SIZE,
																				46,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				button_1,
																				GroupLayout.PREFERRED_SIZE,
																				46,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																button_2,
																GroupLayout.PREFERRED_SIZE,
																46,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED,
												262, Short.MAX_VALUE)
										.addComponent(btnNewButton_2)
										.addGap(83)));
		getContentPane().setLayout(groupLayout);
		setSize(650, 420);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
