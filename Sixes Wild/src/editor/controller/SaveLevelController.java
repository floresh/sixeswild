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
import game.main.Filing;
/**
 * 
 * @author Kwame
 *
 */
public class SaveLevelController implements ActionListener {
	WholesomeLevelEditorScreen screen;
	String name;

	public SaveLevelController(WholesomeLevelEditorScreen app) {
		screen = app;
	}
	
	public SaveLevelController(WholesomeLevelEditorScreen app, String name) {
		screen = app;
		this.name = name;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new SaveLevel(screen, name);
	}
}
