package game.entities;

public class Location {


 

	
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

