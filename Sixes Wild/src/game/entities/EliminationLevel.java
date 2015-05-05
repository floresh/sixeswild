package game.entities;

import java.util.ArrayList;

import game.boundary.EliminationLevelSelection;
import game.boundary.GameModeScreen;
import game.boundary.ReleaseLevelSelection;

public class EliminationLevel extends Level {
	public EliminationLevel(){
		super();
	}
	
	public EliminationLevel(String name, Board board, ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		super(name, board, tileFrequencies, multiplierFrequencies, stars, rules);
		unlockedLevels = new ArrayList<Integer>();
		highScores = new ArrayList<Integer>();
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
