import game.entities.Cell;

import java.awt.event.MouseEvent;

import junit.framework.TestCase;

public class EntityTests extends TestCase{

public void testCells() {
		
		Cell c = new Cell(new Tile());
		
		
		
		assertEquals (new Card(Card.FOUR, Card.HEARTS), eagleWings.wastePile.peek());
		assertTrue (eagleWings.undoMove());
		assertTrue (eagleWings.wastePile.empty());
	
		gw.setVisible(false);
		gw.dispose();
	}
	
}
}
