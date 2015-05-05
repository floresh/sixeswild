package game.entities;

import java.util.ArrayList;

public class ReleaseCell extends Cell{
	
	
	boolean has6;
	
	public ReleaseCell(){
		super();
		
	}
	
	public ReleaseCell(int r , int c ){
		
		location = new Location(r,c);
		 this.isEnabled = true;
		 this.isMarked = false;
		 this.isEmpty = true;
		 tile = new Tile(7,0);
	}
//	@Override
//	protected void gravity(ArrayList<Cell> column) {
//		int index = column.indexOf(this);
//		
//		
//		if(!has6 && column.get(index - 1).getTile().getValue() == 6){
//			tile = column.get(index - 1).requestTile(column);
//			has6 = true;
//		}
//	
//			column.get(index - 1).gravity(column);
//	
//	}
	
	@Override
	protected Tile requestTile(ArrayList<Cell> column){
		int index = column.indexOf(this);
		
		if(!isEnabled){
			return column.get(index - 1).requestTile(column);
		}
		
		if(isEmpty){
			tile = column.get(index - 1).requestTile(column);
			isEmpty = false;
		}
		
		if(tile.getValue() ==  6 ){
			return column.get(index - 1).requestTile(column);

		}
			
			isEmpty = true;
			return tile;
		
		
		
		
//		if(!has6 && column.get(index - 1).getTile().getValue() == 6){
//			tile = column.get(index - 1).requestTile(column);
//			has6 = true;
//			//return column.get(index - 1).requestTile(column);
//		}
//		return column.get(index - 1).requestTile(column);
//		
//		
		
//		if(tile.getValue() == 6 || !isEnabled || isEmpty){
//			System.out.println(String.valueOf(tile.getValue()));
//			return column.get(index - 1).requestTile(column);
//		}
//		System.out.println("passed");
//		isEmpty = isEnabled;
//		return tile;
		
		
//		if((isEmpty || !isEnabled)){
//			if(column.get(index-1).getTile().getValue() == 6){
//				tile = column.get(index - 1).requestTile(column);
//				isEmpty =false;
//			}
//			else{
//				tile = column.get(index - 1).requestTile(column);
//				isEmpty = true;
//			}
//			
//		}
		
		
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
	@Override
	public boolean isReleased(){
		if(tile.getValue() == 6){return true;}
		return false;
	}

}
