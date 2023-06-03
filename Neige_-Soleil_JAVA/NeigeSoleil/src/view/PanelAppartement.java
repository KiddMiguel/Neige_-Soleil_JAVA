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

import controller.Admin;
import controller.Appartement;
import controller.C_Appartement;
import controller.C_Locataire;
import controller.C_Proprietaire;
import controller.C_User;
import controller.Locataire;
import controller.NeigeSoleil;
import controller.Proprietaire;
import controller.Tableau;
import controller.User;

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

	private JComboBox<String>cbx_id_user = new JComboBox<String>();
	
	//Bouttons
	private JButton btAjouter = new JButton("Ajouter");
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btModifier = new JButton("Modifier");
	private JButton btSupprimer = new JButton("Supprimer");

	
	// Tableau
	private JTable tableAppartement ; 
	private Tableau unTableau ; 
	

	
	public PanelAppartement() {
        super();
        this.titre.setText("Appartements");

        
		this.panelForm.setBounds(935, 20, 300, 580);
		this.panelForm.setBackground(new Color (142, 197, 243));
		this.panelForm.setLayout(new GridLayout(31,19));
		
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
		
		this.panelForm.add(new JLabel("Utilisateurs"));
		this.panelForm.add(this.cbx_id_user);
		
		

        this.btAnnuler.setBounds(935, 568, 300, 22);
        this.add(this.btAnnuler);
        
        this.btAjouter.setBounds(935, 590, 300, 22);
        this.add(this.btAjouter);
        
        this.btSupprimer.setBackground(new Color (176, 7, 7));
        this.btSupprimer.setForeground(new Color(255, 255, 255));

		
	    this.add(panelForm);

	    this.remplirCBX();
	    
	    //Rendre les bouttons cliquable
	    this.btAjouter.addActionListener(this);
	    this.btAnnuler.addActionListener(this);
	    this.btModifier.addActionListener(this);
	    this.btSupprimer.addActionListener(this);

	    
	    // Construction un tableau
	    String entetes [] = {"N° Appart","Intitule", "Statut", "Prix", "Ville", "Code postal", "Adresse","Type", "Superficie","Nb Chamb","Nb cuisi", "Nb salon", "Nb salle b",  "Nb pièces","User"}; 
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
				
				if(e.getClickCount()>=1) {

				    JPanel panel = new JPanel();
				    JFrame frame = new JFrame();
				    
				    frame.getContentPane().add(panel);
				    frame.pack();
					frame.setBackground(new Color (142, 197, 243));
				    frame.setBounds(935, 20, 300, 580);	
				    frame.setLocationRelativeTo(null);
			
					panel.setLayout(new GridLayout(15,20));		

				    panel.add(new JLabel("Intitle"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 1).toString())).setBackground(Color.YELLOW);

				    panel.add(new JLabel("Statut"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 2).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Prix"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 3).toString()+" €")).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Ville"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 4).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Code postal"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 5).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Adresse"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 6).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Type"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 7).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Superficie"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 8).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Nb Chambre"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 9).toString()+" Chambre(s)")).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Nb Cuisine"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 9).toString()+" Cuisine(s)")).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Nb Salon"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 9).toString()+" Salon(s)")).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Nb Salle Bain"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 9).toString()+" Salle de bain(s)")).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Nb pièces"));
				    panel.add(new JButton(tableAppartement.getValueAt(numLigne, 9).toString()+" Pièce(s)")).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel(" "));
				    panel.add(new JLabel(" "));
	    
				    panel.add(btSupprimer);
				    panel.add(btModifier);
				       
				    frame.setVisible(true);	

				}
			}
		});
		


	    this.setVisible(false);
	}
	
	public Object [][] getDonnees(){
		ArrayList<Appartement> lesAppartements = C_Appartement.selectAllAppartements(); 
		Object [][] matrice = new Object [lesAppartements.size( )][15]; 
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
			
			matrice[i][9]  = unAppartement.getNb_chambre();
			matrice[i][10]  = unAppartement.getNb_cuisine();
			matrice[i][11]  = unAppartement.getNb_salon();
			matrice[i][12]  = unAppartement.getNb_salle_bain();

			matrice[i][13]  = unAppartement.getNb_piece();
			
			matrice[i][14]  = unAppartement.getId_user();
			i++;
		}
		return matrice;
	}
	
	// remplire les combos Box
	public void remplirCBX ()
	{
		//supprimer ou vider le CBX id_locataire 
		this.cbx_id_user.removeAllItems();
		//récupérer de la base de données tous les locataire 
		ArrayList<User> LesUsers = C_User.selectAllUser(); 
		//parcourir lesClients et remplir le CBX 
		this.cbx_id_user.addItem("");

		for(User unUser : LesUsers)
		{
			this.cbx_id_user.addItem(unUser.getId_user()+"-"+unUser.getNom_user()+"-"+unUser.getPrenom_user());
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
			this.btAjouter.setText("Ajouter");
		}else if(e.getSource() == btAjouter && this.btAjouter.getText().equals("Ajouter")) {
			
			if((this.cbx_id_user.getSelectedItem().toString() == "")) {
				JOptionPane.showMessageDialog(this, "Merci de choisir un proprietaire & un proprietaire", "Attention", JOptionPane.WARNING_MESSAGE);
			}else {
		    int retour = JOptionPane.showConfirmDialog(this, "Confirmer l'ajout d'un contrat !", "Ajouter", JOptionPane.YES_NO_OPTION);
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
				String chaine = this.cbx_id_user.getSelectedItem().toString();
				String tab [] = chaine.split("-"); 
				int id_user = Integer.parseInt(tab[0]);
				
				
				tab = chaine.split("-");
				
				//instancier  
				Appartement unAppartement = new Appartement(statut_appart, intitule_appart, ville_appart, cp_appart
						,adresse_appart,type_appart,superficie_appart,nb_chambre,nb_cuisine,nb_salle_bain,nb_salon,nb_piece,id_user,prix_appart);
				//on l'enregistre dans la base de données 
				C_Appartement.insertAppartement(unAppartement);
			
				
				//récupération de l'id à partir de la BDD 
				unAppartement = C_Appartement.selectWhereAppartement(intitule_appart); 
				//ajout du dans le Tableau 
				Object ligne[] = {unAppartement.getId_appart(), unAppartement.getIntitule_appart(), unAppartement.getStatut_appart(), unAppartement.getPrix_appart(), unAppartement.getVille_appart()
								 ,unAppartement.getCp_appart(), unAppartement.getAdresse_appart(), unAppartement.getType_appart(),unAppartement.getSuperficie_appart(),unAppartement.getNb_chambre(), 
								 unAppartement.getNb_cuisine(),unAppartement.getNb_salon(),unAppartement.getNb_salle_bain(),unAppartement.getNb_piece(),unAppartement.getId_user()};
				this.unTableau.insertLigne(ligne);

			    JOptionPane.showMessageDialog(this, "Reussi !");
			    
			    viderChamps ();
	        }
		}
		        
		}else if(e.getSource() == btAjouter && this.btAjouter.getText().equals("Modifier")) {
			if((this.cbx_id_user.getSelectedItem().toString() == "")) {
				JOptionPane.showMessageDialog(this, "Merci de choisir un locataire & un proprietaire", "Attention", JOptionPane.WARNING_MESSAGE);
			}else {
		    int retour = JOptionPane.showConfirmDialog(this, "Confirmer la modification d'un appartement !", "Modification", JOptionPane.YES_NO_OPTION);
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
				String chaine = this.cbx_id_user.getSelectedItem().toString();
				String tab [] = chaine.split("-"); 
				int numLigne = this.tableAppartement.getSelectedRow();
				
				tab = chaine.split("-");
				int id_user = Integer.parseInt(tab[0]);
				int id_appart = Integer.parseInt(this.tableAppartement.getValueAt(numLigne, 0).toString());
				
				//instancier  
				Appartement unAppartement = new Appartement(id_appart,nb_chambre, nb_cuisine, nb_salle_bain, nb_salon
						,nb_piece,id_user,prix_appart,statut_appart,intitule_appart,ville_appart,cp_appart,adresse_appart,type_appart,superficie_appart);
				//on l'enregistre dans la base de données 
				C_Appartement.updateAppartement(unAppartement);
				//récupération de l'id à partir de la BDD 
				unAppartement = C_Appartement.selectWhereAppartement(intitule_appart); 
				//ajout du dans le Tableau 
				Object ligne[] = {unAppartement.getId_appart(), unAppartement.getIntitule_appart(), unAppartement.getStatut_appart(), unAppartement.getPrix_appart(), unAppartement.getVille_appart()
								 ,unAppartement.getCp_appart(), unAppartement.getAdresse_appart(), unAppartement.getType_appart(),unAppartement.getSuperficie_appart(),unAppartement.getNb_chambre(), 
								 unAppartement.getNb_cuisine(),unAppartement.getNb_salon(),unAppartement.getNb_salle_bain(),unAppartement.getNb_piece(),unAppartement.getId_user()};
				this.unTableau.updateLigne(numLigne, ligne);
			    JOptionPane.showMessageDialog(this, "Reussi !");			    
			    viderChamps ();
	        }
	        }		        
		}
		else if(e.getSource() == btModifier){	
	        update(); 
		}else if(e.getSource() == btSupprimer){	
	        delete(); 
		}
	}
	
	public void update() {
		int numLigne = tableAppartement.getSelectedRow();
		int id_appart = Integer.parseInt(tableAppartement.getValueAt(numLigne, 0).toString());
		
		txt_intitule_appart.setText(tableAppartement.getValueAt(numLigne, 1).toString());
		cbx_statut_appart.setSelectedItem(tableAppartement.getValueAt(numLigne, 2).toString());
		txt_prix_appart.setText(tableAppartement.getValueAt(numLigne, 3).toString());
		txt_ville_appart.setText(tableAppartement.getValueAt(numLigne, 4).toString());
		txt_cp_appart.setText(tableAppartement.getValueAt(numLigne, 5).toString());
		txt_adresse_appart.setText(tableAppartement.getValueAt(numLigne, 6).toString());
		cbx_type_appart.setSelectedItem(tableAppartement.getValueAt(numLigne, 7).toString());
		txt_superficie_appart.setText(tableAppartement.getValueAt(numLigne, 8).toString());
		txt_nb_chambre.setText(tableAppartement.getValueAt(numLigne, 9).toString());
		txt_nb_cuisine.setText(tableAppartement.getValueAt(numLigne, 10).toString());
		txt_nb_salle_bain.setText(tableAppartement.getValueAt(numLigne, 11).toString());
		txt_nb_salon.setText(tableAppartement.getValueAt(numLigne, 12).toString());
		txt_nb_piece.setText(tableAppartement.getValueAt(numLigne, 13).toString());
		cbx_id_user.setSelectedItem(tableAppartement.getValueAt(numLigne, 14).toString());		
		btAjouter.setText("Modifier");
	}
	public void delete() {
		int numLigne = tableAppartement.getSelectedRow();
		int id_appart = Integer.parseInt(tableAppartement.getValueAt(numLigne, 0).toString());
		
		int retour = JOptionPane.showConfirmDialog(null, "Confirmer la suppression de l'appartement", "Supprimer",JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
		if(retour == 0) {
			C_Appartement.deleteAppartement(id_appart);
			unTableau.deleteLigne(numLigne);
			JOptionPane.showMessageDialog(null, "Suppression réussi !");
		}
	
	}

	
	
}
