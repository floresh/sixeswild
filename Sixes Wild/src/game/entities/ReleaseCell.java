package game.entities;

import java.util.ArrayList;

public class ReleaseCell extends Cell{
	Tile tile;
	
	boolean isMarked;
	
	boolean isEmpty;
	
	boolean isEnabled;
	
	Location location;
	
	boolean isSelected = true;
	
	
	public ReleaseCell(){
		super();
	}
	
	public ReleaseCell(int r , int c ){
		
		location = new Location(r,c);
		 this.isEnabled = true;
		 this.isMarked = false;
		 this.isEmpty = true;
	}
	
	@Override
	protected Tile requestTile(ArrayList<Cell> column){
		int index = column.indexOf(this);
		
		if((isEmpty || !isEnabled)){
			if(column.get(index-1).getTile().getValue() == 6){
				tile = column.get(index - 1).requestTile(column);
				isEmpty =false;
			}
			else{
				tile = column.get(index - 1).requestTile(column);
				isEmpty = true;
			}
			
		}
		
		isEmpty = isEnabled;
		return tile;
		
		
	}
	
	@Override
	public Location getLocation(){
		return location;	
	}
	
	@Override
	public boolean getIsEmpty(){
		return isEmpty;
	}
	@Override
	public boolean getIsEnabled(){
		return isEnabled;
	}

}
