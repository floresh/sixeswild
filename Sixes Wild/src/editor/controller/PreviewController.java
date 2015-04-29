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

//
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
		ArrayList<Integer> multiFreq = new ArrayList<Integer>()
		 {
				{
					add(1);
					add(1);
					add(1);
				}
		};
		ArrayList<Integer> stars = new ArrayList<Integer>()
			 {
					{
						add(25);
						add(50);
						add(100);
					}
			};
		ArrayList<Integer> rules = new ArrayList<Integer>()
			 {
					{
						add(50);
						add(900);
						add(5);
						add(5);
						add(5);
					}
			 };	
			 
			 Level level =  Main.model.getCurrentLevel();
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
			 Main.model.setCurrentLevel(level);
			 new LevelView(level);
	}
	
}
