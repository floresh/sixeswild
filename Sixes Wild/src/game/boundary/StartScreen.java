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
		playButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GameModeScreen();
				dispose();
			}
		});
		
		exitButton = new JButton("EXIT");
		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});

		titleLabel = new JLabel("Sixes Wild");
		titleLabel.setFont(new Font("Gisha", Font.PLAIN, 30));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

		panel = new JPanel();
		panel.setLayout(new MigLayout("", "35%[center]35%",
				"20%[]20%[]10%[]20%"));

		panel.add(titleLabel, "span, wrap");
		panel.add(playButton, "width 20%, wrap");
		panel.add(exitButton, "width 20%");
		
		add(panel);

		setSize(500, 450);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// Continue
}
