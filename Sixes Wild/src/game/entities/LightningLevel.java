package game.entities;

import game.boundary.GameModeScreen;
import game.boundary.LightningLevelSelection;
import game.boundary.ReleaseLevelSelection;

import java.util.ArrayList;

public class LightningLevel extends Level{
	public LightningLevel(){
		
	}
	
	public LightningLevel(Board board, ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		super(board, tileFrequencies, multiplierFrequencies, stars, rules);
		unlockedLevels = new ArrayList<Integer>();
		highScores = new ArrayList<Integer>();
	}
	
	public LightningLevel(String name, Board board, ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		super(name, board, tileFrequencies, multiplierFrequencies, stars, rules);
		unlockedLevels = new ArrayList<Integer>();
		highScores = new ArrayList<Integer>();
	}
	
	@Override
	public String getGameMode() {
		return "Lightning";
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

	@Override
	public String getName() {
		return name;
	}

}
