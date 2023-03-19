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
import controller.C_Locataire;
import controller.C_Proprietaire;
import controller.C_User;
import controller.Contrat;
import controller.Locataire;
import controller.Proprietaire;
import controller.Tableau;
import controller.User;

public class PanelContrat extends PanelPrincipal implements ActionListener{

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
	private JButton btModifier = new JButton("Modifier");
	private JButton btSupprimer = new JButton("Supprimer");
    
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
	    String entetes [] = {"N° Contrat","Statut", "Date_debut", "Date_fin", "Date_sign", "N° utilisateur", "N° Appartement"}; 
	    Object [][] donnees = this.getDonnees();
	    
		this.unTableau = new Tableau (donnees, entetes);
		this.tableContrat = new JTable(this.unTableau);
		
		JScrollPane uneScroll = new JScrollPane(this.tableContrat); 
		uneScroll.setBounds(20, 80, 900, 520);
		this.add(uneScroll);
		
		
		this.tableContrat.addMouseListener(new MouseListener() {
			
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
				int numLigne = tableContrat.getSelectedRow();
				int id_contrat = Integer.parseInt(tableContrat.getValueAt(numLigne, 0).toString());
				
				if(e.getClickCount()>=1) {
					JPanel panel = new JPanel();
				    JFrame frame = new JFrame();
				    
				    frame.getContentPane().add(panel);
				    frame.pack();
				    frame.setBackground(new Color (142, 197, 243));
				    frame.setBounds(935, 20, 300, 500);	
				    frame.setLocationRelativeTo(null);
			
				    panel.setLayout(new GridLayout(12,20));	
					
				    panel.add(new JLabel("Statut Contrat"));
				    panel.add(new JButton(tableContrat.getValueAt(numLigne, 1).toString())).setBackground(Color.YELLOW);
					 
				    panel.add(new JLabel("Date debut contrat"));
				    panel.add(new JButton(tableContrat.getValueAt(numLigne, 2).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));

				    panel.add(new JLabel("Date fin Contrat"));
				    panel.add(new JButton(tableContrat.getValueAt(numLigne, 3).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));
				
				    panel.add(new JLabel("Date Signature Contrat"));
				    panel.add(new JButton(tableContrat.getValueAt(numLigne, 4).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));
				
				    panel.add(new JLabel("N° Utilisateur"));
				    panel.add(new JButton(tableContrat.getValueAt(numLigne, 5).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));
				    panel.add(new JLabel("N° Appartement"));
				    panel.add(new JButton(tableContrat.getValueAt(numLigne, 6).toString())).setFont(new Font("Tahoma", Font.BOLD, 10));
 
				    panel.add(new JLabel(" "));
					 panel.add(new JLabel(" "));
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
		ArrayList<Contrat> lesContrats = C_Contrat.selectAllContrat(); 
		Object [][] matrice = new Object [lesContrats.size()][7]; 
		int i=0; 
		for (Contrat unContrat : lesContrats)
		{
			matrice[i][0]  = unContrat.getId_contrat(); 
			matrice[i][1]  = unContrat.getStatut_contrat(); 
			matrice[i][2]  = unContrat.getDate_debut_contrat(); 
			matrice[i][3]  = unContrat.getDate_fin_contrat(); 
			matrice[i][4]  = unContrat.getDate_sign_contrat();
			matrice[i][5]  = unContrat.getId_user();
			matrice[i][6]  = unContrat.getId_appart();
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btAnnuler) {
			this.viderChamps ();
			this.btAjouter.setText("Ajouter");
		}
		else if(e.getSource() == btAjouter && this.btAjouter.getText().equals("Ajouter")) {
			
		    int retour = JOptionPane.showConfirmDialog(this, "Confirmer l'ajout d'un contrat !", "Ajouter", JOptionPane.YES_NO_OPTION);
	        if (retour == 0) {
				String statut_contrat = this.cbx_statut_contrat.getSelectedItem().toString();
	        	String date_debut_contrat = this.txt_date_debut_contrat.getText();
				String date_fin_contrat = this.txt_date_fin_contrat.getText();
				String date_sign_contrat = this.txt_date_sign_contrat.getText();

				String chaine = this.cbx_id_user.getSelectedItem().toString();
				String tab [] = chaine.split("-"); 
				int id_user = Integer.parseInt(tab[0]);
				
				
				chaine = this.cbx_id_appart.getSelectedItem().toString();
				tab = chaine.split("-");
				int id_appart = Integer.parseInt(tab[0]);

				//instancier  
				Contrat unContrat = new Contrat(statut_contrat, date_debut_contrat, date_fin_contrat, date_sign_contrat,id_user,id_appart);
				//on l'enregistre dans la base de données 
				C_Contrat.insertContrat(unContrat);
			
				
				//récupération de l'id à partir de la BDD 
				unContrat = C_Contrat.selectWhereContrat(statut_contrat, date_fin_contrat); 
				//ajout du dans le Tableau 
				Object ligne[] = {unContrat.getId_contrat(), unContrat.getStatut_contrat(), unContrat.getDate_debut_contrat(), unContrat.getDate_fin_contrat(), unContrat.getDate_sign_contrat(), unContrat.getId_user(), unContrat.getId_appart()};
				this.unTableau.insertLigne(ligne);
			    JOptionPane.showMessageDialog(this, "Reussi !");
			    viderChamps ();
	        }
    
		}else if(e.getSource() == btAjouter && this.btAjouter.getText().equals("Modifier")) {
			
		    int retour = JOptionPane.showConfirmDialog(this, "Confirmer l'ajout d'un contrat !", "Ajouter", JOptionPane.YES_NO_OPTION);
	        if (retour == 0) {
				String statut_contrat = this.cbx_statut_contrat.getSelectedItem().toString();
	        	String date_debut_contrat = this.txt_date_debut_contrat.getText();
				String date_fin_contrat = this.txt_date_fin_contrat.getText();
				String date_sign_contrat = this.txt_date_sign_contrat.getText();

				String chaine = this.cbx_id_user.getSelectedItem().toString();
				String tab [] = chaine.split("-"); 
				int id_user = Integer.parseInt(tab[0]);
				
				
				chaine = this.cbx_id_appart.getSelectedItem().toString();
				tab = chaine.split("-");
				int id_appart = Integer.parseInt(tab[0]);
				int numLigne = this.tableContrat.getSelectedRow();
				int id_contrat = Integer.parseInt(this.tableContrat.getValueAt(numLigne, 0).toString());

				
				//instancier  
				Contrat unContrat = new Contrat(id_contrat,id_user,id_appart,statut_contrat, date_debut_contrat, date_fin_contrat, date_sign_contrat);
				//on l'enregistre dans la base de données 
				C_Contrat.updateContrat(unContrat);
			
				
				//récupération de l'id à partir de la BDD 
				unContrat = C_Contrat.selectWhereContrat(statut_contrat, date_fin_contrat); 
				//ajout du dans le Tableau 
				Object ligne[] = {unContrat.getId_contrat(), unContrat.getStatut_contrat(), unContrat.getDate_debut_contrat(), unContrat.getDate_fin_contrat(), unContrat.getDate_sign_contrat(), unContrat.getId_user(), unContrat.getId_appart()};
				this.unTableau.updateLigne(numLigne, ligne);
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
		int numLigne = tableContrat.getSelectedRow();
		int id_contrat = Integer.parseInt(tableContrat.getValueAt(numLigne, 0).toString());
		
		cbx_statut_contrat.setSelectedItem(tableContrat.getValueAt(numLigne, 1).toString());
		txt_date_debut_contrat.setText(tableContrat.getValueAt(numLigne, 2).toString());
		txt_date_fin_contrat.setText(tableContrat.getValueAt(numLigne, 3).toString());
		txt_date_sign_contrat.setText(tableContrat.getValueAt(numLigne, 4).toString());
		cbx_id_user.setSelectedItem(tableContrat.getValueAt(numLigne, 5).toString());
		cbx_id_appart.setSelectedItem(tableContrat.getValueAt(numLigne, 6).toString());

		btAjouter.setText("Modifier");
	}
	public void delete() {
		int numLigne = tableContrat.getSelectedRow();
		int id_contrat = Integer.parseInt(tableContrat.getValueAt(numLigne, 0).toString());
		
		int retour = JOptionPane.showConfirmDialog(null, "Confirmer la suppression du contrat", "Supprimer",JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
		if(retour == 0) {
			C_Contrat.deleContrat(id_contrat);
			unTableau.deleteLigne(numLigne);
			JOptionPane.showMessageDialog(null, "Suppression réussi !");
		}
	
	}
	
	
}
