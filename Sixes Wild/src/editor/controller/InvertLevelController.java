package editor.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import editor.boundary.LevelEditorApplication;
import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.Model;
/**
 * 
 * @author Jake
 *
 * A fairly fun little controller which reverses the on/off status of all cells on the board.
 */
public class InvertLevelController implements ActionListener {
	
	WholesomeLevelEditorScreen wles;
	
	public InvertLevelController(WholesomeLevelEditorScreen wles) {
		this.wles = wles;
	}
	
	
	public boolean setEnabled(boolean onOff, int row, int col){
		Main.application.getModel().getCurrentLevel().getBoard().cells[row][col].setIsEnabled(onOff);
		return true;
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				if(wles.buttArray[i][j].getBackground() == Color.RED){
					wles.buttArray[i][j].setBackground(Color.GREEN);
					setEnabled(true,i,j);
				}
				else{
					wles.buttArray[i][j].setBackground(Color.RED);
					setEnabled(false,i,j);
				}			
			}
		}
		
	}
	
}

