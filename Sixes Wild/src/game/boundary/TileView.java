package game.boundary;

import game.entities.Tile;

/**
 * 
 * @author Li Li
 *
 */
public class TileView {

	Tile tile;
	
	public TileView(Tile tile) {
		this.tile = tile;
	}
	
	public Tile getTile(){
		return this.tile;
	}
}
