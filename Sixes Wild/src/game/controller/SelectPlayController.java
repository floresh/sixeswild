package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import game.boundary.Application;
import game.boundary.GameModeScreen;
import game.boundary.PuzzleLevelSelection;
import game.entities.Model;
import game.main.Main;

public class SelectPlayController implements ActionListener{
	JFrame screen;
	
	public SelectPlayController(JFrame screen) {
		this.screen = screen;
	}
	
	public boolean process(){
		screen.dispose();
		Main.model.getCurrentLevel().openLevelScreen();
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		process();
	}
}
