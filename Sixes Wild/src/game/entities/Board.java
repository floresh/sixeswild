package game.entities;

import java.util.ArrayList;
import java.util.Arrays;


public class Board {

	
	
	public Cell[][] cells = new Cell[10][9];
	protected Level level;

	ArrayList<Cell> column = new ArrayList<Cell>();
	ArrayList<Arrays> columns = new ArrayList<Arrays>();

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
