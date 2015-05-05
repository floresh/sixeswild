package game.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Model implements Serializable{
	Level currentLevel;
	int numSPRemove;
	int numSPSwap;
	int numSPReshuffle;
	public boolean[][] unlockedLevels;

	public Model() {
		currentLevel = new NoLevel();
		numSPRemove = numSPSwap = numSPReshuffle = 0;
		unlockedLevels = new boolean[4][4];
		//first parameter is for game mode type
		//puzzle = 0
		//elimination = 1
		//lightning = 2
		//release = 3
		
		//second parameter is the level number, 0-3 for 1-4
		for(int i = 0; i<4;i++){
			for(int j=0;j<4;j++){
				unlockedLevels[i][j] = true;
			}
		}
		unlockedLevels[0][0] = true;
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
