import java.awt.event.MouseEvent;

import game.boundary.LevelView;
import game.controller.SelectLevelController;
import game.entities.PuzzleLevel;
import game.move.controller.MoveController;
import junit.framework.TestCase;

public class ControllerTests extends TestCase {
	 
	LevelView lv;
	
	protected void setUp() {
		PuzzleLevel pl = new PuzzleLevel();
		LevelView lv = new LevelView(pl);
		SelectLevelController slc = new SelectLevelController(lv, getName());
		
	}
	

	protected void tearDown() {
		
	}
	
	public void testScoreController() {
		
	}

}
