package game.boundary;


import game.controller.SelectPlayController;
import game.entities.Model;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Image;

import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class SplashScreen extends JFrame{
	Image splash;
	Model model;
	Application application;
	
	public SplashScreen(Application app, Model m) {
		this.model = m;
		this.application = app;
		
		setTitle("Sixes Wild");
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addContainerGap(450, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addContainerGap(408, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		

		lblNewLabel.setIcon(new ImageIcon("src\\images\\splash.jpg"));

		
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			
		}
		dispose();
		new StartScreen(application, model);
	}
}
