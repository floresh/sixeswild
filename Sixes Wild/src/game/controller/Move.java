package game.controller;

import java.util.ArrayList;

import game.boundary.Application;
import game.entities.*;

public class Move {
	Model model;
	Application application;
	
	public Move(Application app, Model m, ArrayList<Tile> tiles) {
		this.model = m;
		this.application = app;
	}
	
	public boolean process() {
		return false;
	}
}
