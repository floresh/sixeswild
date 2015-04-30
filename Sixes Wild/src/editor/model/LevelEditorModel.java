package editor.model;

import game.entities.Level;
import game.entities.Model;
import game.entities.PuzzleLevel;
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
	
	public Level getCurrentLevel(){
		return this.currentLevel;
	}
	
	public void setCurrentLevel(Level level){
		this.currentLevel = level;
	}
	
	public ToggleType getToggleType(){
		return this.toggleType;
	}
	
	public void setToggleType(ToggleType t){
		this.toggleType = t;
	}
}
