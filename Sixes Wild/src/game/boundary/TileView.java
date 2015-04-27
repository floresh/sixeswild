package game.boundary;

import game.entities.Tile;

public class TileView {

	Tile tile;
	
	public TileView(Tile tile) {
		this.tile = tile;
	}
	
	public Tile getTile(){
		return this.tile;
	}
}
