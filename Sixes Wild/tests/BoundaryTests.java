import game.boundary.BoardView;
import game.boundary.EndGameScreen;
import game.boundary.LevelView;
import game.boundary.PuzzleLevelSelection;
import game.entities.Board;
import game.entities.PuzzleLevel;
import game.move.controller.MoveController;
import junit.framework.TestCase;


public class BoundaryTests extends TestCase{

	public void testViews(){
		
		PuzzleLevel pl = new PuzzleLevel();
		LevelView lv = new LevelView(pl);
		Board b = new Board(pl);
		MoveController mover = new MoveController(lv);
		BoardView bv = new BoardView(b, mover);
		EndGameScreen egs = new EndGameScreen(lv);
		assertEquals(bv.getBoard(), b);
	}
	
	public void testSelections(){
		PuzzleLevelSelection pls = new PuzzleLevelSelection();
		
	}
}
