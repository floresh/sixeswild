package game.entities;

import game.boundary.GameModeScreen;
import game.boundary.PuzzleLevelSelection;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PuzzleLevel extends Level {
	ArrayList<PuzzleLevel> unlockedLevels, highScores;

	public PuzzleLevel() {
	}

	public PuzzleLevel(ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		super(tileFrequencies, multiplierFrequencies, stars, rules);
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

}
