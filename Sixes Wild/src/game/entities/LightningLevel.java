package game.entities;

import game.boundary.GameModeScreen;
import game.boundary.LightningLevelSelection;
import game.boundary.ReleaseLevelSelection;

import java.util.ArrayList;

public class LightningLevel extends Level{

	@Override
	public String getGameMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean openLevelScreen() {
		new LightningLevelSelection();
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
