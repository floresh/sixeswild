package game.move.controller;

import game.boundary.LevelView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwapButtonController implements ActionListener{

	private LevelView lv;
	//Blahddddddddd
	public SwapButtonController(LevelView lv){
		this.lv = lv;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		MoveSwapController msc = new MoveSwapController(lv.getBoardView());
		lv.getBoardView().setActiveListener(msc);
		lv.getBoardView().setActiveMotionListener(msc);
	}
}