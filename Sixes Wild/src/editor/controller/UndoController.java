package editor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import editor.boundary.LevelEditorApplication;
import editor.boundary.Main;
import editor.boundary.WholesomeLevelEditorScreen;
import game.entities.Level;
import game.entities.Model;
/**
 * 
 * @author Heric, Jake
 *
 */
public class UndoController implements ActionListener {
	WholesomeLevelEditorScreen wles;
	
	public UndoController(WholesomeLevelEditorScreen wles) {
		this.wles = wles;
	}
	
	public boolean process(){
		ArrayList<Level> temp = Main.application.getModel().gameState;
		Level previousState = Main.application.getModel().gameState.get(temp.size()-2);
		Level currentState = Main.application.getModel().gameState.get(temp.size() - 1);
		wles.frequency1.setValue(previousState.getTileFrequencies().get(0));
		System.out.println(previousState.getTileFrequencies().get(0));
		System.out.println(currentState.getTileFrequencies().get(0));
		wles.frequency2.setValue(previousState.getTileFrequencies().get(1));
		wles.frequency3.setValue(previousState.getTileFrequencies().get(2));
		wles.frequency4.setValue(previousState.getTileFrequencies().get(3));
		wles.frequency5.setValue(previousState.getTileFrequencies().get(4));
		wles.frequency6.setValue(previousState.getTileFrequencies().get(5));
		
		wles.xFrequency1.setValue(previousState.getModifierFrequencies().get(0));
		wles.xFrequency2.setValue(previousState.getModifierFrequencies().get(1));
		wles.xFrequency3.setValue(previousState.getModifierFrequencies().get(2));
		
		Main.application.getModel().gameState.remove(temp.size() - 1);
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		process();
	}
	
}
