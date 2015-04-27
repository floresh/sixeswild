package editor.controller;

import editor.boundary.LevelEditorApplication;
import game.entities.Model;
public class ClearLevelController {
	
	Model model;
	LevelEditorApplication application;
	
	public ClearLevelController(LevelEditorApplication app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process(){
		return false;
	}
	
}
