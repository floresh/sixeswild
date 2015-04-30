package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import game.boundary.GameModeScreen;
import game.entities.EliminationLevel;
import game.entities.LightningLevel;
import game.entities.PuzzleLevel;
import game.entities.ReleaseLevel;
import game.main.Filing;
import game.main.Main;

public class SelectGameModeController implements ActionListener {
	GameModeScreen screen;
	String level;

	public SelectGameModeController(GameModeScreen screen) {
		this.screen = screen;
	} 

	public boolean process() {
		switch (level) {
		case "PUZZLE":
			Main.model.setCurrentLevel(new PuzzleLevel());
			Filing.loadGameLevels(Main.model.getCurrentLevel());
			break;
		case "ELIMINATION":
			Main.model.setCurrentLevel(new EliminationLevel());
			
			//Filing.loadGameLevels(Main.model.getCurrentLevel());
			break;
		case "LIGHTNING":
			Main.model.setCurrentLevel(new LightningLevel());
			
			//Filing.loadGameLevels(Main.model.getCurrentLevel());
			break;
		case "RELEASE":
			Main.model.setCurrentLevel(new ReleaseLevel());
			
			//Filing.loadGameLevels(Main.model.getCurrentLevel());
			break;
		}
		if (Main.model.getCurrentLevel().openLevelScreen()) {
			screen.dispose();
			return true;
		}
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		level = e.getActionCommand();
		process();
	}
}
