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
	private JTextField txt_statut_appart = new JTextField();
	private JTextField txt_prix_appart = new JTextField();
	private JTextField txt_intitule_appart = new JTextField();
	private JTextField txt_ville_appart = new JTextField();
	private JTextField txt_cp_appart = new JTextField();
	private JTextField txt_adresse_appart = new JTextField();
	private JTextField txt_description_appart = new JTextField();
	private JTextField txt_type_appart = new JTextField();
	private JTextField txt_superficie_appart = new JTextField();
	private JTextField txt_image = new JTextField();
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
		this.panelForm.setLayout(new GridLayout(32,500));
		
		//Affichage des inputs et des texts 
	    this.panelForm.add(new JLabel("Statut"));
		this.panelForm.add(this.txt_statut_appart); 
		
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
		
	    this.panelForm.add(new JLabel("N° Chambres"));
		this.panelForm.add(this.txt_nb_chambre); 
		
	    this.panelForm.add(new JLabel("N° Cuisine"));
		this.panelForm.add(this.txt_nb_cuisine); 
		
	    this.panelForm.add(new JLabel("N° Salle de Bain"));
		this.panelForm.add(this.txt_nb_salle_bain); 
		
		this.panelForm.add(new JLabel("N° Pieces"));
		this.panelForm.add(this.txt_nb_piece); 
		
		this.panelForm.add(this.cbx_id_locataire);
		this.panelForm.add(this.cbx_id_proprietaire);
		this.panelForm.add(this.cbx_id_user);
		
		this.panelForm.add(new JLabel("     "));
		this.panelForm.add(this.btAnnuler); 
		this.panelForm.add(this.btAjouter);
		
		
	    this.add(panelForm);
	    
	    this.setVisible(false);
	}
}
