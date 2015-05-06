package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;


import game.boundary.PuzzleLevelSelection;
import game.boundary.LightningLevelSelection;
import game.boundary.EliminationLevelSelection;
import game.entities.Board;
import game.entities.LightningLevel;
import game.entities.Model;
import game.entities.PuzzleLevel;
import game.main.Main;
/**
 * 
 * @author Jake, Davis
 *
 *	This class is called when the player chooses a certain level to play (e.g. puzzle level 1)
 *	It initializes the level and stores in in the model, to be used when the player presses
 *  the play button to create the levelView.
 *  
 *  It is way too large, but such is the process of instantiating levels here in the source code 
 *  rather than loading from file.
 */
public class SelectLevelController implements ActionListener{
	JFrame frame;
	String string;
	
	public SelectLevelController(JFrame frame, String string) {
		this.frame = frame;
		this.string = string;
	
	}
	
//	private void process() {
//		String levelType = Main.model.getCurrentLevel().getGameMode();
//		
//		
//		switch(levelType){
//		case "Puzzle":
//			((PuzzleLevelSelection)frame).lblLevelSelected.setText(string);
//			//puzzleInitialize();
//			break;
//		case "Lightning":
//			((LightningLevelSelection)frame).lblLevelSelected.setText(string);
//		//	lightningInitialize();
//			break;
//		case "Elimination":
//			((EliminationLevelSelection)frame).lblLevelSelected.setText(string);
//			break;
//		case "Release":
//			break;
//		}
//		
//	}
	
//	private void puzzleInitialize(){
//		PuzzleLevel level = new PuzzleLevel();
//		if(string.contains("1")){
//			//puzzle level 1
//			ArrayList<Integer> tileFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(90);
//					add(80);
//					add(60);
//					add(40);
//					add(20);
//				}
//			};
//			ArrayList<Integer> multiFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(20);
//					add(10);
//				}
//			};
//			ArrayList<Integer> stars = new ArrayList<Integer>(){
//				{
//					add(75);
//					add(200);
//					add(400);
//				}
//			};
//			level.setMovesLeft(30);
//			level.setMaxMoves(30);
//			level.setStars(stars);
//			level.setTime(0);
//			Board b = Main.model.getCurrentLevel().getBoard();
//			b.setTopCell(tileFreq, multiFreq);
//			b.initialize();
//			level.setBoard(b);
//			level.setScore(0);
//			Main.model.setCurrentLevel(level);
//		}
//		else if(string.contains("2")){
//			//puzzle level 2
//			ArrayList<Integer> tileFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(100);
//					add(90);
//					add(70);
//					add(50);
//					add(30);
//				}
//			};
//			ArrayList<Integer> multiFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(20);
//					add(5);
//				}
//			};
//			ArrayList<Integer> stars = new ArrayList<Integer>(){
//				{
//					add(150);
//					add(350);
//					add(500);
//				}
//			};
//			level.setMovesLeft(40);
//			level.setMaxMoves(40);
//			level.setStars(stars);
//			level.setTime(0);
//			Board b = Main.model.getCurrentLevel().getBoard();
//			b.setTopCell(tileFreq, multiFreq);
//			b.initialize();
//			level.setBoard(b);
//			level.setScore(0);
//			Main.model.setCurrentLevel(level);
//		}
//		else if(string.contains("3")){
//			//puzzle level 3
//			ArrayList<Integer> tileFreq = new ArrayList<Integer>(){
//				{
//					add(90);
//					add(90);
//					add(90);
//					add(80);
//					add(60);
//					add(40);
//				}
//			};
//			ArrayList<Integer> multiFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(20);
//					add(5);
//				}
//			};
//			ArrayList<Integer> stars = new ArrayList<Integer>(){
//				{
//					add(150);
//					add(350);
//					add(500);
//				}
//			};
//			level.setMovesLeft(30);
//			level.setMaxMoves(30);
//			level.setStars(stars);
//			level.setTime(0);
//			Board b = Main.model.getCurrentLevel().getBoard();
//			b.setTopCell(tileFreq, multiFreq);
//			b.initialize();
//			level.setBoard(b);
//			level.setScore(0);
//			Main.model.setCurrentLevel(level);
//		}
//		else if(string.contains("4")){
//			//puzzle level 4
//			ArrayList<Integer> tileFreq = new ArrayList<Integer>(){
//				{
//					add(70);
//					add(70);
//					add(90);
//					add(90);
//					add(75);
//					add(50);
//				}
//			};
//			ArrayList<Integer> multiFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(20);
//					add(10);
//				}
//			};
//			ArrayList<Integer> stars = new ArrayList<Integer>(){
//				{
//					add(200);
//					add(400);
//					add(600);
//				}
//			};
//			level.setMovesLeft(40);
//			level.setMaxMoves(40);
//			level.setStars(stars);
//			level.setTime(0);
//			Board b = Main.model.getCurrentLevel().getBoard();
//			b.setTopCell(tileFreq, multiFreq);
//			b.initialize();
//			level.setBoard(b);
//			level.setScore(0);
//			Main.model.setCurrentLevel(level);
//		}
//	}
	
//	private void lightningInitialize(){
//		LightningLevel level = new LightningLevel();
//		if(string.contains("1")){
//			//lightning level 1
//			ArrayList<Integer> tileFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(90);
//					add(80);
//					add(60);
//					add(40);
//					add(20);
//				}
//			};
//			ArrayList<Integer> multiFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(20);
//					add(10);
//				}
//			};
//			ArrayList<Integer> stars = new ArrayList<Integer>(){
//				{
//					add(75);
//					add(200);
//					add(400);
//				}
//			};
//			level.setMovesLeft(30);
//			level.setMaxMoves(30);
//			level.setStars(stars);
//			level.setTime(100);
//			Board b = Main.model.getCurrentLevel().getBoard();
//			b.setTopCell(tileFreq, multiFreq);
//			b.initialize();
//			level.setBoard(b);
//			level.setScore(0);
//			Main.model.setCurrentLevel(level);
//		}
//		else if(string.contains("2")){
//			//lightning level 2
//			ArrayList<Integer> tileFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(100);
//					add(90);
//					add(70);
//					add(50);
//					add(30);
//				}
//			};
//			ArrayList<Integer> multiFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(20);
//					add(5);
//				}
//			};
//			ArrayList<Integer> stars = new ArrayList<Integer>(){
//				{
//					add(150);
//					add(350);
//					add(500);
//				}
//			};
//			level.setMovesLeft(40);
//			level.setMaxMoves(40);
//			level.setStars(stars);
//			level.setTime(60);
//			Board b = Main.model.getCurrentLevel().getBoard();
//			b.setTopCell(tileFreq, multiFreq);
//			b.initialize();
//			level.setBoard(b);
//			level.setScore(0);
//			Main.model.setCurrentLevel(level);
//		}
//		else if(string.contains("3")){
//			//Lightning level 3
//			ArrayList<Integer> tileFreq = new ArrayList<Integer>(){
//				{
//					add(90);
//					add(90);
//					add(90);
//					add(80);
//					add(60);
//					add(40);
//				}
//			};
//			ArrayList<Integer> multiFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(20);
//					add(5);
//				}
//			};
//			ArrayList<Integer> stars = new ArrayList<Integer>(){
//				{
//					add(150);
//					add(350);
//					add(500);
//				}
//			};
//			level.setMovesLeft(30);
//			level.setMaxMoves(30);
//			level.setStars(stars);
//			level.setTime(30);
//			Board b = Main.model.getCurrentLevel().getBoard();
//			b.setTopCell(tileFreq, multiFreq);
//			b.initialize();
//			level.setBoard(b);
//			level.setScore(0);
//			Main.model.setCurrentLevel(level);
//		}
//		else if(string.contains("4")){
//			//puzzle level 4
//			ArrayList<Integer> tileFreq = new ArrayList<Integer>(){
//				{
//					add(70);
//					add(70);
//					add(90);
//					add(90);
//					add(75);
//					add(50);
//				}
//			};
//			ArrayList<Integer> multiFreq = new ArrayList<Integer>(){
//				{
//					add(100);
//					add(20);
//					add(10);
//				}
//			};
//			ArrayList<Integer> stars = new ArrayList<Integer>(){
//				{
//					add(200);
//					add(400);
//					add(600);
//				}
//			};
//			level.setMovesLeft(40);
//			level.setMaxMoves(40);
//			level.setStars(stars);
//			level.setTime(90);
//			Board b = Main.model.getCurrentLevel().getBoard();
//			b.setTopCell(tileFreq, multiFreq);
//			b.initialize();
//			level.setBoard(b);
//			level.setScore(0);
//			Main.model.setCurrentLevel(level);
//		}
//	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//process();
		
	}
}
