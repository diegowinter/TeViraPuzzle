package gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetailsAndSettingsPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public DetailsAndSettingsPanel() {
		setBackground(Color.DARK_GRAY);
		this.setBounds(0, 0, 200, 400);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btnNewButton);
	}

}
