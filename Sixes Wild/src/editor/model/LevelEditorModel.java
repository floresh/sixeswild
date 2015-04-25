package editor.model;

import java.io.Serializable;

import game.entities.Level;
import game.entities.NoLevel;

public class LevelEditorModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1215689831997227538L;
	Level level;
	
	public LevelEditorModel(){
		level = new NoLevel();
	}
	public LevelEditorModel(Level l){
		this.level = l;
	}
	
	public Level getLevel(){
		return this.level;
	}
	
	public void setLevel(Level l){
		this.level = l;
	}
	
}
