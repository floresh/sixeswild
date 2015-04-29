package editor.boundary;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JSlider;

import editor.controller.ClearLevelController;
import editor.controller.InvertLevelController;
import editor.controller.PreviewController;
import editor.controller.SaveLevelController;
import editor.controller.ToggleCellController;
import editor.controller.ToggleTypeController;

import javax.swing.JSpinner;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Jake
 *
 */
public class WholesomeLevelEditorScreen extends JFrame {
	JTextField nameTextField;

	JSpinner numMoves;
	JSpinner maxTime;
	JSpinner removeTile;
	JSpinner reshuffle;
	JSpinner swap;
	JSpinner starThreshold1;
	JSpinner starThreshold2;
	JSpinner starThreshold3;

	public JSlider frequency1;
	public JSlider frequency2;
	public JSlider frequency3;
	public JSlider frequency4;
	public JSlider frequency5;
	public JSlider frequency6;

	JSlider xFrequency1;
	JSlider xFrequency2;
	JSlider xFrequency3;
	
	JButton saveLevel;
	JButton clearLevel;
	JButton invertLevel;
	JButton previewLevel;
	JButton undo;
	JButton redo;
	public JButton[][] buttArray;

	public void init() {
		nameTextField = new JTextField();

		frequency1 = new JSlider();
		frequency2 = new JSlider();
		frequency3 = new JSlider();
		frequency4 = new JSlider();
		frequency5 = new JSlider();
		frequency6 = new JSlider();

		xFrequency1 = new JSlider();
		xFrequency2 = new JSlider();
		xFrequency3 = new JSlider();

		numMoves = new JSpinner();
		maxTime = new JSpinner();
		removeTile = new JSpinner();
		reshuffle = new JSpinner();
		swap = new JSpinner();

		numMoves.setModel(new SpinnerNumberModel());
		maxTime.setModel(new SpinnerNumberModel());
		removeTile.setModel(new SpinnerNumberModel());
		reshuffle.setModel(new SpinnerNumberModel());
		swap.setModel(new SpinnerNumberModel());

		starThreshold1 = new JSpinner();
		starThreshold2 = new JSpinner();
		starThreshold3 = new JSpinner();

		starThreshold1.setModel(new SpinnerNumberModel());
		starThreshold2.setModel(new SpinnerNumberModel());
		starThreshold3.setModel(new SpinnerNumberModel());

		undo = new JButton("Undo");
		redo = new JButton("Redo");
		clearLevel = new JButton("Clear Level");
		clearLevel.addActionListener(new ClearLevelController(this));
		invertLevel = new JButton("Invert Level");
		invertLevel.addActionListener(new InvertLevelController(this));
		previewLevel = new JButton("Preview Level");
		previewLevel.addActionListener(new PreviewController(this));

		saveLevel = new JButton("Save Level");
		saveLevel.addActionListener(new SaveLevelController(this));
		
		buttArray = new JButton[9][9];
	}

	public String getLevelName() {
		return nameTextField.getText();
	}

	public ArrayList<Integer> getTileFrequencies() {
		ArrayList<Integer> bars = new ArrayList<Integer>();
		bars.add(frequency1.getValue());
		bars.add(frequency2.getValue());
		bars.add(frequency3.getValue());
		bars.add(frequency4.getValue());
		bars.add(frequency5.getValue());
		bars.add(frequency6.getValue());

		return bars;
	}

	public ArrayList<Integer> getMultiplierFrequencies() {
		ArrayList<Integer> sliders = new ArrayList<Integer>();
		sliders.add(xFrequency1.getValue());
		sliders.add(xFrequency2.getValue());
		sliders.add(xFrequency3.getValue());

		return sliders;
	}

	public ArrayList<Integer> getRules() {
		ArrayList<Integer> rules = new ArrayList<Integer>();
		rules.add((Integer) numMoves.getValue());
		rules.add((Integer) maxTime.getValue());
		rules.add((Integer) removeTile.getValue());
		rules.add((Integer) reshuffle.getValue());
		rules.add((Integer) swap.getValue());

		return rules;
	}

	public ArrayList<Integer> getStarThresholds() {
		ArrayList<Integer> stars = new ArrayList<Integer>();
		stars.add((Integer) starThreshold1.getValue());
		stars.add((Integer) starThreshold2.getValue());
		stars.add((Integer) starThreshold3.getValue());

		return stars;
	}
	
	public JButton[][] getButtArray(){
		return buttArray;
	}

	public WholesomeLevelEditorScreen() {
		super("Sixes Wild Level Editor");

		init();
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuBar.add(saveLevel);
		menuBar.add(undo);
		menuBar.add(redo);
		menuBar.add(clearLevel);
		
		
		menuBar.add(invertLevel);
		menuBar.add(previewLevel);

		setSize(1300, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblLevelName = new JLabel("Level Name:");
		lblLevelName.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblLevelName.setBounds(12, 13, 121, 49);
		getContentPane().add(lblLevelName);

		nameTextField.setBounds(130, 29, 116, 22);
		getContentPane().add(nameTextField);
		nameTextField.setColumns(10);

		JLabel lblTileFrequency = new JLabel("Tile Frequency");
		lblTileFrequency
				.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		lblTileFrequency.setBounds(77, 111, 148, 49);
		getContentPane().add(lblTileFrequency);

		JLabel label = new JLabel(
				"1:  0                                                             100");
		label.setBounds(36, 164, 254, 16);
		getContentPane().add(label);

		frequency1.setBounds(60, 164, 200, 23);
		getContentPane().add(frequency1);

		JLabel label_1 = new JLabel(
				"2:  0                                                             100");
		label_1.setBounds(36, 193, 254, 16);
		getContentPane().add(label_1);

		frequency2.setBounds(60, 193, 200, 23);
		getContentPane().add(frequency2);

		JLabel label_2 = new JLabel(
				"3:  0                                                             100");
		label_2.setBounds(36, 220, 254, 16);
		getContentPane().add(label_2);

		frequency3.setBounds(60, 220, 200, 23);
		getContentPane().add(frequency3);

		JLabel label_3 = new JLabel(
				"4:  0                                                             100");
		label_3.setBounds(36, 249, 254, 16);
		getContentPane().add(label_3);

		frequency4.setBounds(60, 249, 200, 23);
		getContentPane().add(frequency4);

		JLabel label_4 = new JLabel(
				"5:  0                                                             100");
		label_4.setBounds(36, 278, 254, 16);
		getContentPane().add(label_4);

		frequency5.setBounds(60, 278, 200, 23);
		getContentPane().add(frequency5);

		JLabel label_5 = new JLabel(
				"6:  0                                                             100");
		label_5.setBounds(36, 307, 254, 16);
		getContentPane().add(label_5);

		frequency6.setBounds(60, 303, 200, 23);
		getContentPane().add(frequency6);

		JLabel lblScoreThresholds = new JLabel("Score Thresholds");
		lblScoreThresholds.setFont(new Font("Old English Text MT", Font.PLAIN,
				21));
		lblScoreThresholds.setBounds(77, 399, 148, 49);
		getContentPane().add(lblScoreThresholds);

		JLabel lblMultiplierFrequency = new JLabel("Multiplier Frequency");
		lblMultiplierFrequency.setFont(new Font("Old English Text MT",
				Font.PLAIN, 21));
		lblMultiplierFrequency.setBounds(461, 111, 200, 49);
		getContentPane().add(lblMultiplierFrequency);

		JLabel lblRules = new JLabel("Rules");
		lblRules.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		lblRules.setBounds(513, 293, 148, 49);
		getContentPane().add(lblRules);

		JLabel lblStar = new JLabel("1 Star:");
		lblStar.setBounds(36, 461, 56, 16);
		getContentPane().add(lblStar);

		JLabel lblStar_1 = new JLabel("2 Stars:");
		lblStar_1.setBounds(36, 518, 56, 16);
		getContentPane().add(lblStar_1);

		JLabel lblStars = new JLabel("3 Stars:");
		lblStars.setBounds(36, 572, 56, 16);
		getContentPane().add(lblStars);

		JLabel label_6 = new JLabel(
				"1:  0                                                             100");
		label_6.setBounds(415, 164, 254, 16);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel(
				"2:  0                                                             100");
		label_7.setBounds(415, 193, 254, 16);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel(
				"3:  0                                                             100");
		label_8.setBounds(415, 220, 254, 16);
		getContentPane().add(label_8);

		xFrequency1.setBounds(439, 164, 200, 23);
		getContentPane().add(xFrequency1);

		xFrequency2.setBounds(439, 193, 200, 23);
		getContentPane().add(xFrequency2);

		xFrequency3.setBounds(439, 220, 200, 23);
		getContentPane().add(xFrequency3);

		JLabel lblNumberOfMoves = new JLabel("Number of Moves:");
		lblNumberOfMoves.setBounds(393, 355, 116, 16);
		getContentPane().add(lblNumberOfMoves);

		JLabel lblMaximumTime = new JLabel("Maximum Time:");
		lblMaximumTime.setBounds(403, 409, 110, 16);
		getContentPane().add(lblMaximumTime);

		JLabel lblSpecialMoveRemove = new JLabel("Special Move: Remove Tile:");
		lblSpecialMoveRemove.setBounds(338, 466, 186, 16);
		getContentPane().add(lblSpecialMoveRemove);

		JLabel lblSpecialMoveReshuffle = new JLabel("Special Move: Reshuffle:");
		lblSpecialMoveReshuffle.setBounds(354, 519, 155, 16);
		getContentPane().add(lblSpecialMoveReshuffle);

		JLabel lblSpecialMoveSwap = new JLabel("Special Move: Swap:");
		lblSpecialMoveSwap.setBounds(375, 569, 134, 16);
		getContentPane().add(lblSpecialMoveSwap);

		starThreshold1.setBounds(91, 452, 134, 35);
		getContentPane().add(starThreshold1);

		starThreshold2.setBounds(91, 509, 134, 35);
		getContentPane().add(starThreshold2);

		starThreshold3.setBounds(91, 563, 134, 35);
		getContentPane().add(starThreshold3);

		numMoves.setBounds(505, 348, 134, 35);
		getContentPane().add(numMoves);

		maxTime.setBounds(505, 403, 134, 35);
		getContentPane().add(maxTime);

		removeTile.setBounds(505, 457, 134, 35);
		getContentPane().add(removeTile);

		reshuffle.setBounds(505, 510, 134, 35);
		getContentPane().add(reshuffle);

		swap.setBounds(505, 563, 134, 35);
		getContentPane().add(swap);
		
		JButton btnToggleOnOff = new JButton("Toggle Cells On/Off");
		btnToggleOnOff.addActionListener(new ToggleTypeController(Main.model, 0));
		btnToggleOnOff.setBounds(790, 572, 168, 49);
		getContentPane().add(btnToggleOnOff);
		
		JButton btnToggleRelease = new JButton("Toggle Release Cells");
		btnToggleRelease.addActionListener(new ToggleTypeController(Main.model, 1));
		btnToggleRelease.setBounds(996, 572, 168, 49);
		getContentPane().add(btnToggleRelease);
		
		JButton btnToggleSix = new JButton("Toggle Six Cells");
		btnToggleSix.addActionListener(new ToggleTypeController(Main.model, 2));
		btnToggleSix.setBounds(896, 634, 168, 49);
		getContentPane().add(btnToggleSix);
		
		// JButton b00 = new JButton("");
		// b00.setBounds(878, 99, 50, 50);
		// getContentPane().add(b00);

		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				buttArray[i][j] = new JButton("");
				buttArray[i][j].setBounds(900, 900, 40, 40);
				buttArray[i][j].setBounds(
						750 + (10 * j) + (j * buttArray[i][j].getWidth()), 100
								+ (10 * i) + (i * buttArray[i][j].getWidth()),
						50, 50);
				getContentPane().add(buttArray[i][j]);

				final JButton ahoy = buttArray[i][j];
				ahoy.setBackground(Color.GREEN);
				final int row = i;
				final int col = j;
				ahoy.addActionListener(new ToggleCellController(this, row, col));
			}
		}
	}

}
