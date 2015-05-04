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

	private LevelView lv;
	MouseListener oldMl;
	MouseMotionListener oldMML;
	public DeleteButtonController(LevelView lv){
		this.lv = lv;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		 oldMl = lv.getBoardView().getActiveListener();
		oldMML = lv.getBoardView().getActiveMouseMotionListener();

		MoveDeleteController mdc = new MoveDeleteController(lv.getBoardView(), this);
		//lv.getLevel().setDeleteMove(true);
		lv.getBoardView().setActiveListener(mdc);
		lv.getBoardView().setActiveMotionListener(mdc);
	}
	
	public void done(){
		lv.getBoardView().setActiveListener(oldMl);
		lv.getBoardView().setActiveMotionListener(oldMML);
	}
}
