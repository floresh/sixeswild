package game.boundary;
import game.controller.SelectPlayController;
import game.entities.Model;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author hfloreshuerta, Andrew, Li Li, Jacob, Kwame
 * 
 * Frame to display introuction screen to game
 */
public class StartScreen extends JFrame {
	
	Model model;

	
	/** Displays Sixes Wild title */
	private JLabel titleLabel;
	
	/** panel displayed on frame, holding all frame contents */
	private JPanel panel;
	
	/** button exits application on click */
	private JButton exitButton;
	
	/** continues to game mode selection screen on click */
	private JButton playButton;

	public StartScreen() {
		super("Start Screen");
		
		playButton = new JButton("PLAY");
		playButton.setBounds(288, 341, 159, 25);
		playButton.addActionListener(new SelectPlayController(this));
		
		exitButton = new JButton("EXIT");
		exitButton.setBounds(288, 428, 159, 25);
		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});

		titleLabel = new JLabel("Sixes Wild");
		titleLabel.setBounds(300, 153, 137, 36);
		titleLabel.setFont(new Font("Gisha", Font.PLAIN, 30));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

		panel = new JPanel();
		panel.setLayout(null);

		panel.add(titleLabel);
		panel.add(playButton);
		panel.add(exitButton);
		
		getContentPane().add(panel);

		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// Continue
}
