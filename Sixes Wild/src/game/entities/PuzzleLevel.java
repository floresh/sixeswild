package game.entities;

import game.boundary.GameModeScreen;
import game.boundary.PuzzleLevelSelection;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PuzzleLevel extends Level {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6023001302320466747L;
	ArrayList<Integer> unlockedLevels, highScores;

	public PuzzleLevel() {
		super();
		
	}

	public PuzzleLevel(ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		super(tileFrequencies, multiplierFrequencies, stars, rules);
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

}
