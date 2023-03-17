package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelLocataire extends PanelPrincipal{
	
	private JPanel panelForm = new JPanel();
	
	String[] choix = {"MR", "MMe", "Autres"};
	
	// variables
	private JComboBox<String>civilite_locataire = new JComboBox<String>(choix);
	private JTextField nom_locataire = new JTextField();
	private JTextField prenom_locataire = new JTextField();
	private JTextField email_locataire = new JTextField();
	private JTextField mdp_locataire = new JTextField();
	private JTextField tel_locataire = new JTextField();
	private JTextField adresse_locataire = new JTextField();
	private JTextField cp_locataire = new JTextField();
	private JTextField nb_reservation = new JTextField();
	

	
	//Variables vides
	
	
	// Variables Listes deroulantes
	private JComboBox<String>cbx_id_appart = new JComboBox<String>();
	private JComboBox<String>cbx_id_proprietaire = new JComboBox<String>();
	private JComboBox<String>cbx_id_user = new JComboBox<String>();
	
	//Bouttons
	private JButton btAjouter = new JButton("Ajouter");
	private JButton btAnnuler = new JButton("Annuler");

	public PanelLocataire() {
		 super();
	        this.titre.setText("Appartements");

	        
			this.panelForm.setBounds(935, 20, 300, 580);
			this.panelForm.setBackground(new Color (142, 197, 243));
			this.panelForm.setLayout(new GridLayout(28,1));
			
			//Affichage des inputs et des texts 
		    this.panelForm.add(new JLabel("civilité"));
			this.panelForm.add(this.civilite_locataire); 
			
		    this.panelForm.add(new JLabel("nom"));
			this.panelForm.add(this.nom_locataire); 
			
		    this.panelForm.add(new JLabel("prenom"));
			this.panelForm.add(this.prenom_locataire); 
			
		    this.panelForm.add(new JLabel("email"));
			this.panelForm.add(this.email_locataire); 
			
		    this.panelForm.add(new JLabel("mdp"));
			this.panelForm.add(this.mdp_locataire); 	
			
		    this.panelForm.add(new JLabel("tel"));
			this.panelForm.add(this.tel_locataire); 
			
		    this.panelForm.add(new JLabel("adresse"));
			this.panelForm.add(this.adresse_locataire); 
			
		    this.panelForm.add(new JLabel("cp"));
			this.panelForm.add(this.cp_locataire); 
 
			this.panelForm.add(new JLabel("Appartement"));
			this.panelForm.add(this.cbx_id_appart);
			this.panelForm.add(new JLabel("Proprietaire"));
			this.panelForm.add(this.cbx_id_proprietaire);
			this.panelForm.add(new JLabel("utilisateur"));
			this.panelForm.add(this.cbx_id_user);
			
			this.panelForm.add(new JLabel(""));
	        this.btAnnuler.setBounds(935, 532, 300, 30);
	        this.add(this.btAnnuler);
	        
	        this.btAjouter.setBounds(935, 568, 300, 30);
	        this.add(this.btAjouter);
			
			
		    this.add(panelForm);
		    
		    this.setVisible(false);
		}
	}