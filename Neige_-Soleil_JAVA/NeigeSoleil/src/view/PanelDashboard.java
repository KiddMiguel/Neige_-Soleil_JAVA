package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDashboard extends PanelPrincipal{
	private JTable table;

	public PanelDashboard() {
		// TODO Auto-generated constructor stub
		super();
        this.titre.setText("Dashboard");

        
		this.panelForm.setBounds(0, 20, 600, 580);
		this.panelForm.setBackground(new Color (255, 255, 255));
		this.panelForm.setLayout(new GridLayout(32,20));
		
	    this.add(panelForm);
	    //-----------------------------------------------------------------
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(35, 131, 232));
	    panel.setBounds(67, 65, 306, 199);
	    add(panel);
	    panel.setLayout(null);
	    Border matteborder = BorderFactory.createMatteBorder(1, 1, 3, 1, Color.white);

	    JLabel lblAppartement = new JLabel("60 Appartement(s)");
	    lblAppartement.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblAppartement.setForeground(Color.WHITE);
	    lblAppartement.setBounds(22, 22, 200, 23);
	    panel.add(lblAppartement);
	    
	    JLabel lblAppartement_1 = new JLabel("En locataion(s) ");
	    lblAppartement_1.setForeground(Color.WHITE);
	    lblAppartement_1.setBounds(22, 131, 200, 23);
	    panel.add(lblAppartement_1);
	    JLabel lblAppartement_2 = new JLabel("Disponible(s) ");
	    lblAppartement_2.setForeground(Color.WHITE);
	    lblAppartement_2.setBounds(22, 166, 200, 23);
	    panel.add(lblAppartement_2);
	    
	    JButton btnAppartement_1 = new JButton("20");
	    btnAppartement_1.setBounds(211, 131, 50, 23);
	    panel.add(btnAppartement_1);
	    btnAppartement_1.setBackground(new Color(6, 194, 0));
	    btnAppartement_1.setForeground(Color.WHITE);



	    JButton btnAppartement_2 = new JButton("20");
	    btnAppartement_2.setBounds(211, 166, 50, 23);
	    panel.add(btnAppartement_2);
	    btnAppartement_2.setBackground(new Color(203, 133, 3));
	    btnAppartement_2.setForeground(Color.WHITE);

	    //--------------------------------------------
	    
	    JPanel panel_revenue = new JPanel();
	    
	    panel_revenue.setBackground(new Color(35, 131, 232));
	    panel_revenue.setBounds(401, 283, 306, 199);
	    add(panel_revenue);
	    panel_revenue.setLayout(null);
	    
	    JLabel lblRevenue = new JLabel("Revenue 800.70 $");
	    lblRevenue.setForeground(Color.WHITE);
	    lblRevenue.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblRevenue.setBounds(10, 10, 200, 23);
	    panel_revenue.add(lblRevenue);
	    
	    JLabel lblRevenue_app_encours = new JLabel("Avec appartemen(s)");
	    lblRevenue_app_encours.setForeground(Color.BLACK);
	    lblRevenue_app_encours.setBounds(20, 150, 200, 23);
	    panel_revenue.add(lblRevenue_app_encours);
	    
	    JButton btnRevenue_app_encours = new JButton("20");
	    btnRevenue_app_encours.setBounds(211, 150, 85, 21);
	    panel_revenue.add(btnRevenue_app_encours);
	    btnRevenue_app_encours.setBackground(new Color(6, 194, 0));
	    btnRevenue_app_encours.setForeground(Color.WHITE);


	    ///----------------------------------------------------------------------------
	    JPanel panel_Propritaire = new JPanel();
	    panel_Propritaire.setBackground(Color.WHITE);
	    panel_Propritaire.setBounds(401, 65, 306, 199);
	    add(panel_Propritaire);
	    panel_Propritaire.setLayout(null);
	    
	    JLabel lblNb_total_propritaire = new JLabel("45 Proprietaire(s)");
	    lblNb_total_propritaire.setBounds(22, 22, 200, 23);
	    lblNb_total_propritaire.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNb_total_propritaire.setForeground(Color.BLACK);
	    panel_Propritaire.add(lblNb_total_propritaire);
	    
	    JButton btn_proprio_appart_yes = new JButton("12");
	    btn_proprio_appart_yes.setBounds(205, 93, 85, 21);
	    panel_Propritaire.add(btn_proprio_appart_yes);
	    btn_proprio_appart_yes.setBackground(new Color(6, 194, 0));
	    btn_proprio_appart_yes.setForeground(Color.WHITE);

	    
	    JButton btnNewButton_3_4 = new JButton("33");
	    btnNewButton_3_4.setBounds(205, 131, 85, 21);
	    panel_Propritaire.add(btnNewButton_3_4);
	    btnNewButton_3_4.setBackground(new Color(203, 133, 3));
	    
	    JButton btn_proprio_appart_no = new JButton("5");
	    btn_proprio_appart_no.setBounds(205, 168, 85, 21);
	    panel_Propritaire.add(btn_proprio_appart_no);
	    
	    JLabel lblproprio_appart_yes = new JLabel("Avec appartemen(s)");
	    lblproprio_appart_yes.setForeground(Color.BLACK);
	    lblproprio_appart_yes.setBounds(20, 93, 200, 23);
	    panel_Propritaire.add(lblproprio_appart_yes);
	    
	    
	    JLabel lblproprio_appart_no = new JLabel("Sans appartement(s)");
	    lblproprio_appart_no.setForeground(Color.BLACK);
	    lblproprio_appart_no.setBounds(20, 131, 200, 23);
	    panel_Propritaire.add(lblproprio_appart_no);
	    
	    JLabel lbllblproprio_appart_rev = new JLabel("reveservation (s)");
	    lbllblproprio_appart_rev.setForeground(Color.BLACK);
	    lbllblproprio_appart_rev.setBounds(20, 166, 200, 23);
	    panel_Propritaire.add(lbllblproprio_appart_rev);
	    
	    
	    //---------------------------------------------------------------------------
	    JPanel panel_locataire = new JPanel();
	    panel_locataire.setBackground(Color.WHITE);
	    panel_locataire.setBounds(67, 283, 306, 199);
	    add(panel_locataire);
	    panel_locataire.setLayout(null);
	    
	    JLabel lbllocataire = new JLabel("120 Locataire(s)");
	    lbllocataire.setFont(new Font("", Font.BOLD, 15));
	    lbllocataire.setBounds(20, 22, 200, 23);
	    panel_locataire.add(lbllocataire);
	    
	    JLabel lbllocataire_yes = new JLabel("Avec appartemen(s)");
	    lbllocataire_yes.setForeground(Color.BLACK);
	    lbllocataire_yes.setBounds(22, 93, 162, 23);
	    panel_locataire.add(lbllocataire_yes);
	    
	    JLabel lbllocataire_no = new JLabel("Sans appartemen(s)");
	    lbllocataire_no.setForeground(Color.BLACK);
	    lbllocataire_no.setBounds(22, 131, 162, 23);
	    panel_locataire.add(lbllocataire_no);
	    
	    JLabel lbllocataire_resrv = new JLabel("Avec Reservation(s)");
	    lbllocataire_resrv.setForeground(Color.BLACK);
	    lbllocataire_resrv.setBounds(22, 166, 162, 23);
	    panel_locataire.add(lbllocataire_resrv);
	    
	    JButton btnlocataire_yes = new JButton("20");
	    btnlocataire_yes.setBounds(211, 93, 85, 21);
	    panel_locataire.add(btnlocataire_yes);
	    
	    JButton btnlocataire_no = new JButton("30");
	    btnlocataire_no.setBounds(211, 131, 85, 21);
	    panel_locataire.add(btnlocataire_no);
	    
	    JButton btnlocataire_resrv = new JButton("65");
	    btnlocataire_resrv.setBounds(211, 166, 85, 21);
	    panel_locataire.add(btnlocataire_resrv);
	    
	    //-------------------------------------------------------------------------------

	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color (255, 200, 57));
	    panel_2.setBounds(732, 65, 446, 199);
	    add(panel_2);
	    panel_2.setLayout(null);
	    
	    JLabel lblAppartements = new JLabel("62 Reservation(s)");
	    lblAppartements.setForeground(Color.WHITE);
	    lblAppartements.setFont(new Font("", Font.BOLD, 15));
	    lblAppartements.setBounds(23, 21, 211, 23);
	    panel_2.add(lblAppartements);
	    
	    JLabel lblNewLabel_1_3_4 = new JLabel("En cour(s)");
	    lblNewLabel_1_3_4.setForeground(Color.BLACK);
	    lblNewLabel_1_3_4.setFont(new Font("", Font.BOLD, 12));
	    lblNewLabel_1_3_4.setBounds(23, 74, 162, 23);
	    panel_2.add(lblNewLabel_1_3_4);
	    
	    JLabel lblNewLabel_1_3_5 = new JLabel("Réservé(s)");
	    lblNewLabel_1_3_5.setForeground(Color.BLACK);
	    lblNewLabel_1_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_3_5.setBounds(23, 107, 162, 23);
	    panel_2.add(lblNewLabel_1_3_5);
	    
	    JButton btnNewLabel_1_3_4 = new JButton("65");
	    btnNewLabel_1_3_4.setBounds(211, 74, 85, 21);
	    panel_2.add(btnNewLabel_1_3_4);
	    
	    JButton btnNewLabel_1_3_5 = new JButton("30");
	    btnNewLabel_1_3_5.setBounds(211, 107, 85, 21);
	    panel_2.add(btnNewLabel_1_3_5);
	    

	    

	    
	    //---------------------------------------------------------------------
	    
	    JPanel panel_2_1 = new JPanel();
	    panel_2_1.setLayout(null);
	    panel_2_1.setBackground(new Color (255, 200, 57));
	    panel_2_1.setBounds(732, 283, 446, 199);
	    add(panel_2_1);
	    
	    JLabel lblAppartement_2_1 = new JLabel("14 Contrat(s)");
	    lblAppartement_2_1.setForeground(Color.WHITE);
	    lblAppartement_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblAppartement_2_1.setBounds(23, 21, 211, 23);
	    panel_2_1.add(lblAppartement_2_1);
	    
	    JLabel lblNewLabel_1_3_4_1 = new JLabel("En cour(s)");
	    lblNewLabel_1_3_4_1.setForeground(Color.BLACK);
	    lblNewLabel_1_3_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_3_4_1.setBounds(23, 74, 162, 23);
	    panel_2_1.add(lblNewLabel_1_3_4_1);
	    
	    JLabel lblNewLabel_1_3_5_1 = new JLabel("Résilier");
	    lblNewLabel_1_3_5_1.setForeground(Color.BLACK);
	    lblNewLabel_1_3_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_3_5_1.setBounds(23, 107, 162, 23);
	    panel_2_1.add(lblNewLabel_1_3_5_1);
	    
	    JButton btnNewLabel_1_3_4_1 = new JButton("65");
	    btnNewLabel_1_3_4_1.setBounds(211, 74, 85, 21);
	    panel_2_1.add(btnNewLabel_1_3_4_1);
	    
	    JButton btnNewLabel_1_3_5_1 = new JButton("30");
	    btnNewLabel_1_3_5_1.setBounds(211, 107, 85, 21);
	    panel_2_1.add(btnNewLabel_1_3_5_1);
	    
	    
	    this.panelForm.setVisible(false);

		
	}
}
