package editor.boundary;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;

import editor.controller.LoadLevelController;
import editor.controller.SelectBuilderModeController;
import game.entities.EliminationLevel;
import game.entities.LightningLevel;
import game.entities.PuzzleLevel;
import game.entities.ReleaseLevel;
/**
 * 
 * @author Jake
 *
 * This is the screen that appears after the splash screen and before the level editor itself.
 * 
 * It allows the user to choose what type of level they want to make, and gives them the option 
 * to load in a level from file. As of writing this, the load option does nothing.
 */
public class LevelEditorIntro extends JFrame{
	
	public LevelEditorIntro() {
		super("Sixes Wild Level Editor");
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JButton loadLevelButton = new JButton("Load Level");
		loadLevelButton.addActionListener(new LoadLevelController(this));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(135)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(108)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(196)
							.addComponent(loadLevelButton, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(118, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(loadLevelButton)
					.addGap(175))
		);
		
		JLabel lblSixesWild = new JLabel("Sixes Wild");
		panel_1.add(lblSixesWild);
		lblSixesWild.setFont(new Font("Old English Text MT", Font.PLAIN, 31));
		
		JLabel lblLevelEditor = new JLabel("Level Editor");
		panel_1.add(lblLevelEditor);
		lblLevelEditor.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JMenuBar menuBar = new JMenuBar();
		//panel.add(menuBar);
		//add(menuBar);
		setJMenuBar(menuBar);
		
		JMenu mnCreateNewLevel = new JMenu("Create New Level");
		menuBar.add(mnCreateNewLevel);
	
		JMenuItem btnPuzzle = new JMenuItem("Puzzle");
		btnPuzzle.addActionListener(new SelectBuilderModeController(this, "Puzzle"));
		mnCreateNewLevel.add(btnPuzzle);
		
		JMenuItem btnElimination = new JMenuItem("Elimination");
		btnElimination.addActionListener(new SelectBuilderModeController(this, "Elimination"));
		mnCreateNewLevel.add(btnElimination);
		
		JMenuItem btnLightning = new JMenuItem("Lightning");
		btnLightning.addActionListener(new SelectBuilderModeController(this, "Lightning"));
		mnCreateNewLevel.add(btnLightning);
		
		JMenuItem btnRelease = new JMenuItem("Release");
		btnRelease.addActionListener(new SelectBuilderModeController(this, "Release"));
		mnCreateNewLevel.add(btnRelease);
		getContentPane().setLayout(groupLayout);
		
		setSize(500, 450);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
