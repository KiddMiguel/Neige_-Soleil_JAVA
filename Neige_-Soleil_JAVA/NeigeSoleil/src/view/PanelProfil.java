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

	private JTextArea txtInfos = new JTextArea(); 
	private JTextField txt_nom = new JTextField();
	private JTextField txt_prenom = new JTextField();
	private JTextField txt_email = new JTextField();
	private JPasswordField tx_tMdp = new JPasswordField(); 
	private JTextField txt_adresse = new JTextField();

	private Admin Admin;


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
	    
	    txt_nom = new JTextField();
	    txt_nom.setBounds(199, 176, 213, 36);
	    add(txt_nom);
	    txt_nom.setColumns(10);
	    
	    txt_prenom = new JTextField();
	    txt_prenom.setBounds(525, 176, 285, 36);
	    add(txt_prenom);
	    txt_prenom.setColumns(10);
	    
	    txt_adresse = new JTextField();
	    txt_adresse.setBounds(199, 248, 611, 36);
	    add(txt_adresse);
	    txt_adresse.setColumns(10);

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
	    
	    txt_email = new JTextField();
	    txt_email.setBounds(890, 150, 207, 36);
	    add(txt_email);
	    txt_email.setColumns(10);
	    
	    JLabel lblNewLabel_2 = new JLabel("Mot de Passe");
	    lblNewLabel_2.setBounds(890, 218, 96, 27);
	    add(lblNewLabel_2);
	    
	    tx_tMdp = new JPasswordField();
	    tx_tMdp.setBounds(890, 255, 207, 35);
	    add(tx_tMdp);
	    
	    JButton btn_gerer = new JButton("Gérer");
	    btn_gerer.setBackground(Color.ORANGE);
	    btn_gerer.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btn_gerer.setBounds(1091, 46, 85, 21);
	    add(btn_gerer);
	    
	    this.Admin = VueConnexion.getAdmin();
	    this.txt_nom.setText(Admin.getNom());
	    this.txt_prenom.setText(Admin.getPrenom());
	    this.txt_email.setText(Admin.getEmail());
	    this.tx_tMdp.setText(Admin.getMdp());
	    this.txt_adresse.setText(Admin.getAdresse());


	    
	    this.panelForm.setVisible(false);
	    


	    
	}
}
