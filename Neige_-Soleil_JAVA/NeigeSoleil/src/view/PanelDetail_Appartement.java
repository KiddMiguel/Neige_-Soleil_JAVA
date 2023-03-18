package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDetail_Appartement extends PanelAppartement{

	private JPanel panelForm = new JPanel();
	private JTextField txt_prix_appart = new JTextField();
	private JTextField txt_intitule_appart = new JTextField();
	private JTextField txt_ville_appart = new JTextField();
	private JTextField txt_cp_appart = new JTextField();
	private JTextField txt_adresse_appart = new JTextField();
	private JTextField txt_description_appart = new JTextField();
	private JTextField txt_statut_appart = new JTextField();
	private JTextField txt_type_appart = new JTextField();
	private JTextField txt_superficie_appart = new JTextField();
	private JTextField txt_id_locataire = new JTextField();

	private JTextField txt_id_proprietaire = new JTextField();
	private JTextField txt_nb_chambre = new JTextField();
	private JTextField txt_nb_cuisine = new JTextField();
	private JTextField txt_nb_salon = new JTextField();
	private JTextField txt_nb_salle_bain = new JTextField();
	private JTextField txt_nb_piece = new JTextField();

	public PanelDetail_Appartement() {
		// TODO Auto-generated constructor stub
		super();
        this.titre.setText("Appartements");

        
		this.panelForm.setBounds(935, 20, 300, 580);
		this.setBackground(new Color (142, 197, 243));
		this.panelForm.setLayout(new GridLayout(32,20));
		
		
	    this.add(panelForm);

	    this.setVisible(false);

	}

}
