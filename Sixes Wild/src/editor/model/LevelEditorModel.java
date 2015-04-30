package editor.model;

import game.entities.Level;
import game.entities.Model;
/**
 * 
 * @author Jake
 *
 */
public class LevelEditorModel extends Model{
	Level currentLevel;
	int numSPRemove;
	int numSPSwap;
	int numSPReshuffle;
	ToggleType toggleType;
	
	public LevelEditorModel(){
		super();
		toggleType = new ToggleType();
	}
	
	public void setCurrentLevel(Level l){
		this.currentLevel = l;
	}
	
	public ToggleType getToggleType(){
		return this.toggleType;
	}
	
	public void setToggleType(ToggleType t){
		this.toggleType = t;
	}
}
