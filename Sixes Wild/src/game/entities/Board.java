package game.entities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Board {
	
	
	protected Cell[][] cells = new Cell[10][9];
	
	
	
	
	public Board(){
		
		
		for(int i = 0 ; i < 10; i++){
			for(int j = 0; i < 9; j++){
				cells[i][j] =new Cell(new Tile(1,1),true, false, false);
			}
		}
		
	}
	public void setBoard(Cell[][] c){
		cells = c;
	}
	
	
public void initialize(ArrayList<Integer> tileFrequency, ArrayList<Integer> multiplierFrequency){
	
	
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
	
	for(int i = 0 ; i < 10; i++){
		for(int j = 0; i < 9; j++){
			cells[i][j].setTile(new Tile(value,multiplier));
		}
	}
	
	
	
}
	
  
	
	public void gravity()
	{
		
		
	}
	public static int randInt(int min, int max) {
		  
	    Random rand = new Random();
	    
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
}



