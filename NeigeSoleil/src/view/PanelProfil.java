package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.Admin;

public class PanelProfil extends PanelPrincipal{
	JPanel panelForm = new JPanel();
	
	//variables
	private JTextField txtNom = new JTextField(); 
	private JTextField txtPrenom = new JTextField(); 
	private JTextField txtEmail = new JTextField();
	private JPasswordField txtMdp = new JPasswordField(); 
	


	private JTextArea txtInfos = new JTextArea(); 


	public PanelProfil() {
        super();
        this.titre.setText("Profil");
	    this.setLayout(null);
	    
	    
	    this.panelForm.setVisible(false);
	    


	    
	}


}
