package game.entities;

import java.util.ArrayList;

import game.boundary.EliminationLevelSelection;
import game.boundary.GameModeScreen;
import game.boundary.ReleaseLevelSelection;

public class EliminationLevel extends Level implements ILevel {
	public EliminationLevel(){
		super();
	}

	@Override
	public String getGameMode() {
		return "Elimination";
	}

	@Override
	public boolean openLevelScreen() {
		new EliminationLevelSelection();
		return true;
	}

	@Override
	public GameModeScreen getPreviousScreen() {
		return new GameModeScreen();
	}

	@Override
	public ArrayList<Integer> getTileFrequencies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Integer> getModifierFrequencies() {
		// TODO Auto-generated method stub
		return null;
	}

}
