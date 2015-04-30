package editor.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.Tile;
/**
 * 
 * @author Jake
 *
 */
public class ToggleCellController implements ActionListener {
	WholesomeLevelEditorScreen screen;
	JButton cell;
	
	int row;
	int column;
	
	public ToggleCellController(WholesomeLevelEditorScreen screen, int row, int column){
		this.screen = screen;
		this.row = row;
		this.column = column;
	}
	
	public boolean setEnabled(boolean onOff){
		Main.application.getModel().getCurrentLevel().getBoard().cells[row][column].setIsEnabled(onOff);
		return true;
	}
	
	public boolean setRelease(boolean onOff){
		//add release cells and set this cell to be a release cell
		//Main.model.getCurrentLevel().getBoard().cells[row][column];
		return true;
	}
	
	public boolean setSix(boolean onOff){
		if(onOff){
			Main.application.getModel().getToggleType().getCellArray()[this.row][this.column] = 6;
		}
		else{
			Main.application.getModel().getToggleType().getCellArray()[this.row][this.column] = 0;
		}
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cell = (JButton) e.getSource();
		if(Main.application.getModel().getToggleType().getValue() == 0 ){
			if(cell.getBackground() == Color.GREEN){
				cell.setBackground(Color.RED);
				setEnabled(false);
			}
			else{
				cell.setBackground(Color.GREEN);
				setEnabled (true);
			}
		}
		else if(Main.application.getModel().getToggleType().getValue() == 1){
			if(cell.getText()==""){
				cell.setText("R");
				setRelease(true);
			}
			else{
				cell.setText("");
				setRelease(false);
			}
		}
		else if(Main.application.getModel().getToggleType().getValue() == 2){
			if(cell.getText()==""){
				cell.setText("6");
				setSix(true);
			}
			else{
				cell.setText("");
				setSix(false);
			}
		}
	}
	
}
