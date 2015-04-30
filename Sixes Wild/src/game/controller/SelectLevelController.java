package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import game.boundary.Application;
import game.boundary.PuzzleLevelSelection;
import game.entities.Model;
/**
 * 
 * @author Jake
 *
 */
public class SelectLevelController implements ActionListener{
	JFrame frame;
	String string;
	
	public SelectLevelController(JFrame frame, String string) {
		this.frame = frame;
		this.string = string;
	
	}
	
	private void process() {
		((PuzzleLevelSelection)frame).lblLevelSelected.setText(string);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		process();
		
	}
}
