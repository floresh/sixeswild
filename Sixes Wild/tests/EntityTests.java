import java.util.ArrayList;

import game.boundary.SplashScreen;
import game.entities.Board;
import game.entities.Cell;
import game.entities.Level;
import game.entities.Model;
import game.entities.PuzzleLevel;
import game.entities.TopCell;
import junit.framework.TestCase;

public class EntityTests extends TestCase{
	
	Model m = new Model();
	PuzzleLevel pl = new PuzzleLevel();
	Cell[][] cells = new Cell[9][9];
	
public void testLevel() {
	 
		assertNotSame(m.getCurrentLevel(), pl);
		
		m.setCurrentLevel(pl);
		assertEquals(m.getCurrentLevel(), pl);
}

public void initializeBoards(){
	Cell c = new Cell();
	for(int i = 0; i < 9; i++){
		for(int j = 0; j < 9; j++){
			cells[i][j].add
		}
	}
	
	Board b = new Board(m.getCurrentLevel(),cells);
	public Board(Cell[][] cells, ArrayList<Integer> tileFrequency, ArrayList<Integer> multiplierFrequency) {
		this.cells = cells;
		setTopCell(tileFrequency, multiplierFrequency);
	}
	
}
public void testSplashScreen(){
	SplashScreen splash = new SplashScreen();
}

public void testCells() {}}

