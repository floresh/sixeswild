package editor.boundary;
import java.util.ArrayList;

import editor.model.LevelEditorModel;
import game.entities.Level;
import game.entities.Model;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 * 
 * @author Jake, Kwame
 *
 */
public class Main {
	public static LevelEditorApplication application;
	public static LevelEditorModel model;
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
		application = new LevelEditorApplication();
		model = application.getModel();
		new EditorSplashScreen();
	}
	
	public static ArrayList<Level> getLoadedLevels(){
		return loadedLevels;
	}
	
	public static void resetLevels(){
		loadedLevels = new ArrayList<Level>();
	}
}
