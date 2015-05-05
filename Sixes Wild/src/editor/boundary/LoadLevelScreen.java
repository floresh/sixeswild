package editor.boundary;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.LayoutStyle.ComponentPlacement;

import editor.controller.LoadLevelController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoadLevelScreen extends JFrame {
	JComboBox<String> gameModeComboBox;
	JComboBox<String> levelNameComboBox;
	
	
	public LoadLevelScreen() {
		super("Load Specific Level");
		
		JLabel lblGameMode = new JLabel("Game Mode:");
		
		JLabel lblLevelName = new JLabel("Level Name:");
		
		gameModeComboBox = new JComboBox<String>();
		gameModeComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Puzzle", "Elimination", "Lightning", "Release"}));
		
		levelNameComboBox = new JComboBox<String>();
		levelNameComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6"}));

		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new LoadLevelController(this, (String) gameModeComboBox.getSelectedItem(), (String) levelNameComboBox.getSelectedItem()));
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(77, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGameMode)
						.addComponent(lblLevelName))
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnLoad)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(levelNameComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(gameModeComboBox, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
							.addGap(115))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(58, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(gameModeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGameMode))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLevelName)
						.addComponent(levelNameComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnLoad)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
