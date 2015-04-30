package editor.boundary;

import editor.model.LevelEditorModel;
import game.entities.ReleaseLevel;
/**
 * 
 * @author Jake
 *
 */
public class LevelEditorApplication {
	LevelEditorModel model;
	
	public LevelEditorApplication(){
		this.model = new LevelEditorModel();
	}
	
	public LevelEditorModel getModel(){
		return this.model;
	}
}
