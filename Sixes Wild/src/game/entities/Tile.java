package game.entities;

public class Tile {
	int value;
	int multiplier;
	public Tile(int value, int multiplier){
		this.value = value;
		this.multiplier = multiplier;
	}
	int getValue(){
		return value;
	}
	int getMultipier(){
		return multiplier;
	}

}
 