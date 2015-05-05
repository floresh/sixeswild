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
		levels.put(level.getName(), level);
		return true;
	}
	
	public Level getLevel(String name){
		System.out.println(levels.containsKey(name));
		return levels.get(name);
	}

}
