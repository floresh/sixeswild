package game.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Model implements Serializable{
	Level currentLevel;
	int numSPRemove;
	int numSPSwap;
	int numSPReshuffle;

	public Model() {
		currentLevel = new NoLevel();
		numSPRemove = numSPSwap = numSPReshuffle = 0;
	}
	
	public Model (Level currentLevel){
		this.currentLevel = currentLevel;
	}

	public Level getCurrentLevel() {
		return currentLevel;
	}
	
	

	public void setCurrentLevel(Level level) {
		currentLevel = level;
	}

}
