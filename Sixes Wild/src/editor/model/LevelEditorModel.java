package editor.model;

import game.entities.Level;
import game.entities.Model;

public class LevelEditorModel extends Model{
	Level CurrentLevel;
	int numSPRemove;
	int numSPSwap;
	int numSPReshuffle;
	ToggleType toggleType;
	
	public LevelEditorModel(){
		super();
		toggleType = new ToggleType();
	}
	
	public ToggleType getToggleType(){
		return this.toggleType;
	}
	
	public void setToggleType(ToggleType t){
		this.toggleType = t;
	}
}
