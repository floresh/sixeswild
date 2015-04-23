package game.entities;

import java.util.ArrayList;

public class PuzzleLevel extends Level {
	public PuzzleLevel(ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars, ArrayList<Integer> rules) {
		super(tileFrequencies, multiplierFrequencies, stars, rules);
	}

	@Override
	public String getGameMode() {
		return "Puzzle";
	}

}
