package editor.boundary;

import editor.model.LevelEditorModel;
import game.entities.ReleaseLevel;
/**
 * 
 * @author Jake
 *
 * This became largely unused, and only holds an the level editor model object.
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
