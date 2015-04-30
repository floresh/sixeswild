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
 */
public class ToggleTypeController implements ActionListener{
	
	Model model;
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
