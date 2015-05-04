package game.entities;

import java.util.ArrayList;

import game.boundary.GameModeScreen;

public class NoLevel extends Level implements ILevel{

	public NoLevel(){
		super();
	}

	@Override
	public String getGameMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean openLevelScreen() {
		new GameModeScreen();
		return true;
	}

	@Override
	public GameModeScreen getPreviousScreen() {
		throw new UnsupportedOperationException("Game closes from here");
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

	@Override
	public String getName() {
		throw new UnsupportedOperationException("No name for no level");
	}
	
}
