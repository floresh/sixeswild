package editor.controller;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.Board;
import game.entities.Cell;
import game.entities.EliminationLevel;
import game.entities.Level;
import game.entities.LightningLevel;
import game.entities.PuzzleLevel;
import game.entities.ReleaseLevel;
import game.main.Filing;

public class SaveLevel {
	WholesomeLevelEditorScreen screen;
	Cell[][] cells;
	Board board;
	Level level;
	ArrayList<Integer> tileFrequencies, multiplierFrequencies, rules, stars;
	
	public SaveLevel(WholesomeLevelEditorScreen screen){
		this.screen = screen;
		String name = screen.getLevelName();
		if(save(name)) {
			JOptionPane.showMessageDialog(null, "Saved!");
		} else {
			JOptionPane.showMessageDialog(null, "Not Saved!");
		}
	}
	
	public SaveLevel(WholesomeLevelEditorScreen screen, String name){
		this.screen = screen;
		level = Main.model.getCurrentLevel();
		if(save(name)) {
			JOptionPane.showMessageDialog(null, "Saved!");
		} else {
			JOptionPane.showMessageDialog(null, "Not Saved!");
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
		cells = new Cell[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				cells[i][j] = new Cell(i,j,buttArray[i][j].getBackground().equals(
						Color.GREEN), false,true);
			}
		}

		board = new Board(cells, tileFrequencies, multiplierFrequencies);
		return board != null;
	}
	
	
	public boolean save(String name){
		if (name.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Enter level name");
		} else {
			if (getTileFrequencies() && getMultiplierFrequencies()
					&& getRules() && getStars() && getCells()) {
				switch(level.getGameMode()){
				case "Puzzle": level = new PuzzleLevel(name, board, tileFrequencies,
						multiplierFrequencies, stars, rules);break;
				case "Elimination": level = new EliminationLevel(name, board, tileFrequencies,
						multiplierFrequencies, stars, rules);break;
				case "Lightning": level = new LightningLevel(name, board, tileFrequencies,
						multiplierFrequencies, stars, rules);break;
				case "Release": level = new ReleaseLevel(name, board, tileFrequencies,
						multiplierFrequencies, stars, rules);break;
				}
				
				if(!Main.getLevels().addLevel(level))
					return false;
				Filing.openOutputFile(level);
				return Filing.save();
			}
		}
		return false;
	}
	
}
