package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import editor.boundary.LevelEditorIntro;
import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.EliminationLevel;
import game.entities.Level;
import game.entities.PuzzleLevel;
import game.main.Filing;

public class SelectBuilderModeController implements ActionListener {
	LevelEditorIntro screen;
	ObjectInputStream input;
	Level level;
	String levelName;

	public SelectBuilderModeController(LevelEditorIntro screen) {
		this.screen = screen;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		levelName = e.getActionCommand();
		switch (levelName) {
		case "Puzzle":
			level = new PuzzleLevel();
			break;
		case "Elimination":
			level = new EliminationLevel();
			break;
		// case "Lightning" : level = new LightningLevel();break;
		}

		Main.model.setCurrentLevel(level);
		Filing.loadLevels();
		screen.dispose();
		new WholesomeLevelEditorScreen();
	}

}
