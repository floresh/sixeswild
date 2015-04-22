package game.entities;

import java.util.ArrayList;
import java.util.Arrays;


public class Board {
	ArrayList<Cell> column = new ArrayList<Cell>();
	ArrayList<Arrays> columns = new ArrayList<Arrays>();
	Level level;
	
	public Board(){
		
	}
	
	public Board(Level level, ArrayList<Cell> column ,ArrayList<Arrays> columns, ArrayList<Integer> tileFrequency ,ArrayList<Integer> multiplierFrequency){
		
	}
	
	
 
	
	public void gravity()
	{
		
		
	}
	public void randomize(){
		
	}
	
	ArrayList<Arrays> getColumns(){
		return columns;
		
	}

}
