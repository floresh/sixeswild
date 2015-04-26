package game.boundary;
import game.controller.ReturnToPreviousMenuController;
import game.entities.Model;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;


public class LightningLevelSelection extends JFrame{
	Model model;
	Application application;
	
	public LightningLevelSelection(Application app, Model m) {
		super("Lightning Level Selection");
		this.model = m;
		this.application = app;
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBounds(30, 44, 63, 25);
		btnNewButton.addActionListener(new ReturnToPreviousMenuController(this));
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(194, 44, 48, 46);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button = new JButton("2");
		button.setBounds(277, 44, 48, 46);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setEnabled(false);
		
		JButton button_1 = new JButton("3");
		button_1.setBounds(361, 44, 48, 46);
		button_1.setEnabled(false);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(443, 44, 48, 46);
		button_2.setEnabled(false);
		
		JButton btnNewButton_2 = new JButton("PLAY");
		btnNewButton_2.setBounds(630, 645, 79, 25);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						new LevelView();
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
		
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
