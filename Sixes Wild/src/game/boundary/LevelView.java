package game.boundary;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Dimension;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.FlowLayout;

import net.miginfocom.swing.MigLayout;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.Window.Type;

import javax.swing.JProgressBar;

public class LevelView extends JFrame{
	public LevelView() {
		getContentPane().setLayout(null);
		add(new BoardView());
	}
}