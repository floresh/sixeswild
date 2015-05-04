import javax.swing.JFrame;

import editor.boundary.EditorSplashScreen;
import editor.boundary.LevelEditorIntro;
import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import junit.framework.TestCase;


public class EditorBoundaryTests extends TestCase{
	//Main main;
	
	EditorSplashScreen ess;
	
	LevelEditorIntro lei;
	
	WholesomeLevelEditorScreen wles;
	
	@Override
	protected void setUp(){
	//	main = new Main();
		ess = new EditorSplashScreen();
		lei = new LevelEditorIntro();
		wles = new WholesomeLevelEditorScreen();
	}
	
	@Override
	protected void tearDown(){
		lei.dispose();
		wles.dispose();
	}
	
	public void testTitles(){
		assertEquals("Sixes Wild Level Editor", lei.getTitle());
		assertEquals("Sixes Wild Level Editor", wles.getTitle());
	}
}
