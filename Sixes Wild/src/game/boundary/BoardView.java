package game.boundary;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class BoardView extends JPanel{
	public BoardView() {
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 600, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 600, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
		final JLabel[][] labelArr = new JLabel[9][9];
		 
		// JLabel label = new JLabel("New label");
		// label.setBounds(30, 30, 50, 50);
		// add(label);
		for(int i = 0; i<=8;i++){
			for(int j =0; j<=8;j++){
				labelArr[i][j] = new JLabel("");
				labelArr[i][j].setBounds(600,600,50,50);
				labelArr[i][j].setBounds(30+(10*i)+(i*labelArr[i][j].getWidth()),30+(10*j)+(j*labelArr[i][j].getWidth()), 50,50);
				add(labelArr[i][j]);
			}
	}
	}
}
