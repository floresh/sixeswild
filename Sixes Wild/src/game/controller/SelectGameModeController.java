package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import game.boundary.GameModeScreen;
import game.entities.PuzzleLevel;
import game.main.Main;

;

public class SelectGameModeController implements ActionListener {
	GameModeScreen screen;
	String level;

	public SelectGameModeController(GameModeScreen screen) {
		this.screen = screen;
	}

	public boolean process() {

		switch (level) {
		case "PUZZLE": Main.getModel().setCurrentLevel(new PuzzleLevel()); break;
		}
		if (Main.getModel().getCurrentLevel().openLevelScreen()) {
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
