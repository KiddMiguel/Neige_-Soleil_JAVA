package view;

import java.awt.Color;

public class PanelProprietaire extends PanelPrincipal {

    public PanelProprietaire ()
    {
        super();
        this.titre.setText("Proprietaire");
        this.setBounds(500, 150, 800, 200);
        this.setBackground(new Color(232, 41, 41));
	    this.setLayout(null);
	    
	    this.titre.setBounds(70, 300, 100, 100);
	    
	    this.setVisible(false);
    }

}
