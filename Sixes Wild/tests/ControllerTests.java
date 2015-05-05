
import javax.swing.JFrame;
import game.boundary.LevelView;
import game.controller.SelectLevelController;
import game.entities.Board;
import game.entities.Cell;
import game.move.controller.MoveController;
import game.move.controller.SelectionController;
import junit.framework.TestCase;

public class ControllerTests extends TestCase {
	JFrame frame = new JFrame();
	LevelView lv;
	Cell[][] cells;
	Cell cell;
	
	protected void setUp() {
		Board b = new Board(cells);
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				cell = new Cell (i, j, true, false, false);
			}
		}
		cell = new Cell (7, 8, true, false, false);
	}
	protected void tearDown() {
		lv.dispose();
	}
	
	public void testSelect(){
		SelectLevelController slc = new SelectLevelController(frame, "Puzzle");
		
	}
	
	public void moveController() {
		MoveController mc = new MoveController(lv);
		SelectionController sc = new SelectionController(lv.getBoardView(), mc);
	}

}
