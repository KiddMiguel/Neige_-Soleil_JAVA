package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.Appartement;
import controller.C_Appartement;
import controller.C_Locataire;
import controller.C_Proprietaire;
import controller.C_Reservation;
import controller.Locataire;
import controller.Proprietaire;
import controller.Reservation;
import controller.Tableau;

public class PanelLocataire extends PanelPrincipal implements ActionListener{
	
	private JPanel panelForm = new JPanel();
	
	String[] choix = {"Mr", "Mme", "Autres"};
	
	// variables
	private JComboBox<String>choix_civilite_locataire = new JComboBox<String>(choix);
	private JTextField txt_nom_locataire = new JTextField();
	private JTextField txt_prenom_locataire = new JTextField();
	private JTextField txt_email_locataire = new JTextField();
	private JPasswordField txt_mdp_locataire = new JPasswordField("");
	
	private JTextField txt_tel_locataire = new JTextField();
	private JTextField txt_adresse_locataire = new JTextField();
	private JTextField txt_cp_locataire = new JTextField(); 
	
	
	private JTextField txt_nb_reservations = new JTextField();
	
	
	

	
	//Variables vides
	
	
	// Variables Listes deroulantes
	private JComboBox<String>cbx_id_appart = new JComboBox<String>();
	private JComboBox<String>cbx_id_proprietaire = new JComboBox<String>();
	private JComboBox<String>cbx_id_user = new JComboBox<String>();
	
	//Bouttons
	private JButton btAjouter = new JButton("Ajouter");
	private JButton btAnnuler = new JButton("Annuler");
	
	// Tableau
	 	private JTable tableLocataire ; 
	 	private Tableau unTableau ; 

	public PanelLocataire() {
		 super();
	        this.titre.setText("Appartements");

	        
			this.panelForm.setBounds(935, 20, 300, 580);
			this.panelForm.setBackground(new Color (142, 197, 243));
			this.panelForm.setLayout(new GridLayout(27,1));
			
			//Affichage des inputs et des texts 
		    this.panelForm.add(new JLabel("civilité"));
			this.panelForm.add(this.choix_civilite_locataire); 
			
		    this.panelForm.add(new JLabel("nom"));
			this.panelForm.add(this.txt_nom_locataire); 
			
		    this.panelForm.add(new JLabel("prenom"));
			this.panelForm.add(this.txt_prenom_locataire); 
			
		    this.panelForm.add(new JLabel("email"));
			this.panelForm.add(this.txt_email_locataire); 
			
		    this.panelForm.add(new JLabel("mdp"));
			this.panelForm.add(this.txt_mdp_locataire); 	
			
		    this.panelForm.add(new JLabel("tel"));
			this.panelForm.add(this.txt_tel_locataire); 
			
		    this.panelForm.add(new JLabel("adresse"));
			this.panelForm.add(this.txt_adresse_locataire); 
			
		    this.panelForm.add(new JLabel("cp"));
			this.panelForm.add(this.txt_cp_locataire); 
			
			this.panelForm.add(new JLabel("N� Reservations"));
			this.panelForm.add(this.txt_nb_reservations); 
 
			this.panelForm.add(new JLabel("Appartement"));
			this.panelForm.add(this.cbx_id_appart);
			this.panelForm.add(new JLabel("Proprietaire"));
			this.panelForm.add(this.cbx_id_proprietaire);

			
			this.panelForm.add(new JLabel(""));
	        this.btAnnuler.setBounds(935, 532, 300, 30);
	        this.add(this.btAnnuler);
	        
	        this.btAjouter.setBounds(935, 568, 300, 30);
	        this.add(this.btAjouter);
			
			
		    this.add(panelForm);
		    
		    this.remplirCBX();
		    //Rendre les bouttons cliquable
		    this.btAjouter.addActionListener(this);
		    this.btAnnuler.addActionListener(this);
		    
		 // Construction un tableau
		    String entetes [] = {"N° Locataire","Civilité", "Nom_locataire", "Prenom_locataire", "Email_locataire", "Tel_locataire", "Adresse_locataire", "Cp_locataire", "Nb_reservation"}; 
		    Object [][] donnees = this.getDonnees();
		    
			this.unTableau = new Tableau (donnees, entetes);
			this.tableLocataire = new JTable(this.unTableau);
			
			JScrollPane uneScroll = new JScrollPane(this.tableLocataire); 
			uneScroll.setBounds(20, 80, 900, 520);
			this.add(uneScroll);
		    
		    this.setVisible(false);
		}
	
	public Object [][] getDonnees()
	{
		ArrayList<Locataire> lesLocataires = C_Locataire.selectAllLocataire(); 
		Object [][] matrice = new Object [lesLocataires.size()][9]; 
		int i=0; 
		for (Locataire unLocataire : lesLocataires)
		{
			matrice[i][0]  = unLocataire.getId_locataire(); 
			matrice[i][1]  = unLocataire.getCivilite_locataire(); 
			matrice[i][2]  = unLocataire.getNom_locataire(); 
			matrice[i][3]  = unLocataire.getPrenom_locataire(); 
			matrice[i][4]  = unLocataire.getEmail_locataire();
			matrice[i][5]  = unLocataire.getTel_locataire();
			matrice[i][6]  = unLocataire.getAdresse_locataire();
			matrice[i][7]  = unLocataire.getCp_locataire();
			matrice[i][8]  = unLocataire.getNb_reservations();
			
			i++;
		}
		return matrice;
	}
	
	// remplire les combos Box
	public void remplirCBX ()
	{
		//supprimer ou vider le CBX idProprietaire
		this.cbx_id_proprietaire.removeAllItems();
		//récupérer de la base de données tous les clients 
		ArrayList<Proprietaire> lesProprietaires = C_Proprietaire.selectAllProprietaire(); 

		for(Proprietaire unProprietaire : lesProprietaires)
		{
			this.cbx_id_proprietaire.addItem(unProprietaire.getId_proprietaire()+"-"+unProprietaire.getNom_proprio()+"-"+unProprietaire.getPrenom_proprio());
		}

		
		//supprimer ou vider le CBX idProprietaire
				this.cbx_id_appart.removeAllItems();
				//récupérer de la base de données tous les clients 
				ArrayList<Appartement> lesAppartement = C_Appartement.selectAllAppartements(); 

				for(Appartement unAppartement : lesAppartement)
				{
					this.cbx_id_appart.addItem(unAppartement.getId_appart()+"-"+unAppartement.getIntitule_appart());
				}

		
	}
	public void viderChamps ()
	{
		this.txt_nom_locataire.setText("");
		this.txt_prenom_locataire.setText("");
		this.txt_email_locataire.setText("");
		this.txt_mdp_locataire.setText("");
		this.txt_tel_locataire.setText("");
		this.txt_adresse_locataire.setText("");
		this.txt_cp_locataire.setText("");
	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btAnnuler) {
			this.viderChamps ();
		}else if(e.getSource() == btAjouter) {
			
		    int retour = JOptionPane.showConfirmDialog(this, "Confirmer !", "Ajouter", JOptionPane.YES_NO_OPTION);
	        if (retour == 0) {
	        	
	        	
	        	String civilite_locataire = this.choix_civilite_locataire.getSelectedItem().toString();
	        	
	        	String nom_locataire = this.txt_nom_locataire.getText();
	        	String prenom_locataire = this.txt_prenom_locataire.getText();
	        	
	        	String email_locataire = this.txt_email_locataire.getText();
	        	String mdp_locataire = new String(this.txt_mdp_locataire.getPassword());
				
	        	int nb_reservations = Integer.parseInt(this.txt_nb_reservations.getText());
	        	String tel_locataire = this.txt_tel_locataire.getText();
	        	String adresse_locataire = this.txt_adresse_locataire.getText();
	        	
	        	String cp_locataire = this.txt_cp_locataire.getText();
				
			
				String chaine = this.cbx_id_proprietaire.getSelectedItem().toString();
				String tab [] = chaine.split("-"); 
				
				
				
				chaine = this.cbx_id_proprietaire.getSelectedItem().toString();
				tab = chaine.split("-");
				int id_proprietaire = Integer.parseInt(tab[0]);
				int id_appart = Integer.parseInt(tab[0]);
				int id_user = Integer.parseInt(tab[0]);
				
				
				//instancier  
				Locataire unLocataire = new Locataire(id_appart, nb_reservations, id_proprietaire, id_user,
						civilite_locataire,nom_locataire,prenom_locataire,email_locataire,mdp_locataire,tel_locataire,adresse_locataire,cp_locataire);
				//on l'enregistre dans la base de données 
				C_Locataire.insertLocataire(unLocataire);
				
			    JOptionPane.showMessageDialog(this, "Reussi !");
			    
			    viderChamps ();
		
	}
	}
		
	}
}