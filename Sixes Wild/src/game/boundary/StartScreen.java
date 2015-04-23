package game.boundary;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartScreen extends JFrame {
	private JLabel titleLabel;
	private JPanel panel;
	private JButton exitButton;
	private JButton playButton;

	public StartScreen() {
		super("Start Screen");
		playButton = new JButton("PLAY");
		playButton.setBounds(288, 341, 159, 25);
		playButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GameModeScreen();
				dispose();
			}
		});
		
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
