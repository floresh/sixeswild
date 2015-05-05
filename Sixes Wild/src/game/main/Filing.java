package game.main;

import editor.boundary.Main;
import game.entities.EliminationLevel;
import game.entities.Level;
import game.entities.LightningLevel;
import game.entities.Model;
import game.entities.PuzzleLevel;
import game.entities.ReleaseLevel;

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

	public static Path openOutputFile(Level level) {
		Path path = FileSystems.getDefault().getPath("Levels",
				level.getGameMode() + ".dat");
		System.out.println("Output file: " + level.getGameMode());
		try {
			if (!Files.exists(path)) {
				Files.createDirectories(path.getParent());
				Files.createFile(path);
			}
			output = new ObjectOutputStream(Files.newOutputStream(path));
		} catch (FileAlreadyExistsException e) {
			System.err.println("File already exists");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}

	public static Path openInputFile(Level level) {
		Path path = FileSystems.getDefault().getPath("Levels",
				level.getGameMode() + ".dat");
		try {
			if (!Files.exists(path)) {
				Files.createDirectories(path.getParent());
				Files.createFile(path);
			}
			input = new ObjectInputStream(Files.newInputStream(path));
		} catch (FileAlreadyExistsException e) {
			System.err.println("File already exists");
		} catch (IOException e) {
			System.err.println("End of file reached");
		}
		return path;
	}

	public static boolean save() {
		try {
			for (Level l : Main.getLevels().getlevels().values()) {
				output.writeObject(l);
			}
			closeFile();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return true;
	}

	public static void closeFile() {
		try {
			if (output != null)
				output.close();
			if (input != null)
				input.close();
		} catch (IOException ioException) {
			System.err.println("Error closing file. Terminating.");
			System.exit(1);
		}
	}

	public static boolean loadGameLevels(Level level) {
		Path path = openInputFile(level);
		try {
			input = new ObjectInputStream(Files.newInputStream(path));
			while (true) {
				switch (level.getGameMode()) {
				case "Puzzle":
					level = (PuzzleLevel) input.readObject();break;
				case "Elimination":
					level = (EliminationLevel) input.readObject();break;
				case "Lightning":
					level = (LightningLevel) input.readObject();break;
				case "Release":
					level = (ReleaseLevel) input.readObject();break;
				}
				game.main.Main.getLevels().addLevel(level);
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

	public static boolean loadBuilderLevels(Level level) {
		Path path = openInputFile(level);
		try {
			input = new ObjectInputStream(Files.newInputStream(path));
			while (true) {
				switch (level.getGameMode()) {
				case "Puzzle":
					level = (PuzzleLevel) input.readObject();
					System.out.println("loading puzzles");break;
				case "Elimination":
					level = (EliminationLevel) input.readObject();
					System.out.println("loading elims");break;
				}
				Main.getLevels().addLevel(level);
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
