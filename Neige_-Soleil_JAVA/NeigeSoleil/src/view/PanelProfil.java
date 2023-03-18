package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.Admin;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelProfil extends PanelPrincipal{
	JPanel panelForm = new JPanel();
	
	
	String[] choix = {"Mr", "Mme", "Autres"};
	String[] profesion = {"Professionel", "locataire", "Autres"};
	
	//variables
	private JTextField txtNom = new JTextField(); 
	private JTextField txtPrenom = new JTextField(); 
	private JTextField txtEmail = new JTextField();
	private JPasswordField txtMdp = new JPasswordField(); 
	


	private JTextArea txtInfos = new JTextArea(); 
	private JTextField textField = new JTextField();
	private JTextField textField_1 = new JTextField();
	private JTextField textField_2 = new JTextField();
	private JTextField textField_3 = new JTextField();
	private JTextField textField_4 = new JTextField();
	private JTextField textField_5 = new JTextField();
	private JTextField textField_6 = new JTextField();
	private JTextField textField_7 = new JTextField();
	private JPasswordField passwordField = new JPasswordField();


	public PanelProfil() {
        super();
        this.titre.setText("Profil");
	    this.setLayout(null);
	    
	    JComboBox intituler = new JComboBox(choix);
	    intituler.setBounds(199, 66, 111, 21);
	    add(intituler);
	    
	    JComboBox comboBox_1 = new JComboBox(profesion);
	    comboBox_1.setBounds(199, 116, 313, 36);
	    add(comboBox_1);
	    
	    textField = new JTextField();
	    textField.setBounds(199, 176, 213, 36);
	    add(textField);
	    textField.setColumns(10);
	    
	    textField_1 = new JTextField();
	    textField_1.setBounds(525, 176, 285, 36);
	    add(textField_1);
	    textField_1.setColumns(10);
	    
	    textField_2 = new JTextField();
	    textField_2.setBounds(199, 248, 611, 50);
	    add(textField_2);
	    textField_2.setColumns(10);
	    
	    textField_3 = new JTextField();
	    textField_3.setBounds(199, 366, 96, 19);
	    add(textField_3);
	    textField_3.setColumns(10);
	    
	    textField_4 = new JTextField();
	    textField_4.setBounds(199, 405, 96, 19);
	    add(textField_4);
	    textField_4.setColumns(10);
	    
	    textField_5 = new JTextField();
	    textField_5.setBounds(392, 405, 96, 19);
	    add(textField_5);
	    textField_5.setColumns(10);
	    
	    JComboBox comboBox_2 = new JComboBox();
	    comboBox_2.setBounds(382, 365, 91, 21);
	    add(comboBox_2);
	    
	    textField_6 = new JTextField();
	    textField_6.setBounds(199, 320, 611, 36);
	    add(textField_6);
	    textField_6.setColumns(10);
	    
	    JButton btn_sauvegarder = new JButton("Sauvegarder");
	    btn_sauvegarder.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btn_sauvegarder.setBackground(Color.RED);
	    btn_sauvegarder.setBounds(509, 481, 207, 50);
	    add(btn_sauvegarder);
	    
	    JLabel lblNewLabel = new JLabel("Paramètre Confidentialité");
	    lblNewLabel.setBounds(879, 43, 175, 27);
	    add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("Email");
	    lblNewLabel_1.setBounds(890, 122, 50, 24);
	    add(lblNewLabel_1);
	    
	    textField_7 = new JTextField();
	    textField_7.setBounds(890, 150, 207, 36);
	    add(textField_7);
	    textField_7.setColumns(10);
	    
	    JLabel lblNewLabel_2 = new JLabel("Mot de Passe");
	    lblNewLabel_2.setBounds(890, 218, 96, 27);
	    add(lblNewLabel_2);
	    
	    passwordField = new JPasswordField();
	    passwordField.setBounds(890, 255, 207, 35);
	    add(passwordField);
	    
	    JButton btn_gerer = new JButton("Gérer");
	    btn_gerer.setBackground(Color.ORANGE);
	    btn_gerer.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btn_gerer.setBounds(1091, 46, 85, 21);
	    add(btn_gerer);
	    
	    
	    this.panelForm.setVisible(false);
	    


	    
	}
}
