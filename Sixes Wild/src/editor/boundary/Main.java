package editor.boundary;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import editor.model.LevelEditorModel;
import game.entities.Board;
import game.entities.Level;

public class Main {
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
		Level level = new Level();
		Board board = new Board();
		LevelEditorModel model = new LevelEditorModel(level, board);
		new EditorSplashScreen();
	}
}
