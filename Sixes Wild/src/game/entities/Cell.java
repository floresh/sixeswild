package game.entities;

public class Cell {
	
	Tile tile;
	boolean isMarked;
	boolean isEmpty;
	boolean isEnabled;
	
	
	
	public Cell(Tile tile, boolean isEnabled, boolean isMarked, boolean isEmpty){
		
		 this.tile = tile;
		 this.isEnabled = isEnabled;
		 this.isMarked = isMarked;
		 this.isEmpty = isEmpty;
		 
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
	public void setTile(Tile t){
		tile = t;
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
