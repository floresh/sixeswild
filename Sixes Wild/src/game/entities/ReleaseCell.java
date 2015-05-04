package game.entities;

import java.util.ArrayList;

public class ReleaseCell extends Cell{

	
	
	public ReleaseCell(){
		super();
	}
	
	public ReleaseCell(int r , int c ){
		
		location = new Location(r,c);
		 this.isEnabled = true;
		 this.isMarked = false;
		 this.isEmpty = true;
	}
	

	
	protected Tile requestTile(ArrayList<Cell> column){
		int index = column.indexOf(this);
		if(isEmpty){
			tile = column.get(index - 1).requestTile(column);
			isEmpty = false;
		}
		if( !isEnabled || tile.getValue() == 6){	
			return column.get(index - 1).requestTile(column);
		
		}else
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
