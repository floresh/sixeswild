package game.entities;

import game.boundary.GameModeScreen;

public interface ILevel {
	
	public String getGameMode();
	
	public boolean openLevelScreen();
	
	public GameModeScreen getPreviousScreen();

}
