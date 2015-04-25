package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import editor.boundary.WholesomeLevelEditorScreen;
import editor.model.LevelEditorModel;
import game.entities.Board;
import game.entities.Cell;
import game.entities.Level;
import game.entities.PuzzleLevel;
import game.entities.Tile;

public class SaveLevelController implements ActionListener {
	WholesomeLevelEditorScreen screen;
	Board board;
	Level level;
	LevelEditorModel model;
	ArrayList<Integer> tileFrequencies, multiplierFrequencies, rules, stars;
	String levelName = "";
	ObjectOutputStream output;

	public SaveLevelController(WholesomeLevelEditorScreen app) {
		screen = app;
	}

	public boolean process() {
		if (!screen.getLevelName().equals("")) {
			levelName = screen.getLevelName();
		}
		if (getTileFrequencies() && getMultiplierFrequencies() && getRules()
				&& getStars() && getCells()) {
			level = new PuzzleLevel(board, tileFrequencies,
					multiplierFrequencies, stars, rules);
			model = new LevelEditorModel(level);
			if (save(openFile())) {
				JOptionPane.showMessageDialog(null, "Saved!");
			} else {
				JOptionPane.showMessageDialog(null, "Not Saved!");
			}
			closeFile();
			return true;
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
		Cell[][] cells = new Cell[10][9];

		for (int i = 1; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				cells[i][j] = new Cell(buttArray[i][j].getBackground().equals(
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
		Path path;
		if (levelName.equals("")) {
			path = Paths.get((level.getGameMode() + ".dat"));
		} else {
			path = Paths.get(levelName + ".dat");
		}
		return path;
	}

	public boolean save(Path path) {
		try {
			output = new ObjectOutputStream(Files.newOutputStream(path,
					StandardOpenOption.CREATE, StandardOpenOption.APPEND));
			output.writeObject(model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
