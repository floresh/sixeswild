package game.move.controller;

import game.boundary.BoardView;
import game.boundary.CellView;
import game.boundary.LevelView;
import game.entities.Cell;
import game.entities.Tile;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MoveReshuffleBoardController extends MouseAdapter{
//Blah
	BoardView bv;
	ArrayList<Cell> cells = new ArrayList<Cell>();
	LevelView lv;
	Tile tile;

	public MoveReshuffleBoardController(LevelView lv) {
		this.lv = lv;
	}

}


