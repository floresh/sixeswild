package editor.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.boundary.LevelView;
import game.entities.PuzzleLevel;

//
public class PreviewController implements ActionListener{
	
	WholesomeLevelEditorScreen editorScreen;
	
	public PreviewController(WholesomeLevelEditorScreen es) {
		this.editorScreen = es;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//TODO
		LevelView lv = new LevelView(new PuzzleLevel());
	}
	
}
