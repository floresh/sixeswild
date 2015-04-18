package game.entities;

public class Cell {
	
	Tile tile;
	boolean isMarked;
	boolean isEmpty;
	boolean isEnabled;
	Cell above;
	
	
	public Cell(boolean isEnabled){
		
	}
	public Tile requestTile(Cell above){
		
		return above.tile;
	}
	
}
