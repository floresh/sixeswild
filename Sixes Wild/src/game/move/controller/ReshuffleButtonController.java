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
		if(lv.getLevel().getReshufflesLeft()>0){
		tiles = lv.getBoardView().getBoard().getValidTiles();
		Collections.shuffle(tiles);
		lv.getBoardView().getBoard().setValidTiles(tiles);
		lv.getBoardView().draw(); 
		lv.getLevel().setReshufflesLeft(lv.getLevel().getReshufflesLeft()-1);
		lv.updateSpMoves();
		}
	//	movesLeft.process();	
		//MoveReshuffleBoardController mrbc = new MoveReshuffleBoardController(lv);
	//	lv.getBoardView().setActiveListener(mrbc);
		//lv.getBoardView().setActiveMotionListener(mrbc);
	}

}