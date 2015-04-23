package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import editor.boundary.WholesomeLevelEditorScreen;
import editor.model.LevelEditorModel;
import game.entities.Level;
import game.entities.PuzzleLevel;

public class SaveLevelController implements ActionListener {
	WholesomeLevelEditorScreen screen;
	Level level;
	LevelEditorModel model;
	ArrayList<Integer> tileFrequencies, multiplierFrequencies, rules, stars;
	
	public SaveLevelController(WholesomeLevelEditorScreen app){
		screen = app;
	}
	
	public boolean process(){
		if(screen.getLevelName().equals("")){
			JOptionPane.showMessageDialog(null, "Enter a level name");
			return false;
		}else{
			if(getTileFrequencies() && getMultiplierFrequencies() && getRules() && getStars()){
				level = new PuzzleLevel(tileFrequencies, multiplierFrequencies, stars, rules);
				model = new LevelEditorModel(level);
				if(save(openFile())){
					JOptionPane.showMessageDialog(null, "Saved!");
				}else{
					JOptionPane.showMessageDialog(null, "Not Saved!");
				}
			}
			return true;
		}
	}
	
	public boolean getTileFrequencies(){
		tileFrequencies = screen.getTileFrequencies();
		return !tileFrequencies.isEmpty();
	}
	
	public boolean getMultiplierFrequencies(){
		multiplierFrequencies = screen.getMultiplierFrequencies();
		return !multiplierFrequencies.isEmpty();
	}
	
	public boolean getRules(){
		rules = screen.getRules();
		return !rules.isEmpty();
	}
	
	public boolean getStars(){
		stars = screen.getStarThresholds();
		return !stars.isEmpty();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		process();
	}
	
	public Path openFile(){
		Path path = Paths.get((level.getGameMode() + ".dat"));
		return path;
	}
	
	public boolean save(Path path){
		try {
			ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path));
			output.writeObject(model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
