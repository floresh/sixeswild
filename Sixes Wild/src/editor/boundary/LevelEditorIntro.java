package editor.boundary;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//ok
public class LevelEditorIntro extends JFrame{
	public LevelEditorIntro() {
		setTitle("Sixes Wild Level Editor");
			
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JButton btnLoadLevel = new JButton("Load Level");
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
							.addComponent(btnLoadLevel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
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
					.addComponent(btnLoadLevel)
					.addGap(175))
		);
		
		JLabel lblSixesWild = new JLabel("Sixes Wild");
		panel_1.add(lblSixesWild);
		lblSixesWild.setFont(new Font("Old English Text MT", Font.PLAIN, 31));
		
		JLabel lblLevelEditor = new JLabel("Level Editor");
		panel_1.add(lblLevelEditor);
		lblLevelEditor.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);
		
		JMenu mnCreateNewLevel = new JMenu("Create New Level");
		menuBar.add(mnCreateNewLevel);
		
		JButton btnPuzzle = new JButton("Puzzle");
		btnPuzzle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new LevelEditorScreen();
				dispose();
			}
		});
		mnCreateNewLevel.add(btnPuzzle);
		
		JButton btnElimination = new JButton("Elimination");
		btnElimination.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LevelEditorScreen();
				dispose();
			}
		});
		mnCreateNewLevel.add(btnElimination);
		
		JButton btnLightning = new JButton("Lightning");
		btnLightning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LevelEditorScreen();
				dispose();
			}
		});
		mnCreateNewLevel.add(btnLightning);
		
		JButton btnRelease = new JButton("Release");
		btnRelease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LevelEditorScreen();
				dispose();
			}
		});
		mnCreateNewLevel.add(btnRelease);
		getContentPane().setLayout(groupLayout);
		
		setSize(500, 450);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
