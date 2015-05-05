package game.entities;

import game.boundary.GameModeScreen;
import game.boundary.ReleaseLevelSelection;

import java.util.ArrayList;

public class ReleaseLevel extends Level {
	
	public ReleaseLevel(Board board, ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		super(board, tileFrequencies, multiplierFrequencies, stars, rules);
		unlockedLevels = new ArrayList<Integer>();
		highScores = new ArrayList<Integer>();
	}
	
	public ReleaseLevel(String name, Board board, ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		super(name, board, tileFrequencies, multiplierFrequencies, stars, rules);
		unlockedLevels = new ArrayList<Integer>();
		highScores = new ArrayList<Integer>();
	}

	public ReleaseLevel(){
		super();
	}
	@Override
	public String getGameMode() {
		return "Release";
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
		return this.tileFrequencies;
	}

	@Override
	public ArrayList<Integer> getModifierFrequencies() {
		return this.multiplierFrequencies;
	}
	@Override
	public String getName() {
		return name;
	}
}
