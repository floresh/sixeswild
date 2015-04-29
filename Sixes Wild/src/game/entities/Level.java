package game.entities;

import game.controller.TimeController;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Level implements Serializable, ILevel {

	int score;
	int time;
	int movesLeft;
	
	Board board;
	TimeController timer;
	ArrayList<Integer> tileFrequencies, multiplierFrequencies, stars, rules;

	public Level() {
		tileFrequencies = new ArrayList<Integer>();
		multiplierFrequencies = new ArrayList<Integer>();

		// test code
		tileFrequencies = new ArrayList<Integer>() {
			{
				add(30);
				add(1);
				add(1);
				add(1);
				add(1);
				add(1);

			}
		};
		multiplierFrequencies = new ArrayList<Integer>() {
			{
				add(1);
				add(1);
				add(1);
				add(1);
				add(1);
				add(1);

			}
		};
		board = new Board(this);
		board.gravity();
		score = 0;
		time = 500;
		movesLeft = 50;
		
	}
	
	public Level(boolean a){
		
	}
	
	public Level(Board board, int score, int time, int movesLeft,
			ArrayList<Integer> tileFrequency,
			ArrayList<Integer> multiplierFrequency) {

	}

	public Level(Board board, ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		this.board = board;
		this.tileFrequencies = tileFrequencies;
		this.multiplierFrequencies = multiplierFrequencies;
		this.stars = stars;
		this.rules = rules;

		initilizeBoard();
	}

	public void initilizeBoard() {
		board.initialize();
	}
	
	public ArrayList<Integer> getTF(){
		return tileFrequencies;
	}
	public ArrayList<Integer> getMF(){
		return multiplierFrequencies;
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
	
	public TimeController getTimer() {
		return this.timer;
	}
	
	public void setTimer(TimeController timeController) {
		this.timer = timeController;
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
		this.multiplierFrequencies = f;
	}

	public void setBoard(Board b) {
		this.board = b;
		
	}
}
