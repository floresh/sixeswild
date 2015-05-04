package game.controller;

import game.boundary.BoardView;

import java.awt.event.MouseAdapter;

public class SpMoveSelController extends MouseAdapter{
	
	public enum SpMove{
		DELETE , SWAP
	}
	
	SpMove spMove;
	BoardView bv;
	
	public SpMoveSelController(BoardView bv){
		this.bv = bv;
	}
	
	public void setSpMove(SpMove spMove){
		this.spMove = spMove;
	}
	
	public void register() {
		bv.setActiveListener(this);
		bv.setActiveMotionListener(this);
	}
	
	public void mouseClicked(){
		
	//	switch spMove
		
		
	}
	
	
	

}
