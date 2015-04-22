package editor.controller;

import editor.boundary.LevelEditorApplication;
import editor.model.LevelEditorModel;
import game.entities.Cell;
//
public class ToggleCellController {
	
	LevelEditorModel model;
	LevelEditorApplication application;
	boolean onOff;
	int row;
	int column;
	
	public ToggleCellController(LevelEditorApplication app, LevelEditorModel m, int r, int c, boolean o) {
		this.model = m;
		this.application = app;
		this.onOff = o;
		this.row = r;
		this.column = c;
	}
	
	public boolean process(){
		
		model.getBoard().cells[row][column].setIsEnabled(onOff);
	
		return false;
	}
	
}
