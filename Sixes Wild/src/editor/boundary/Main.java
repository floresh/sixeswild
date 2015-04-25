package editor.boundary;
import editor.model.LevelEditorModel;
import game.entities.NoLevel;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	public static LevelEditorModel model;
	
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
		model = new LevelEditorModel();
		new EditorSplashScreen();
	}
}
