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

	public SaveLevelController(WholesomeLevelEditorScreen app) {
		screen = app;
	}

	public boolean process() {
		if (screen.getLevelName().equals("")) {
			JOptionPane.showMessageDialog(null, "Enter a level name");
			return false;
		} else {
			if (getTileFrequencies() && getMultiplierFrequencies()
					&& getRules() && getStars() && getCells()) {
				level = new PuzzleLevel(board, tileFrequencies,
						multiplierFrequencies, stars, rules);
				model = new LevelEditorModel(level);
				if (save(openFile())) {
					JOptionPane.showMessageDialog(null, "Saved!");
				} else {
					JOptionPane.showMessageDialog(null, "Not Saved!");
				}
			}
			return true;
		}
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

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == 0) {
					cells[i][j] = new Cell();
				}
				cells[i][j] = new Cell(buttArray[i][j].getBackground().equals("GREEN"), false);
			}
		}

		board = new Board(cells);
		return board != null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		process();
	}

	public Path openFile() {
		Path path = Paths.get((level.getGameMode() + ".dat"));
		return path;
	}

	public boolean save(Path path) {
		try {
			ObjectOutputStream output = new ObjectOutputStream(
					Files.newOutputStream(path, StandardOpenOption.CREATE,
							StandardOpenOption.APPEND));
			output.writeObject(model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
