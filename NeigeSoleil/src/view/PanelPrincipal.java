package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
	
	protected JLabel titre = new JLabel("");
	protected JButton btAjout = new JButton("Ajouter");
	protected JPanel panelForm = new JPanel();

	public PanelPrincipal(){
	    this.setBounds(240, 150, 1300, 800);
	    this.setLayout(null);
	    this.titre.setBounds(20, 5, 300, 50);
        this.titre.setFont(new Font("Serif", Font.BOLD, 20));
        this.titre.setForeground(new Color(59, 125, 221)); //blue
		this.add(this.titre);

	    
		this.panelForm.setVisible(false);
		
	    
	}
	

}
