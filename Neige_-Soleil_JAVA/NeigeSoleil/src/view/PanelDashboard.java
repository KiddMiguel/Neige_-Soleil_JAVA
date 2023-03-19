package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTable;
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
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(35, 131, 232));
	    panel.setBounds(67, 65, 306, 199);
	    add(panel);
	    panel.setLayout(null);
	    
	    JLabel lblAppartement = new JLabel("60 Appartement(s)");
	    lblAppartement.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblAppartement.setForeground(Color.WHITE);
	    lblAppartement.setBounds(22, 22, 200, 23);
	    panel.add(lblAppartement);
	    
	    JLabel lblAppartement_1 = new JLabel("dernier appartement active(Avril) ");
	    lblAppartement_1.setForeground(Color.WHITE);
	    lblAppartement_1.setFont(new Font("", Font.BOLD, 12));
	    lblAppartement_1.setBounds(22, 55, 200, 23);
	    panel.add(lblAppartement_1);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(35, 131, 232));
	    panel_1.setBounds(401, 283, 306, 199);
	    add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel lblNewLabel_3 = new JLabel("800.70 $");
	    lblNewLabel_3.setForeground(Color.WHITE);
	    lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNewLabel_3.setBounds(10, 10, 114, 23);
	    panel_1.add(lblNewLabel_3);
	    
	    JLabel lblNewLabel_1_1 = new JLabel("dernier contrat active");
	    lblNewLabel_1_1.setForeground(Color.WHITE);
	    lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_1.setBounds(10, 40, 162, 23);
	    panel_1.add(lblNewLabel_1_1);
	    
	    JLabel lblNewLabel_1_2 = new JLabel("dernier contrat active");
	    lblNewLabel_1_2.setForeground(Color.WHITE);
	    lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_2.setBounds(10, 130, 162, 23);
	    panel_1.add(lblNewLabel_1_2);
	    

	    
	    JPanel panel_1_1 = new JPanel();
	    panel_1_1.setBackground(Color.LIGHT_GRAY);
	    panel_1_1.setBounds(401, 65, 306, 199);
	    add(panel_1_1);
	    panel_1_1.setLayout(null);
	    
	    JLabel lblNewLabel_5 = new JLabel("New label");
	    lblNewLabel_5.setBounds(10, 10, 45, 13);
	    panel_1_1.add(lblNewLabel_5);
	    
	    JButton btnNewButton_3_3 = new JButton("New button");
	    btnNewButton_3_3.setBounds(205, 93, 85, 21);
	    panel_1_1.add(btnNewButton_3_3);
	    
	    JButton btnNewButton_3_4 = new JButton("New button");
	    btnNewButton_3_4.setBounds(205, 131, 85, 21);
	    panel_1_1.add(btnNewButton_3_4);
	    
	    JButton btnNewButton_3_5 = new JButton("New button");
	    btnNewButton_3_5.setBounds(205, 168, 85, 21);
	    panel_1_1.add(btnNewButton_3_5);
	    
	    JLabel lblNewLabel_1_3_1 = new JLabel("dernier contrat active");
	    lblNewLabel_1_3_1.setForeground(Color.BLACK);
	    lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_3_1.setBounds(10, 93, 152, 23);
	    panel_1_1.add(lblNewLabel_1_3_1);
	    
	    JLabel lblNewLabel_1_3_2 = new JLabel("dernier contrat active");
	    lblNewLabel_1_3_2.setForeground(Color.BLACK);
	    lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_3_2.setBounds(10, 131, 152, 23);
	    panel_1_1.add(lblNewLabel_1_3_2);
	    
	    JLabel lblNewLabel_1_3_3 = new JLabel("dernier contrat active");
	    lblNewLabel_1_3_3.setForeground(Color.BLACK);
	    lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_3_3.setBounds(10, 166, 152, 23);
	    panel_1_1.add(lblNewLabel_1_3_3);
	    
	    JPanel panel_1_1_1 = new JPanel();
	    panel_1_1_1.setBackground(Color.LIGHT_GRAY);
	    panel_1_1_1.setBounds(67, 283, 306, 199);
	    add(panel_1_1_1);
	    panel_1_1_1.setLayout(null);
	    
	    JLabel lblNewLabel_2 = new JLabel("Highlights");
	    lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_2.setBounds(10, 10, 111, 26);
	    panel_1_1_1.add(lblNewLabel_2);
	    
	    JLabel lblNewLabel_1_3 = new JLabel("dernier contrat active");
	    lblNewLabel_1_3.setForeground(Color.BLACK);
	    lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_3.setBounds(10, 58, 162, 23);
	    panel_1_1_1.add(lblNewLabel_1_3);
	    
	    JLabel lblNewLabel_1_4 = new JLabel("dernier contrat active");
	    lblNewLabel_1_4.setForeground(Color.BLACK);
	    lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_4.setBounds(10, 87, 162, 23);
	    panel_1_1_1.add(lblNewLabel_1_4);
	    
	    JLabel lblNewLabel_1_5 = new JLabel("dernier contrat active");
	    lblNewLabel_1_5.setForeground(Color.BLACK);
	    lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1_5.setBounds(10, 120, 162, 23);
	    panel_1_1_1.add(lblNewLabel_1_5);
	    
	    JButton btnNewButton_3 = new JButton("New button");
	    btnNewButton_3.setBounds(211, 60, 85, 21);
	    panel_1_1_1.add(btnNewButton_3);
	    
	    JButton btnNewButton_3_1 = new JButton("New button");
	    btnNewButton_3_1.setBounds(211, 89, 85, 21);
	    panel_1_1_1.add(btnNewButton_3_1);
	    
	    JButton btnNewButton_3_2 = new JButton("New button");
	    btnNewButton_3_2.setBounds(211, 122, 85, 21);
	    panel_1_1_1.add(btnNewButton_3_2);
	    
	    

	    
	    
	    this.panelForm.setVisible(false);

		
	}
}
