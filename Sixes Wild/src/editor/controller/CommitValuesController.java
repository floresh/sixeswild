package editor.controller;

import LevelEditor.LevelEditorApplication;
import editor.model.LevelEditorModel;

public class CommitValuesController {
	LevelEditorModel model;
	LevelEditorApplication application;
	
	public CommitValuesController(LevelEditorApplication app, LevelEditorModel m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process(){
		return false;
	}
	
}
