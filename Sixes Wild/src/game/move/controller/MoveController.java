package game.move.controller;

import java.util.ArrayList;

import game.boundary.BoardView;
import game.boundary.LevelView;
import game.controller.EndGameController;
import game.entities.Board;
import game.entities.Cell;
import game.entities.Level;
import game.entities.Location;
//Blah
/**
 * 
 * @author Li, Andrew, Jake
 *
 */
public class MoveController {
//Executes the move.
	Level level;

	ArrayList<Cell> cells;
	Board board;
	LevelView levelView;
	
	public MoveController(LevelView levelView){
		this.levelView = levelView;
		level = levelView.getLevel();
		board = level.getBoard();
	}
	
	
	public boolean doMove(ArrayList<Cell> cells ){
		this.cells = cells;
		Cell next;
		int score = 0;

		int size = cells.size();

		if(!isLegal(size)) { return false; }

		for(int i = 0; i < size; i++) {
			next = cells.get(i);
			score += next.getTile().getValue();
			score *= next.getTile().getMultiplier();
		}

	
		for(int i = 0; i < size; i++){
			int col = cells.get(i).getLocation().getColumn();
			int row = cells.get(i).getLocation().getRow();
			board.cells[row][col].setIsEmpty(true);
		}

		//movesLeft.process();
		level.setMovesLeft(level.getMovesLeft()-1);
		level.setScore(level.getScore()+score);
		levelView.getScoreLabel().setText(((Integer) level.getScore()).toString());
		levelView.getMovesLeftLabel().setText(((Integer) level.getMovesLeft()).toString());
		levelView.getProgressBar().setValue(level.getScore());
		board.gravity();
		
		if(level.getMovesLeft() == 0){
			new EndGameController(this.levelView);
		}
		return true;
		
		
	}
	public boolean isLegal(int size) {
		if(size > 6) { return false; }

		int total = 0;
		ArrayList<Location> locations = new ArrayList<Location>();

		for(int i = 0; i < size; i++) {
			locations.add(cells.get(i).getLocation());
			total += cells.get(i).getTile().getValue();
		}
		if(total != 6) { return false; }
		else{

			Location l1, l2;
			int r1,r2,c1,c2;
			boolean funtimes = false;
			
			for(int i = 1; i < size; i++) {
				l1 = locations.get(i);
				l2 = locations.get(i-1);
				r1=l1.getRow(); r2=l2.getRow();
				c1=l1.getColumn(); c2=l2.getColumn();

				if(l1 == l2 || ((r1+1 == r2 || r1-1 == r2) && (c1 == c2)) ||
						((c1+1 == c2 || c1-1 == c2) && (r1 == r2))) {
					System.out.println(l1);
					System.out.println(l2);
					System.out.println(r1);
					System.out.println(r2);
					System.out.println(c1);
					System.out.println(c2);
					funtimes = true;
				}
			}
			
			return funtimes;

		}
	}
	
}
