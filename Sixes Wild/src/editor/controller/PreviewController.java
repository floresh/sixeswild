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
 */
public class PreviewController implements ActionListener{
	
	WholesomeLevelEditorScreen editorScreen;
	
	public PreviewController(WholesomeLevelEditorScreen es) {
		this.editorScreen = es;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
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
			 
			 Level level =  Main.application.getModel().getCurrentLevel();
			 level.setTime(rules.get(1));
			 System.out.println(rules.get(1));
			 level.setStars(stars);
			 Board b = Main.application.getModel().getCurrentLevel().getBoard();
			 b.setTopCell(tileFreq, multiFreq);
			 b.initialize();
			 for(int i =0;i<9;i++){
					for(int j =0;j<9;j++){
						if(Main.application.getModel().getToggleType().cellArray[i][j] == 6){
							b.cells[i][j].setTile(new Tile(6, 0));
						}
					}
				}
			 level.setBoard(b);
			 Main.application.getModel().setCurrentLevel(level);
			 System.out.println(((Integer)Main.application.getModel().getCurrentLevel().getTime()).toString());
			 new LevelView(level);
	}
	
}
