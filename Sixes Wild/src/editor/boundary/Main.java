package editor.boundary;
import editor.model.LevelEditorModel;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	static LevelEditorModel model;
	
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
		LevelEditorApplication app = new LevelEditorApplication();
		new EditorSplashScreen(app, model);
	}
}
