package game.controller.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import game.boundary.LevelView;
import game.controller.EndGameController;
import game.entities.Cell;
import game.entities.Level;
import game.entities.Model;
import game.entities.PuzzleLevel;
import game.entities.Tile;
import game.main.Main;
import game.move.controller.MoveController;

public class EndGameControllerTest extends TestCase{
	Main main;
	
	@Override
	protected void setUp(){
		main = new Main();
		
		Main.model = new Model();
	}
	
	public void testEndGameController(){
		PuzzleLevel level = new PuzzleLevel();
		LevelView lv = new LevelView(level);
		
		lv.getLevel().setMovesLeft(1);
		
		MoveController mc = new MoveController(lv);
		Cell c1 = level.getBoard().cells[0][0];
		Cell c2 = level.getBoard().cells[0][0];
		Cell c3 = level.getBoard().cells[0][0];
		Tile t1 = new Tile(1,1);
		Tile t2 = new Tile(2,1);
		Tile t3 = new Tile(3,1);
		c1.setTile(t1);
		c2.setTile(t2);
		c3.setTile(t3);
		ArrayList<Cell> cells = new ArrayList<Cell>();
		cells.add(c1);
		cells.add(c2);
		cells.add(c3);
		mc.doMove(cells);
		ArrayList<Cell> fauxCells = new ArrayList<Cell>();
		for(int i = 0; i<8; i++){
			fauxCells.add(c1);
		}
		mc.doMove(fauxCells);
		assertEquals(1,lv.getLevel().getMovesLeft());
		
		EndGameController egc = new EndGameController(lv);
		egc.process(true);
		
		lv.getLevel().setScore(40);
		egc.process(true);
		
		lv.getLevel().setScore(80);
		egc.process(true);
		
		lv.getLevel().setScore(150);
		egc.process(true);
	}
	
	
	
} 
