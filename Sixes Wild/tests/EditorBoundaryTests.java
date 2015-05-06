import editor.boundary.EditorSplashScreen;

import editor.boundary.LevelEditorIntro;
import editor.boundary.WholesomeLevelEditorScreen;
import editor.model.*;
import editor.boundary.Main;
import junit.framework.TestCase;


public class EditorBoundaryTests extends TestCase{
	Main main;
	
	//WholesomeLevelEditorScreen wles;
	//Main main;
	
	@Override
	protected void setUp(){
		main = new Main();
		//lei = new LevelEditorIntro();
		//wles = new WholesomeLevelEditorScreen();
		Main.model = new LevelEditorModel();
	}
	
	public void testSplash(){
		EditorSplashScreen ess = new EditorSplashScreen();
	}
	
	public void testLEI(){
		LevelEditorIntro lei = new LevelEditorIntro();
	}
	
	public void testWLES(){
		WholesomeLevelEditorScreen wles = new WholesomeLevelEditorScreen();
	}
	
	public void testTitles(){
//		assertEquals("Sixes Wild Level Editor", lei.getTitle());
//		assertEquals("Sixes Wild Level Editor", wles.getTitle());
	}
	
	@Override
	protected void tearDown(){
	}
}
