package editor.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;

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
		Main.model.getCurrentLevel().getBoard().cells[row][column].setIsEnabled(onOff);
		return true;
	}
	
	public boolean setRelease(boolean onOff){
		//add release cells and set this cell to be a release cell
		//Main.model.getCurrentLevel().getBoard().cells[row][column];
		return true;
	}
	
	public boolean setSix(boolean onOff){
		//set this cell to be a six cell
		//Main.model.getCurrentLevel().getBoard().cells[row][column];
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cell = (JButton) e.getSource();
		if(Main.model.getToggleType().getValue() == 0 ){
			if(cell.getBackground() == Color.GREEN){
				cell.setBackground(Color.RED);
				setEnabled(false);
			}
			else{
				cell.setBackground(Color.GREEN);
				setEnabled (true);
			}
		}
		else if(Main.model.getToggleType().getValue() == 1){
			if(cell.getText()==""){
				cell.setText("R");
				setRelease(true);
			}
			else{
				cell.setText("");
				setRelease(false);
			}
		}
		else if(Main.model.getToggleType().getValue() == 2){
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
