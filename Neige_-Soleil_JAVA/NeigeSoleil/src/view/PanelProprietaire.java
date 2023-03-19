package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelProprietaire extends PanelPrincipal {
	
	private JPanel panelForm = new JPanel();
	
	//variable
	private JTextField Txt_nom_Proprio = new JTextField();
	private JTextField Txt_prenom_proprio = new JTextField();
	private JTextField Txt_statut_proprio = new JTextField();
	private JTextField Txt_email_proprio = new JTextField();
	private JTextField Txt_mdp_proprio = new JTextField();
	private JTextField Txt_tel_proprio  = new JTextField();
	private JTextField Txt_adresse_proprio = new JTextField();
	private JTextField Txt_cp_proprio = new JTextField();
	private JTextField Txt_ville_proprio = new JTextField();
	private JTextField Txt_pays_proprio = new JTextField();
	private JTextField Txt_code_adherent = new JTextField();
	
	
	// Variable listes d�roulant 
	private JComboBox<String> id_user = new JComboBox<String>();
	private JComboBox<String> id_contrat = new JComboBox<String>();
	private JComboBox<String> id_appart = new JComboBox<String>();
	private JComboBox<String> civilite_proprio = new JComboBox<String>();
	
	private JButton btAjout = new JButton("Ajout");
	private JButton btAnnuler = new JButton ("Annuler");
	
    public PanelProprietaire ()
    {
        super();
        this.titre.setText("Proprietaire");
        
        this.panelForm.setBounds(930, 20, 300, 580);
        this.panelForm.setBackground(new Color(142, 197, 243));
        this.panelForm.setLayout(new GridLayout(31,1));
        
        this.panelForm.add(new JLabel ("Sexe"));
		this.panelForm.add(this.civilite_proprio);
       
        this.panelForm.add(new JLabel ("Nom"));
        this.panelForm.add(this.Txt_nom_Proprio);
        
        this.panelForm.add(new JLabel ("Prenom"));
        this.panelForm.add(this.Txt_prenom_proprio); 
        
        this.panelForm.add(new JLabel ("Statut"));
        this.panelForm.add(this.Txt_statut_proprio);
        
        this.panelForm.add(new JLabel ("Email"));
        this.panelForm.add(this.Txt_email_proprio);
        
        this.panelForm.add(new JLabel ("Mot de passe"));
        this.panelForm.add(this.Txt_mdp_proprio);
        
        this.panelForm.add(new JLabel ("Numero de t�l�phone"));
        this.panelForm.add(this.Txt_tel_proprio);
        
        this.panelForm.add(new JLabel ("Adresse"));
        this.panelForm.add (this.Txt_adresse_proprio);
        
        this.panelForm.add(new JLabel ("Code postale"));
        this.panelForm.add(this.Txt_cp_proprio);
        
        this.panelForm.add(new JLabel ("Ville"));
        this.panelForm.add(this.Txt_ville_proprio);
        
        this.panelForm.add(new JLabel ("Pays"));
        this.panelForm.add(this.Txt_pays_proprio);
        
        this.panelForm.add(new JLabel ("Adherent"));
        this.panelForm.add(this.Txt_code_adherent);
        
        
        this.panelForm.add(new JLabel ("Contrat"));
		this.panelForm.add(this.id_contrat);
		this.panelForm.add(new JLabel ("Appartement"));
		this.panelForm.add(this.id_appart);
		
		
		
	    this.setLayout(null);
	    
	    this.add(panelForm);

	    this.setVisible(false);
    }

}
