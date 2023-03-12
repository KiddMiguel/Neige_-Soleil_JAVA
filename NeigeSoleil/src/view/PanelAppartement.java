package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAppartement extends PanelPrincipal {
	
	private JPanel panelForm = new JPanel();
	
	// variables
	String[] choix_statut = {"Disponible", "En location"};
	private JComboBox <String>cbx_statut_appart = new JComboBox<String>(choix_statut);
	
	private JTextField txt_prix_appart = new JTextField();
	private JTextField txt_intitule_appart = new JTextField();
	private JTextField txt_ville_appart = new JTextField();
	private JTextField txt_cp_appart = new JTextField();
	private JTextField txt_adresse_appart = new JTextField();
	private JTextField txt_description_appart = new JTextField();
	
	String[] choix_type_appart = {"Appartement", "Maison","Chalet", "Studio"};
	private JComboBox<String> txt_type_appart = new JComboBox<String>(choix_type_appart);
	
	private JTextField txt_superficie_appart = new JTextField();
	private JTextField txt_nb_chambre = new JTextField();
	private JTextField txt_nb_cuisine = new JTextField();
	private JTextField txt_nb_salon = new JTextField();
	private JTextField txt_nb_salle_bain = new JTextField();
	private JTextField txt_nb_piece = new JTextField();
	
	//Variables vides
	
	
	// Variables Listes deroulantes
	private JComboBox<String>cbx_id_locataire = new JComboBox<String>();
	private JComboBox<String>cbx_id_proprietaire = new JComboBox<String>();
	private JComboBox<String>cbx_id_user = new JComboBox<String>();
	
	//Bouttons
	private JButton btAjouter = new JButton("Ajouter");
	private JButton btAnnuler = new JButton("Annuler");

	
	public PanelAppartement() {
        super();
        this.titre.setText("Appartements");

        
		this.panelForm.setBounds(935, 20, 300, 580);
		this.panelForm.setBackground(new Color (142, 197, 243));
		this.panelForm.setLayout(new GridLayout(32,20));
		
		//Affichage des inputs et des texts 
	    this.panelForm.add(new JLabel("Statut"));
		this.panelForm.add(this.cbx_statut_appart); 
		
	    this.panelForm.add(new JLabel("Intitule"));
		this.panelForm.add(this.txt_intitule_appart); 
		
	    this.panelForm.add(new JLabel("Prix"));
		this.panelForm.add(this.txt_prix_appart); 
		
	    this.panelForm.add(new JLabel("Ville"));
		this.panelForm.add(this.txt_ville_appart); 
		
	    this.panelForm.add(new JLabel("CP"));
		this.panelForm.add(this.txt_cp_appart); 	
		
	    this.panelForm.add(new JLabel("Adresse"));
		this.panelForm.add(this.txt_adresse_appart); 
		
	    this.panelForm.add(new JLabel("Type"));
		this.panelForm.add(this.txt_type_appart); 
		
	    this.panelForm.add(new JLabel("Superficie"));
		this.panelForm.add(this.txt_superficie_appart); 
		
	    this.panelForm.add(new JLabel("Nb Salons"));
		this.panelForm.add(this.txt_nb_salon); 
		
	    this.panelForm.add(new JLabel("Nb Chambres"));
		this.panelForm.add(this.txt_nb_chambre); 
		
	    this.panelForm.add(new JLabel("Nb Cuisine"));
		this.panelForm.add(this.txt_nb_cuisine); 
		
	    this.panelForm.add(new JLabel("Nb Salle de Bain"));
		this.panelForm.add(this.txt_nb_salle_bain); 
		
		this.panelForm.add(new JLabel("Nb Pièces"));
		this.panelForm.add(this.txt_nb_piece); 
		
		this.panelForm.add(new JLabel("Locataire"));
		this.panelForm.add(this.cbx_id_locataire);
		
		this.panelForm.add(new JLabel("Propriétaire"));
		this.panelForm.add(this.cbx_id_proprietaire);
		
		

        this.btAnnuler.setBounds(935, 568, 300, 22);
        this.add(this.btAnnuler);
        
        this.btAjouter.setBounds(935, 590, 300, 22);
        this.add(this.btAjouter);
		
		
	    this.add(panelForm);
	    
	    this.setVisible(false);
	}
}
