import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import game.boundary.SplashScreen;
import game.entities.Model;
import game.entities.PuzzleLevel;
import game.main.Main;
import junit.framework.TestCase;

public class EntityTests extends TestCase{

public void testLevel() {
	
		Model m = new Model();
		PuzzleLevel pl = new PuzzleLevel();
		assertNotSame(m.getCurrentLevel(), pl);
		
		m.setCurrentLevel(pl);
		assertEquals(m.getCurrentLevel(), pl);
}

public void testCells() {}}

