package controller;

public class Proprietaire {
	private int id_proprietaire,id_user, id_contrat, id_appart;
	private String nom_proprio,prenom_proprio,statut_proprio,email_proprio, mdp_proprio, tel_proprio, adresse_proprio, cp_proprio, ville_proprio, pays_proprio, code_adherent ;
	public Proprietaire(int id_proprietaire,int id_user, int id_contrat, int id_appart,String nom_proprio, String prenom_proprio, String statut_proprio, String email_proprio, String tel_proprio,
			String adresse_proprio, String cp_proprio, String ville_proprio, String pays_proprio, String code_adherent) {
	 	this.id_proprietaire = id_proprietaire;
		this.id_user = id_user;
	 	this.id_appart = id_appart;
	 	this.id_contrat = id_contrat;
		this.nom_proprio = nom_proprio;
		this.prenom_proprio = prenom_proprio;
		this.statut_proprio = statut_proprio;
		this.email_proprio = email_proprio;
		this.tel_proprio = tel_proprio;
		this.adresse_proprio = adresse_proprio;
		this.cp_proprio = cp_proprio;
		this.ville_proprio = ville_proprio;
		this.pays_proprio = pays_proprio;
		this.code_adherent = code_adherent;
		
	}
	public Proprietaire(String nom_proprio, String prenom_proprio, String statut_proprio, String email_proprio, String tel_proprio, String adresse_proprio, String cp_proprio, String ville_proprio, String pays_proprio, String code_adherent) {
	 	this.id_proprietaire = 0;
		this.id_user = 0;
	 	this.id_appart = 0;
	 	this.id_contrat = 0;
		this.nom_proprio = nom_proprio;
		this.prenom_proprio = prenom_proprio;
		this.statut_proprio = statut_proprio;
		this.email_proprio = email_proprio;
		this.tel_proprio = tel_proprio;
		this.adresse_proprio = adresse_proprio;
		this.cp_proprio = cp_proprio;
		this.ville_proprio = ville_proprio;
		this.pays_proprio = pays_proprio;
		this.code_adherent = code_adherent;
	}
	public Proprietaire() {
	 	this.id_proprietaire = 0;
		this.id_user = 0;
	 	this.id_contrat = 0;
	 	this.id_appart = 0;
	 	this.id_appart = 0;
		this.nom_proprio = "";
		this.prenom_proprio = "";
		this.statut_proprio = "";
		this.email_proprio = "";
		this.tel_proprio = "";
		this.adresse_proprio = "";
		this.cp_proprio = "";
		this.ville_proprio = "";
		this.pays_proprio = "";
		this.code_adherent = "";
	}
	public int getId_proprietaire() {
		return id_proprietaire;
	}
	public void setId_proprietaire(int id_proprietaire) {
		this.id_proprietaire = id_proprietaire;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_contrat() {
		return id_contrat;
	}
	public void setId_contrat(int id_contrat) {
		this.id_contrat = id_contrat;
	}
	public int getId_appart() {
		return id_appart;
	}
	public void setId_appart(int id_appart) {
		this.id_appart = id_appart;
	}
	public String getNom_proprio() {
		return nom_proprio;
	}
	public void setNom_proprio(String nom_proprio) {
		this.nom_proprio = nom_proprio;
	}
	public String getPrenom_proprio() {
		return prenom_proprio;
	}
	public void setPrenom_proprio(String prenom_proprio) {
		this.prenom_proprio = prenom_proprio;
	}
	public String getStatut_proprio() {
		return statut_proprio;
	}
	public void setStatut_proprio(String statut_proprio) {
		this.statut_proprio = statut_proprio;
	}
	public String getEmail_proprio() {
		return email_proprio;
	}
	public void setEmail_proprio(String email_proprio) {
		this.email_proprio = email_proprio;
	}
	public String getMdp_proprio() {
		return mdp_proprio;
	}
	public void setMdp_proprio(String mdp_proprio) {
		this.mdp_proprio = mdp_proprio;
	}
	public String getTel_proprio() {
		return tel_proprio;
	}
	public void setTel_proprio(String tel_proprio) {
		this.tel_proprio = tel_proprio;
	}
	public String getAdresse_proprio() {
		return adresse_proprio;
	}
	public void setAdresse_proprio(String adresse_proprio) {
		this.adresse_proprio = adresse_proprio;
	}
	public String getCp_proprio() {
		return cp_proprio;
	}
	public void setCp_proprio(String cp_proprio) {
		this.cp_proprio = cp_proprio;
	}
	public String getVille_proprio() {
		return ville_proprio;
	}
	public void setVille_proprio(String ville_proprio) {
		this.ville_proprio = ville_proprio;
	}
	public String getPays_proprio() {
		return pays_proprio;
	}
	public void setPays_proprio(String pays_proprio) {
		this.pays_proprio = pays_proprio;
	}
	public String getCode_adherent() {
		return code_adherent;
	}
	public void setCode_adherent(String code_adherent) {
		this.code_adherent = code_adherent;
	}
	
}
