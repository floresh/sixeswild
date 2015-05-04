package game.entities;

import java.util.ArrayList;

import game.boundary.GameModeScreen;

public interface ILevel {
	
	public String getName();
	
	public String getGameMode();
	
	public boolean openLevelScreen();
	
	public GameModeScreen getPreviousScreen();
	
	public ArrayList<Integer> getTileFrequencies();
	
	public ArrayList<Integer> getModifierFrequencies();

}
