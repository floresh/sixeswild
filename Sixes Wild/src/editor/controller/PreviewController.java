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
			 
		Board b = Main.model.getCurrentLevel().getBoard();
		b.initialize(tileFreq, multiFreq);
		b.gravity();
		
		Level levski = new PuzzleLevel(b, tileFreq ,multiFreq, stars, rules);
		
		LevelView lv = new LevelView(levski);
		
	}
	
}
