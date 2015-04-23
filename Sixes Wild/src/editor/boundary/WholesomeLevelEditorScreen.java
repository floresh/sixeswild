package editor.boundary;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JSlider;

public class WholesomeLevelEditorScreen extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	public WholesomeLevelEditorScreen() {
		setTitle("Sixes Wild Level Editor");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("Save Level");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Undo");
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Redo");
		menuBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear Level");
		menuBar.add(btnNewButton_3);
		
		JButton btnPreviewLevel = new JButton("Preview Level");
		btnPreviewLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PreviewPanelView();
			}
		});
		menuBar.add(btnPreviewLevel);
		setSize(1600, 900);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblLevelName = new JLabel("Level Name:");
		lblLevelName.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		lblLevelName.setBounds(12, 13, 121, 49);
		getContentPane().add(lblLevelName);
		
		textField = new JTextField();
		textField.setBounds(130, 29, 116, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTileFrequency = new JLabel("Tile Frequency");
		lblTileFrequency.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		lblTileFrequency.setBounds(77, 111, 148, 49);
		getContentPane().add(lblTileFrequency);
		
		JLabel label = new JLabel("1:  0                                                             100");
		label.setBounds(36, 164, 254, 16);
		getContentPane().add(label);
		
		JSlider slider = new JSlider();
		slider.setBounds(60, 164, 200, 23);
		getContentPane().add(slider);
		
		JLabel label_1 = new JLabel("2:  0                                                             100");
		label_1.setBounds(36, 193, 254, 16);
		getContentPane().add(label_1);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBounds(60, 193, 200, 23);
		getContentPane().add(slider_1);
		
		JLabel label_2 = new JLabel("3:  0                                                             100");
		label_2.setBounds(36, 220, 254, 16);
		getContentPane().add(label_2);
		
		JSlider slider_2 = new JSlider();
		slider_2.setBounds(60, 220, 200, 23);
		getContentPane().add(slider_2);
		
		JLabel label_3 = new JLabel("4:  0                                                             100");
		label_3.setBounds(36, 249, 254, 16);
		getContentPane().add(label_3);
		
		JSlider slider_3 = new JSlider();
		slider_3.setBounds(60, 249, 200, 23);
		getContentPane().add(slider_3);
		
		JLabel label_4 = new JLabel("5:  0                                                             100");
		label_4.setBounds(36, 278, 254, 16);
		getContentPane().add(label_4);
		
		JSlider slider_4 = new JSlider();
		slider_4.setBounds(60, 278, 200, 23);
		getContentPane().add(slider_4);
		
		JLabel label_5 = new JLabel("6:  0                                                             100");
		label_5.setBounds(36, 307, 254, 16);
		getContentPane().add(label_5);
		
		JSlider slider_5 = new JSlider();
		slider_5.setBounds(60, 303, 200, 23);
		getContentPane().add(slider_5);
		
		JLabel lblScoreThresholds = new JLabel("Score Thresholds");
		lblScoreThresholds.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		lblScoreThresholds.setBounds(77, 399, 148, 49);
		getContentPane().add(lblScoreThresholds);
		
		JLabel lblMultiplierFrequency = new JLabel("Multiplier Frequency");
		lblMultiplierFrequency.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		lblMultiplierFrequency.setBounds(461, 111, 200, 49);
		getContentPane().add(lblMultiplierFrequency);
		
		JLabel lblRules = new JLabel("Rules");
		lblRules.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		lblRules.setBounds(513, 399, 148, 49);
		getContentPane().add(lblRules);
		
		JLabel lblStar = new JLabel("1 Star:");
		lblStar.setBounds(36, 461, 56, 16);
		getContentPane().add(lblStar);
		
		JLabel lblStar_1 = new JLabel("2 Stars:");
		lblStar_1.setBounds(36, 507, 56, 16);
		getContentPane().add(lblStar_1);
		
		JLabel lblStars = new JLabel("3 Stars:");
		lblStars.setBounds(36, 556, 56, 16);
		getContentPane().add(lblStars);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 461, 116, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 504, 116, 22);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(109, 553, 116, 22);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_6 = new JLabel("1:  0                                                             100");
		label_6.setBounds(415, 164, 254, 16);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("2:  0                                                             100");
		label_7.setBounds(415, 193, 254, 16);
		getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("3:  0                                                             100");
		label_8.setBounds(415, 220, 254, 16);
		getContentPane().add(label_8);
		
		JSlider slider_6 = new JSlider();
		slider_6.setBounds(439, 164, 200, 23);
		getContentPane().add(slider_6);
		
		JSlider slider_7 = new JSlider();
		slider_7.setBounds(439, 193, 200, 23);
		getContentPane().add(slider_7);
		
		JSlider slider_8 = new JSlider();
		slider_8.setBounds(439, 220, 200, 23);
		getContentPane().add(slider_8);
		
		JLabel lblNumberOfMoves = new JLabel("Number of Moves:");
		lblNumberOfMoves.setBounds(393, 461, 116, 16);
		getContentPane().add(lblNumberOfMoves);
		
		textField_4 = new JTextField();
		textField_4.setBounds(512, 458, 116, 22);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblMaximumTime = new JLabel("Maximum Time:");
		lblMaximumTime.setBounds(403, 492, 110, 16);
		getContentPane().add(lblMaximumTime);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(513, 489, 116, 22);
		getContentPane().add(textField_5);
		
		JLabel lblSpecialMoveRemove = new JLabel("Special Move: Remove Tile:");
		lblSpecialMoveRemove.setBounds(338, 521, 186, 16);
		getContentPane().add(lblSpecialMoveRemove);
		
		JLabel lblSpecialMoveReshuffle = new JLabel("Special Move: Reshuffle:");
		lblSpecialMoveReshuffle.setBounds(354, 553, 155, 16);
		getContentPane().add(lblSpecialMoveReshuffle);
		
		JLabel lblSpecialMoveSwap = new JLabel("Special Move: Swap:");
		lblSpecialMoveSwap.setBounds(375, 582, 134, 16);
		getContentPane().add(lblSpecialMoveSwap);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(512, 521, 116, 22);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(512, 550, 116, 22);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(512, 579, 116, 22);
		getContentPane().add(textField_8);
		
		final JButton[][] buttArray = new JButton[9][9];
		//JButton b00 = new JButton("");
		//b00.setBounds(878, 99, 50, 50);
		//getContentPane().add(b00);
		
		for(int i = 0; i<=8;i++){
			for(int j =0; j<=8;j++){
				buttArray[i][j] = new JButton("");
				buttArray[i][j].setBounds(900,900,50,50);
				buttArray[i][j].setBounds(878+(10*i)+(i*buttArray[i][j].getWidth()),99+(10*j)+(j*buttArray[i][j].getWidth()), 50,50);
				getContentPane().add(buttArray[i][j]);
				
				final JButton ahoy = buttArray[i][j];
				ahoy.setBackground(Color.GREEN);
				ahoy.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {	
						if(ahoy.getBackground() == Color.GREEN){
							ahoy.setBackground(Color.RED);
						}
						else{
							ahoy.setBackground(Color.GREEN);
						}
					}
				});
			}
		}
	}
}
