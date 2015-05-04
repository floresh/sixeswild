package game.move.controller;

import game.boundary.BoardView;
import game.entities.Cell;
import game.entities.Location;
/**
 * 
 * @author Li Li
 *
 */
public class SpMoveDelete {
	//fsdfds
	BoardView boardView;
	Location location;
	//Blah
	public SpMoveDelete(BoardView boardView){
		this.boardView = boardView;
			
	}

	public boolean doMove(Cell cell){
		cell.setIsEmpty(true);
		boardView.getBoard().gravity();
		boardView.draw();
		return true;
		
	}
	
	
}
