package game.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import game.boundary.Application;
import game.entities.*;

public class SpMoveReshuffleBoard {
	Model model;
	Application application;
	
	public SpMoveReshuffleBoard(Application app, Model m) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		model.getLevel().getBoard().randomize();
		
		int movesLeft = model.getLevel().getScore();
		model.getLevel().setMovesLeft(movesLeft - 1);
		
		return true;
	}
}
