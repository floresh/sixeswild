package game.main;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import editor.model.LevelManager;
import game.boundary.SplashScreen;
import game.entities.Model;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	public static Model model;
	static LevelManager levels; 

	public static void main(String[] args) {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException ex) {
		}
		model = new Model();
		resetLevels();
		new SplashScreen();
	}

	public static Path openFile() {
		Path path = FileSystems.getDefault().getPath("Levels",
				model.getCurrentLevel().getGameMode() + ".dat");
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

	public static LevelManager getLevels(){
		return levels;
	}
	
	public static void resetLevels(){
		levels = new LevelManager();
	}
}
