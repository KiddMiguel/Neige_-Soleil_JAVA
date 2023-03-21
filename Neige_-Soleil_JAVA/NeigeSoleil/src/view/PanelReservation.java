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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.Appartement;
import controller.C_Appartement;
import controller.C_Contrat;
import controller.C_Reservation;
import controller.C_User;
import controller.Contrat;
import controller.Reservation;
import controller.Tableau;
import controller.User;

public class PanelReservation extends PanelPrincipal implements ActionListener {

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
    private JButton btModifier = new JButton("Modifier");
    private JButton btSupprimer = new JButton("Supprimer");
    
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
        
        this.btSupprimer.setBackground(new Color (176, 7, 7));
        this.btSupprimer.setForeground(new Color(255, 255, 255));

        this.add(panelForm);
        this.remplirCBX();
        
     // Construction un tableau
	    String entetes [] = {"N° Reservation","Statut", "Date_debut", "Date_fin", "Prix", "Nb_Personnes","id appart","id lol"}; 
	    Object [][] donnees = this.getDonnees();
	    
		this.unTableau = new Tableau (donnees, entetes);
		this.tableReservation = new JTable(this.unTableau);
		
		JScrollPane uneScroll = new JScrollPane(this.tableReservation); 
		uneScroll.setBounds(20, 80, 900, 520);
		this.add(uneScroll);
		
		this.tableReservation.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int numLigne = tableReservation.getSelectedRow();
				int id_reservation = Integer.parseInt(tableReservation.getValueAt(numLigne, 0).toString());

				if(e.getClickCount()>=1) {
				    JPanel panel = new JPanel();
				    JFrame frame = new JFrame();

				    frame.getContentPane().add(panel);
				    frame.pack();
				    frame.setBackground(new Color (142, 197, 243));
				    frame.setBounds(935, 20, 300, 580);    
				    frame.setLocationRelativeTo(null);

				    panel.setLayout(new GridLayout(15,20));        

				    panel.add(new JLabel("Statut"));
				    JButton lestatut = new JButton(tableReservation.getValueAt(numLigne, 1).toString());
				    panel.add(lestatut);
				    if (lestatut.getText().equals("Réservé")) {
				        lestatut.setBackground(new Color(176, 7, 7));
				    } else {
				        lestatut.setBackground(Color.YELLOW);
				    }

				    panel.add(new JLabel("Date_debut"));
				    panel.add(new JButton(tableReservation.getValueAt(numLigne, 2).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Date_fin"));
				    panel.add(new JButton(tableReservation.getValueAt(numLigne, 3).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("prix"));
				    panel.add(new JButton(tableReservation.getValueAt(numLigne, 4).toString()+" €")).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("nb_Personnes"));
				    panel.add(new JButton(tableReservation.getValueAt(numLigne, 5).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel(" "));
				    panel.add(new JLabel(" "));

				    panel.add(btSupprimer);
				    panel.add(btModifier);

				    frame.setVisible(true);
				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
				

		});
		


	    this.setVisible(false);
	}
	
	
    
    public Object [][] getDonnees()
	{
		ArrayList<Reservation> lesReservations = C_Reservation.selectAllReservations(); 
		Object [][] matrice = new Object [lesReservations.size()][8]; 
		int i=0; 
		for (Reservation unReservation : lesReservations)
		{
			matrice[i][0]  = unReservation.getId_reservation(); 
			matrice[i][1]  = unReservation.getStatut_reservation(); 
			matrice[i][2]  = unReservation.getDate_debut_reservation(); 
			matrice[i][3]  = unReservation.getDate_fin_reservation(); 
			matrice[i][4]  = unReservation.getPrix_reservation();
			matrice[i][5]  = unReservation.getNb_personnes();
			matrice[i][6]  = unReservation.getId_user();
			matrice[i][7]  = unReservation.getId_appart();
			
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



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btAnnuler) {
			this.viderChamps ();
			this.btAjouter.setText("Ajouter");
		}else if(e.getSource() == btAjouter && this.btAjouter.getText().equals("Ajouter")) {
			
		    int retour = JOptionPane.showConfirmDialog(this, "Confirmer l'ajout d'un contrat !", "Ajouter", JOptionPane.YES_NO_OPTION);
	        if (retour == 0) {
	        	
	        
	        	 String statut_reservation = this.cbx_statut_reserv.getSelectedItem().toString();
				
		        	String date_debut_reservation = this.txt_date_debut_reserv.getText();
					String date_fin_reservation = this.txt_date_fin_reserv.getText();
					float prix_reservation = Float.parseFloat(this.txt_prix_reserv.getText());
					int nb_personne_reservation = Integer.parseInt(this.txt_nb_personnes_reserv.getText());

					String chaine = this.cbx_id_user.getSelectedItem().toString();
					String tab [] = chaine.split("-"); 
					int id_user = Integer.parseInt(tab[0]);
					
					
					chaine = this.cbx_id_appart.getSelectedItem().toString();
					tab = chaine.split("-");
					int id_appart = Integer.parseInt(tab[0]);

					//instancier  
					Reservation uneReservation = new Reservation(statut_reservation, date_debut_reservation, date_fin_reservation, prix_reservation,nb_personne_reservation,id_appart,id_user);
					//on l'enregistre dans la base de données 
					C_Reservation.insertReservation(uneReservation);
				
					
					//récupération de l'id à partir de la BDD 
					uneReservation = C_Reservation.selectWhereReservation(statut_reservation); 
					//ajout du dans le Tableau 
					Object ligne[] = {uneReservation.getId_reservation(), uneReservation.getStatut_reservation(), uneReservation.getDate_debut_reservation(), uneReservation.getDate_fin_reservation(), uneReservation.getPrix_reservation(), uneReservation.getNb_personnes()};
					this.unTableau.insertLigne(ligne);
				    JOptionPane.showMessageDialog(this, "Reussi !");
				    viderChamps ();
		        }
	    
			}else if(e.getSource() == btAjouter && this.btAjouter.getText().equals("Modifier")) {
				
			    int retour = JOptionPane.showConfirmDialog(this, "Confirmer l'ajout d'un contrat !", "Ajouter", JOptionPane.YES_NO_OPTION);
		        if (retour == 0) {
		        	 String statut_reservation = this.cbx_statut_reserv.getSelectedItem().toString();
						
			        	String date_debut_reservation = this.txt_date_debut_reserv.getText();
						String date_fin_reservation = this.txt_date_fin_reserv.getText();
						float prix_reservation = Float.parseFloat(this.txt_prix_reserv.getText());
						int nb_personne_reservation = Integer.parseInt(this.txt_nb_personnes_reserv.getText());

					String chaine = this.cbx_id_user.getSelectedItem().toString();
					String tab [] = chaine.split("-"); 
					int id_user = Integer.parseInt(tab[0]);
					
					
					chaine = this.cbx_id_appart.getSelectedItem().toString();
					tab = chaine.split("-");
					int id_appart = Integer.parseInt(tab[0]);
					int numLigne = this.tableReservation.getSelectedRow();
					int id_contrat = Integer.parseInt(this.tableReservation.getValueAt(numLigne, 0).toString());

					
					//instancier  
					Reservation uneReservation = new Reservation(statut_reservation, date_debut_reservation, date_fin_reservation, prix_reservation,nb_personne_reservation,id_appart,id_user);
					//on l'enregistre dans la base de données 
					C_Reservation.insertReservation(uneReservation);
				
					
					//récupération de l'id à partir de la BDD 
					uneReservation = C_Reservation.selectWhereReservation(statut_reservation); 
					//ajout du dans le Tableau 
					Object ligne[] = {uneReservation.getId_reservation(), uneReservation.getStatut_reservation(), uneReservation.getDate_debut_reservation(), uneReservation.getDate_fin_reservation(), uneReservation.getPrix_reservation(), uneReservation.getNb_personnes()};
					this.unTableau.insertLigne(ligne);
				    JOptionPane.showMessageDialog(this, "Reussi !");
				    viderChamps ();
		        	}
		        }else if(e.getSource() == btModifier){	
			        update();
				}else if(e.getSource() == btSupprimer){	
			        delete(); 
				}
			
			
			
		}
		public void update() {
			int numLigne = tableReservation.getSelectedRow();
			int id_reservation = Integer.parseInt(tableReservation.getValueAt(numLigne, 0).toString());
			
			cbx_statut_reserv.setSelectedItem(tableReservation.getValueAt(numLigne, 1).toString());
			txt_date_debut_reserv.setText(tableReservation.getValueAt(numLigne, 2).toString());
			txt_date_fin_reserv.setText(tableReservation.getValueAt(numLigne, 3).toString());
			txt_prix_reserv.setText(tableReservation.getValueAt(numLigne, 4).toString());
			txt_nb_personnes_reserv.setText(tableReservation.getValueAt(numLigne, 5).toString());
			cbx_id_user.setSelectedItem(tableReservation.getValueAt(numLigne, 6).toString());
			cbx_id_appart.setSelectedItem(tableReservation.getValueAt(numLigne, 7).toString());

			btAjouter.setText("Modifier");
		}
		public void delete() {
			int numLigne = tableReservation.getSelectedRow();
			int id_reservation = Integer.parseInt(tableReservation.getValueAt(numLigne, 0).toString());
			
			int retour = JOptionPane.showConfirmDialog(null, "Confirmer la suppression de la resrvation", "Supprimer",JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
			if(retour == 0) {
				C_Reservation.deleteReservation(id_reservation);
				unTableau.deleteLigne(numLigne);
				JOptionPane.showMessageDialog(null, "Suppression réussi !");
			}
		}
    
    
}
