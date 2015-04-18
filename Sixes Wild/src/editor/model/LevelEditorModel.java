package editor.model;

import MainGame.Entities.Level;

public class LevelEditorModel {
	Level level;
	
	public LevelEditorModel(Level l){
		this.level = l;
	}
	
	Level getLevel(){
		return this.level;
	}
	
	void setLevel(Level l){
		this.level = l;
	}
	
}
