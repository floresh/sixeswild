package game.move.controller;

import game.boundary.LevelView;
import game.entities.Tile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 * @author Li Li
 *
 */
public class ReshuffleButtonController implements ActionListener{

	private LevelView lv;
	ArrayList<Tile> tiles = new ArrayList<Tile>();
	public ReshuffleButtonController(LevelView lv){
		this.lv = lv;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		tiles = lv.getBoardView().getBoard().getTiles();
		Collections.shuffle(tiles);
		lv.getBoardView().getBoard().setTiles(tiles);
		lv.getBoardView().draw(); 
	//	movesLeft.process();	
		//MoveReshuffleBoardController mrbc = new MoveReshuffleBoardController(lv);
	//	lv.getBoardView().setActiveListener(mrbc);
		//lv.getBoardView().setActiveMotionListener(mrbc);
	}

}