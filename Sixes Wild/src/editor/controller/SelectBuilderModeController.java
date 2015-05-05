package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;

import editor.boundary.LevelEditorIntro;
import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.EliminationLevel;
import game.entities.Level;
import game.entities.LightningLevel;
import game.entities.PuzzleLevel;
import game.entities.ReleaseLevel;
import game.main.Filing;
/**
 * 
 * @author Kwame, Jake
 *
 */
public class SelectBuilderModeController implements ActionListener {
	/** The jframe where the level type is selected. */
	LevelEditorIntro screen;
	
	ObjectInputStream input;
	
	/** The level object to be created. */
	Level level;
	
	/** The type of level to be created. */
	String levelName;

	public SelectBuilderModeController(LevelEditorIntro screen, String ln) {
		this.screen = screen;
		this.levelName = ln;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (levelName) {
		case "Puzzle":
			level = new PuzzleLevel();
			break;
		case "Elimination":
			level = new EliminationLevel();
			break;
		case "Lightning" : 
			level = new LightningLevel();
			break;
		case "Release" :
			level = new ReleaseLevel();
			break;
		}
		Main.model.setCurrentLevel(level);
		
		Filing.loadBuilderLevels(Main.model.getCurrentLevel());
		screen.dispose();
		new WholesomeLevelEditorScreen();
	}

}
