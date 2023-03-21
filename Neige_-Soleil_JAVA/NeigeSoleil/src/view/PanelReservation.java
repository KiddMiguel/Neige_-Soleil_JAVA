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
import controller.C_Reservation;
import controller.C_User;
import controller.Reservation;
import controller.Tableau;
import controller.User;

public class PanelReservation extends PanelPrincipal {

    private JPanel panelForm = new JPanel();

    // Variables
	String[] choix_statut_reserv = {"En cours", "Réservé"};
	private JComboBox <String>cbx_statut_reserv = new JComboBox<String>(choix_statut_reserv);
	
    private JTextField txt_date_debut_reserv = new JTextField();
    private JTextField txt_date_fin_reserv = new JTextField();
    private JTextField txt_prix_reserv = new JTextField();
    private JTextField txt_nb_personnes_reserv = new JTextField();

    // Variables vides

    // Variables Listes deroulantes
    private JComboBox<String> cbx_id_user = new JComboBox<String>();
    private JComboBox<String> cbx_id_appart = new JComboBox<String>();
    private JComboBox<String> cbx_id_materiel_proprio = new JComboBox<String>();

    // Bouttons
    private JButton btAjouter = new JButton("Ajouter");
    private JButton btAnnuler = new JButton("Annuler");
    
 // Tableau
  	private JTable tableReservation ; 
  	private Tableau unTableau ;

    public PanelReservation() {
        super();
        this.titre.setText("Reservations");

        this.panelForm.setBounds(935, 20, 300, 580);
        this.panelForm.setBackground(new Color(142, 197, 243));
        this.panelForm.setLayout(new GridLayout(18, 6));

        // Affichage des inputs et des texts
        this.panelForm.add(new JLabel("Statut"));
        this.panelForm.add(this.cbx_statut_reserv);

        this.panelForm.add(new JLabel("Date début"));
        this.panelForm.add(this.txt_date_debut_reserv);

        this.panelForm.add(new JLabel("Date fin"));
        this.panelForm.add(this.txt_date_fin_reserv);

        this.panelForm.add(new JLabel("Prix"));
        this.panelForm.add(this.txt_prix_reserv);

        this.panelForm.add(new JLabel("Nb personnes"));
        this.panelForm.add(this.txt_nb_personnes_reserv);

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
	    String entetes [] = {"N° Reservation","Statut", "Date_debut", "Date_fin", "Prix", "Nb_Personnes"}; 
	    Object [][] donnees = this.getDonnees();
	    
		this.unTableau = new Tableau (donnees, entetes);
		this.tableReservation = new JTable(this.unTableau);
		
		JScrollPane uneScroll = new JScrollPane(this.tableReservation); 
		uneScroll.setBounds(20, 80, 900, 520);
		this.add(uneScroll);

        this.setVisible(false);
    }
    
    public Object [][] getDonnees()
	{
		ArrayList<Reservation> lesReservations = C_Reservation.selectAllReservations(); 
		Object [][] matrice = new Object [lesReservations.size()][6]; 
		int i=0; 
		for (Reservation unReservation : lesReservations)
		{
			matrice[i][0]  = unReservation.getId_reservation(); 
			matrice[i][1]  = unReservation.getStatut_reservation(); 
			matrice[i][2]  = unReservation.getDate_debut_reservation(); 
			matrice[i][3]  = unReservation.getDate_fin_reservation(); 
			matrice[i][3]  = unReservation.getDate_fin_reservation();
			matrice[i][4]  = unReservation.getPrix_reservation();
			matrice[i][5]  = unReservation.getNb_personnes();
			
			i++;
		}
		return matrice;
	}
    
 // remplire les combos Box
    public void remplirCBX ()
    {
    	//supprimer ou vider le CBX id_contrat 
    	this.cbx_id_appart.removeAllItems();
    	//récupérer de la base de données tous les reservations
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
		this.txt_date_debut_reserv.setText("");
		this.txt_date_fin_reserv.setText("");
		this.txt_prix_reserv.setText("");
		this.txt_nb_personnes_reserv.setText("");
	}
}
