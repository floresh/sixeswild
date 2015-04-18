package editor.controller;

import LevelEditor.LevelEditorApplication;
import editor.model.LevelEditorModel;

public class ToggleCellController {
	
	LevelEditorModel model;
	LevelEditorApplication application;
	
	public ToggleCellController(LevelEditorApplication app, LevelEditorModel m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process(){
		return false;
	}
	
}
