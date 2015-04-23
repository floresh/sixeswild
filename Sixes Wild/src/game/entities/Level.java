package game.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Level implements Serializable, ILevel {

	int score;
	int time;
	int movesLeft;
	Board board;
	ArrayList<Integer> tileFrequencies, multiplierFrequencies, stars, rules;

	public Level() {
		tileFrequencies = new ArrayList<Integer>();
		multiplierFrequencies = new ArrayList<Integer>();
	}

	public Level(Board board, int score, int time, int movesLeft,
			ArrayList<Integer> tileFrequency,
			ArrayList<Integer> multiplierFrequency) {

	}

	public Level(ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars, ArrayList<Integer> rules) {
		board = new Board();
		this.tileFrequencies = tileFrequencies;
		this.multiplierFrequencies = multiplierFrequencies;
		this.stars = stars;
		this.rules = rules;
	}

	public Board getBoard() {
		return board;
	}

	public int getScore() {
		return score;
	}

	public int getTime() {
		return time;
	}

	public int getMovesLeft() {
		return movesLeft;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void setMovesLeft(int movesLeft) {
		this.movesLeft = movesLeft;
	}

	public void setTileFrequency(ArrayList<Integer> f) {
		this.tileFrequencies = f;
	}

	public void setMultiplierFrequency(ArrayList<Integer> f) {
		this.tileFrequencies = f;
	}

	@Override
	public String getGameMode() {
		return "level";
	}

}
