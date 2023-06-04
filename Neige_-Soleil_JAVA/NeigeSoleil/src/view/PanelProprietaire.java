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
import controller.C_Contrat;
import controller.C_Locataire;
import controller.C_Proprietaire;
import controller.Contrat;
import controller.Locataire;
import controller.Proprietaire;
import controller.Tableau;

public class PanelProprietaire extends PanelPrincipal implements ActionListener {
	
	private JPanel panelForm = new JPanel();
	
	String[] choix = {"Mr", "Mme", "Autres"};
	//variable
	private JTextField Txt_nom_Proprio = new JTextField();
	private JTextField Txt_prenom_proprio = new JTextField();
	private JTextField Txt_statut_proprio = new JTextField();
	private JTextField Txt_email_proprio = new JTextField();
	private JPasswordField Txt_mdp_proprio = new JPasswordField();
	private JTextField Txt_tel_proprio  = new JTextField();
	private JTextField Txt_adresse_proprio = new JTextField();
	private JTextField Txt_cp_proprio = new JTextField();
	private JTextField Txt_ville_proprio = new JTextField();
	private JTextField Txt_pays_proprio = new JTextField();
	private JTextField Txt_code_adherent = new JTextField();
	
	
	// Variable listes d roulant 
	private JComboBox<String> cbx_id_user = new JComboBox<String>();
	private JComboBox<String> cbx_id_contrat = new JComboBox<String>();
	private JComboBox<String> cbx_id_appart = new JComboBox<String>();
	private JComboBox<String> cbx_civilite_proprio = new JComboBox<String>(choix);
	
	//button
	private JButton btAjouter = new JButton("Ajouter");
	private JButton btAnnuler = new JButton ("Annuler");
	private JButton btModifier = new JButton("Modifier");
	private JButton btSupprimer = new JButton("Supprimer");
	
	//Tableau
	private JTable tableProprietaire ; 
	private Tableau unTableau ; 
	
	//Message d'information
    public PanelProprietaire ()
    {
        super();
        this.titre.setText("Proprietaire");
        
        this.panelForm.setBounds(930, 20, 300, 580);
        this.panelForm.setBackground(new Color(142, 197, 243));
        this.panelForm.setLayout(new GridLayout(31,1));
        
        this.panelForm.add(new JLabel ("Civilité"));
		this.panelForm.add(this.cbx_civilite_proprio);
       
        this.panelForm.add(new JLabel ("Nom"));
        this.panelForm.add(this.Txt_nom_Proprio);
        
        this.panelForm.add(new JLabel ("Prenom"));
        this.panelForm.add(this.Txt_prenom_proprio); 
        
        this.panelForm.add(new JLabel ("Statut"));
        this.panelForm.add(this.Txt_statut_proprio);
        
        this.panelForm.add(new JLabel ("Email"));
        this.panelForm.add(this.Txt_email_proprio);
        
      //  this.panelForm.add(new JLabel ("Mot de passe"));
        //this.panelForm.add(this.Txt_mdp_proprio);
        
        this.panelForm.add(new JLabel ("Numero de t l phone"));
        this.panelForm.add(this.Txt_tel_proprio);
        
        this.panelForm.add(new JLabel ("Adresse"));
        this.panelForm.add (this.Txt_adresse_proprio);
        
        this.panelForm.add(new JLabel ("Code postale"));
        this.panelForm.add(this.Txt_cp_proprio);
        
        this.panelForm.add(new JLabel ("Ville"));
        this.panelForm.add(this.Txt_ville_proprio);
        
        this.panelForm.add(new JLabel ("Pays"));
        this.panelForm.add(this.Txt_pays_proprio);
        
        this.panelForm.add(new JLabel ("Contrat"));
		this.panelForm.add(this.cbx_id_contrat);
		this.panelForm.add(new JLabel ("Appartement"));
		this.panelForm.add(this.cbx_id_appart);
		
		this.btAnnuler.setBounds(930, 555, 300, 22);
        this.add(this.btAnnuler);
       
        this.btAjouter.setBounds(930, 575, 300, 22);
        this.add(this.btAjouter);
        this.btSupprimer.setBackground(new Color (176, 7, 7));
        this.btSupprimer.setForeground(new Color(255, 255, 255));
		
	    this.setLayout(null);
	    
	    this.add(panelForm);
	    
	    this.remplirCBX();
	    
	    
	    //Rendre les bouttons cliquable
	    this.btAjouter.addActionListener(this);
	    this.btAnnuler.addActionListener(this);
	    this.btModifier.addActionListener(this);
	    this.btSupprimer.addActionListener(this);
	   // Construction un tableau
	    String entetes [] = {"N° Proprietaire", "N° Contrat", "N° Appartement","Civilité", "Nom", "Prenom", "Statut","Email", "Telephone", "Adresse","Code Postal", "Ville","Pays"}; 
	    Object [] [] donnees = this.getDonnees();
	    
	    this.unTableau = new Tableau (donnees, entetes);
	    this.tableProprietaire = new JTable (this.unTableau);
	    this.tableProprietaire.setBackground(new Color (142, 197, 243));
	    
	    JScrollPane uneScroll = new JScrollPane(this.tableProprietaire);
	    uneScroll.setBounds(20, 80, 900, 520);
	    this.add(uneScroll);
	    
	    
	    this.tableProprietaire.addMouseListener(new MouseListener() {
			
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
				int numLigne = tableProprietaire.getSelectedRow();
				int id_appart = Integer.parseInt(tableProprietaire.getValueAt(numLigne, 0).toString());
				
				if(e.getClickCount()>=1) {

				    JPanel panel = new JPanel();
				    JFrame frame = new JFrame();
				    
				    frame.getContentPane().add(panel);
				    frame.pack();
					frame.setBackground(new Color (142, 197, 243));
				    frame.setBounds(935, 20, 300, 580);	
				    frame.setLocationRelativeTo(null);
			
					panel.setLayout(new GridLayout(15,20));		
				    panel.add(new JLabel("N° Contrat"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 1).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("N° Appartement"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 2).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Civilité"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne,3).toString())).setBackground(Color.YELLOW);

				    panel.add(new JLabel("Nom"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 4).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Prenom"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 5).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Statut"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 6).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Email"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 7).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Telephone"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 8).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Adresse"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 9).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Code Postale"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 10).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    
				    panel.add(new JLabel("Ville"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 11).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Pays"));
				    panel.add(new JButton(tableProprietaire.getValueAt(numLigne, 12).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));
				
			
				    panel.add(new JLabel(""));
				    panel.add(new JLabel(""));
				    panel.add(new JLabel(""));
				    panel.add(new JLabel(""));
		
	    
				    panel.add(btSupprimer);
				    panel.add(btModifier);
				       
				    frame.setVisible(true);	

				}
			}
		});

	    this.setVisible(false);
    }
    
    public Object [] [] getDonnees(){
    	
    	ArrayList<Proprietaire> lesProprietaire = C_Proprietaire.selectAllProprietaire();
    	Object [] [] matrice = new Object [lesProprietaire.size()][13];
    	int i=0;
    	for (Proprietaire unProprietaire : lesProprietaire)
    	{
    		
    		matrice[i][0] = unProprietaire.getId_proprietaire();
    		matrice[i][1] = unProprietaire.getId_contrat();
    		matrice[i][2] = unProprietaire.getId_appart();
    		matrice[i][3] = unProprietaire.getCivilite_proprio();
    		matrice[i][4] = unProprietaire.getNom_proprio();
    		matrice[i][5] = unProprietaire.getPrenom_proprio();
    		matrice[i][6] = unProprietaire.getStatut_proprio();
    		matrice[i][7] = unProprietaire.getEmail_proprio();
    		matrice[i][8] = unProprietaire.getTel_proprio();
    		matrice[i][9] = unProprietaire.getAdresse_proprio();
    		matrice[i][10] = unProprietaire.getCp_proprio();
    		matrice[i][11] = unProprietaire.getVille_proprio();
    		matrice[i][12] = unProprietaire.getPays_proprio();

    		i++;
    	}
    	return matrice; 
    }
    
    public void remplirCBX ()
    {
   
    	//supprimer ou vider le CBX id_contrat
    	this.cbx_id_contrat.removeAllItems();
    	//recup rer de la base de donnees tout les contrats
    	ArrayList<Contrat> lesContrats = C_Contrat.selectAllContrat(); 
    	//parcourir lesClients et remplir le CBX
		this.cbx_id_contrat.addItem("");
    	for (Contrat unContrat : lesContrats)
    	{
    		this.cbx_id_contrat.addItem(unContrat.getId_contrat()+
    				"-"+unContrat.getStatut_contrat()+
    				"| DD "+unContrat.getDate_debut_contrat()+
    				"| DF "+unContrat.getDate_fin_contrat());
    	}
    	//Supprimer ou vider le CBX id_Appartement
    	this.cbx_id_appart.removeAllItems();
    	//recup rer de la base de donnees tous les appartement
    	ArrayList<Appartement> lesAppartements = C_Appartement.selectAllAppartements();
		this.cbx_id_appart.addItem("");

    	for(Appartement unAppartement : lesAppartements)
    	{
    		this.cbx_id_appart.addItem(unAppartement.getNb_chambre()+"-"+
    				unAppartement.getIntitule_appart());
    	}
    }
    
    public void viderChamps()
    {
    	this.Txt_nom_Proprio.setText("");
    	this.Txt_prenom_proprio.setText("");
    	this.Txt_statut_proprio.setText("");
    	this.Txt_email_proprio.setText("");
    	this.Txt_mdp_proprio.setText("");
    	this.Txt_tel_proprio.setText("");
    	this.Txt_cp_proprio.setText("");
    	this.Txt_pays_proprio.setText("");
    	this.Txt_ville_proprio.setText("");
    	this.Txt_pays_proprio.setText("");
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btAnnuler) {
			this.viderChamps ();
			this.btAjouter.setText("Ajouter");
		}else if(e.getSource() == btAjouter && this.btAjouter.getText().equals("Ajouter")) {
			
	
		    int retour = JOptionPane.showConfirmDialog(this, "Confirmer l'ajout d'un proprietaire !", "Ajouter", JOptionPane.YES_NO_OPTION);
	        if (retour == 0) {
	        	String civilite_proprio = this.cbx_civilite_proprio.getSelectedItem().toString();
	        	String nom_proprio = this.Txt_nom_Proprio.getText();
	        	String prenom_proprio = this.Txt_prenom_proprio.getText();
	        	String statut_proprio = this.Txt_statut_proprio.getText();
	        	String email_proprio = this.Txt_email_proprio.getText();
	        	//String mdp_proprio = new String(this.Txt_mdp_proprio.getPassword());
				String tel_proprio = this.Txt_tel_proprio.getText();
				String adresse_proprio = this.Txt_adresse_proprio.getText();
				String cp_proprio = this.Txt_cp_proprio.getText();
				String pays_proprio = this.Txt_pays_proprio.getText();
				String ville_proprio = this.Txt_ville_proprio.getText();

				//String chaine = this.cbx_id_appart.getSelectedItem().toString();
				//String tab [] = chaine.split("-"); 
				//int id_appart = Integer.parseInt(tab[0]);
				
				
				//chaine = this.cbx_id_contrat.getSelectedItem().toString();
				//tab = chaine.split("-");
				//int id_contrat = Integer.parseInt(tab[0]);
				
				//instancier  
				Proprietaire unProprietaire = new Proprietaire(civilite_proprio, nom_proprio,prenom_proprio, statut_proprio, email_proprio
						,tel_proprio,adresse_proprio,cp_proprio,ville_proprio,pays_proprio);
				//on l'enregistre dans la base de données 
				C_Proprietaire.insertProprietaire(unProprietaire);

				//ajout du dans le Tableau 
				Object ligne[] = {unProprietaire.getId_proprietaire(),unProprietaire.getId_contrat(),unProprietaire.getId_appart(), unProprietaire.getCivilite_proprio(), unProprietaire.getNom_proprio(), unProprietaire.getPrenom_proprio(), unProprietaire.getStatut_proprio()
								 ,unProprietaire.getEmail_proprio(), unProprietaire.getTel_proprio(),unProprietaire.getAdresse_proprio(),unProprietaire.getCp_proprio(), 
								 unProprietaire.getVille_proprio(),unProprietaire.getPays_proprio()};
				this.unTableau.insertLigne(ligne);

			    JOptionPane.showMessageDialog(this, "Reussi !");
			    
			    viderChamps ();
	        
		}
		        
		}else if(e.getSource() == btAjouter && this.btAjouter.getText().equals("Modifier")) {

			if((this.cbx_id_appart.getSelectedItem().toString() == "") || (this.cbx_id_contrat.getSelectedItem().toString() == "")) {
				JOptionPane.showMessageDialog(this, "Merci de choisir l'appartement & un contrat", "Attention", JOptionPane.WARNING_MESSAGE);
				
			}else {
		    int retour = JOptionPane.showConfirmDialog(this, "Confirmer !", "Modifier", JOptionPane.YES_NO_OPTION);
	        if (retour == 0) {
	        	String civilite_proprio = this.cbx_civilite_proprio.getSelectedItem().toString();
	        	String nom_proprio = this.Txt_nom_Proprio.getText();
	        	String prenom_proprio = this.Txt_prenom_proprio.getText();
	        	String statut_proprio = this.Txt_statut_proprio.getText();
	        	String email_proprio = this.Txt_email_proprio.getText();
	        	//String mdp_proprio = new String(this.Txt_mdp_proprio.getPassword());
				String tel_proprio = this.Txt_tel_proprio.getText();
				String adresse_proprio = this.Txt_adresse_proprio.getText();
				String cp_proprio = this.Txt_cp_proprio.getText();
				String pays_proprio = this.Txt_pays_proprio.getText();
				String ville_proprio = this.Txt_ville_proprio.getText();

				String chaine = this.cbx_id_appart.getSelectedItem().toString();
				String tab [] = chaine.split("-"); 
				int id_appart = Integer.parseInt(tab[0]);
				
				
				chaine = this.cbx_id_contrat.getSelectedItem().toString();
				tab = chaine.split("-");
				int id_contrat = Integer.parseInt(tab[0]);
				
				int numLigne = this.tableProprietaire.getSelectedRow();
				int id_proprietaire = Integer.parseInt(this.tableProprietaire.getValueAt(numLigne, 0).toString());

				//instancier  
				Proprietaire unProprietaire = new Proprietaire(id_proprietaire,id_appart, id_contrat,civilite_proprio, nom_proprio,prenom_proprio, statut_proprio, email_proprio
						,tel_proprio,adresse_proprio,cp_proprio,ville_proprio,pays_proprio);
				//on l'enregistre dans la base de données 
				C_Proprietaire.updateProprietaire(unProprietaire);
				//récupération de l'id à partir de la BDD 
				unProprietaire = C_Proprietaire.selectWhereProprietaire(email_proprio); 
				Object ligne[] = {unProprietaire.getId_proprietaire(),unProprietaire.getId_contrat(),unProprietaire.getId_appart(), unProprietaire.getCivilite_proprio(), unProprietaire.getNom_proprio(), unProprietaire.getPrenom_proprio(), unProprietaire.getStatut_proprio()
						 ,unProprietaire.getEmail_proprio(), unProprietaire.getTel_proprio(),unProprietaire.getAdresse_proprio(),unProprietaire.getCp_proprio(), 
						 unProprietaire.getVille_proprio(),unProprietaire.getPays_proprio()};
				this.unTableau.updateLigne(numLigne, ligne);
			    JOptionPane.showMessageDialog(this, "Reussi !");
			    
			    viderChamps ();
		
	        }
			}
		}else if(e.getSource() == btModifier){	
		    this.btAjouter.setVisible(true);
	        update(); 
		}else if(e.getSource() == btSupprimer){	
	        delete(); 
		}
	}
	
	public void update() {
		int numLigne = tableProprietaire.getSelectedRow();
		int id_proprietaire = Integer.parseInt(tableProprietaire.getValueAt(numLigne, 0).toString());
		
		cbx_id_contrat.setSelectedItem(tableProprietaire.getValueAt(numLigne, 1).toString());
		cbx_id_appart.setSelectedItem(tableProprietaire.getValueAt(numLigne, 2).toString());
		cbx_civilite_proprio.setSelectedItem(tableProprietaire.getValueAt(numLigne, 3));
		Txt_nom_Proprio.setText(tableProprietaire.getValueAt(numLigne, 4).toString());
		Txt_prenom_proprio.setText(tableProprietaire.getValueAt(numLigne, 5).toString());
		Txt_statut_proprio.setText(tableProprietaire.getValueAt(numLigne, 6).toString());
		Txt_email_proprio.setText(tableProprietaire.getValueAt(numLigne, 7).toString());
		Txt_tel_proprio.setText(tableProprietaire.getValueAt(numLigne, 8).toString());
		Txt_adresse_proprio.setText(tableProprietaire.getValueAt(numLigne, 9).toString());
		Txt_cp_proprio.setText(tableProprietaire.getValueAt(numLigne, 10).toString());
		Txt_ville_proprio.setText(tableProprietaire.getValueAt(numLigne, 11).toString());
		Txt_pays_proprio.setText(tableProprietaire.getValueAt(numLigne, 12).toString());

		btAjouter.setText("Modifier");
	}
	public void delete() {
		int numLigne = tableProprietaire.getSelectedRow();
		int id_proprietaire = Integer.parseInt(tableProprietaire.getValueAt(numLigne, 0).toString());
		
		int retour = JOptionPane.showConfirmDialog(null, "Confirmer la suppression du proprietaire", "Supprimer",JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
		if(retour == 0) {
			C_Proprietaire.deleteProprietaire(id_proprietaire);
			unTableau.deleteLigne(numLigne);
			JOptionPane.showMessageDialog(null, "Suppression réussi !");
		}
	
	}
}