package editor.controller;

import editor.boundary.LevelEditorApplication;
import editor.model.LevelEditorModel;

public class UndoController {
	LevelEditorModel model;
	LevelEditorApplication application;
	
	public UndoController(LevelEditorApplication app, LevelEditorModel m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process(){
		return false;
	}
	
}
