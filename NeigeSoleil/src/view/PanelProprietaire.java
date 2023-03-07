package view;

import java.awt.Color;

public class PanelProprietaire extends PanelPrincipal {

    public PanelProprietaire ()
    {
        super();
        this.titre.setText("Proprietaire");
        this.setBounds(15, 70, 1500, 800);
        this.setBackground(new Color(232, 41, 41));
	    this.setLayout(null);
	    
	    this.titre.setBounds(70, 300, 100, 100);
	    
	    this.setVisible(false);
    }

}
