package controller;

public class Locataire {
	private int id_locataire, id_user, nb_reservations, id_appart, id_proprietaire;
	private String civilite_locataire, nom_locataire,prenom_locataire,email_locataire,mdp_locataire, tel_locataire, adresse_locataire,cp_locataire ;
	public Locataire(int id_locataire, int id_appart, int nb_reservations , int id_proprietaire,int id_user,String civilite_locataire, String nom_locataire, String prenom_locataire, String email_locataire, String tel_locataire, String adresse_locataire, String cp_locataire) {
	 	this.id_user = id_user;
	 	this.id_locataire = id_locataire;
		this.id_appart = id_appart;
	 	this.id_proprietaire = id_proprietaire;
		this.nb_reservations = nb_reservations;
		this.nom_locataire = nom_locataire;
		this.prenom_locataire = prenom_locataire;
		this.email_locataire = email_locataire;
		this.mdp_locataire = mdp_locataire;
		this.tel_locataire = tel_locataire;
		this.civilite_locataire = civilite_locataire;
		this.adresse_locataire = adresse_locataire;
		this.cp_locataire = cp_locataire;
	}
	public Locataire(int id_appart, int nb_reservations , int id_proprietaire,int id_user,String civilite_locataire,String nom_locataire, String prenom_locataire, String email_locataire, String mdp_locataire, String tel_locataire, String adresse_locataire, String cp_locataire) {
	 	this.id_user = 0;
	 	this.id_locataire = 0;
		this.id_proprietaire = id_proprietaire;
		this.id_appart = id_appart;
		this.civilite_locataire = civilite_locataire;
		this.nom_locataire = nom_locataire;
		this.prenom_locataire = prenom_locataire;
		this.email_locataire = email_locataire;
		this.mdp_locataire = mdp_locataire;
		this.tel_locataire = tel_locataire;
		this.adresse_locataire = adresse_locataire;
		this.cp_locataire = cp_locataire;
		this.nb_reservations = nb_reservations;
	}
	public Locataire(int i) {
	 	this.id_user = 0;
	 	this.id_locataire = 0;
		this.id_proprietaire = 0;
		this.id_appart = 0;
		this.nb_reservations = 0;
		this.civilite_locataire = "";
		this.nom_locataire = "";
		this.prenom_locataire = "";
		this.email_locataire = "";
		this.mdp_locataire = "";
		this.tel_locataire = "";
		this.adresse_locataire = "";
		this.cp_locataire = "";
	}
	public int getId_locataire() {
		return id_locataire;
	}
	public void setId_locataire(int id_locataire) {
		this.id_locataire = id_locataire;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getNb_reservations() {
		return nb_reservations;
	}
	public void setNb_reservations(int nb_reservations) {
		this.nb_reservations = nb_reservations;
	}
	public int getId_appart() {
		return id_appart;
	}
	public void setId_appart(int id_appart) {
		this.id_appart = id_appart;
	}
	public int getId_proprietaire() {
		return id_proprietaire;
	}
	public void setId_proprietaire(int id_proprietaire) {
		this.id_proprietaire = id_proprietaire;
	}
	public String getCivilite_locataire() {
		return civilite_locataire;
	}
	public void setCivilite_locataire(String civilite_locataire) {
		this.civilite_locataire = civilite_locataire;
	}
	public String getNom_locataire() {
		return nom_locataire;
	}
	public void setNom_locataire(String nom_locataire) {
		this.nom_locataire = nom_locataire;
	}
	public String getPrenom_locataire() {
		return prenom_locataire;
	}
	public void setPrenom_locataire(String prenom_locataire) {
		this.prenom_locataire = prenom_locataire;
	}
	public String getEmail_locataire() {
		return email_locataire;
	}
	public void setEmail_locataire(String email_locataire) {
		this.email_locataire = email_locataire;
	}
	public String getMdp_locataire() {
		return mdp_locataire;
	}
	public void setMdp_locataire(String mdp_locataire) {
		this.mdp_locataire = mdp_locataire;
	}
	public String getTel_locataire() {
		return tel_locataire;
	}
	public void setTel_locataire(String tel_locataire) {
		this.tel_locataire = tel_locataire;
	}
	public String getAdresse_locataire() {
		return adresse_locataire;
	}
	public void setAdresse_locataire(String adresse_locataire) {
		this.adresse_locataire = adresse_locataire;
	}
	public String getCp_locataire() {
		return cp_locataire;
	}
	public void setCp_locataire(String cp_locataire) {
		this.cp_locataire = cp_locataire;
	}

	
}
