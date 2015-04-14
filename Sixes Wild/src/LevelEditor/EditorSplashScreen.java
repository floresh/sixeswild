package LevelEditor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Image;

import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class EditorSplashScreen extends JFrame{
	Image splash;
	
	public EditorSplashScreen() {
		setTitle("Sixes Wild Level Editor");
		setSize(500, 450);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("why god");
		
		JLabel lblIMeanYay = new JLabel("I mean yay Tarvos Group!");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(90)
							.addComponent(lblIMeanYay)))
					.addContainerGap(140, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblIMeanYay)
					.addContainerGap(94, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
		lblNewLabel.setIcon(new ImageIcon("C:\\users\\Jake\\Desktop\\D&D\\whale.png"));
		
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			
		}
		dispose();
		new LevelEditorIntro();
	}
}
