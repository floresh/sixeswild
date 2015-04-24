package editor.controller;

import editor.boundary.LevelEditorApplication;
import editor.model.LevelEditorModel;
//
public class ToggleCellController {
	
	LevelEditorModel model;
	LevelEditorApplication application;
	int row;
	int column;
	boolean onOff;
	
	public ToggleCellController(LevelEditorApplication app, LevelEditorModel m, int row, int column, boolean onOff) {
		this.model = m;
		this.application = app;
		this.row = row;
		this.column = column;
		this.onOff = onOff;
	}
	
	public boolean process(){
		model.getLevel().getBoard().cells[row][column].setIsEnabled(onOff);
		
		return true;
	}
	
}
