package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import controller.Appartement;
import controller.C_Appartement;
import controller.C_Locataire;
import controller.C_Proprietaire;
import controller.Locataire;
import controller.NeigeSoleil;
import controller.Proprietaire;
import controller.Tableau;

public class PanelAppartement extends PanelPrincipal implements ActionListener{
	
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
	private JComboBox<String> cbx_type_appart = new JComboBox<String>(choix_type_appart);
	
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

	
	// Tableau
	private JTable tableAppartement ; 
	private Tableau unTableau ; 
	

	
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
		this.panelForm.add(this.cbx_type_appart); 
		
	    this.panelForm.add(new JLabel("Superficie"));
		this.panelForm.add(this.txt_superficie_appart); 
		
	    this.panelForm.add(new JLabel("Nb Salons"));
		this.panelForm.add(this.txt_nb_salon); 
		
	    this.panelForm.add(new JLabel("N� Chambres"));
		this.panelForm.add(this.txt_nb_chambre); 
		
	    this.panelForm.add(new JLabel("N� Cuisine"));
		this.panelForm.add(this.txt_nb_cuisine); 
		
	    this.panelForm.add(new JLabel("N� Salle de Bain"));
		this.panelForm.add(this.txt_nb_salle_bain); 
		
		this.panelForm.add(new JLabel("N� Pieces"));
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

	    this.remplirCBX();
	    
	    // Construction un tableau
	    String entetes [] = {"N° Appart","Intitule", "Statut", "Prix", "Ville", "Code postal", "Adresse","Type", "Superficie", "Nb pièces"}; 
	    Object [][] donnees = this.getDonnees();
	    
		this.unTableau = new Tableau (donnees, entetes);
		this.tableAppartement = new JTable(this.unTableau);
		
		JScrollPane uneScroll = new JScrollPane(this.tableAppartement); 
		uneScroll.setBounds(20, 80, 900, 520);
		this.add(uneScroll);
		
		this.tableAppartement.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int numLigne = tableAppartement.getSelectedRow();
				int id_appart = Integer.parseInt(tableAppartement.getValueAt(numLigne, 0).toString());
				
				 if (e.getClickCount() >= 1) {
			         
			         JFrame frame = new JFrame("Détail appartement");
			            JPanel PanelDetail_Appartement = new PanelDetail_Appartement();
			            frame.getContentPane().add(PanelDetail_Appartement);
			            frame.pack();
			            frame.setVisible(true);
			            frame.setBounds(935, 20, 300, 580);

			        }
			}
		});
		
	    //Rendre les bouttons cliquable
	    this.btAjouter.addActionListener(this);
	    this.btAnnuler.addActionListener(this);
	    
	    this.setVisible(false);
	}
	
	public Object [][] getDonnees(){
		ArrayList<Appartement> lesAppartements = C_Appartement.selectAllAppartements(); 
		Object [][] matrice = new Object [lesAppartements.size()][10]; 
		int i=0; 
		for (Appartement unAppartement : lesAppartements)
		{
			matrice[i][0]  = unAppartement.getId_appart(); 
			matrice[i][1]  = unAppartement.getIntitule_appart(); 
			matrice[i][2]  = unAppartement.getStatut_appart(); 
			matrice[i][3]  = unAppartement.getPrix_appart(); 
			matrice[i][4]  = unAppartement.getVille_appart();
			matrice[i][5]  = unAppartement.getCp_appart();
			matrice[i][6]  = unAppartement.getAdresse_appart();
			matrice[i][7]  = unAppartement.getType_appart();
			matrice[i][8]  = unAppartement.getSuperficie_appart();
			matrice[i][9]  = unAppartement.getNb_piece();
			i++;
		}
		return matrice;
	}
	
	// remplire les combos Box
	public void remplirCBX ()
	{
		//supprimer ou vider le CBX id_locataire 
		this.cbx_id_locataire.removeAllItems();
		//récupérer de la base de données tous les locataire 
		ArrayList<Locataire> lesLocataires = C_Locataire.selectAllLocataire(); 
		//parcourir lesClients et remplir le CBX 
		for(Locataire unLocataire : lesLocataires)
		{
			this.cbx_id_locataire.addItem(unLocataire.getId_locataire()+"-"+unLocataire.getNom_locataire()+"-"+unLocataire.getPrenom_locataire());
		}
		
		//supprimer ou vider le CBX idProprietaire
		this.cbx_id_proprietaire.removeAllItems();
		//récupérer de la base de données tous les clients 
		ArrayList<Proprietaire> lesProprietaires = C_Proprietaire.selectAllProprietaire(); 

		for(Proprietaire unProprietaire : lesProprietaires)
		{
			this.cbx_id_proprietaire.addItem(unProprietaire.getId_proprietaire()+"-"+unProprietaire.getNom_proprio()+"-"+unProprietaire.getPrenom_proprio());
		}
		
	}
	
	
	public void viderChamps ()
	{
		this.txt_intitule_appart.setText("");
		this.txt_prix_appart.setText("");
		this.txt_ville_appart.setText("");
		this.txt_cp_appart.setText("");
		this.txt_adresse_appart.setText("");
		this.txt_superficie_appart.setText("");
		this.txt_nb_salon.setText("");
		this.txt_nb_chambre.setText("");
		this.txt_nb_cuisine.setText("");
		this.txt_nb_salle_bain.setText("");
		this.txt_nb_piece.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btAnnuler) {
			this.viderChamps ();
		}else if(e.getSource() == btAjouter) {
			
		    int retour = JOptionPane.showConfirmDialog(this, "Confirmer !", "Ajouter", JOptionPane.YES_NO_OPTION);
	        if (retour == 0) {
	        	String intitule_appart = this.txt_intitule_appart.getText();
				
				String statut_appart = this.cbx_statut_appart.getSelectedItem().toString();
				
				float prix_appart = Float.parseFloat(this.txt_prix_appart.getText()); 
				
				String ville_appart = this.txt_ville_appart.getText();
				String cp_appart = this.txt_cp_appart.getText();
				String adresse_appart = this.txt_adresse_appart.getText();
				
				String type_appart = this.cbx_type_appart.getSelectedItem().toString();
				
				String superficie_appart = this.txt_superficie_appart.getText();
				int nb_chambre = Integer.parseInt(this.txt_nb_chambre.getText());
				int nb_cuisine = Integer.parseInt(this.txt_nb_cuisine.getText());
				int nb_salon = Integer.parseInt(this.txt_nb_salon.getText());
				int nb_salle_bain = Integer.parseInt(this.txt_nb_salle_bain.getText());

				int nb_piece = Integer.parseInt(this.txt_nb_piece.getText());
				String chaine = this.cbx_id_locataire.getSelectedItem().toString();
				String tab [] = chaine.split("-"); 
				int id_locataire = Integer.parseInt(tab[0]);
				
				
				chaine = this.cbx_id_proprietaire.getSelectedItem().toString();
				tab = chaine.split("-");
				int id_proprietaire = Integer.parseInt(tab[0]);
				
				//instancier  
				Appartement unAppartement = new Appartement(statut_appart, intitule_appart, ville_appart, cp_appart
						,adresse_appart,type_appart,superficie_appart,nb_chambre,nb_cuisine,nb_salle_bain,nb_salon,nb_piece,id_proprietaire,id_locataire,prix_appart);
				//on l'enregistre dans la base de données 
				C_Appartement.insertAppartement(unAppartement);
			
				//récupération de l'id à partir de la BDD 
				unAppartement = C_Appartement.selectWhereAppartement(intitule_appart); 
				//ajout du dans le Tableau 
				Object ligne[] = {unAppartement.getId_appart(), unAppartement.getIntitule_appart(), unAppartement.getStatut_appart(), unAppartement.getPrix_appart(), unAppartement.getVille_appart()
								 ,unAppartement.getCp_appart(), unAppartement.getAdresse_appart(), unAppartement.getType_appart(),unAppartement.getSuperficie_appart(), unAppartement.getNb_piece()};
				this.unTableau.insertLigne(ligne);

			    JOptionPane.showMessageDialog(this, "Reussi !");
			    
			    viderChamps ();
	        }
			
		        
		}
	}
	
	
	
}
