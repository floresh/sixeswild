package game.move.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import game.controller.Move;
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
	
	public void MousePressed (MouseEvent me){
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
