package view;

import java.awt.Color;

public class PanelAppartement extends PanelPrincipal {

	public PanelAppartement() {
        super();
        this.titre.setText("Appartements");
        this.setBounds(15, 200, 1500, 800);
        this.setBackground(new Color(41, 209, 232));
	    this.setLayout(null);
	    
	    
	    
	    this.setVisible(false);
	}
}
