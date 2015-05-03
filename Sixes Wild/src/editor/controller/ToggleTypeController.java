package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import editor.boundary.LevelEditorApplication;
import editor.boundary.Main;
import editor.model.ToggleType;
import game.entities.Model;
/**
 * 
 * @author Jake
 *
 * This controller handles which type of toggling the user wants to do with the 
 * grid of buttons in the level editor.
 */
public class ToggleTypeController implements ActionListener{
	/** The level editor model.*/
	Model model;
	
	/** The integer which stores which type of toggling is being done.*/
	int type;
	
	public ToggleTypeController(Model m, int type) {
		this.model = m;
		this.type = type;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Main.application.getModel().getToggleType().setValue(type);	
	}
	
}
