package editor.controller;

import editor.boundary.LevelEditorApplication;
import game.entities.Model;
//
public class CommitValuesController {
	Model model;
	LevelEditorApplication application;
	
	public CommitValuesController(LevelEditorApplication app, Model m) {
		model = m;
		this.application = app;
	}
	
	public boolean process(){
		return false;
	}
	
}
