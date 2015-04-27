package editor.controller;

import editor.boundary.LevelEditorApplication;
import game.entities.Model;

public class UndoController {
	Model model;
	LevelEditorApplication application;
	
	public UndoController(LevelEditorApplication app, Model m) {
		model = m;
		this.application = app;
	}
	
	public boolean process(){
		return false;
	}
	
}
