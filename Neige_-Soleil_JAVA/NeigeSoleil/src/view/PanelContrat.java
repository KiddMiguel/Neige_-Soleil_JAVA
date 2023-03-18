package view;

import java.awt.Color;
import java.awt.GridLayout;
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
import controller.C_Locataire;
import controller.C_Proprietaire;
import controller.C_User;
import controller.Contrat;
import controller.Locataire;
import controller.Proprietaire;
import controller.Tableau;
import controller.User;

public class PanelContrat extends PanelPrincipal {

    private JPanel panelForm = new JPanel();

    // Variables
	String[] choix_statut_contrat = {"En cours", "Résilié"};
	private JComboBox <String>cbx_statut_contrat = new JComboBox<String>(choix_statut_contrat);
	
    private JTextField txt_date_debut_contrat = new JTextField();
    private JTextField txt_date_fin_contrat = new JTextField();
    private JTextField txt_date_sign_contrat = new JTextField();

    // Variables vides

    // Variables Listes deroulantes
    private JComboBox<String> cbx_id_user = new JComboBox<String>();
    private JComboBox<String> cbx_id_appart = new JComboBox<String>();

    // Bouttons
    private JButton btAjouter = new JButton("Ajouter");
    private JButton btAnnuler = new JButton("Annuler");
    
 // Tableau
 	private JTable tableContrat ; 
 	private Tableau unTableau ; 

    public PanelContrat() {
        super();
        this.titre.setText("Contrats");

        this.panelForm.setBounds(935, 20, 300, 580);
        this.panelForm.setBackground(new Color(142, 197, 243));
        this.panelForm.setLayout(new GridLayout(18,1));

        // Affichage des inputs et des texts
        this.panelForm.add(new JLabel("Statut"));
        this.panelForm.add(this.cbx_statut_contrat);

        this.panelForm.add(new JLabel("Date début"));
        this.panelForm.add(this.txt_date_debut_contrat);

        this.panelForm.add(new JLabel("Date fin"));
        this.panelForm.add(this.txt_date_fin_contrat);

        this.panelForm.add(new JLabel("Date signature"));
        this.panelForm.add(this.txt_date_sign_contrat);

        this.panelForm.add(new JLabel("Utilisateur"));
        this.panelForm.add(this.cbx_id_user);

        this.panelForm.add(new JLabel("Appartement"));
        this.panelForm.add(this.cbx_id_appart);

        this.btAnnuler.setBounds(935, 532, 300, 30);
        this.add(this.btAnnuler);
        
        this.btAjouter.setBounds(935, 568, 300, 30);
        this.add(this.btAjouter);

        this.add(panelForm);
	    this.remplirCBX();
	    
	 // Construction un tableau
	    String entetes [] = {"N° Contrat","Statut", "Date_debut", "Date_fin", "Date_sign"}; 
	    Object [][] donnees = this.getDonnees();
	    
		this.unTableau = new Tableau (donnees, entetes);
		this.tableContrat = new JTable(this.unTableau);
		
		JScrollPane uneScroll = new JScrollPane(this.tableContrat); 
		uneScroll.setBounds(20, 80, 900, 520);
		this.add(uneScroll);

        this.setVisible(false);
    }
    
    public Object [][] getDonnees()
	{
		ArrayList<Contrat> lesContrats = C_Contrat.selectAllContrat(); 
		Object [][] matrice = new Object [lesContrats.size()][5]; 
		int i=0; 
		for (Contrat unContrat : lesContrats)
		{
			matrice[i][0]  = unContrat.getId_contrat(); 
			matrice[i][1]  = unContrat.getStatut_contrat(); 
			matrice[i][2]  = unContrat.getDate_debut_contrat(); 
			matrice[i][3]  = unContrat.getDate_fin_contrat(); 
			matrice[i][4]  = unContrat.getDate_sign_contrat();
			
			i++;
		}
		return matrice;
	}
    
 // remplire les combos Box
    public void remplirCBX ()
    {
    	//supprimer ou vider le CBX id_contrat 
    	this.cbx_id_appart.removeAllItems();
    	//récupérer de la base de données tous les contrats
    	ArrayList<Appartement> lesAppartements= C_Appartement.selectAllAppartements(); 
    	//parcourir les contrats et remplir le CBX 
    	for(Appartement unAppartement : lesAppartements)
    	{
    		this.cbx_id_appart.addItem(unAppartement.getId_appart()+"-"+unAppartement.getIntitule_appart());
    	}
    	
        this.cbx_id_user.removeAllItems();
        //récupérer de la base de données tous les contrats
        ArrayList<User> lesUsers= C_User.selectAllUser(); 
        //parcourir les contrats et remplir le CBX 
        for(User unUser : lesUsers)
        {
            this.cbx_id_user.addItem(unUser.getId_user()+"-"+unUser.getNom_user()+"-"+unUser.getPrenom_user());
        }
    }

    public void viderChamps ()
	{
		this.txt_date_debut_contrat.setText("");
		this.txt_date_fin_contrat.setText("");
		this.txt_date_sign_contrat.setText("");
	}
}
