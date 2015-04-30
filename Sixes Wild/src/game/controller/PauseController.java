package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import game.boundary.LevelView;
import game.main.Main;

/**
 * 
 * @author hfloreshuerta
 * @author Li
 */
public class PauseController implements ActionListener{
	LevelView frame;
	
	public PauseController(LevelView levelView) {
		this.frame = levelView;
	}
	
	public void actionPerformed(ActionEvent e) {
		frame.getTimeController().stop();
		frame.getBoardView().setVisible(false);
		
		Object[] options = new Object[] {"Continue"};
		JOptionPane.showOptionDialog(new JFrame(), "Game Paused", 
		        "Paused", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, 
		        null, options, JOptionPane.OK_OPTION);
		
		frame.getBoardView().setVisible(true);
		frame.getTimeController().play();
		Main.model.getCurrentLevel();
	}
}