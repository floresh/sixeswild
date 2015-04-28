package game.controller;

import game.main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ReturnToPreviousMenuController implements ActionListener {
	JFrame frame;
	
	public ReturnToPreviousMenuController(JFrame frame){
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		Main.model.getCurrentLevel().getPreviousScreen();
	}

}
