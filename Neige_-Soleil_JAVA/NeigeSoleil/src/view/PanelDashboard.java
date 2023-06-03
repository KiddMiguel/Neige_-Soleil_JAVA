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

public class PanelDashboard extends PanelPrincipal implements ActionListener{
	private JTable table; 

	public PanelDashboard() {
		// TODO Auto-generated constructor stub
		super();
        
		this.panelForm.setBounds(0, 20, 600, 580);
		this.panelForm.setBackground(new Color (255, 255, 255));
		this.panelForm.setLayout(new GridLayout(32,20));
		
	    this.add(panelForm);
	    //-----------------------------------------------------------------
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(35, 131, 232));
	    panel.setBounds(67, 65, 280, 210);
	    ImageIcon appart = new ImageIcon("src/Images/appart.png"); //Image blue du top
	    JButton Buttonappart = new JButton(appart);
	    Buttonappart.setBounds(0, 0, 280, 210);
	    panel.add(Buttonappart);
	    add(panel);
	    panel.setLayout(null);
	    Border matteborder = BorderFactory.createMatteBorder(1, 1, 3, 1, Color.white);

	    JLabel lblAppartement = new JLabel("60 Appartement(s)");
	    lblAppartement.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblAppartement.setForeground(Color.WHITE);
	    lblAppartement.setBounds(22, 22, 200, 23);
	    panel.add(lblAppartement);
	    
	  

	    JPanel panel_Propritaire = new JPanel();
	    panel_Propritaire.setBackground(Color.WHITE);
	    panel_Propritaire.setBounds(401, 65, 280, 210);
	    ImageIcon prorio = new ImageIcon("src/Images/proprio.png"); //Image blue du top
	    JButton Buttonprorio = new JButton(prorio);
	    Buttonprorio.setBounds(0, 0, 280, 210);
	    panel_Propritaire.add(Buttonprorio);
	    add(panel_Propritaire);
	    panel_Propritaire.setLayout(null);
	    
	    JLabel lblNb_total_propritaire = new JLabel("Proprietaire(s)");
	    lblNb_total_propritaire.setBounds(22, 22, 200, 23);
	    lblNb_total_propritaire.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNb_total_propritaire.setForeground(Color.BLACK);
	    panel_Propritaire.add(lblNb_total_propritaire);
	   
	    
	    JPanel panel_2_1 = new JPanel();
	    panel_2_1.setLayout(null);
	    panel_2_1.setBounds(732, 65, 500, 420);
	    ImageIcon profil = new ImageIcon("src/Images/apropos.jpg"); //Image blue du top
	    JLabel Labelprofil = new JLabel(profil);
	    Labelprofil.setBounds(0, 0, 500, 420);
	    panel_2_1.add(Labelprofil);
	    add(panel_2_1);


	    this.panelForm.setVisible(false);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
