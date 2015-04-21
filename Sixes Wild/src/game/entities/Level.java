package game.entities;
import java.util.ArrayList;

public class Level {
	
	int score;
	int time;
	int movesLeft;
	Board board;
	ArrayList<Integer> tileFrequency = new ArrayList<Integer>();
	ArrayList<Integer> multiplierFrequency = new ArrayList<Integer>();
	
	public Level(){
		
	}
	
	public Level(Board board, int score, int time, int movesLeft, ArrayList<Integer> tileFrequency , ArrayList<Integer> multiplierFrequency){
		
	}
	
	public Board getBoard() { return board; }
	
	public int getScore() { return score; }
	
	public int getTime() { return time; }
	
	public int getMovesLeft() { return movesLeft; }
	
	public void setScore(int score) { this.score = score; }
	
	public void setTime(int time) { this.time = time; }
	
	public void setMovesLeft(int movesLeft) { this.movesLeft =  movesLeft; }
	}

	 
	


