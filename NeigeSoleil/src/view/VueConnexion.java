package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.Admin;
import controller.C_Admin;

public class VueConnexion extends JFrame implements ActionListener, KeyListener{
	private JTextField txtEmail = new JTextField("miguel@gmail.com");
	private JLabel txtTitre = new JLabel("S’identifier",SwingConstants.CENTER);
	private JLabel txtInfo = new JLabel("Mot de passe oublié ?");
	private JLabel txtMessage = new JLabel("Connectez-vous pour gérer votre compte !");
	private JPasswordField txtMdp = new JPasswordField("admin");
	private JPanel panelConnexion = new JPanel();
	private JButton btConnexion	= new JButton("Connexion");
	
	public VueConnexion() {
		this.setTitle("Neige et Soliel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(15, 20, 1500, 800);
		this.getContentPane().setBackground(new Color(255,255,255));
		this.setLayout(null);
		
		ImageIcon uneImage = new ImageIcon("src/Images/footer.png");
		JLabel unJLabel = new JLabel(uneImage);
		unJLabel.setBounds(0, 580, 1500, 200);
		this.add(unJLabel);
	
		//Pour notre titre
		this.txtTitre.setBounds(573, 120, 280, 200);
		this.txtTitre.setFont(new Font("Serif", Font.BOLD, 55));
		this.txtTitre.setForeground(new Color(59, 125, 221));  //blue
		this.add(this.txtTitre);
		
		//Pour notre titre
		this.txtMessage.setBounds(590, 170, 280, 200);
		this.txtMessage.setPreferredSize(new Dimension(250, 150));
		this.add(this.txtMessage);
		
		this.panelConnexion.setBounds(570, 300, 280, 200);
		this.panelConnexion.setBackground(new Color(255,255,255));
		this.panelConnexion.setLayout(new GridLayout(7,0));
		
		//Pour L'input Email
		this.panelConnexion.add(new JLabel("Email"));
		this.panelConnexion.add(this.txtEmail);
		this.txtEmail.setBackground(new Color(59, 125, 221)); //Couleur de fond blue
		this.txtEmail.setForeground(new Color(255, 255, 255));  //couleur de text White
		
		//Pour l'input MDP
		this.panelConnexion.add(new JLabel("Mot de passe"));
		this.panelConnexion.add(this.txtMdp);
		this.txtMdp.setBackground(new Color(59, 125, 221)); //blue
		this.txtMdp.setForeground(new Color(255, 255, 255));  //couleur de text White
		
		//Pour le text MDP oublié
		this.panelConnexion.add(new JLabel(""));
		this.panelConnexion.add(this.txtInfo);
		this.txtMdp.setBackground(new Color(59, 125, 221)); //blue
		
		//Pour le bouton
		this.panelConnexion.add(this.btConnexion);
		this.btConnexion.setBackground(new Color(255, 200, 57));
		this.btConnexion.setBounds(500, 500, 250, 100);
		this.btConnexion.addActionListener(this);
		

		this.add(this.panelConnexion);
		
		this.setVisible(true);
	}
	
	public void verifConnexion() {
		String email = this.txtEmail.getText();
		String mdp = new String(this.txtMdp.getPassword());
		Admin unAdmin = C_Admin.selectWhereAdmin(email, mdp);
		
		if(unAdmin == null) {
			JOptionPane.showMessageDialog(this, "Mot de passe incorrect !\n Vérifier vos informations");
		}else {
			JOptionPane.showMessageDialog(this, "Bienvenue ! "+unAdmin.getNom()+" "+unAdmin.getPrenom());
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.btConnexion) {
			this.verifConnexion();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			this.verifConnexion();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

