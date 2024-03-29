package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import controller.Admin;
import controller.C_Admin;
import controller.NeigeSoleil;

public class VueGenerale extends JFrame implements ActionListener{
	private JPanel panelMenu = new JPanel();
	private JButton btAppartement = new JButton("Appartements", new ImageIcon("src/Images/logos/dashboard.png"));
	private JButton btContrat = new JButton("Contrats           ", new ImageIcon("src/Images/logos/contrat.png"));
	private JButton btProrietaire = new JButton("Proprietaires   ",  new ImageIcon("src/Images/logos/proprietaire.png"));
	private JButton btLocataire = new JButton("Locataires       ", new ImageIcon("src/Images/logos/locataire.png"));
	private JButton btReservation = new JButton("Réservations   ", new ImageIcon("src/Images/logos/reservation.png"));
	private JButton btProfil = new JButton("Profil");

	private JButton btDeconnecter = new JButton("Deconnecter    ", new ImageIcon("src/Images/logos/parametres.png"));
	
	private JButton btDashboard = new JButton("", new ImageIcon("src/Images/logos/activité.png"));

	private JLabel txtidentifiant = new JLabel();
	private PanelDashboard unPanelDashboard = new PanelDashboard();	

	private PanelProfil unPanelProfil = new PanelProfil();	
	private PanelAppartement unPanelAppartement = new PanelAppartement();	
	private PanelContrat unPanelContrat = new PanelContrat();	
	private PanelProprietaire unPanelProprietaire = new PanelProprietaire();	
	private PanelLocataire unPanelLocataire = new PanelLocataire();	
	private PanelReservation unPanelReservation = new PanelReservation();	

	
	//Profil 
	private JLabel txt_nom_prenom = new JLabel("");
	private JLabel txt_email = new JLabel("");
	private Admin Admin;


	
	public VueGenerale() {
	    this.setTitle("Neige et Soliel");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
	    this.setBounds(15, 20, 1500, 800);
	    this.getContentPane().setBackground(new Color(255, 255, 255));
	    this.setLayout(null);
	    
	    ImageIcon fond_top = new ImageIcon("src/Images/bar.png"); //Image blue du top
	    JLabel Labelfond_top = new JLabel(fond_top);
	    Labelfond_top.setBounds(0, 0, 1500, 150);
	    this.add(Labelfond_top);
	    
	    ImageIcon profil = new ImageIcon("src/Images/profil.png"); //Image blue du top
	    JLabel Labelprofil = new JLabel(profil);
	    Labelprofil.setBounds(75, 120, 100, 200);
	    this.add(Labelprofil);

	
		this.txt_nom_prenom.setBounds(95, 260, 100, 50);
		this.txt_email.setBounds(75, 280, 150, 50);

	    this.Admin = VueConnexion.getAdmin();
	    this.txt_nom_prenom.setText(Admin.getNom()+" "+Admin.getPrenom());
	    
	    this.txt_email.setText(Admin.getEmail());
	    
	    this.add(this.txt_nom_prenom);
	    this.add(this.txt_email);
	    
	    this.btProfil.setBounds(75,320,100, 20);

	    this.panelMenu.setBounds(40, 380, 170, 200);
		this.panelMenu.setBackground(new Color (255, 255, 255));
	    this.panelMenu.setLayout(new GridLayout(6,4));
	   
	    
	    this.btAppartement.setBackground(new Color(223, 236, 239));
	    this.btContrat.setBackground(new Color(223, 236, 239));
	    this.btProrietaire.setBackground(new Color(223, 236, 239));
	    this.btLocataire.setBackground(new Color(223, 236, 239));
	    this.btReservation.setBackground(new Color(223, 236, 239));
	    this.btDeconnecter.setBackground(new Color(223, 236, 239));

	    Border matteborder = BorderFactory.createMatteBorder(1, 1, 3, 1, Color.white);
	    this.btAppartement.setBorder(matteborder);
	    this.btContrat.setBorder(matteborder);
	    this.btProrietaire.setBorder(matteborder);
	    this.btLocataire.setBorder(matteborder);
	    this.btReservation.setBorder(matteborder);
	    this.btDeconnecter.setBorder(matteborder);
	    this.btProfil.setBorder(matteborder);
	    
	    this.btProfil.setBackground(new Color(42, 165, 246));
	    this.btDeconnecter.setBackground(new Color(233, 38, 15));
	    this.btDeconnecter.setForeground(new Color(255, 255, 255)); //couleur de text White


	    
	    this.btAppartement.addActionListener(this);
	    this.btContrat.addActionListener(this);
	    this.btProrietaire.addActionListener(this);
	    this.btLocataire.addActionListener(this);
	    this.btReservation.addActionListener(this);
	    this.btDeconnecter.addActionListener(this);
	    this.btProfil.addActionListener(this);
	    this.btDashboard.addActionListener(this);


	   this.panelMenu.add(this.btAppartement);
       this.panelMenu.add(this.btContrat);
       this.panelMenu.add(this.btProrietaire);
       this.panelMenu.add(this.btLocataire);
       this.panelMenu.add(this.btReservation);
       this.panelMenu.add(this.btDeconnecter);
	    	    	    
	    this.add(this.panelMenu);

	    this.add(this.unPanelDashboard);
	    this.add(this.unPanelProfil);
	    this.add(this.unPanelAppartement);
	    this.add(this.unPanelContrat);
	    this.add(this.unPanelProprietaire);
	    this.add(this.unPanelLocataire);
	    this.add(this.unPanelReservation);
	    this.add(this.unPanelDashboard);


	    
	    this.add(btProfil);
	    
	    this.btDashboard.setBounds(10, 150, 50, 50);
	    this.btDashboard.setBackground(new Color(255,255,255));
	    this.add(btDashboard);
	    
	    this.setVisible(false);
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {
	    // Couleur de fond par défaut pour les boutons inactifs
	    Color couleurDefaut = new Color(223, 236, 239);
	    
	    // Tableau des boutons à modifier
	    JButton[] boutons = {this.btAppartement, this.btContrat, this.btProrietaire, this.btLocataire, this.btReservation};
	    
	    // Itérer sur les boutons et mettre à jour leur couleur de fond
	    for (JButton bouton : boutons) {
	        if (e.getSource() == bouton) {
	            bouton.setBackground(new Color(255, 200, 57));
	        } else {
	            bouton.setBackground(couleurDefaut);
	        }
	    }
	    
	    // Gérer le clic sur le bouton de déconnexion
	    if (e.getSource() == this.btDeconnecter) {
	        int retour = JOptionPane.showConfirmDialog(this, "Se déconnecter !", "Quitter l'application", JOptionPane.YES_NO_OPTION);
	        if (retour == 0) {
	            NeigeSoleil.rendreVisibleVueGenerale(false);
	            NeigeSoleil.rendreVisibleVueConnexion(true);
	        }
	    }else if (e.getSource() == this.btProfil) {
	    	this.affichePanel(1);
	    }else if (e.getSource() == this.btAppartement) {
	    	this.affichePanel(2);
	    }else if (e.getSource() == this.btContrat) {
	    	this.affichePanel(3);
	    }else if (e.getSource() == this.btProrietaire) {
	    	this.affichePanel(4);
	    }else if (e.getSource() == this.btLocataire) {
	    	this.affichePanel(5);
	    }else if (e.getSource() == this.btReservation) {
	    	this.affichePanel(6);
	    }else if (e.getSource() == this.btDashboard) {
	    	this.affichePanel(7);
	    }
	}

	public void affichePanel( int numero) {
		this.unPanelDashboard.setVisible(false);
		this.unPanelProfil.setVisible(false);
		this.unPanelAppartement.setVisible(false);
		this.unPanelContrat.setVisible(false);
		this.unPanelProprietaire.setVisible(false);
		this.unPanelLocataire.setVisible(false);
		this.unPanelReservation.setVisible(false);
		this.unPanelDashboard.setVisible(false);
		
		switch (numero) {
		case 1: 
			this.unPanelProfil.setVisible(true);
			break;
		case 2:
			this.unPanelAppartement.setVisible(true);
			break;
		case 3:
			this.unPanelContrat.setVisible(true);
			break;
		case 4:
			this.unPanelProprietaire.setVisible(true);
			break;
		case 5:
			this.unPanelLocataire.setVisible(true);
			break;
		case 6:
			this.unPanelReservation.setVisible(true);
			break;
		case 7 : 
			this.unPanelDashboard.setVisible(true);
			break;
		}
	}
}
