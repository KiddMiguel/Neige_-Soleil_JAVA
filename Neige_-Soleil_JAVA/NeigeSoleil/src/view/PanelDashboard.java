package view;

import java.awt.Color;
import java.awt.GridLayout;

public class PanelDashboard extends PanelPrincipal{

	public PanelDashboard() {
		// TODO Auto-generated constructor stub
		super();
        this.titre.setText("Dashboard");

        
		this.panelForm.setBounds(935, 20, 300, 580);
		this.panelForm.setBackground(new Color (142, 197, 243));
		this.panelForm.setLayout(new GridLayout(32,20));
		
	    this.add(panelForm);
	    this.panelForm.setVisible(false);

		
	}

}
