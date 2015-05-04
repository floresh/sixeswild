package editor.boundary;

import editor.model.LevelEditorModel;
import editor.model.LevelManager;

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
	static LevelManager levels; 
	
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
	
	public static LevelManager getLevels(){
		return levels;
	}
	
	public static void resetLevels(){
		levels = new LevelManager();
	}
}
