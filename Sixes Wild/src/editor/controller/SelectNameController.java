package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.Level;

public class SelectNameController implements ActionListener{

	WholesomeLevelEditorScreen frame;
	
	String name;
	
	Level level;
	
	public SelectNameController(WholesomeLevelEditorScreen frame, String string){
		this.frame = frame;
		this.name = string;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(name);
		level.setName(level.getGameMode() + " " + name);
	}

}
