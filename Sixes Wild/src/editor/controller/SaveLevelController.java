package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.Board;
import game.entities.Cell;
import game.entities.Level;
import game.entities.Model;
import game.entities.PuzzleLevel;

public class SaveLevelController implements ActionListener {
	WholesomeLevelEditorScreen screen;
	Cell[][] cells;
	Board board;
	Level level;
	Model model;
	ArrayList<Integer> tileFrequencies, multiplierFrequencies, rules, stars;
	String levelName = "";

	ObjectInputStream input;
	ObjectOutputStream output;

	public SaveLevelController(WholesomeLevelEditorScreen app) {
		screen = app;
	}

	public boolean process() {
		if (screen.getLevelName().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Enter level name");
		} else {
			if (getTileFrequencies() && getMultiplierFrequencies()
					&& getRules() && getStars() && getCells()) {
				level = new PuzzleLevel(board, tileFrequencies,
						multiplierFrequencies, stars, rules);
				model = new Model(level);
				Main.getLoadedModels().add(model);
				openFile();
				if (save()) {
					JOptionPane.showMessageDialog(null, "Saved!");
				} else {
					JOptionPane.showMessageDialog(null, "Not Saved!");
				}
				return true;
			}
		}
		closeFile();
		return false;
	}

	public boolean getTileFrequencies() {
		tileFrequencies = screen.getTileFrequencies();
		return !tileFrequencies.isEmpty();
	}

	public boolean getMultiplierFrequencies() {
		multiplierFrequencies = screen.getMultiplierFrequencies();
		return !multiplierFrequencies.isEmpty();
	}

	public boolean getRules() {
		rules = screen.getRules();
		return !rules.isEmpty();
	}

	public boolean getStars() {
		stars = screen.getStarThresholds();
		return !stars.isEmpty();
	}

	public boolean getCells() {
		JButton[][] buttArray = screen.getButtArray();
		cells = new Cell[10][9];

		for (int i = 1; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				cells[i][j] = new Cell(i,j,buttArray[i][j].getBackground().equals(
						"GREEN"), false);
			}
		}

		for (int i = 0; i < 9; i++) {
			cells[0][i] = new Cell();
		}
		board = new Board(cells);
		return board != null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		process();
	}

	public Path openFile() {
		Path path = FileSystems.getDefault().getPath("Levels",
				model.getCurrentLevel().getGameMode() + ".dat");
		try {
			output = new ObjectOutputStream(Files.newOutputStream(path));
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

	public boolean save() {
		try {
			for (Model m : Main.getLoadedModels()) {
				output.writeObject(m);
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return true;
	}

	public void closeFile() {
		try {
			if (output != null)
				output.close();
		} catch (IOException ioException) {
			System.err.println("Error closing file. Terminating.");
			System.exit(1);
		}
	}
}
