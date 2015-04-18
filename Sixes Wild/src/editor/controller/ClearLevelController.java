package editor.controller;

import LevelEditor.LevelEditorApplication;
import editor.model.LevelEditorModel;

public class ClearLevelController {
	
	LevelEditorModel model;
	LevelEditorApplication application;
	
	public ClearLevelController(LevelEditorApplication app, LevelEditorModel m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process(){
		return false;
	}
	
}
