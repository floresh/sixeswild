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
	Board getBoard(){
		return board;
	}
	int getScore(){
		return score;
	}
	int getTime(){
		return time;
	}
	int getMovesLeft(){
		return movesLeft;
	}
	void setScore(int score){
		 this.score = score;
	}
	void setTime(int time){
		this.time = time;
	}
	void setMovesLeft(int movesLeft){
		this.movesLeft =  movesLeft;
	}
	}

	 
	


