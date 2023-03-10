package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
	
	protected JLabel titre = new JLabel("Mon profil");
	protected JButton btAjout = new JButton("Ajouter");
	
	public PanelPrincipal(){
	    this.setBounds(50, 80, 550, 200);
	    this.setLayout(null);
	    this.btAjout.setBounds(50, 200, 50, 50);
	    this.add(btAjout);
	    
	    
	    this.setVisible(false);
		
	    
	}
	

}
