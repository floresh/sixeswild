package editor.controller;

import editor.boundary.LevelEditorApplication;
import game.entities.Model;
//
public class ToggleReleaseTileController {
	
	Model model;
	LevelEditorApplication application;
	
	public ToggleReleaseTileController(LevelEditorApplication app, Model m) {
		model = m;
		this.application = app;
	}
	
	public boolean process(){
		return false;
	}
	
}
