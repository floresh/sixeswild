import game.boundary.BoardView;
import game.boundary.EndGameScreen;
import game.boundary.LevelView;
import game.boundary.PuzzleLevelSelection;
import game.entities.Board;
import game.entities.PuzzleLevel;
import game.main.Main;
import game.move.controller.MoveController;
import junit.framework.TestCase;


public class BoundaryTests extends TestCase{

	public void testViews(){
		LevelView lv = new LevelView(Main.model.getCurrentLevel());
		
}
}
