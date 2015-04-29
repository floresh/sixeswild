package game.boundary;

import game.controller.PauseController;
import game.controller.ResetBoardController;
import game.controller.ReturnToPreviousMenuController;

import game.controller.SelectGameModeController;
import game.entities.Board;

import game.controller.TimeController;

import game.entities.Level;
import game.main.Main;
import game.move.controller.SpMoveDelete;
import game.move.controller.SpMoveReshuffleBoard;
import game.move.controller.SpMoveSwapTiles;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

/**
 * 
 * @author Li Li, Jake, hfloreshuerta
 *
 */
public class LevelView extends JFrame{
	
	Level level;
	BoardView boardView;
	JLabel timeLabel;
	JLabel scoreLabel;
	
	TimeController timeController;
	
	
	
	
	
	public LevelView(final Level level) {
		setResizable(false);

		JPanel panel = new JPanel();

	
		
		//JPanel boardView = new BoardView(board);

		BoardView boardView = new BoardView(level.getBoard());
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
		btnNewButton_1.addActionListener(new ResetBoardController(level, boardView));
		btnNewButton_1.setBounds(35, 75, 97, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("QUIT");
		btnNewButton_2.addActionListener(new ReturnToPreviousMenuController(this));
		btnNewButton_2.setBounds(35, 113, 97, 25);
		panel.add(btnNewButton_2);
		
		JLabel lblSpecialMoves = new JLabel("SPECIAL MOVES");
		lblSpecialMoves.setBounds(36, 173, 96, 25);
		lblSpecialMoves.setFont(new Font("Serif", Font.PLAIN, 13));
		panel.add(lblSpecialMoves);
		
		JButton btnNewButton_3 = new JButton("RESHUFFLE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				new SpMoveReshuffleBoard(level.getBoard()).doMove();

			}
		});
		btnNewButton_3.setBounds(35, 211, 97, 25);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SWAP");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SpMoveSwapTiles(level.getBoard()).doMove();
			}
		});
		btnNewButton_4.setBounds(35, 259, 97, 25);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("DELETE");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SpMoveDelete(level.getBoard()).doMove();
			}
		});

		btnNewButton_5.setBounds(35, 305, 97, 25);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("SCORE: ");
		lblNewLabel.setBounds(201, 79, 56, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TIME: ");
		lblNewLabel_1.setBounds(201, 41, 56, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sixes Wild");
		lblNewLabel_2.setBounds(396, 37, 161, 71);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel_2);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(57, 357, 56, 357);
		progressBar.setValue(0);
		progressBar.setOrientation(SwingConstants.VERTICAL);
		panel.add(progressBar);
		
		JLabel timeLabel = new JLabel("time");
		timeLabel.setBounds(255, 42, 46, 14);
		panel.add(timeLabel);
		
		this.timeLabel = new JLabel(((Integer)level.getTime()).toString());
		this.timeLabel.setBounds(255, 42, 46, 14);
		panel.add(this.timeLabel);

		

		this.scoreLabel = new JLabel(((Integer)level.getScore()).toString());
		this.scoreLabel.setBounds(255, 80, 46, 14);
		panel.add(this.scoreLabel);

		JLabel scoreLabel = new JLabel("score");
		scoreLabel.setBounds(255, 80, 46, 14);
		panel.add(scoreLabel);

		timeController = new TimeController(level.getGameMode(), this);
		timeController.play();

		
		JLabel lbl3Star = new JLabel("3 STARS");
		lbl3Star.setBounds(123, 357, 56, 16);
		panel.add(lbl3Star);
		
		JLabel lbl2Stars = new JLabel("2 STARS");
		lbl2Stars.setBounds(123,714-(int)(357*level.getStars().get(1)/level.getStars().get(2)), 56, 16);
		panel.add(lbl2Stars);
		
		JLabel lbl1Stars = new JLabel("1 STAR");
		lbl1Stars.setBounds(123, 714-(int)(357*level.getStars().get(0)/level.getStars().get(2)), 56, 16);
		panel.add(lbl1Stars);
		
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Level getLevel(){
		return level;
	}
	public BoardView getBoardView(){
		return boardView;
	}

	//Potential method for pressing the special moves/other buttons on level view screen
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
