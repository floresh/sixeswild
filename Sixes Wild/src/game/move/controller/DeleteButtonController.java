package game.move.controller;

import game.boundary.LevelView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Blahddddddddd
public class DeleteButtonController implements ActionListener{

	private LevelView lv;
	
	public DeleteButtonController(LevelView lv){
		this.lv = lv;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		MoveDeleteController mdc = new MoveDeleteController(lv.getBoardView());
		lv.getBoardView().setActiveListener(mdc);
		lv.getBoardView().setActiveMotionListener(mdc);
	}
}
