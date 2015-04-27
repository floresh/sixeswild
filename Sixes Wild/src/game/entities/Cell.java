package game.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Cell implements Serializable {
	
	Tile tile;
	boolean isMarked;
	boolean isEmpty;
	boolean isEnabled;
	
	public Cell(){
		tile = new Tile();
		isMarked = false;
		isEmpty = true;
		isEnabled = false;
	}
	
	public Cell(boolean isEnabled, boolean isMarked){
		 tile = new Tile();
		 this.isEnabled = isEnabled;
		 this.isMarked = isMarked;
		 this.isEmpty = tile != null;
	}
	
	public Cell(Tile tile, boolean isEnabled, boolean isMarked, boolean isEmpty){
		 this.tile = tile;
		 this.isEnabled = isEnabled;
		 this.isMarked = isMarked;
		 this.isEmpty = isEmpty;
	}
	
	protected void gravity(ArrayList<Cell> column){
		int index = column.indexOf(this);
		
		if(isEmpty){
			tile = column.get(index - 1).requestTile(column);
			isEmpty = false;
		}
	
			column.get(index - 1).gravity(column);
	
	}
	
	protected Tile requestTile(ArrayList<Cell> column){
		int index = column.indexOf(this);
		
		if(isEmpty){	
			tile = column.get(index - 1).requestTile(column);
			isEmpty =false;
		}
		
		isEmpty = true;
		return tile;
		
		
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
