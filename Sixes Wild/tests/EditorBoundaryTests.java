import java.util.ArrayList;

import editor.boundary.EditorSplashScreen;
import editor.boundary.LevelEditorIntro;
import editor.boundary.WholesomeLevelEditorScreen;
import editor.model.*;
import editor.boundary.Main;
import editor.controller.GameStateController;
import editor.controller.PreviewController;
import editor.controller.RedoController;
import editor.controller.UndoController;
import game.entities.Level;
import game.entities.PuzzleLevel;
import junit.framework.TestCase;

/**
 * 
 * @author Jake
 *
 */
public class EditorBoundaryTests extends TestCase{
	Main main;
	
	@Override
	protected void setUp(){
		main = new Main();
		
		Main.model = new LevelEditorModel();
	}
	
	public void testSplash(){
		EditorSplashScreen ess = new EditorSplashScreen();
	}
	
	public void testLEI(){
		 LevelEditorIntro lei = new LevelEditorIntro();
	}
	
	public void testWLES(){
		final WholesomeLevelEditorScreen wles = new WholesomeLevelEditorScreen();
		assertEquals("[50, 50, 50, 50, 50, 50]", wles.getTileFrequencies().toString());
		assertEquals("[50, 50, 50]", wles.getMultiplierFrequencies().toString());
		assertEquals("[0, 0, 0, 0, 0]", wles.getRules().toString());
		
		Main.model.gameState = new ArrayList<Level>();
		wles.xFrequency1.setValue(99);
		
		GameStateController gsc = new GameStateController(wles);
		gsc.process();
	
		assertEquals("99",((Integer) wles.xFrequency1.getValue()).toString());
		
		wles.xFrequency1.setValue(20);
		gsc.process();

		assertEquals("20",((Integer) wles.xFrequency1.getValue()).toString());
		
		UndoController uc = new UndoController(wles);
		uc.process();
		
		assertEquals("99",((Integer) wles.xFrequency1.getValue()).toString());
		
		RedoController rc = new RedoController(wles);
		rc.process();
		
		assertEquals("20",((Integer) wles.xFrequency1.getValue()).toString());
		
		PuzzleLevel level = new PuzzleLevel();
		Main.model.setCurrentLevel(level);
		
		PreviewController pvc = new PreviewController(wles);
		
		pvc.process();
	}
	
	
	@Override
	protected void tearDown(){
	}
}
