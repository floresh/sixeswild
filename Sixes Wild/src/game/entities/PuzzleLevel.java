package game.entities;

import game.boundary.GameModeScreen;
import game.boundary.PuzzleLevelSelection;

import java.util.ArrayList;

/**
 * 
 * @author Andrew
 *
 */
public class PuzzleLevel extends Level {
	public PuzzleLevel() {
		super();
	}

	public PuzzleLevel(Board board, ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		super(board, tileFrequencies, multiplierFrequencies, stars, rules);
		unlockedLevels = new ArrayList<Integer>();
		highScores = new ArrayList<Integer>();
	}
	
	public PuzzleLevel(String name, Board board, ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		super(name, board, tileFrequencies, multiplierFrequencies, stars, rules);
		unlockedLevels = new ArrayList<Integer>();
		highScores = new ArrayList<Integer>();
	}

	@Override
	public String getGameMode() {
		return "Puzzle";
	}

	@Override
	public boolean openLevelScreen() {
		new PuzzleLevelSelection();
		return true;
	}

	@Override
	public GameModeScreen getPreviousScreen() {
		return new GameModeScreen();
	}

	@Override
	public ArrayList<Integer> getTileFrequencies() {
		return tileFrequencies;
	}

	@Override
	public ArrayList<Integer> getModifierFrequencies() {
		return multiplierFrequencies;
	}

	@Override
	public String getName() {
		return name;
	}

}
