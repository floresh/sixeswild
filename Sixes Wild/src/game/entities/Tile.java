package game.entities;

import java.io.Serializable;

public class Tile implements Serializable {
	int value;
	int multiplier;
	boolean setSelected;
	
	public Tile(){
		value = 0;
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
	
	public boolean setSelected(){
		return setSelected;
	}

}
 