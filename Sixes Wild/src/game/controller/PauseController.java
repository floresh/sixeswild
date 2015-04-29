package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import game.main.Main;

/**
 * 
 * @author hfloreshuerta
 * @author Li
 */
public class PauseController implements ActionListener{
	JFrame frame;
	
	public PauseController(JFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object[] options = {"Continue"};
		JOptionPane.showMessageDialog(frame,"Paused.");
		
		Main.model.getCurrentLevel();
	}
}

