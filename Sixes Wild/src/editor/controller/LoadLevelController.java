package editor.controller;

import editor.boundary.LevelEditorIntro;
import editor.boundary.LoadLevelScreen;
import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.EliminationLevel;
import game.entities.Level;
import game.entities.LightningLevel;
import game.entities.PuzzleLevel;
import game.entities.ReleaseLevel;
import game.main.Filing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class LoadLevelController implements ActionListener {
	LoadLevelScreen screen;
	LevelEditorIntro frame;
	Level level;
	String gameMode, levelName;

	public LoadLevelController(LevelEditorIntro frame) {
		this.frame = frame;
	}

	public LoadLevelController(LoadLevelScreen screen, String gameMode,
			String levelName) {
		this.screen = screen;
		this.gameMode = gameMode;
		this.levelName = levelName;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (gameMode != null) {
			switch (gameMode) {
			case "Puzzle":
				level = new PuzzleLevel();
				break;
			case "Elimination":
				level = new EliminationLevel();
				break;
			case "Lightning":
				level = new LightningLevel();
				break;
			case "Release":
				level = new ReleaseLevel();
				break;
			}
			Main.model.setCurrentLevel(level);

			Filing.loadBuilderLevels(Main.model.getCurrentLevel());
			screen.dispose();
			new WholesomeLevelEditorScreen(Main.getLevels().getLevel(levelName));
		}else{
			frame.dispose();
			screen = new LoadLevelScreen();
		}
	}

}
