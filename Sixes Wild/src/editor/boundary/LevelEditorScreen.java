package editor.boundary;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Choice;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;


public class LevelEditorScreen extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	PreviewPanelView p;

	public LevelEditorScreen() {
		setTitle("Sixes Wild Level Editor");
		setResizable(false);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		
		JLabel lblNumberOfMoves = new JLabel("Number of Moves:");
		lblNumberOfMoves.setToolTipText("Number of Moves");
		
		JLabel lblMaximumTime = new JLabel("Maximum Time:");
		lblMaximumTime.setToolTipText("Maximum Time Limit");
		
		JLabel lblTileFrequency = new JLabel("Tile Frequency");
		lblTileFrequency.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		
		JLabel label = new JLabel("1:");
		
		JLabel label_1 = new JLabel("2:");
		
		JLabel label_2 = new JLabel("3:");
		
		JLabel label_3 = new JLabel("4:");
		
		JLabel label_4 = new JLabel("5:");
		
		JLabel label_5 = new JLabel("6:");
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setOrientation(JScrollBar.HORIZONTAL);
		
		JScrollBar scrollBar_3 = new JScrollBar();
		scrollBar_3.setOrientation(JScrollBar.HORIZONTAL);
		
		JScrollBar scrollBar_4 = new JScrollBar();
		scrollBar_4.setOrientation(JScrollBar.HORIZONTAL);
		
		JScrollBar scrollBar_5 = new JScrollBar();
		scrollBar_5.setOrientation(JScrollBar.HORIZONTAL);
		
		final JButton b00 = new JButton("");
		b00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				if(b00.getBackground() == Color.GREEN){
					b00.setBackground(Color.RED);
				}
				else{
					b00.setBackground(Color.GREEN);
				}
			}
		});
		
		b00.setForeground(Color.GREEN);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		
		JButton b10 = new JButton("");
		b10.setForeground(Color.GREEN);
		
		JButton b30 = new JButton("");
		b30.setForeground(Color.GREEN);
		
		JButton b20 = new JButton("");
		b20.setForeground(Color.GREEN);
		
		JButton b21 = new JButton("");
		b21.setForeground(Color.GREEN);
		
		JButton b31 = new JButton("");
		b31.setForeground(Color.GREEN);
		
		JButton b32 = new JButton("");
		b32.setForeground(Color.GREEN);
		
		JButton b22 = new JButton("");
		b22.setForeground(Color.GREEN);
		
		JButton b23 = new JButton("");
		b23.setForeground(Color.GREEN);
		
		JButton b33 = new JButton("");
		b33.setForeground(Color.GREEN);
		
		JButton b34 = new JButton("");
		b34.setForeground(Color.GREEN);
		
		JButton b24 = new JButton("");
		b24.setForeground(Color.GREEN);
		
		JButton b25 = new JButton("");
		b25.setForeground(Color.GREEN);
		
		JButton b35 = new JButton("");
		b35.setForeground(Color.GREEN);
		
		JButton b36 = new JButton("");
		b36.setForeground(Color.GREEN);
		
		JButton b26 = new JButton("");
		b26.setForeground(Color.GREEN);
		
		JButton b27 = new JButton("");
		b27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		b27.setForeground(Color.GREEN);
		
		JButton b37 = new JButton("");
		b37.setForeground(Color.GREEN);
		
		JButton b38 = new JButton("");
		b38.setForeground(Color.GREEN);
		
		JButton b28 = new JButton("");
		b28.setForeground(Color.GREEN);
		
		JButton b50 = new JButton("");
		b50.setForeground(Color.GREEN);
		
		JButton b40 = new JButton("");
		b40.setForeground(Color.GREEN);
		
		JButton b41 = new JButton("");
		b41.setForeground(Color.GREEN);
		
		JButton b51 = new JButton("");
		b51.setForeground(Color.GREEN);
		
		JButton b52 = new JButton("");
		b52.setForeground(Color.GREEN);
		
		JButton b42 = new JButton("");
		b42.setForeground(Color.GREEN);
		
		JButton b43 = new JButton("");
		b43.setForeground(Color.GREEN);
		
		JButton b53 = new JButton("");
		b53.setForeground(Color.GREEN);
		
		JButton b54 = new JButton("");
		b54.setForeground(Color.GREEN);
		
		JButton b44 = new JButton("");
		b44.setForeground(Color.GREEN);
		
		JButton b45 = new JButton("");
		b45.setForeground(Color.GREEN);
		
		JButton b55 = new JButton("");
		b55.setForeground(Color.GREEN);
		
		JButton b56 = new JButton("");
		b56.setForeground(Color.GREEN);
		
		JButton b46 = new JButton("");
		b46.setForeground(Color.GREEN);
		
		JButton b47 = new JButton("");
		b47.setForeground(Color.GREEN);
		
		JButton b57 = new JButton("");
		b57.setForeground(Color.GREEN);
		
		JButton b58 = new JButton("");
		b58.setForeground(Color.GREEN);
		
		JButton b48 = new JButton("");
		b48.setForeground(Color.GREEN);
		
		JButton b70 = new JButton("");
		b70.setForeground(Color.GREEN);
		
		JButton b60 = new JButton("");
		b60.setForeground(Color.GREEN);
		
		JButton b61 = new JButton("");
		b61.setForeground(Color.GREEN);
		
		JButton b71 = new JButton("");
		b71.setForeground(Color.GREEN);
		
		JButton b72 = new JButton("");
		b72.setForeground(Color.GREEN);
		
		JButton b62 = new JButton("");
		b62.setForeground(Color.GREEN);
		
		JButton b63 = new JButton("");
		b63.setForeground(Color.GREEN);
		
		JButton b73 = new JButton("");
		b73.setForeground(Color.GREEN);
		
		JButton b74 = new JButton("");
		b74.setForeground(Color.GREEN);
		
		JButton b64 = new JButton("");
		b64.setForeground(Color.GREEN);
		
		JButton b65 = new JButton("");
		b65.setForeground(Color.GREEN);
		
		JButton b75 = new JButton("");
		b75.setForeground(Color.GREEN);
		
		JButton b76 = new JButton("");
		b76.setForeground(Color.GREEN);
		
		JButton b66 = new JButton("");
		b66.setForeground(Color.GREEN);
		
		JButton b67 = new JButton("");
		b67.setForeground(Color.GREEN);
		
		JButton b77 = new JButton("");
		b77.setForeground(Color.GREEN);
		
		JButton b78 = new JButton("");
		b78.setForeground(Color.GREEN);
		
		JButton b68 = new JButton("");
		b68.setForeground(Color.GREEN);
		
		JButton b80 = new JButton("");
		b80.setForeground(Color.GREEN);
		
		JButton b81 = new JButton("");
		b81.setForeground(Color.GREEN);
		
		JButton b82 = new JButton("");
		b82.setForeground(Color.GREEN);
		
		JButton b83 = new JButton("");
		b83.setForeground(Color.GREEN);
		
		JButton b84 = new JButton("");
		b84.setForeground(Color.GREEN);
		
		JButton b85 = new JButton("");
		b85.setForeground(Color.GREEN);
		
		JButton b86 = new JButton("");
		b86.setForeground(Color.GREEN);
		
		JButton b87 = new JButton("");
		b87.setForeground(Color.GREEN);
		
		JButton b88 = new JButton("");
		b88.setForeground(Color.GREEN);
		
		JLabel lblScoreThresholds = new JLabel("Score Thresholds");
		lblScoreThresholds.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		
		JLabel lblStar = new JLabel("1 Star  ");
		
		JLabel lblStars = new JLabel("2 Stars");
		
		JLabel lblStars_1 = new JLabel("3 Stars");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		
		JLabel lblMultiplierFrequency = new JLabel("Multiplier Frequency");
		lblMultiplierFrequency.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		
		JLabel lblX = new JLabel("X1");
		
		JLabel lblX_1 = new JLabel("X2");
		
		JLabel lblX_2 = new JLabel("X3");
		
		JSlider slider = new JSlider();
		
		JSlider slider_1 = new JSlider();
		
		JSlider slider_2 = new JSlider();
		
		JLabel lblRules = new JLabel("Rules");
		lblRules.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		
		JLabel lblSpecialMoveRemove = new JLabel("Special Move: Remove Tile:");
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setColumns(10);
		
		JLabel lblSpecialMoveReshuffle = new JLabel("Special Move: Reshuffle:");
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setColumns(10);
		
		JLabel lblSpecialMoveSwap = new JLabel("Special Move: Swap:");
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		
		JButton b11 = new JButton("");
		b11.setForeground(Color.GREEN);
		
		JButton b12 = new JButton("");
		b12.setForeground(Color.GREEN);
		
		JButton b13 = new JButton("");
		b13.setForeground(Color.GREEN);
		
		JButton b14 = new JButton("");
		b14.setForeground(Color.GREEN);
		
		JButton b15 = new JButton("");
		b15.setForeground(Color.GREEN);
		
		JButton b16 = new JButton("");
		b16.setForeground(Color.GREEN);
		
		JButton b17 = new JButton("");
		b17.setForeground(Color.GREEN);
		
		JButton b18 = new JButton("");
		b18.setForeground(Color.GREEN);
		
		JButton b01 = new JButton("");
		b01.setForeground(Color.GREEN);
		
		JButton b02 = new JButton("");
		b02.setForeground(Color.GREEN);
		
		JButton b03 = new JButton("");
		b03.setForeground(Color.GREEN);
		
		JButton b04 = new JButton("");
		b04.setForeground(Color.GREEN);
		
		JButton b05 = new JButton("");
		b05.setForeground(Color.GREEN);
		
		JButton b06 = new JButton("");
		b06.setForeground(Color.GREEN);
		
		JButton b07 = new JButton("");
		b07.setForeground(Color.GREEN);
		
		JButton b08 = new JButton("");
		b08.setForeground(Color.GREEN);
		
		JButton btnEnabledisableCell = new JButton("Enable/Disable Cell");
		
		JButton btnRelease = new JButton("Release");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(105)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(label_1)
										.addComponent(label)
										.addComponent(label_5)
										.addComponent(label_4)
										.addComponent(label_3)
										.addComponent(label_2))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addComponent(scrollBar_5, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addComponent(scrollBar_4, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addComponent(scrollBar_3, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addComponent(scrollBar_1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
										.addComponent(scrollBar_2, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblStar)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblStars)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblStars_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(133)
							.addComponent(lblTileFrequency)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(172)
											.addComponent(lblMultiplierFrequency))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(141)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblX_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(slider_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblX)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblX_2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(slider_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
									.addGap(314)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(b20, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b21, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b22, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b23, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b24, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b25, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b26, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b27, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b28, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(b30, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b31, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b32, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b33, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b34, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b35, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b36, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b37, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b38, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(b60, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b61, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b62, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b63, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b64, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b65, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b66, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b67, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b68, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(b70, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b71, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b72, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b73, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b74, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b75, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b76, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b77, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b78, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(b40, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b41, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b42, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b43, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b44, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b45, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b46, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b47, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b48, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(b50, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b51, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b52, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b53, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b54, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b55, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b56, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b57, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b58, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
													.addComponent(btnRelease)
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(b80, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
														.addGap(7)
														.addComponent(b81, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
														.addGap(7)
														.addComponent(b82, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
														.addGap(7)
														.addComponent(b83, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
														.addGap(7)
														.addComponent(b84, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
														.addGap(7)
														.addComponent(b85, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
														.addGap(7)
														.addComponent(b86, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
												.addGap(7)
												.addComponent(b87, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addGap(7)
												.addComponent(b88, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(b10, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
												.addComponent(b00, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(b11, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b12, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b13, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b14, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b15, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b16, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b17, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b18, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(b01, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b02, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b03, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b04, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b05, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b06, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b07, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
													.addGap(7)
													.addComponent(b08, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))))
									.addContainerGap(192, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(82)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblSpecialMoveRemove)
												.addComponent(lblMaximumTime))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblRules)
												.addComponent(lblNumberOfMoves))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(370)
									.addComponent(btnEnabledisableCell)
									.addGap(574)))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(101)
								.addComponent(lblSpecialMoveReshuffle, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
								.addGap(1150)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(122)
							.addComponent(lblSpecialMoveSwap, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(127)
					.addComponent(lblScoreThresholds)
					.addContainerGap(1429, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(171)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTileFrequency)
								.addComponent(lblMultiplierFrequency))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(label)
									.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblX)))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollBar_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(slider_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblX_1)))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(scrollBar_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_2))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(slider_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblX_2)))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollBar_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollBar_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollBar_5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(80)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(b00, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b01, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b02, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b03, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b04, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b05, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b06, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b07, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b08, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(b10, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b11, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b12, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b13, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b14, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b15, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b16, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b17, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b18, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(b20, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b21, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b22, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b23, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b24, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b25, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b26, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b27, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b28, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(b30, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b31, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b32, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b33, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b34, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b35, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b36, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b37, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b38, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(b40, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b41, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b42, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b43, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b44, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b45, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b46, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b47, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b48, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(b50, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b51, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b52, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b53, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b54, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b55, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b56, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b57, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b58, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(b60, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b61, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b62, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b63, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b64, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b65, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b66, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b67, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b68, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(b70, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b71, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b72, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b73, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b74, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b75, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b76, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b77, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b78, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(b80, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b81, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b82, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b83, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b84, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b85, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b86, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b87, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(b88, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblScoreThresholds)
								.addComponent(lblRules))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblStar)
								.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNumberOfMoves)
								.addComponent(btnEnabledisableCell)
								.addComponent(btnRelease))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblStars)
								.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblStars_1)
								.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMaximumTime)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSpecialMoveRemove)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSpecialMoveReshuffle)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSpecialMoveSwap)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(182))
		);
		getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnSaveLevel = new JButton("Save Level");
		menuBar.add(btnSaveLevel);
		
		JButton btnUndo = new JButton("Undo");
		menuBar.add(btnUndo);
		
		JButton btnRedo = new JButton("Redo");
		menuBar.add(btnRedo);
		
		JButton btnClearLevel = new JButton("Clear Level");
		menuBar.add(btnClearLevel);
		
		JButton btnPreviewLevel = new JButton("Preview Level");
		btnPreviewLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p = new PreviewPanelView ();
				
			}
		});
		
		JButton btnCommitValues = new JButton("Commit Values");
		menuBar.add(btnCommitValues);
		menuBar.add(btnPreviewLevel);
		
		JButton btnCloseLevel = new JButton("Close Preview");
		btnCloseLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.dispose();
			}
		});
		menuBar.add(btnCloseLevel);
		setSize(1600, 900);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
