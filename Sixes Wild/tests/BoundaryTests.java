import game.boundary.BoardView;
import game.boundary.EndGameScreen;
import game.boundary.LevelView;
import game.boundary.PuzzleLevelSelection;
import game.controller.ReturnToPreviousMenuController;
import game.entities.Board;
import game.entities.PuzzleLevel;
import game.main.Main;
import game.move.controller.MoveController;
import junit.framework.TestCase;


public class BoundaryTests extends TestCase{
 
	LevelView lv;
	
	@Override
	protected void setUp(){
		PuzzleLevel level = new PuzzleLevel();
		lv = new LevelView(level);
	}
	
	@Override
	protected void tearDown(){
		lv.dispose();
	}
	
	public void testQuitLevel(){
		new ReturnToPreviousMenuController(lv);
	}
	
}
