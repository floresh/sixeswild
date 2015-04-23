package game.boundary;
import game.controller.SelectGameModeController;
import game.entities.Model;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.LayoutStyle.ComponentPlacement;


public class GameModeScreen extends JFrame{
	Model model;
	Application application;
	
	private JButton backButton;
	public GameModeScreen(Application app, Model m) {
		super("Game Mode Select");
		this.model = m;
		this.application = app;
		
		setResizable(false);
		
		backButton = new JButton("BACK");
		backButton.setBounds(94, 75, 63, 25);
		backButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				new StartScreen(application, model);
				dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("PUZZLE");
		btnNewButton_1.setBounds(216, 268, 97, 25);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SelectGameModeController(application, model, "Puzzle");
				dispose();
			}
		});
		
		JButton btnNewButton_2 = new JButton("ELIMINATION");
		btnNewButton_2.setBounds(434, 268, 118, 25);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SelectGameModeController(application, model, "Elimination");
				dispose();
			}
		});
		
		JButton btnNewButton_3 = new JButton("LIGHTNING");
		btnNewButton_3.setBounds(214, 413, 99, 25);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SelectGameModeController(application, model, "Lightning");
				dispose();
			}
		});
		
		JButton btnNewButton_4 = new JButton("RELEASE");
		btnNewButton_4.setBounds(434, 413, 117, 25);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SelectGameModeController(application, model, "Release");
				dispose();
			}
		});
		
		JButton btnNewButton_5 = new JButton("USER MADE");
		btnNewButton_5.setBounds(322, 607, 101, 25);
		getContentPane().setLayout(null);
		getContentPane().add(backButton);
		getContentPane().add(btnNewButton_3);
		getContentPane().add(btnNewButton_1);
		getContentPane().add(btnNewButton_2);
		getContentPane().add(btnNewButton_4);
		getContentPane().add(btnNewButton_5);

		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

