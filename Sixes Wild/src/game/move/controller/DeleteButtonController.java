package game.move.controller;

import game.boundary.LevelView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/**
 * 
 * @author Li Li
 *
 */
public class DeleteButtonController implements ActionListener{
//fdsfdsfsdfds
	private LevelView lv;
	MouseListener oldMl;
	MouseMotionListener oldMML;
	private int left;
	
	public DeleteButtonController(LevelView lv){
		this.lv = lv;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		left = lv.getLevel().getDeletsLeft();
		if(left>0){
		 oldMl = lv.getBoardView().getActiveListener();
		oldMML = lv.getBoardView().getActiveMouseMotionListener();

		MoveDeleteController mdc = new MoveDeleteController(lv.getBoardView(), this);
		//lv.getLevel().setDeleteMove(true);
		lv.getBoardView().setActiveListener(mdc);
		lv.getBoardView().setActiveMotionListener(mdc);
		}
	}
	
	public void done(){
		lv.getBoardView().setActiveListener(oldMl);
		lv.getBoardView().setActiveMotionListener(oldMML);
		lv.getLevel().setDeletesLeft(left-1);
		lv.updateSpMoves();
	}
}
