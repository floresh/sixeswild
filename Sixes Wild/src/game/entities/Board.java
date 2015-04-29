package game.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Board implements Serializable {
	public Cell[][] cells;
	TopCell topCell;
	
	

	public Board(Level level) {
		topCell = new TopCell(level.getTF(),level.getMF());
		cells  = new Cell[9][9];
		

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				cells[i][j] = new Cell(i, j, true, false,true);
			}
		}
	}
	public Board(Level level,Cell[][] cells) {
		topCell = new TopCell(level.getTF(),level.getMF());
		cells  = new Cell[9][9];
		

		this.cells = cells;
	}
	public Board(Cell[][] cells) {
		this.cells = cells;
	}

	public ArrayList<Tile> getTiles() {
		ArrayList<Tile> tiles = new ArrayList<Tile>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; i < 9; j++) {
				tiles.add(cells[i][j].getTile());
			}
		}
		return tiles;
	}

	public void setTiles(ArrayList<Tile> tile) {
		int count = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; i < 9; j++) {
				cells[i][j].setTile(tile.get(count));
				count++;
			}
		}

	}

	public void initialize(ArrayList<Integer> tileFrequency,
			ArrayList<Integer> multiplierFrequency) {

		int value = 0;
		int multiplier = 0;

		int tileMax = 0;
		for (int i = 0; i < tileFrequency.size(); i++) {
			tileMax = tileMax + tileFrequency.get(i);

		}

		int multiMax = 0;
		for (int i = 0; i < multiplierFrequency.size(); i++) {
			multiMax = multiMax + multiplierFrequency.get(i);
		}

		int rand1 = randInt(0, tileMax);
		int rand2 = randInt(0, multiMax);

		int valueCount = 0;
		for (int i = 0; i < tileFrequency.size(); i++) {
			valueCount = valueCount + tileFrequency.get(i);
			if (rand1 <= valueCount) {
				value = i;
				break;
			}
		}
		int multiCount = 0;
		for (int j = 0; j < multiplierFrequency.size(); j++) {
			multiCount = multiCount + multiplierFrequency.get(j);
			if (rand2 <= multiCount) {
				multiplier = j;
				break;
			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				cells[i][j] = new Cell(i,j,true, false , false);
				cells[i][j].setTile(new Tile(value, multiplier));
			}
		}
	}
	
	
	public void gravity() {
		ArrayList<Cell> arrayHelp = new ArrayList<Cell>();
		arrayHelp.add(topCell);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arrayHelp.add(cells[j][i]);
			}
			cells[8][i].gravity(arrayHelp);
		}

	}

	public static int randInt(int min, int max) {

		Random rand = new Random();

		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

}
