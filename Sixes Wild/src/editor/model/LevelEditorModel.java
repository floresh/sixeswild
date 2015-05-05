package editor.model;

import java.util.ArrayList;

import game.entities.Level;
import game.entities.Model;
import game.entities.PuzzleLevel;
/**
 * 
 * @author Jake
 *
 * Holds the toggle type of the editor, as well as the current level and number of special moves.
 */
public class LevelEditorModel extends Model{
	Level currentLevel;
	int numSPRemove;
	int numSPSwap;
	int numSPReshuffle;
	ToggleType toggleType;
	public ArrayList<Level> gameState;
	public ArrayList<Level> redoStates;
	
	public LevelEditorModel(){
		super();
		this.gameState = new ArrayList<Level>();
		this.redoStates = new ArrayList<Level>();
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
