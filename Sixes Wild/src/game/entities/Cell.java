package game.entities;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author Andrew
 * 
 * 
 */
public class Cell implements Serializable {
	/** tile that each non empty/disabled cell holds */
	Tile tile;
	
	/** marks a cell for elimination game mode */
	boolean isMarked;
	
	/** marks a cell as empty so that it may be refilled */
	boolean isEmpty;
	
	/** marks a cell as enable/disabled so that tiles fall through it */
	boolean isEnabled;
	
	/** Location(row, column) of this cell */
	Location location;
	
	/**
	 * TODO what is the difference between this isSelected and the isSelected in tile?
	 *  Marks cell as selected in the middle of a move */
	boolean isSelected = false;
	
	public Cell(){
		tile = new Tile();
		isMarked = false;
		isEmpty = true;
		isEnabled = false;
	}
	
//	public Cell(int column, int row, boolean isEnabled, boolean isMarked){
//		location = new Location(column ,row);
//		 tile = new Tile();
//		 this.isEnabled = isEnabled;
//		 this.isMarked = isMarked;
//		 this.isEmpty = tile != null;
//	}
//	
	public Cell(int r , int c , boolean isEnabled, boolean isMarked, boolean isEmpty){
		
		location = new Location(r,c);
		 this.isEnabled = isEnabled;
		 this.isMarked = isMarked;
		 this.isEmpty = isEmpty;
	}
	
	/**
	 * recursive method to have tiles fall down in columns
	 * @param column
	 */
	protected void gravity(ArrayList<Cell> column) {
		int index = column.indexOf(this);
		
		if(isEmpty){
			tile = column.get(index - 1).requestTile(column);
			isEmpty = false;
		}
	
			column.get(index - 1).gravity(column);
	
	}
	
	/**
	 * TODO explain method
	 * @param column
	 * @return Tile
	 */
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
	public Location getLocation(){
		return location;
		
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

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected() {
		isSelected = true;	
	}
}
