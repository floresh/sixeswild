package editor.model;

import java.io.Serializable;

import game.entities.Level;

public class LevelEditorModel implements Serializable {
	Level level;
	
	public LevelEditorModel(Level l){
		this.level = l;
	}
	
	public Level getLevel(){
		return this.level;
	}
	
	void setLevel(Level l){
		this.level = l;
	}
	
}
