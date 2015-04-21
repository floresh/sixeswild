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
	
	Tile getTile(){
		return tile;
	}
	boolean getIsMarked(){
		return isMarked;
	}
	boolean getIsEmpty(){
		return isEmpty;
	}
	boolean getIsEnabled(){
		return isEnabled;
	}
	
	void setIsMarked(boolean isMarked){
		this.isMarked = isMarked;
	}
	void setIsEmpty(boolean isEmpty){
		this.isEmpty = isEmpty;
	}
	void setIsEnabled(boolean isEnabled){
		this.isEnabled  = isEnabled;
	}
	 

}
