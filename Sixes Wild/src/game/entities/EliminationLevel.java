package game.entities;

import java.util.ArrayList;

import game.boundary.GameModeScreen;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GameModeScreen getPreviousScreen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Integer> getTileFrequencies() {
		// TODO Auto-generated method stub
		return null;
	}

}
