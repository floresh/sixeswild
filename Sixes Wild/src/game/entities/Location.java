package game.entities;

import java.io.Serializable;
/**
 * 
 * @author Andrew
 * 
 * 
 */

public class Location implements Serializable{

	int column;
	int row;
	
	public Location(int r, int c){
		column = c;
		row = r;
				
	}
	
	public int getRow(){
		return row;
	}
	public int getColumn(){
		return column;
	}
}

