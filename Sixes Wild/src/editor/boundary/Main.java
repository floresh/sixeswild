package editor.boundary;
import java.util.ArrayList;

import editor.model.LevelEditorModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	public static LevelEditorModel model;
	static ArrayList<LevelEditorModel> loadedModels; 
	
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
		loadedModels = new ArrayList<LevelEditorModel>();
		model = new LevelEditorModel();
		new EditorSplashScreen();
	}
	
	public static ArrayList<LevelEditorModel> getLoadedModels(){
		return loadedModels;
	}
}
