package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelReservation extends PanelPrincipal {

    private JPanel panelForm = new JPanel();

    // Variables
    private JTextField txt_statut_reserv = new JTextField();
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

    public PanelReservation() {
        super();
        this.titre.setText("Reservations");

        this.panelForm.setBounds(935, 20, 300, 580);
        this.panelForm.setBackground(new Color(142, 197, 243));
        this.panelForm.setLayout(new GridLayout(20, 6));

        // Affichage des inputs et des texts
        this.panelForm.add(new JLabel("Statut"));
        this.panelForm.add(this.txt_statut_reserv);

        this.panelForm.add(new JLabel("Date début"));
        this.panelForm.add(this.txt_date_debut_reserv);

        this.panelForm.add(new JLabel("Date fin"));
        this.panelForm.add(this.txt_date_fin_reserv);

        this.panelForm.add(new JLabel("Prix"));
        this.panelForm.add(this.txt_prix_reserv);

        this.panelForm.add(new JLabel("Nb personnes"));
        this.panelForm.add(this.txt_nb_personnes_reserv);

        this.panelForm.add(new JLabel("ID User"));
        this.panelForm.add(this.cbx_id_user);

        this.panelForm.add(new JLabel("ID Appartement"));
        this.panelForm.add(this.cbx_id_appart);

        this.panelForm.add(new JLabel("ID Matériel Propriétaire"));
        this.panelForm.add(this.cbx_id_materiel_proprio);

        this.panelForm.add(new JLabel(""));
        this.panelForm.add(this.btAnnuler);
        this.panelForm.add(this.btAjouter);

        this.add(panelForm);

        this.setVisible(false);
    }
}
