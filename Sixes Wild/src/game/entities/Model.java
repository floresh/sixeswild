package game.entities;

public class Model{
	Level currentLevel;
	int numSPSRemove;
	int numSPSwap;
	int numSPReshuffle;

	public Model() {
		currentLevel = new NoLevel();
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
