package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.Appartement;
import controller.C_Appartement;
import controller.C_Contrat;
import controller.C_Proprietaire;
import controller.Contrat;
import controller.Proprietaire;
import controller.Tableau;

public class PanelProprietaire extends PanelPrincipal implements ActionListener {
	
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
	
	
	// Variable listes dï¿½roulant 
	private JComboBox<String> cbx_id_user = new JComboBox<String>();
	private JComboBox<String> cbx_id_contrat = new JComboBox<String>();
	private JComboBox<String> cbx_id_appart = new JComboBox<String>();
	private JComboBox<String> cbx_civilite_proprio = new JComboBox<String>();
	
	//button
	private JButton btAjouter = new JButton("Ajouter");
	private JButton btAnnuler = new JButton ("Annuler");
	
	//Tableau
	private JTable tableProprietaire ; 
	private Tableau unTableau ; 
	
    public PanelProprietaire ()
    {
        super();
        this.titre.setText("Proprietaire");
        
        this.panelForm.setBounds(930, 20, 300, 580);
        this.panelForm.setBackground(new Color(142, 197, 243));
        this.panelForm.setLayout(new GridLayout(31,1));
        
        this.panelForm.add(new JLabel ("Sexe"));
		this.panelForm.add(this.cbx_civilite_proprio);
       
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
        
        this.panelForm.add(new JLabel ("Numero de tï¿½lï¿½phone"));
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
		this.panelForm.add(this.cbx_id_contrat);
		this.panelForm.add(new JLabel ("Appartement"));
		this.panelForm.add(this.cbx_id_appart);
		
		this.btAnnuler.setBounds(930, 555, 300, 22);
        this.add(this.btAnnuler);
       
        this.btAjouter.setBounds(930, 575, 300, 22);
        this.add(this.btAjouter);
		
		
	    this.setLayout(null);
	    
	    this.add(panelForm);
	    
	    this.remplirCBX();
	    
	   // Construction un tableau
	    String entetes [] = {"N° Proprietaire", "Contrat", "Appart", "Nom", "Prenom", "Statut","Email", "Teléphone", "Adresse", "Ville"}; 
	    Object [] [] donnees = this.getDonnees();
	    
	    this.unTableau = new Tableau (donnees, entetes);
	    this.tableProprietaire = new JTable (this.unTableau);
	    this.tableProprietaire.setBackground(new Color (142, 197, 243));
	    
	    JScrollPane uneScroll = new JScrollPane(this.tableProprietaire);
	    uneScroll.setBounds(20, 80, 900, 520);
	    this.add(uneScroll);
	    

	    this.setVisible(false);
    }
    
    public Object [] [] getDonnees(){
    	
    	ArrayList<Proprietaire> lesProprietaire = C_Proprietaire.selectAllProprietaire();
    	Object [] [] matrice = new Object [lesProprietaire.size()][10];
    	int i=0;
    	for (Proprietaire unProprietaire : lesProprietaire)
    	{
    		
    		matrice[i][0] = unProprietaire.getId_proprietaire();
    		matrice[i][1] = unProprietaire.getId_contrat();
    		matrice[i][2] = unProprietaire.getId_appart();
    		matrice[i][3] = unProprietaire.getNom_proprio();
    		matrice[i][4] = unProprietaire.getPrenom_proprio();
    		matrice[i][5] = unProprietaire.getStatut_proprio();
    		matrice[i][6] = unProprietaire.getEmail_proprio();
    		matrice[i][7] = unProprietaire.getTel_proprio();
    		matrice[i][8] = unProprietaire.getAdresse_proprio();
    		matrice[i][9] = unProprietaire.getVille_proprio();
    		i++;
    	}
    	return matrice; 
    }
    
    public void remplirCBX ()
    {
   
    	//supprimer ou vider le CBX id_contrat
    	this.cbx_id_contrat.removeAllItems();
    	//recupérer de la base de donnees tout les contrats
    	ArrayList<Contrat> lesContrats = C_Contrat.selectAllContrat(); 
    	//parcourir lesClients et remplir le CBX
    	for (Contrat unContrat : lesContrats)
    	{
    		this.cbx_id_contrat.addItem(unContrat.getId_contrat()+
    				"-"+unContrat.getStatut_contrat()+
    				"| DD "+unContrat.getDate_debut_contrat()+
    				"| DF "+unContrat.getDate_fin_contrat());
    	}
    	//Supprimer ou vider le CBX id_Appartement
    	this.cbx_id_appart.removeAllItems();
    	//recupérer de la base de donnees tous les appartement
    	ArrayList<Appartement> lesAppartements = C_Appartement.selectAllAppartements();
    	
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
    	this.Txt_code_adherent.setText("");
    	
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}