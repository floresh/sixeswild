package game.entities;

import java.util.ArrayList;
import java.util.Random;

public class TopCell extends Cell{
	
	Tile tile;
	boolean isMarked = false;
	boolean isEmpty = false;
	boolean isEnabled = false;
	
	ArrayList<Integer> tileFrequency = new ArrayList<Integer>();
	ArrayList<Integer> multiplierFrequency = new ArrayList<Integer>();
	
	protected void gravity(ArrayList<Cell> column){
		
	}
	
	protected Tile requestTile(ArrayList<Cell> column){
		
		int value =0;
		int multiplier =0;
		
		int tileMax =0;
		for(int i = 0;  i < tileFrequency.size(); i++){
			tileMax = tileMax + tileFrequency.get(i);
			
		}
		
		int multiMax =0;
		for(int i = 0;  i < multiplierFrequency.size(); i++){
			multiMax = multiMax + multiplierFrequency.get(i);
			
		}
		
		int rand1 = randInt(0,tileMax);
		int rand2 = randInt(0,multiMax);
		
		int valueCount = 0;
		for(int i = 0;  i < tileFrequency.size(); i++){
			valueCount = valueCount +tileFrequency.get(i);
			if(rand1 <= valueCount ){
				value = i;
				break;
			}
		}
		int multiCount = 0;
		for(int j = 0;  j < multiplierFrequency.size(); j++){
			multiCount = multiCount + multiplierFrequency.get(j);
			if(rand2 <= multiCount){
				multiplier = j;
				break;
				}	
		}
		
		
		return new Tile(value , multiplier);
		
		
	}
	public static int randInt(int min, int max) {
		  
	    Random rand = new Random();
	    
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}
