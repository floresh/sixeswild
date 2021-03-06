package game.entities;

import game.controller.TimeController;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * 
 * @author Andrew
 * 
 * 
 */

public abstract class Level implements Serializable, ILevel {

	String name;
	int score;
	int time;
	int movesLeft;
	int maxMoves;
	boolean deleteMove;
	boolean swapTilesMove;
	int deletesLeft;
	int swapsLeft;
	int reshufflesLeft;
	ArrayList<Integer> unlockedLevels, highScores;

	Board board;
	TimeController timer;
	/**
	 * rules order:
	 * 0: maxMoves
	 * 1: maxTime
	 * 2: deletesLeft
	 * 3: reshufflesLeft
	 * 4: swapsLeft
	 */
	ArrayList<Integer> tileFrequencies, multiplierFrequencies, stars, rules;
	

	public Level() {

		deletesLeft = 3;
		swapsLeft = 3;
		reshufflesLeft = 3;

		tileFrequencies = new ArrayList<Integer>();
		multiplierFrequencies = new ArrayList<Integer>();

		// test code
		tileFrequencies = new ArrayList<Integer>() {
			{
				add(1);
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
		stars = new ArrayList<Integer>() {
			{
				add(25);
				add(50);
				add(100);
			}
		};
		board = new Board(this);
		board.gravity();
		score = 0;
		time = 0;
		movesLeft = 50;
		maxMoves = movesLeft;
		deleteMove = false;
		swapTilesMove = false;
	}

	public Level(boolean a) {

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
		this.movesLeft = rules.get(0);

		// initilizeBoard();
	}
	
	public Level(String name, Board board, ArrayList<Integer> tileFrequencies,
			ArrayList<Integer> multiplierFrequencies, ArrayList<Integer> stars,
			ArrayList<Integer> rules) {
		this(board, tileFrequencies, multiplierFrequencies, stars, rules);
		this.name = name;
		this.movesLeft = maxMoves = rules.get(0);
		deletesLeft = rules.get(2);
		reshufflesLeft = rules.get(3);
		swapsLeft = rules.get(4);
	}
	
	/**
	 * rules order:
	 * 0: maxMoves
	 * 1: maxTime
	 * 2: deletesLeft
	 * 3: reshufflesLeft
	 * 4: swapsLeft
	 */

	public void initilizeBoard() {
		board.initialize();
	}

	public ArrayList<Integer> getTF() {
		return tileFrequencies;
	}

	public ArrayList<Integer> getMF() {
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

	public ArrayList<Integer> getStars() {
		return this.stars;
	}

	public TimeController getTimer() {
		return this.timer;
	}

	public void setStars(ArrayList<Integer> newStars) {
		this.stars = newStars;
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

	public int getMaxMoves() {
		return this.maxMoves;
	}

	public void setBoard(Board b) {
		this.board = b;
	}

	public void setMaxMoves(int maximum) {
		this.maxMoves = maximum;
	}

	public void setDeleteMove(boolean state) {
		deleteMove = state;
	}

	public boolean getDeleteMoveState() {
		return deleteMove;
	}

	public void setMoveSwap(boolean state) {
		swapTilesMove = state;
	}

	public boolean getMoveSwap() {
		return swapTilesMove;
	}

	public int getDeletsLeft() {
		return deletesLeft;
	}

	public int getReshufflesLeft() {
		return reshufflesLeft;
	}

	public int getSwapsLeft() {
		return swapsLeft;
	}

	public void setDeletesLeft(int i) {
		deletesLeft = i;
	}

	public void setSwapsLeft(int i) {
		swapsLeft = i;
	}

	public void setReshufflesLeft(int i) {
		reshufflesLeft = i;
	}
	
	public void setName(String s){
		this.name = s;
	}

}
