/**import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import game.boundary.LevelView;
import game.controller.ReturnToPreviousMenuController;
import game.entities.EliminationLevel;
import game.entities.LightningLevel;
import game.entities.PuzzleLevel;
import game.entities.ReleaseLevel;
import junit.framework.TestCase;


public class BoundaryTests extends TestCase{
 
	LevelView lv;
	MouseListener l;
	MouseMotionListener ml;
	
	@Override
	protected void setUp(){
		PuzzleLevel level = new PuzzleLevel();
		EliminationLevel el = new EliminationLevel();
		LightningLevel ll = new LightningLevel();
		ReleaseLevel rl = new ReleaseLevel();
		
		lv = new LevelView(level);
		lv.getBoardView().setActiveListener(l);
		lv.getBoardView().setActiveMotionListener(ml);
	}
	
	public void testGetListener(){
		lv.getBoardView().getActiveListener();
		lv.getBoardView().getActiveMouseMotionListener();
	}
	
	public void testGetBoard(){
		lv.getBoardView().getBoard();
	}
	
	@Override
	protected void tearDown(){
		lv.dispose();
	}
	
	public void testQuitLevel(){
		new ReturnToPreviousMenuController(lv);
	}
	
}
*/