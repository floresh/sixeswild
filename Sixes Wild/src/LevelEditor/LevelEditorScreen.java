package LevelEditor;
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

//ok
public class LevelEditorScreen extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
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
		
		JButton button_8 = new JButton("");
		button_8.setForeground(Color.GREEN);
		
		JButton button_9 = new JButton("");
		button_9.setForeground(Color.GREEN);
		
		JButton button_10 = new JButton("");
		button_10.setForeground(Color.GREEN);
		
		JButton button_11 = new JButton("");
		button_11.setForeground(Color.GREEN);
		
		JButton button_12 = new JButton("");
		button_12.setForeground(Color.GREEN);
		
		JButton button_13 = new JButton("");
		button_13.setForeground(Color.GREEN);
		
		JButton button_14 = new JButton("");
		button_14.setForeground(Color.GREEN);
		
		JButton button_15 = new JButton("");
		button_15.setForeground(Color.GREEN);
		
		JButton button_16 = new JButton("");
		button_16.setForeground(Color.GREEN);
		
		JButton button_17 = new JButton("");
		button_17.setForeground(Color.GREEN);
		
		JButton button_18 = new JButton("");
		button_18.setForeground(Color.GREEN);
		
		JButton button_19 = new JButton("");
		button_19.setForeground(Color.GREEN);
		
		JButton button_20 = new JButton("");
		button_20.setForeground(Color.GREEN);
		
		JButton button_21 = new JButton("");
		button_21.setForeground(Color.GREEN);
		
		JButton button_22 = new JButton("");
		button_22.setForeground(Color.GREEN);
		
		JButton button_23 = new JButton("");
		button_23.setForeground(Color.GREEN);
		
		JButton button_24 = new JButton("");
		button_24.setForeground(Color.GREEN);
		
		JButton button_25 = new JButton("");
		button_25.setForeground(Color.GREEN);
		
		JButton button_26 = new JButton("");
		button_26.setForeground(Color.GREEN);
		
		JButton button_27 = new JButton("");
		button_27.setForeground(Color.GREEN);
		
		JButton button_28 = new JButton("");
		button_28.setForeground(Color.GREEN);
		
		JButton button_29 = new JButton("");
		button_29.setForeground(Color.GREEN);
		
		JButton button_30 = new JButton("");
		button_30.setForeground(Color.GREEN);
		
		JButton button_31 = new JButton("");
		button_31.setForeground(Color.GREEN);
		
		JButton button_32 = new JButton("");
		button_32.setForeground(Color.GREEN);
		
		JButton button_33 = new JButton("");
		button_33.setForeground(Color.GREEN);
		
		JButton button_34 = new JButton("");
		button_34.setForeground(Color.GREEN);
		
		JButton button_35 = new JButton("");
		button_35.setForeground(Color.GREEN);
		
		JButton button_36 = new JButton("");
		button_36.setForeground(Color.GREEN);
		
		JButton button_37 = new JButton("");
		button_37.setForeground(Color.GREEN);
		
		JButton button_38 = new JButton("");
		button_38.setForeground(Color.GREEN);
		
		JButton button_39 = new JButton("");
		button_39.setForeground(Color.GREEN);
		
		JButton button_40 = new JButton("");
		button_40.setForeground(Color.GREEN);
		
		JButton button_41 = new JButton("");
		button_41.setForeground(Color.GREEN);
		
		JButton button_42 = new JButton("");
		button_42.setForeground(Color.GREEN);
		
		JButton button_43 = new JButton("");
		button_43.setForeground(Color.GREEN);
		
		JButton button_44 = new JButton("");
		button_44.setForeground(Color.GREEN);
		
		JButton button_45 = new JButton("");
		button_45.setForeground(Color.GREEN);
		
		JButton button_46 = new JButton("");
		button_46.setForeground(Color.GREEN);
		
		JButton button_47 = new JButton("");
		button_47.setForeground(Color.GREEN);
		
		JButton button_48 = new JButton("");
		button_48.setForeground(Color.GREEN);
		
		JButton button_49 = new JButton("");
		button_49.setForeground(Color.GREEN);
		
		JButton button_50 = new JButton("");
		button_50.setForeground(Color.GREEN);
		
		JButton button_51 = new JButton("");
		button_51.setForeground(Color.GREEN);
		
		JButton button_52 = new JButton("");
		button_52.setForeground(Color.GREEN);
		
		JButton button_53 = new JButton("");
		button_53.setForeground(Color.GREEN);
		
		JButton button_54 = new JButton("");
		button_54.setForeground(Color.GREEN);
		
		JButton button_55 = new JButton("");
		button_55.setForeground(Color.GREEN);
		
		JButton button_56 = new JButton("");
		button_56.setForeground(Color.GREEN);
		
		JButton button_57 = new JButton("");
		button_57.setForeground(Color.GREEN);
		
		JButton button_58 = new JButton("");
		button_58.setForeground(Color.GREEN);
		
		JButton button_59 = new JButton("");
		button_59.setForeground(Color.GREEN);
		
		JButton button_60 = new JButton("");
		button_60.setForeground(Color.GREEN);
		
		JButton button_61 = new JButton("");
		button_61.setForeground(Color.GREEN);
		
		JButton button_62 = new JButton("");
		button_62.setForeground(Color.GREEN);
		
		JButton button_63 = new JButton("");
		button_63.setForeground(Color.GREEN);
		
		JButton button_64 = new JButton("");
		button_64.setForeground(Color.GREEN);
		
		JButton button_65 = new JButton("");
		button_65.setForeground(Color.GREEN);
		
		JButton button_66 = new JButton("");
		button_66.setForeground(Color.GREEN);
		
		JButton button_67 = new JButton("");
		button_67.setForeground(Color.GREEN);
		
		JButton button_68 = new JButton("");
		button_68.setForeground(Color.GREEN);
		
		JButton button_69 = new JButton("");
		button_69.setForeground(Color.GREEN);
		
		JButton button_70 = new JButton("");
		button_70.setForeground(Color.GREEN);
		
		JButton button_71 = new JButton("");
		button_71.setForeground(Color.GREEN);
		
		JButton button_72 = new JButton("");
		button_72.setForeground(Color.GREEN);
		
		JButton button_73 = new JButton("");
		button_73.setForeground(Color.GREEN);
		
		JButton button_74 = new JButton("");
		button_74.setForeground(Color.GREEN);
		
		JButton button_75 = new JButton("");
		button_75.setForeground(Color.GREEN);
		
		JButton button_76 = new JButton("");
		button_76.setForeground(Color.GREEN);
		
		JButton button_77 = new JButton("");
		button_77.setForeground(Color.GREEN);
		
		JButton button_78 = new JButton("");
		button_78.setForeground(Color.GREEN);
		
		JButton button_79 = new JButton("");
		button_79.setForeground(Color.GREEN);
		
		JLabel lblScoreThresholds = new JLabel("Score Thresholds");
		lblScoreThresholds.setFont(new Font("Old English Text MT", Font.PLAIN, 21));
		
		JLabel lblStar = new JLabel("1 Star  ");
		
		JLabel lblStars = new JLabel("2 Stars");
		
		JLabel lblStars_1 = new JLabel("3 Stars");
		
		JButton button = new JButton("");
		button.setForeground(Color.GREEN);
		
		JButton button_1 = new JButton("");
		button_1.setForeground(Color.GREEN);
		
		JButton button_2 = new JButton("");
		button_2.setForeground(Color.GREEN);
		
		JButton button_3 = new JButton("");
		button_3.setForeground(Color.GREEN);
		
		JButton button_4 = new JButton("");
		button_4.setForeground(Color.GREEN);
		
		JButton button_5 = new JButton("");
		button_5.setForeground(Color.GREEN);
		
		JButton button_6 = new JButton("");
		button_6.setForeground(Color.GREEN);
		
		JButton button_7 = new JButton("");
		button_7.setForeground(Color.GREEN);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(54)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNumberOfMoves)
								.addComponent(lblMaximumTime))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
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
					.addPreferredGap(ComponentPlacement.RELATED, 676, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_19, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_22, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_23, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_26, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_27, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_30, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_31, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_34, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button_17, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_20, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_21, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_24, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_25, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_28, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_29, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_32, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_33, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(button_54, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_55, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_58, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_59, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_62, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_63, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_66, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_67, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_70, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(button_53, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_56, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_57, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_60, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_61, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_64, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_65, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_68, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_69, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(button_36, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_37, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_40, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_41, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_44, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_45, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_48, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_49, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_52, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(button_35, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_38, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_39, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_42, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_43, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_46, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_47, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_50, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(7)
										.addComponent(button_51, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button_71, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_72, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_73, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_74, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_75, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_76, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_77, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_78, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_79, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(194, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(b00, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addGap(7)
									.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
							.addGap(192))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(127)
					.addComponent(lblScoreThresholds)
					.addContainerGap(1319, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(96)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNumberOfMoves))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMaximumTime))
							.addGap(24)
							.addComponent(lblTileFrequency)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label)
								.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollBar_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollBar_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2))
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
								.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_19, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_22, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_23, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_26, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_27, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_30, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_31, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_34, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_17, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_20, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_21, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_24, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_25, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_28, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_29, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_32, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_33, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_36, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_37, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_40, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_41, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_44, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_45, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_48, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_49, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_52, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_35, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_38, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_39, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_42, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_43, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_46, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_47, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_50, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_51, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_54, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_55, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_58, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_59, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_62, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_63, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_66, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_67, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_70, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_53, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_56, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_57, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_60, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_61, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_64, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_65, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_68, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_69, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_71, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_72, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_73, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_74, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_75, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_76, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_77, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_78, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_79, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))))
					.addGap(20)
					.addComponent(lblScoreThresholds)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStar)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStars)
						.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStars_1)
						.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(216, Short.MAX_VALUE))
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
		menuBar.add(btnPreviewLevel);
		
		JButton btnCloseLevel = new JButton("Close Level");
		btnCloseLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
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
