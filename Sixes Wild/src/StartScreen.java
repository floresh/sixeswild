import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartScreen extends JFrame{
	private JTextField txtWildWhales;
	public StartScreen() {
	//None shall pass	
		JButton btnNewButton_1 = new JButton("Play");
		
		txtWildWhales = new JTextField();
		txtWildWhales.setFont(new Font("Gisha", Font.PLAIN, 30));
		txtWildWhales.setHorizontalAlignment(SwingConstants.CENTER);
		txtWildWhales.setText("Sixes Wild");
		txtWildWhales.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(71)
							.addComponent(txtWildWhales, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(184)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(txtWildWhales, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addGap(126))
		);
		getContentPane().setLayout(groupLayout);
	}
	//Continue
}
