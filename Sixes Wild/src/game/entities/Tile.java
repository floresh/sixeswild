package game.entities;

import java.io.Serializable;

public class Tile implements Serializable {
	int value;
	int multiplier;
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
 