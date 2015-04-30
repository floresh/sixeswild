/*package game.move.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import game.boundary.Application;
import game.boundary.BoardView;
import game.boundary.CellView;
import game.boundary.LevelView;
import game.controller.Move;
import game.controller.MovesLeftController;
import game.controller.ScoreController;
import game.controller.SelectionController;
import game.entities.*;

public class MoveController extends SelectionController{
	//Now called move controller from move
	Level level;
	BoardView bv;
	ArrayList<Cell> cells;
	SelectionController selection;
	LevelView lv;

	ScoreController updateScore = new ScoreController(level);
	MovesLeftController movesLeft = new MovesLeftController(level);

	public MoveController(LevelView levelView) {
		this.level = levelView.getLevel();
		this.lv = levelView;
	}

	public boolean doMove() {
		Cell next;
		int total = 0;
		int subtotal = 0;
		int size = selection.getSize();

		if(!isLegal(size)) { return false; }

		for(int i = 0; i < size; i++) {
			next = selection.selectedCellsList().get(i);

			subtotal += next.getTile().getValue();

			total += next.getTile().getValue();
			total *= next.getTile().getMultiplier();
		}

		if(subtotal != 6) { return false; }
		for(int i = 0; i < size; i++){
			int col = selection.selectedCellsList().get(i).getLocation().getColumn();
			int row = selection.selectedCellsList().get(i).getLocation().getRow();
			bv.getBoard().cells[row][col].setIsEmpty(true);
		}

		movesLeft.process();
		updateScore.process(total);

		level.getBoard().gravity();
		bv.draw();
		return true;
	}

	public void register() {
		lv.setActiveListener(this);
		lv.setActiveMotionListener(this);
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
					return true;
				}
			}
			return false;

		}
	}
}
*/