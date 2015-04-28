package editor.boundary;
import java.util.ArrayList;

import game.entities.Level;
import game.entities.Model;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	public static Model model;
	static ArrayList<Level> loadedLevels; 
	
	public static void main(String[] args){
		try {
            for (UIManager.LookAndFeelInfo info : UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | 
        		InstantiationException | 		
        		IllegalAccessException | 
        		UnsupportedLookAndFeelException ex) {
        }
		resetLevels();
		model = new Model();
		new EditorSplashScreen();
	}
	
	public static ArrayList<Level> getLoadedLevels(){
		return loadedLevels;
	}
	
	public static void resetLevels(){
		loadedLevels = new ArrayList<Level>();
	}
}
