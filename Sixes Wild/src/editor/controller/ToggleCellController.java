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
		Main.model.getLevel().getBoard().cells[row][column].setIsEnabled(onOff);
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cell = (JButton) e.getSource();
		if(cell.getBackground() == Color.GREEN){
			cell.setBackground(Color.RED);
			setEnabled(false);
		}
		else{
			cell.setBackground(Color.GREEN);
			setEnabled (true);
		}
	}
	
}
