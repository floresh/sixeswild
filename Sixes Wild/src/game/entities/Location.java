package game.entities;

public class Location {
	
	int column;
	int row;
	
	public Location(int c, int r){
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
