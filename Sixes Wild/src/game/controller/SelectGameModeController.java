package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import game.boundary.GameModeScreen;
import game.entities.Model;
import game.entities.PuzzleLevel;
import game.main.Main;

public class SelectGameModeController implements ActionListener {
	GameModeScreen screen;
	String level;
	ObjectInputStream input;

	public SelectGameModeController(GameModeScreen screen) {
		this.screen = screen;
	}

	public boolean process() {

		switch (level) {
		case "PUZZLE":
			Main.getModel().setCurrentLevel(new PuzzleLevel());
			loadLevels();
			break;
		}
		if (Main.getModel().getCurrentLevel().openLevelScreen()) {
			screen.dispose();
			return true;
		}
		return false;
	}

	public boolean loadLevels() {
		Main.resetLevels();
		Path path = Main.openFile();
		try {
			input = new ObjectInputStream(
					Files.newInputStream(path));
			while (true) {
				Model level = (Model) input.readObject();
				Main.getLoadedModels().add(level);
			}
		} catch (EOFException e) {
			System.err.println("No more records to load");
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		level = e.getActionCommand();
		process();
	}
}
