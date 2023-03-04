package controller;

public class Locataire {
	private int id_user, nb_reservations, id_appart, id_reservation;
	private String nom_locataire,prenom_locataire,email_locataire,mdp_locataire, tel_locataire, adresse_locataire,cp_locataire ;
	public Locataire(int id_user,int id_reservation, int id_appart, int nb_reservations, String nom_locataire, String prenom_locataire, String email_locataire, String tel_locataire, String adresse_locataire, String cp_locataire) {
	 	this.id_user = id_user;
		this.id_appart = id_appart;
	 	this.id_reservation = id_reservation;
		this.nb_reservations = nb_reservations;
		this.prenom_locataire = prenom_locataire;
		this.email_locataire = email_locataire;
		this.tel_locataire = tel_locataire;
		this.adresse_locataire = adresse_locataire;
		this.cp_locataire = cp_locataire;
	}
	public Locataire(String nom_locataire, String prenom_locataire, String email_locataire, String mdp_locataire, String tel_locataire, String adresse_locataire, String cp_locataire) {
	 	this.id_user = 0;
		this.id_reservation = 0;
		this.id_appart = 0;
		this.nb_reservations = 0;
		this.nom_locataire = nom_locataire;
		this.prenom_locataire = prenom_locataire;
		this.email_locataire = email_locataire;
		this.tel_locataire = tel_locataire;
		this.adresse_locataire = adresse_locataire;
		this.cp_locataire = cp_locataire;
	}
	public Locataire(int i) {
	 	this.id_user = 0;
		this.id_reservation = 0;
		this.id_appart = 0;
		this.nb_reservations = 0;
		this.nom_locataire = "";
		this.prenom_locataire = "";
		this.email_locataire = "";
		this.tel_locataire = "";
		this.adresse_locataire = "";
		this.cp_locataire = "";
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
	public int getId_reservation() {
		return id_reservation;
	}
	public void setId_reservation(int id_reservation) {
		this.id_reservation = id_reservation;
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