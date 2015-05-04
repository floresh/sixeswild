import java.awt.event.MouseEvent;

import game.boundary.LevelView;
import game.move.controller.MoveController;
import junit.framework.TestCase;

public class ControllerTests extends TestCase {
	
	LevelView lv;
	
	protected void setUp() {
		MoveController mc = new MoveController(lv);
	}
	

	protected void tearDown() {
		
	}
	
	public void testScoreController() {
		
	}

}
