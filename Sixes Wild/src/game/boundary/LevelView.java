package game.boundary;

import game.controller.PauseController;
import game.controller.ResetBoardController;
import game.controller.ReturnToPreviousMenuController;
import game.controller.TimeController;
import game.entities.Level;
import game.entities.Model;
import game.main.Main;
import game.move.controller.DeleteButtonController;
import game.move.controller.ReshuffleButtonController;
import game.move.controller.SpMoveDelete;
import game.move.controller.SpMoveReshuffleBoard;
import game.move.controller.SpMoveSwapTiles;
import game.move.controller.MoveController;
import game.move.controller.SwapButtonController;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;

/**
 * 
 * @author Li Li, Jake, hfloreshuerta, Andrew
 *	
 *	Displays the level being played and holds the board(BoardView)
 */
public class LevelView extends JFrame{
	/** Level which LevelView is displaying */
	Level level;
	
	/**	BoardView (board) to display on frame */
	BoardView boardView;
	
	/** Displays level time */
	JLabel timeLabel;
	
	/** Displays level score */
	JLabel scoreLabel;
	
	/** Timer handler for level time */
	TimeController timeController;
	
	/** Progress bar to show score */
	JProgressBar progressBar;
	
	/** Moves Left Label */
	JLabel lblMovesLeft;
	JLabel deletesLeft;
	JLabel swapsLeft;
	JLabel reshuffleLeft;
	
	MoveController mover;
	
	public LevelView(Level level) {
		setResizable(false);
		
		this.level = level;
	
		JPanel panel = new JPanel();
		//MoveController mc = new MoveController(this);
		
		//JPanel boardView = new BoardView(board);
		mover = new MoveController(this);
		this.boardView = new BoardView(level.getBoard(), mover);
		boardView.setBounds(255, 229, 450, 450);
		panel.add(boardView);
		
		

		panel.setBounds(224, 66, 384, 369);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("PAUSE");
		btnNewButton.addActionListener(new PauseController(this));
	
		btnNewButton.setBounds(35, 37, 97, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ResetBoardController(this));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scoreLabel.setText("0");
				progressBar.setValue(0);
			}
		});
		btnNewButton_1.setBounds(35, 75, 97, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("QUIT");
		btnNewButton_2.addActionListener(new ReturnToPreviousMenuController(this));
		btnNewButton_2.setBounds(35, 113, 97, 25);
		panel.add(btnNewButton_2);
		
		JLabel lblSpecialMoves = new JLabel("SPECIAL MOVES");
		lblSpecialMoves.setBounds(165, 13, 96, 25);
		lblSpecialMoves.setFont(new Font("Serif", Font.PLAIN, 13));
		panel.add(lblSpecialMoves);
		
		JButton btnNewButton_3 = new JButton("RESHUFFLE");
		btnNewButton_3.addActionListener(new ReshuffleButtonController(this));
		btnNewButton_3.setBounds(164, 51, 97, 25);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SWAP");
		btnNewButton_4.addActionListener(new SwapButtonController(this));
		btnNewButton_4.setBounds(164, 99, 97, 25);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("DELETE");
		btnNewButton_5.addActionListener(new DeleteButtonController(this));
		btnNewButton_5.setBounds(164, 149, 97, 25);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton_5);
	
		JLabel lblNewLabel = new JLabel("SCORE: ");
		lblNewLabel.setBounds(35, 311, 56, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TIME: ");
		lblNewLabel_1.setBounds(35, 273, 56, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sixes Wild");
		lblNewLabel_2.setBounds(396, 37, 161, 71);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel_2);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(57, 357, 56, 357);
		progressBar.setValue(0);
		progressBar.setMaximum(level.getStars().get(2));
		progressBar.setOrientation(SwingConstants.VERTICAL);
		panel.add(progressBar);
		
		this.timeLabel = new JLabel(((Integer)level.getTime()).toString());
		this.timeLabel.setBounds(110, 275, 46, 14);
		panel.add(this.timeLabel);

		this.scoreLabel = new JLabel(((Integer)level.getScore()).toString());
		this.scoreLabel.setBounds(110, 313, 46, 14);
		panel.add(this.scoreLabel);

		timeController = new TimeController(level.getGameMode(), this);
		timeController.play();

		
		JLabel lbl3Star = new JLabel("3 STARS");
		lbl3Star.setBounds(123, 357, 56, 16);
		panel.add(lbl3Star);
		
		JLabel lbl2Stars = new JLabel("2 STARS");
		int twoVal = level.getStars().get(1);
		int threeVal = level.getStars().get(2);
		if(threeVal == 0){
			//prevents divide-by-zero in preview level
			threeVal = 100;
		}
		lbl2Stars.setBounds(123, 714-(int)(357*twoVal/threeVal), 56, 16);
		panel.add(lbl2Stars);
		
		JLabel lbl1Stars = new JLabel("1 STAR");
		int oneVal = level.getStars().get(0);
		lbl1Stars.setBounds(123, 714-(int)(357*oneVal/threeVal), 56, 16);
		panel.add(lbl1Stars);
		
		JLabel MovesLeft = new JLabel("MOVES LEFT:");
		MovesLeft.setBounds(12, 233, 101, 27);
		panel.add(MovesLeft);
		
		lblMovesLeft = new JLabel("0");
		lblMovesLeft.setBounds(110, 238, 46, 14);
		lblMovesLeft.setText(((Integer) level.getMovesLeft()).toString());
		panel.add(lblMovesLeft);
		
		deletesLeft = new JLabel(String.valueOf(level.getDeletsLeft()));
		deletesLeft.setBounds(271, 154, 46, 14);
	
		panel.add(deletesLeft);
		
		swapsLeft = new JLabel(String.valueOf(level.getSwapsLeft()));
		swapsLeft.setBounds(271, 104, 46, 14);
		panel.add(swapsLeft);
		
		reshuffleLeft = new JLabel(String.valueOf(level.getReshufflesLeft()));
		reshuffleLeft.setBounds(271, 56, 46, 14);
		panel.add(reshuffleLeft);
		
		
		
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	/**
	 * 
	 * @return Level
	 */
	public Level getLevel(){
		return level;
	}
	/**
	 * 
	 * @return BoardView
	 */
	public BoardView getBoardView(){
		return boardView;
	}
	
	/**
	 * 
	 * @return TimeController
	 */
	public TimeController getTimeController() {
		return timeController;
	}
	/**
	 * Refreshes the time displayed by getting new time from Level
	 */
	public void refreshTimer() {
		timeLabel.setText(((Integer)Main.model.getCurrentLevel().getTime()).toString());
	}
	/**
	 * Refreshes score displayed by getting new score from Level
	 */
	public void refreshScore() {
		scoreLabel.setText(((Integer)Main.model.getCurrentLevel().getScore()).toString());
	}
	public JLabel getScoreLabel() {
		return this.scoreLabel;
	}
	public JProgressBar getProgressBar() {
		return this.progressBar;
	}
	public JLabel getMovesLeftLabel() {
		return this.lblMovesLeft;
	}
	public void updateSpMoves(){
		deletesLeft.setText(String.valueOf(level.getDeletsLeft()));
		swapsLeft.setText(String.valueOf(level.getSwapsLeft()));
		reshuffleLeft.setText(String.valueOf(level.getReshufflesLeft()));
	}
	}

