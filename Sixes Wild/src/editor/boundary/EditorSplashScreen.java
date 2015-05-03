package editor.boundary;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Image;

import javax.swing.JLabel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

/**
 * 
 * @author Jake
 *
 * This is the frame that holds the splashscreen for the level editor. It lasts about 1 second, then instantiates
 * a levelEditorIntro jframe.
 */
public class EditorSplashScreen extends JFrame{
	/** The splash screen image with the group names and a cool moon.  */
	Image splash;
	
	public EditorSplashScreen() {
		
		setTitle("Sixes Wild Level Editor");
		setSize(800, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addContainerGap(450, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addContainerGap(408, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		

		lblNewLabel.setIcon(new ImageIcon("src\\images\\splash.jpg"));

		//Allows the screen to stay on 1 second, then closes and opens the next screen. 
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			
		}
		dispose();
		new LevelEditorIntro();
	}
}
