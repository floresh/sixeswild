package editor.model;

import game.entities.Level;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * 
 * @author Kwame
 *
 */
public class LevelManager {
	HashMap<String, Level> levels;
	
	public LevelManager(){
		levels = new HashMap<String, Level>();
	}
	
	public LevelManager( HashMap<String, Level> levels){
		this.levels = levels;
	}
	
	public  HashMap<String, Level> getlevels(){
		return levels;
	}
	
	public boolean addLevel(Level level){
		if(levels.containsKey(level.getName()))
			return false;
		levels.put(level.getName(), level);
		return true;
	}
	
	public Level getLevel(String name){
		return levels.get(name);
	}

}
