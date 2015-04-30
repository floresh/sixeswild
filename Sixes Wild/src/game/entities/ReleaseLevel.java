package game.entities;

import game.boundary.GameModeScreen;
import game.boundary.PuzzleLevelSelection;
import game.boundary.ReleaseLevelSelection;

import java.util.ArrayList;

public class ReleaseLevel extends Level {

	@Override
	public String getGameMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean openLevelScreen() {
		new ReleaseLevelSelection();
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
