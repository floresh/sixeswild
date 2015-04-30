package editor.model;

import game.entities.Level;

import java.util.ArrayList;
/**
 * 
 * @author Kwame
 *
 */
public class LevelManager {
	ArrayList<Level> levels;
	
	public LevelManager(){
		levels = new ArrayList<Level>();
	}
	
	public LevelManager(ArrayList<Level> levels){
		this.levels = levels;
	}
	
	public ArrayList<Level> getlevels(){
		return levels;
	}
	
	public void addLevel(Level level){
		levels.add(level);
	}

}
