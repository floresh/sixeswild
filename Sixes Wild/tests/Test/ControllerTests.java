package Test;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

import game.boundary.GameModeScreen;
import game.boundary.LevelView;
import game.controller.SelectGameModeController;
import game.controller.SelectLevelController;
import game.entities.Board;
import game.entities.Cell;
import game.entities.Model;
import game.entities.PuzzleLevel;
import game.main.Main;
import game.move.controller.MoveController;
import game.move.controller.SelectionController;
import game.move.controller.SwapButtonController;
import junit.framework.TestCase;

public class ControllerTests extends TestCase {
	
	Main main;
	JFrame frame = new JFrame();
	LevelView lv;
	Cell[][] cells;
	ArrayList<Cell> cellsz = new ArrayList<Cell>();
	Cell cell;
	Board b = new Board(cells);
	PuzzleLevel pl = new PuzzleLevel();
	GameModeScreen gms;
	
	protected void setUp() {
		main = new Main();
		lv = new LevelView(pl);
		gms = new GameModeScreen();
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				cell = new Cell (i, j, true, false, false);
			}
		}
		cell = new Cell (7, 8, true, false, false);
	}
	protected void tearDown() {
		lv.dispose();
	}
	
	public void testSelect(){
		SelectLevelController slc = new SelectLevelController(frame, "Puzzle");
		
	}
	
	public void testSelectGameMode(){
		SelectGameModeController sgmc = new SelectGameModeController(gms);
	}
	public void testSwap(){
		SwapButtonController sbc = new SwapButtonController(lv);
		sbc.swap(cell);
	}

}
