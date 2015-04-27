package editor.controller;

import editor.boundary.LevelEditorApplication;
import game.entities.Model;

public class RedoController {
	
	Model model;
	LevelEditorApplication application;
	
	public RedoController(LevelEditorApplication app, Model m) {
		model = m;
		this.application = app;
	}
	
	public boolean process(){
		return false;
	}
}
