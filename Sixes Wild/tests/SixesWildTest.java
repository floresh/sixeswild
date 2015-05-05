import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.EventObject;

import javax.swing.JFrame;

import game.boundary.EndGameScreen;
import game.boundary.GameModeScreen;
import game.boundary.LevelView;
import game.boundary.PuzzleLevelSelection;
import game.boundary.SplashScreen;
import game.controller.ReturnToPreviousMenuController;
import game.controller.SelectLevelController;
import game.entities.Board;
import game.entities.Cell;
import game.entities.EliminationLevel;
import game.entities.LightningLevel;
import game.entities.Model;
import game.entities.PuzzleLevel;
import game.entities.ReleaseLevel;
import game.move.controller.MoveController;
import game.move.controller.SelectionController;
import junit.framework.TestCase;

public class SixesWildTest extends TestCase{

	Model m = new Model();
	Board b;
	PuzzleLevel pl;
	Cell[][] cells = new Cell[9][9];
	LevelView lv;
	MouseListener l;
	MouseMotionListener ml;
	JFrame frame;
	Cell cell;
	PuzzleLevelSelection puzFrame;
	
	protected void setUp() {
		pl = new PuzzleLevel();
		lv = new LevelView(pl);
		EliminationLevel el = new EliminationLevel();
		LightningLevel ll = new LightningLevel();
		ReleaseLevel rl = new ReleaseLevel();
		EndGameScreen egs = new EndGameScreen(lv);
		GameModeScreen gms = new GameModeScreen();
		
		b = new Board(cells);
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				cells[i][j] = new Cell (i, j, true, false, false);
			}
		}

		lv = new LevelView(pl);
		lv.getBoardView().setActiveListener(l);
		lv.getBoardView().setActiveMotionListener(ml);
}
	public void testLevel() {

		assertNotSame(m.getCurrentLevel(), pl);
		m.setCurrentLevel(pl);
		assertEquals(m.getCurrentLevel(), pl);
	}

	public void testSplash(){
		SplashScreen splash = new SplashScreen();

	}

	public void testSelect(){
		SelectLevelController slc = new SelectLevelController(puzFrame, "Puzzle");
		Board board = new Board(pl);
		//slc.actionPerformed(e);
	}

	public void testCell(){
	//	assertEquals(b.cells[1][1], );
	}

	public void testMoveController() {
		//Object me = ((EventObject) me).getSource();
		MoveController mc = new MoveController(lv);
		SelectionController sc = new SelectionController(lv.getBoardView(), mc);
		sc.register();
		
		//sc.mousePressed(me);
		
		//MouseEvent pr = createPressed(cell
	}
	
	public void testGetListener(){
		lv.getBoardView().getActiveListener();
		lv.getBoardView().getActiveMouseMotionListener();
	}
	
	public void testGetBoard(){
		lv.getBoardView().getBoard();
	}
	
	public void testQuitLevel(){
		new ReturnToPreviousMenuController(lv);
	}
	
	public void testPuzzle(){
		//assertEquals(pl.openLevelScreen(), puzFrame);
	}
	
	@Override
	protected void tearDown(){
		lv.dispose();
	}
	
}
