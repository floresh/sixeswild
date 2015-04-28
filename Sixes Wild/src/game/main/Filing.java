package game.main;

import editor.boundary.Main;
import game.entities.Level;
import game.entities.Model;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Filing {

	static ObjectInputStream input;
	static ObjectOutputStream output;
	
	public static Path openFile(Level level) {
		Path path = FileSystems.getDefault().getPath("Levels",
				level.getGameMode() + ".dat");
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

	public static boolean save() {
		try {
			for (Level l : Main.getLoadedLevels()) {
				output.writeObject(l);
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return true;
	}

	public static void closeFile() {
		try {
			if (output != null)
				output.close();
		} catch (IOException ioException) {
			System.err.println("Error closing file. Terminating.");
			System.exit(1);
		}
	}
	
	public static boolean loadLevels() {
		Path path = openFile(Main.model.getCurrentLevel());
		try {
			input = new ObjectInputStream(Files.newInputStream(path));
			while (true) {
				Level level = (Level) input.readObject();
				Main.getLoadedLevels().add(level);
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

}
