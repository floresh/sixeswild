package game.boundary;

import game.controller.ResetBoardController;
import game.entities.NoLevel;
import game.main.Main;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EndGameScreen extends JFrame {
	JLabel lblWinLose;
	JLabel lblStars;
	LevelView gameScreen;
	
	public EndGameScreen(LevelView lv) {
		setTitle("Sixes Wild");
		this.gameScreen = lv;
		getContentPane().setLayout(null);
		
		lblWinLose = new JLabel("A fine old english morning.");
		lblWinLose.setFont(new Font("Old English Text MT", Font.PLAIN, 39));
		lblWinLose.setBounds(0, 0, 432, 68);
		getContentPane().add(lblWinLose);
		
		JButton btnReturnToLevel = new JButton("Return to Level Selection");
		btnReturnToLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.model.setCurrentLevel(new NoLevel());
				lv.dispose();
				dispose();
				new GameModeScreen();
			}
		});
		btnReturnToLevel.setBounds(108, 131, 200, 50);
		getContentPane().add(btnReturnToLevel);
		
		JButton btnRetryLevel = new JButton("Retry Level");
		btnRetryLevel.addActionListener(new ResetBoardController(this.gameScreen));
		btnRetryLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnRetryLevel.setBounds(108, 187, 200, 50);
		getContentPane().add(btnRetryLevel);
		
		lblStars = new JLabel("Spot of tea, eh?");
		lblStars.setFont(new Font("Old English Text MT", Font.PLAIN, 30));
		lblStars.setBounds(47, 61, 336, 68);
		getContentPane().add(lblStars);
		
		setSize(450,300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public JLabel getWinLose() {
		return this.lblWinLose;
	}
	
	public JLabel getLblStars(){
		return this.lblStars;
	}
	
	
}
