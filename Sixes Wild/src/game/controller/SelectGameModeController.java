package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

import editor.model.LevelEditorModel;
import game.boundary.GameModeScreen;
import game.entities.PuzzleLevel;
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
		Path path = openFile();
		try {
			ObjectInputStream input = new ObjectInputStream(
					Files.newInputStream(path));
			while (true) {
				PuzzleLevel level = (PuzzleLevel) ( (LevelEditorModel) input.readObject()).getLevel();
				JOptionPane.showMessageDialog(null, level.getTileFrequencies().get(0));
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

	public Path openFile() {
		return Paths
				.get((Main.getModel().getCurrentLevel().getGameMode() + ".dat"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		level = e.getActionCommand();
		process();
	}
}
