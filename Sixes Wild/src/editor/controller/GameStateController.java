package editor.controller;

import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.Board;
import game.entities.Level;
import game.entities.PuzzleLevel;
import game.entities.Tile;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
/**
 * 
 * @author Jake, Heric
 *
 */
public class GameStateController extends java.awt.event.MouseAdapter{
	
		/** The level editor jframe.*/
		WholesomeLevelEditorScreen editorScreen;
		
		public GameStateController(WholesomeLevelEditorScreen es) {
			this.editorScreen = es;
		}
		
	
		public void mouseReleased(MouseEvent me) {
			
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
				 
				 Level level =  new PuzzleLevel();
				 level.setTileFrequency(tileFreq);
				 level.setMultiplierFrequency(multiFreq);
				 level.setMovesLeft(rules.get(0));
				 level.setMaxMoves(rules.get(0));
				 level.setTime(rules.get(1));
				 level.setStars(stars);
				 Board b = new Board(level);
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
				 level.setScore(0);
				 Main.application.getModel().gameState.add(level);
				 
				 Main.application.getModel().redoStates.clear();
		}
		
	}


