package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.Level;

/**
 * 
 * @author Heric, Jake
 * 
 * Contains redo functionality
 */
public class RedoController implements ActionListener {
	
	WholesomeLevelEditorScreen wles;
	
	public RedoController(WholesomeLevelEditorScreen wles) {
		this.wles = wles;
	}

	public boolean process(){
		ArrayList<Level> temp = Main.model.redoStates;
			
			if(temp.size() < 1) { return false; }
			
			Level nextState = temp.get(temp.size()-1);
			wles.frequency1.setValue(nextState.getTileFrequencies().get(0));
			wles.frequency2.setValue(nextState.getTileFrequencies().get(1));
			wles.frequency3.setValue(nextState.getTileFrequencies().get(2));
			wles.frequency4.setValue(nextState.getTileFrequencies().get(3));
			wles.frequency5.setValue(nextState.getTileFrequencies().get(4));
			wles.frequency6.setValue(nextState.getTileFrequencies().get(5));
			
			wles.xFrequency1.setValue(nextState.getModifierFrequencies().get(0));
			wles.xFrequency2.setValue(nextState.getModifierFrequencies().get(1));
			wles.xFrequency3.setValue(nextState.getModifierFrequencies().get(2));
			
			Main.model.gameState.add(nextState);
			Main.model.redoStates.remove(temp.size()-1);
			return true;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ArrayList<Level> temp = Main.application.getModel().redoStates;
		process();
	}
}
