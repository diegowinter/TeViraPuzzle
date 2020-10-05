package gui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class MainPanel extends JPanel {
	
	GamePanel gamePanel;
	DetailsAndSettingsPanel detailsAndSettingsPanel;

	public MainPanel() {
		this.setBounds(0, 0, 600, 400);
		this.setLayout(new BorderLayout(0, 0));
		
		gamePanel = new GamePanel();
		this.add(gamePanel, BorderLayout.CENTER);
		detailsAndSettingsPanel = new DetailsAndSettingsPanel();
		this.add(detailsAndSettingsPanel, BorderLayout.EAST);
		
		detailsAndSettingsPanel.setPreferredSize(new Dimension(200, 0));
	}

}
