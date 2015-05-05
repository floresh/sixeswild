import javax.swing.JLabel;

import game.boundary.LevelView;
import game.boundary.PuzzleLevelSelection;
import game.boundary.StartScreen;
import game.entities.EliminationLevel;
import game.entities.LightningLevel;
import game.entities.Model;
import game.entities.PuzzleLevel;
import game.entities.ReleaseLevel;
import junit.framework.TestCase;


public class DavisTests extends TestCase{
	
	Model model;
	PuzzleLevelSelection pls;
	JLabel jl;
	StartScreen ss;
	@Override
	protected void setUp(){
	model = new Model();
	

	
	
	}
	public void testPLS(){
		
	ss = new StartScreen();
	model.getCurrentLevel().openLevelScreen();
	//pls = new PuzzleLevelSelection();
	//jl = new JLabel();
	}

}
