package editor.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.boundary.LevelView;
import game.entities.Board;
import game.entities.Level;
import game.entities.PuzzleLevel;
import game.entities.Tile;

/**
 * 
 * @author Jake, Andrew
 *
 * Creates a preview level based on what the user has input into the level editor. 
 * 
 * This preview level can be played and won like a normal level, but the timer does not function.
 * 
 */
public class PreviewController implements ActionListener{
	
	/** The level editor jframe.*/
	WholesomeLevelEditorScreen editorScreen;
	
	public PreviewController(WholesomeLevelEditorScreen es) {
		this.editorScreen = es;
	}
	
	public boolean process(){
		ArrayList<Integer> tileFreq = new ArrayList<Integer>() {
			{
				add(editorScreen.frequency1.getValue());
				add(editorScreen.frequency2.getValue());
				add(editorScreen.frequency3.getValue());
				add(editorScreen.frequency4.getValue());
				add(editorScreen.frequency5.getValue());
				add(editorScreen.frequency6.getValue());

			}
		};
		ArrayList<Integer> multiFreq = editorScreen.getMultiplierFrequencies();
		ArrayList<Integer> stars = editorScreen.getStarThresholds();
		ArrayList<Integer> rules = editorScreen.getRules();
			 
			 Level level =  Main.model.getCurrentLevel();
			 level.setMovesLeft(rules.get(0));
			 level.setMaxMoves(rules.get(0));
			 level.setTime(rules.get(1));
			 level.setStars(stars);
			 level.setDeletesLeft((int)editorScreen.getRemoveTile().getValue());
			 level.setReshufflesLeft((int)editorScreen.getReshuffle().getValue());
			 level.setSwapsLeft((int)editorScreen.getSwap().getValue());
			 Board b = Main.model.getCurrentLevel().getBoard();
			 b.setTopCell(tileFreq, multiFreq);
			 b.initialize();
			 for(int i =0;i<9;i++){
					for(int j =0;j<9;j++){
						if(Main.model.getToggleType().cellArray[i][j] == 6){
							b.cells[i][j].setTile(new Tile(6, 0));
						}
					}
				}
			 level.setBoard(b);
			 level.setScore(0);
			 Main.model.setCurrentLevel(level);
			 new LevelView(level);
		
		return true;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		process();
	}
	
}
