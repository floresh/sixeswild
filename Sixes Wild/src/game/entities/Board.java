package game.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;


/**
 * 
 * @author Andrew
 * 
 * Holds information for the game board.
 * Contains a 9x9 array of cells which are the stationary place-holders for tiles
 */

public class Board implements Serializable {
	
	/** Array to hold all cells */
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
	
	public Board(Cell[][] cells, ArrayList<Integer> tileFrequency, ArrayList<Integer> multiplierFrequency) {
		this.cells = cells;
		setTopCell(tileFrequency, multiplierFrequency);
	}
	/**
	 * returns an array list of all tile in board
	 * @return
	 */
	public ArrayList<Tile> getTiles() {
		ArrayList<Tile> tiles = new ArrayList<Tile>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				tiles.add(cells[i][j].getTile());
			}
		}
		return tiles;
	}
	/**
	 * takes an array list of tiles and iterates through
	 * it in order, to create an board from tiles
	 * @param tile
	 */
	public void setTiles(ArrayList<Tile> tile) {
		int count = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				cells[i][j].setTile(tile.get(count));
				count++;
			}
		}

	}
	/**
	 * initializes board randomly by setting all cells
	 * to empty and calling gravity function
	 */
	public void initialize() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
		
				cells[i][j].setIsEmpty(true);
				cells[i][j].setIsMarked(false);
			}
		}
		gravity();
	}
	
	/**
	 * Goes through entire board looking for empty cells
	 * and has new tiles fall down into them
	 */
	public void gravity() {
		ArrayList<Cell> arrayHelp = new ArrayList<Cell>();
	
		
		
		for (int c = 0; c < 9; c++) {
			arrayHelp.add(topCell);
			for (int r = 0; r < 9; r++) {
				arrayHelp.add(cells[r][c]);
			}
			cells[8][c].gravity(arrayHelp);
			arrayHelp.clear();
		}

	}
	
	/**
	 * TODO explain setTopCell and TopCell attribute
	 * @param tileFrequency
	 * @param multiplierFrequency
	 */
	public void setTopCell(ArrayList<Integer> tileFrequency, ArrayList<Integer> multiplierFrequency){
		topCell = new TopCell(tileFrequency,multiplierFrequency);
		
	}
	public boolean allMarked(){
		for (int c = 0; c < 9; c++) {
			for (int r = 0; r < 9; r++) {
				Cell cell = cells[r][c];
				if(cell.getIsEnabled() && !cell.isMarked){
					return false;
				}
			}
		
	}
		return true;
	}
	public boolean allReleased(){
		for (int c = 0; c < 9; c++) {
			for (int r = 0; r < 9; r++) {
				Cell cell = cells[r][c];
				if(!cell.isReleased()){
					return false;
				}
			}
		
	}
		return true;
		
	}
	/**
	 * Returns a random int between the give minimum and maximum values
	 * @param min
	 * @param max
	 * @return new random int
	 */
	public static int randInt(int min, int max) {

		Random rand = new Random();

		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

}
