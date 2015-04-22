package game.entities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Board {
	
	
	protected Cell[][] cells = new Cell[10][9];
	protected Level level;
	
	public Board(){
		Tile tile = new Tile(1,1);
		
		
		
	}
	
	public Board(Level level){
		this.level = level;
		
		for(int i = 0 ; i < 10; i++){
			for(int j = 0; i < 9; j++){
				cells[i][j] =new Cell(new Tile(1,1),true, false, false);
			}
		}
		
	}
	
	
  
	
	public void gravity()
	{
		
		
	}
	public void randomize(){
		
	}
	
	
		
	}


