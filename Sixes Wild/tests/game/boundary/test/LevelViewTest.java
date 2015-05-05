package game.boundary.test;

import game.boundary.LevelView;
import game.entities.PuzzleLevel;

public class LevelViewTest {

	LevelView lv;
	PuzzleLevel pl;
	 
	protected void setUp() {
		pl = new PuzzleLevel();
		lv = new LevelView(pl);
	}
	
	public void testView(){
	}
	protected void tearDown(){
	}
}
