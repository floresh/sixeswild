package editor.controller;

import LevelEditor.LevelEditorApplication;
import editor.model.LevelEditorModel;

public class RedoController {
	
	LevelEditorModel model;
	LevelEditorApplication application;
	
	public RedoController(LevelEditorApplication app, LevelEditorModel m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process(){
		return false;
	}
}
