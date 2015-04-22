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
	
	public Tile getTile(){
		return tile;
	}
	public boolean getIsMarked(){
		return isMarked;
	}
	public boolean getIsEmpty(){
		return isEmpty;
	}
	public boolean getIsEnabled(){
		return isEnabled;
	}
	
	public void setIsMarked(boolean isMarked){
		this.isMarked = isMarked;
	}
	public void setIsEmpty(boolean isEmpty){
		this.isEmpty = isEmpty;
	}
	public void setIsEnabled(boolean isEnabled){
		this.isEnabled  = isEnabled;
	}
	 

}
