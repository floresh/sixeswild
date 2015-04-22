package editor.controller;

import java.util.ArrayList;

import editor.model.LevelEditorModel;
import game.boundary.Application;

public class SaveLevelController {
	Application application;
	LevelEditorModel model;
	
	public SaveLevelController(Application application, LevelEditorModel model){
		this.application = application;
		this.model = model;
	}
	
	public boolean process(){
		getTileFrequencies();
		return false;
	}
	
	public boolean getTileFrequencies(){
		ArrayList<Integer> frequencies = new ArrayList<Integer>();
		
		return true;
	}
}
