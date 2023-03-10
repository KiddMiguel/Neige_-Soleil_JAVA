package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelContrat extends PanelPrincipal {

    private JPanel panelForm = new JPanel();

    // Variables
    private JTextField txt_statut_contrat = new JTextField();
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

    public PanelContrat() {
        super();
        this.titre.setText("Contrats");

        this.panelForm.setBounds(935, 20, 300, 580);
        this.panelForm.setBackground(new Color(142, 197, 243));
        this.panelForm.setLayout(new GridLayout(20,20));

        // Affichage des inputs et des texts
        this.panelForm.add(new JLabel("Statut"));
        this.panelForm.add(this.txt_statut_contrat);

        this.panelForm.add(new JLabel("Date début"));
        this.panelForm.add(this.txt_date_debut_contrat);

        this.panelForm.add(new JLabel("Date fin"));
        this.panelForm.add(this.txt_date_fin_contrat);

        this.panelForm.add(new JLabel("Date sign"));
        this.panelForm.add(this.txt_date_sign_contrat);

        this.panelForm.add(new JLabel("ID User"));
        this.panelForm.add(this.cbx_id_user);

        this.panelForm.add(new JLabel("ID Appartement"));
        this.panelForm.add(this.cbx_id_appart);

        this.panelForm.add(new JLabel(""));
        this.panelForm.add(this.btAnnuler);
        this.panelForm.add(this.btAjouter);

        this.add(panelForm);

        this.setVisible(false);
    }
}
