package game.controller;

import game.boundary.LevelView;
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
		if(frame instanceof LevelView) { ((LevelView)frame).disposeTimer(); }
		Main.model.getCurrentLevel().getPreviousScreen();
	}

}
