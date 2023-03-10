package view;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelProfil extends PanelPrincipal{
	JPanel panelForm = new JPanel();

	public PanelProfil() {
        super();
        this.titre.setText("Profil");
	    this.setLayout(null);
	    
	    
	    this.panelForm.setVisible(false);
	    this.setVisible(false);
	}

	public JPanel getPanelForm() {
		return panelForm;
	}

	public void setPanelForm(JPanel panelForm) {
		this.panelForm = panelForm;
	}
}
