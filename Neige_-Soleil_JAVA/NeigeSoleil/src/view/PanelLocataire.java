package view;

import java.awt.Color;
import java.awt.Font;
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
	private JPasswordField txt_mdp_locataire = new JPasswordField();
	private JTextField txt_tel_locataire = new JTextField();
	private JTextField txt_adresse_locataire = new JTextField();
	private JTextField txt_cp_locataire = new JTextField(); 
	private JTextField txt_nb_reservations = new JTextField();

	// Variables Listes deroulantes
	//private JComboBox<String>cbx_id_appart = new JComboBox<String>();
	//private JComboBox<String>cbx_id_proprietaire = new JComboBox<String>();
	//private JComboBox<String>cbx_id_user = new JComboBox<String>();
	
	//Bouttons
	private JButton btAjouter = new JButton("Ajouter");
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btModifier = new JButton("Modifier");
	private JButton btSupprimer = new JButton("Supprimer");
	
	// Tableau
	 	private JTable tableLocataire ; 
	 	private Tableau unTableau ; 
	 	
	//Message d'information
	private	JLabel info = new JLabel("L'admin ne peux pas créer un compte client !");


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
 
			//this.panelForm.add(new JLabel("Appartement"));
			//this.panelForm.add(this.cbx_id_appart);
			//this.panelForm.add(new JLabel("Proprietaire"));
			//this.panelForm.add(this.cbx_id_proprietaire);

			
			this.panelForm.add(new JLabel(""));
	        this.btAnnuler.setBounds(935, 532, 300, 30);
	        this.add(this.btAnnuler);
	        
	        this.btAjouter.setBounds(935, 568, 300, 30);
	        this.add(this.btAjouter);
	        this.btAjouter.setVisible(true);
			this.info.setBounds(960, 568, 300, 30);
	        this.info.setForeground(new Color(203, 21, 3));
			//this.add(this.info);
			
	        this.btSupprimer.setBackground(new Color (176, 7, 7));
	        this.btSupprimer.setForeground(new Color(255, 255, 255));
	        
		    this.add(panelForm);
		    
		    
		    //this.remplirCBX();
		    //Rendre les bouttons cliquable
		    this.btAjouter.addActionListener(this);
		    this.btAnnuler.addActionListener(this);
		    this.btModifier.addActionListener(this);
		    this.btSupprimer.addActionListener(this);
		    
		 // Construction un tableau
		    String entetes [] = {"N° Locataire","Civilité", "Nom_locataire", "Prenom_locataire", "Email_locataire", "Mot de passe", "Tel_locataire", "Adresse_locataire", "Cp_locataire", "Nb_reservation" }; 
		    Object [][] donnees = this.getDonnees();
		    
			this.unTableau = new Tableau (donnees, entetes);
			this.tableLocataire = new JTable(this.unTableau);
			
			JScrollPane uneScroll = new JScrollPane(this.tableLocataire); 
			uneScroll.setBounds(20, 80, 900, 520);
			this.add(uneScroll);
			
			this.tableLocataire.addMouseListener(new MouseListener() {
				
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
					int numLigne = tableLocataire.getSelectedRow();
					int id_locataire = Integer.parseInt(tableLocataire.getValueAt(numLigne, 0).toString());
					
					if(e.getClickCount()>=1) {

					    JPanel panel = new JPanel();
					    JFrame frame = new JFrame();
					    
					    frame.getContentPane().add(panel);
					    frame.pack();
						frame.setBackground(new Color (142, 197, 243));
					    frame.setBounds(935, 20, 300, 580);	
					    frame.setLocationRelativeTo(null);
				
						panel.setLayout(new GridLayout(15,20));		

					    panel.add(new JLabel("Civilite"));
					    panel.add(new JButton(tableLocataire.getValueAt(numLigne, 1).toString())).setBackground(Color.YELLOW);

					    panel.add(new JLabel("Nom"));
					    panel.add(new JButton(tableLocataire.getValueAt(numLigne, 2).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

					    panel.add(new JLabel("Prenom"));
					    panel.add(new JButton(tableLocataire.getValueAt(numLigne, 3).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

					    panel.add(new JLabel("Email"));
					    panel.add(new JButton(tableLocataire.getValueAt(numLigne, 4).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

					    panel.add(new JLabel("Tel"));
					    panel.add(new JButton(tableLocataire.getValueAt(numLigne, 5).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

					    panel.add(new JLabel("Adresse"));
					    panel.add(new JButton(tableLocataire.getValueAt(numLigne, 6).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

					    panel.add(new JLabel("Code postal"));
					    panel.add(new JButton(tableLocataire.getValueAt(numLigne, 7).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

					    panel.add(new JLabel("Nb Reservation"));
					    panel.add(new JButton(tableLocataire.getValueAt(numLigne, 8).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				
			
					    // panel.add(new JLabel("N° Appartement"));
					    // panel.add(new JButton(tableLocataire.getValueAt(numLigne, 9).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

					    // panel.add(new JLabel("N° Proprietaire"));
					    // panel.add(new JButton(tableLocataire.getValueAt(numLigne, 10).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

					    panel.add(new JLabel(" "));
					    panel.add(new JLabel(" "));
					    panel.add(new JLabel(" "));
					    panel.add(new JLabel(" "));
					    panel.add(new JLabel(" "));
					    panel.add(new JLabel(" "));
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
	
	public Object [][] getDonnees()
	{
		ArrayList<Locataire> lesLocataires = C_Locataire.selectAllLocataire(); 
		Object [][] matrice = new Object [lesLocataires.size()][10]; 
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
			//matrice[i][10] = unLocataire.getId_proprietaire();
			i++;
		}
		return matrice;
	}
	
	// remplire les combos Box
	/*public void remplirCBX ()
	{
		//supprimer ou vider le CBX idProprietaire
		this.cbx_id_proprietaire.removeAllItems();
		//récupérer de la base de données tous les clients 
		ArrayList<Proprietaire> lesProprietaires = C_Proprietaire.selectAllProprietaire(); 
		this.cbx_id_proprietaire.addItem("");

		for(Proprietaire unProprietaire : lesProprietaires)
		{
			this.cbx_id_proprietaire.addItem(+unProprietaire.getId_proprietaire()+"-"+unProprietaire.getNom_proprio()+"-"+unProprietaire.getPrenom_proprio());
		}

		
		//supprimer ou vider le CBX idProprietaire
				this.cbx_id_appart.removeAllItems();
				//récupérer de la base de données tous les clients 
				ArrayList<Appartement> lesAppartement = C_Appartement.selectAllAppartements(); 
				this.cbx_id_appart.addItem("");
				for(Appartement unAppartement : lesAppartement)
				{
					this.cbx_id_appart.addItem(unAppartement.getId_appart()+"-"+unAppartement.getIntitule_appart());
				}

		
	}*/
	public void viderChamps ()
	{
		this.txt_nom_locataire.setText("");
		this.txt_prenom_locataire.setText("");
		this.txt_email_locataire.setText("");
		this.txt_mdp_locataire.setText("");
		this.txt_tel_locataire.setText("");
		this.txt_adresse_locataire.setText("");
		this.txt_cp_locataire.setText("");
		this.txt_nb_reservations.setText("");
		btAjouter.setText("Ajouter");

	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btAnnuler) {
			this.viderChamps ();
			this.btAjouter.setVisible(false);
			this.info.setVisible(true);
		}else if(e.getSource() == btAjouter && this.btAjouter.getText().equals("Ajouter")) {
	
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
				
			
	        	//String chaine = this.cbx_id_proprietaire.getSelectedItem().toString();
	        	//String tab [] = chaine.split("-"); 
				
				
				
	        	//chaine = this.cbx_id_proprietaire.getSelectedItem().toString();
	        	//tab = chaine.split("-");
	        	//int id_proprietaire = Integer.parseInt(tab[0]);
	        	//int id_appart = Integer.parseInt(tab[0]);
				//int id_user = Integer.parseInt(tab[0]);
				
				
				//instancier  
				Locataire unLocataire = new Locataire( nb_reservations,
						civilite_locataire,nom_locataire,prenom_locataire,email_locataire,mdp_locataire,tel_locataire,adresse_locataire,cp_locataire);
				//on l'enregistre dans la base de données 
				C_Locataire.insertLocataire(unLocataire);
				Object ligne[] = { unLocataire.getNb_reservations(), unLocataire.getCivilite_locataire()
						 ,unLocataire.getNom_locataire(), unLocataire.getPrenom_locataire(), unLocataire.getEmail_locataire(),unLocataire.getMdp_locataire(),unLocataire.getTel_locataire(), 
						unLocataire.getMdp_locataire(), unLocataire.getAdresse_locataire(),unLocataire.getCp_locataire()};
				this.unTableau.insertLigne(ligne);

			    JOptionPane.showMessageDialog(this, "Reussi !");
			    
			    viderChamps ();
	        }
	        
		}else if(e.getSource() == btAjouter && this.btAjouter.getText().equals("Modifier")) {

	

		    int retour = JOptionPane.showConfirmDialog(this, "Confirmer !", "Modifier", JOptionPane.YES_NO_OPTION);
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

	        	//String chaine = this.cbx_id_proprietaire.getSelectedItem().toString();
	        	//String tab [] = chaine.split("-"); 
				int numLigne = this.tableLocataire.getSelectedRow();
				int id_locataire = Integer.parseInt(this.tableLocataire.getValueAt(numLigne, 0).toString());
				
				//chaine = this.cbx_id_proprietaire.getSelectedItem().toString();
				//tab = chaine.split("-");
				//int id_proprietaire = Integer.parseInt(tab[0]);
				//int id_appart = Integer.parseInt(tab[0]);
				//int id_user = Integer.parseInt(tab[0]);
				
				
				//instancier  
				Locataire unLocataire = new Locataire(id_locataire,
						civilite_locataire,nom_locataire,prenom_locataire,email_locataire,tel_locataire,adresse_locataire,cp_locataire, nb_reservations);
				//on l'enregistre dans la base de données 
				C_Locataire.updateLocataire(unLocataire);
				
				unLocataire = C_Locataire.selectWhereLocataire(email_locataire);
				Object ligne[] = {unLocataire.getId_locataire(), unLocataire.getCivilite_locataire(), unLocataire.getNom_locataire(), unLocataire.getPrenom_locataire(), unLocataire.getEmail_locataire()
						,unLocataire.getMdp_locataire() , unLocataire.getTel_locataire(), unLocataire.getAdresse_locataire(),unLocataire.getCp_locataire(),unLocataire.getNb_reservations()};
				this.unTableau.updateLigne(numLigne, ligne);
			    JOptionPane.showMessageDialog(this, "Reussi !");
			    
			    viderChamps ();
		
	        }
			
		
		}else if(e.getSource() == btModifier){	
		    this.info.setVisible(false);
		    this.btAjouter.setVisible(true);
	        update(); 
		}else if(e.getSource() == btSupprimer){	
	        delete(); 
		}
		
	}
	
	public void update() {
		int numLigne = tableLocataire.getSelectedRow();
		int id_locataire = Integer.parseInt(tableLocataire.getValueAt(numLigne, 0).toString());
		
		choix_civilite_locataire.setSelectedItem(tableLocataire.getValueAt(numLigne, 1).toString());
		txt_nom_locataire.setText(tableLocataire.getValueAt(numLigne, 2).toString());
		txt_prenom_locataire.setText(tableLocataire.getValueAt(numLigne, 3).toString());
		txt_email_locataire.setText(tableLocataire.getValueAt(numLigne, 4).toString());
		txt_tel_locataire.setText(tableLocataire.getValueAt(numLigne, 5).toString());
		txt_adresse_locataire.setText(tableLocataire.getValueAt(numLigne, 6).toString());
		txt_nb_reservations.setText(tableLocataire.getValueAt(numLigne, 8).toString());
		txt_cp_locataire.setText(tableLocataire.getValueAt(numLigne, 7).toString());
		//cbx_id_appart.setSelectedItem(Integer.parseInt((tableLocataire.getValueAt(numLigne, 9).toString())));
		//cbx_id_proprietaire.setSelectedItem(tableLocataire.getValueAt(numLigne, 10));
		btAjouter.setText("Modifier");
	}
	public void delete() {
		int numLigne = tableLocataire.getSelectedRow();
		int id_locataire = Integer.parseInt(tableLocataire.getValueAt(numLigne, 0).toString());
		
		int retour = JOptionPane.showConfirmDialog(null, "Confirmer la suppression de l'appartement", "Supprimer",JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
		if(retour == 0) {
			C_Locataire.deleteLocataire(id_locataire);
			unTableau.deleteLigne(numLigne);
			JOptionPane.showMessageDialog(null, "Suppression réussi !");
		}
	
	}
}