import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import game.boundary.LevelView;
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

	protected void setUp() {
		pl = new PuzzleLevel();
		/**lv = new LevelView(lv.getLevel());
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				cell = new Cell (i, j, true, false, false);
			}
		}
		cell = new Cell (7, 8, true, false, false);
	}
*/
	public void testLevel() {

		assertNotSame(m.getCurrentLevel(), pl);

		m.setCurrentLevel(pl);
		assertEquals(m.getCurrentLevel(), pl);
	}

	public void testSplashScreen(){
		SplashScreen splash = new SplashScreen();

	}

	public void testSelect(){
		SelectLevelController slc = new SelectLevelController(frame, "Puzzle");

	}

	public void checkCell(){
		assertEquals(b.cells[1][1], cell = new Cell(1, 1, true, false, false));
	}

	public void moveController() {
		MoveController mc = new MoveController(lv);
		SelectionController sc = new SelectionController(lv.getBoardView(), mc);
		sc.register();
		//MouseEvent pr = createPressed(lv, lv.getBoardView().getBoard().getTiles(), 300, 300);
		//lv.getBoardView)().getMouseManager().handleMouseEvent(pr);
	}
	

	LevelView lv;
	MouseListener l;
	MouseMotionListener ml;
	
	@Override
	protected void setUp(){
		PuzzleLevel level = new PuzzleLevel();
		EliminationLevel el = new EliminationLevel();
		LightningLevel ll = new LightningLevel();
		ReleaseLevel rl = new ReleaseLevel();
		
		lv = new LevelView(level);
		lv.getBoardView().setActiveListener(l);
		lv.getBoardView().setActiveMotionListener(ml);
	}
	
	public void testGetListener(){
		lv.getBoardView().getActiveListener();
		lv.getBoardView().getActiveMouseMotionListener();
	}
	
	public void testGetBoard(){
		lv.getBoardView().getBoard();
	}
	
	@Override
	protected void tearDown(){
		lv.dispose();
	}
	
	public void testQuitLevel(){
		new ReturnToPreviousMenuController(lv);
	}
	
}


}