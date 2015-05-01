package game.move.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import game.controller.MovesLeftController;
import game.entities.Board;
import game.entities.Location;
import game.entities.Model;

public class SpMoveDelete  implements ActionListener {
	

	Board board;
	Location location;
	
	
	public SpMoveDelete(Board board){
		this.board = board;
			
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
