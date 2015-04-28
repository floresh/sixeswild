package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import editor.boundary.LevelEditorIntro;
import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.EliminationLevel;
import game.entities.Level;
import game.entities.Model;
import game.entities.PuzzleLevel;

public class SelectBuilderModeController implements ActionListener {
	LevelEditorIntro screen;
	ObjectInputStream input;
	Model model;
	Level level;
	String levelName;

	public SelectBuilderModeController(LevelEditorIntro screen) {
		this.screen = screen;
	}

	public boolean loadLevels() {
		Path path = openFile();
		try {
			input = new ObjectInputStream(Files.newInputStream(path));
			while (true) {
				model = (Model) input.readObject();
				Main.getLoadedModels().add(model);
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
		Path path = FileSystems.getDefault().getPath("Levels",
				level.getGameMode() + ".dat");
		try {
			Files.createDirectories(path.getParent());
			Files.createFile(path);
		} catch (FileAlreadyExistsException e) {
			System.err.println("File already exists");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
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
		loadLevels();
		screen.dispose();
		new WholesomeLevelEditorScreen();
	}

}
