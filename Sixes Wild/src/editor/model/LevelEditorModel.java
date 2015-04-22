package editor.model;

import game.entities.Board;
import game.entities.Level;

public class LevelEditorModel {
	Level level;
	Board board;
	
	public LevelEditorModel(Level l, Board b){
		this.level = l;
		this.board = b;
	}
	
	Level getLevel(){
		return this.level;
	}
	
	void setLevel(Level l){
		this.level = l;

	}
	
	public Board getBoard(){
		return this.board;
	}
	
	void setBoard(Board b){
		this.board = b;

	}
	
}
