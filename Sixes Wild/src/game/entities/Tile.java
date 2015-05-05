package game.entities;

import java.io.Serializable;

/**
 * 
 * @author Andrew
 * 
 * Tiles hold the information displayed on the board and used for moves
 * These are the individual entities that fall down the board columns during moves
 */
public class Tile implements Serializable {
	/** value, 1-6 */
	int value;
	
	/** multiplier to value */
	int multiplier;
	
	public Tile(){
		value = 1;
		multiplier = 0;
	}
	
	public Tile(int value, int multiplier){
		this.value = value;
		this.multiplier = multiplier;
	}
	
	public int getValue(){
		return value;
	} 
	
	public int getMultiplier() {
		return multiplier;
	}
	
}
 
