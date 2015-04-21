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
		//long seed = System.nanoTime();
		//ArrayList<ArrayList<Cell>> grid = model.getLevel().getBoard().getColumns();
		
		//Collections.shuffle(grid, new Random(seed));
		return true;
	}
}
