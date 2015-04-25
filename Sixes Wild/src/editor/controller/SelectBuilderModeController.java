package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import editor.boundary.LevelEditorIntro;
import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.PuzzleLevel;

public class SelectBuilderModeController implements ActionListener {
	LevelEditorIntro screen;
	String level;
	
	public SelectBuilderModeController(LevelEditorIntro screen){
		this.screen = screen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		level = e.getActionCommand();
		switch(level){
		case "PUZZLE": Main.model.setLevel(new PuzzleLevel());break;
		}
		
		screen.dispose();
		new WholesomeLevelEditorScreen();
	}

}
