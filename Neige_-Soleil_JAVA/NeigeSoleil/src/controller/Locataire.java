package controller;

public class Locataire {
	private int id_locataire, nb_reservations;
	private String civilite_locataire, nom_locataire,prenom_locataire,email_locataire, tel_locataire, adresse_locataire,cp_locataire ;
	
	public Locataire(int id_locataire,
			String civilite_locataire, String nom_locataire, String prenom_locataire, String email_locataire,
			 String tel_locataire, String adresse_locataire, String cp_locataire, int nb_reservations) {
	 	this.id_locataire = id_locataire;
		this.nb_reservations = nb_reservations;
		this.nom_locataire = nom_locataire;
		this.prenom_locataire = prenom_locataire;
		this.email_locataire = email_locataire;
		this.tel_locataire = tel_locataire;
		this.civilite_locataire = civilite_locataire;
		this.adresse_locataire = adresse_locataire;
		this.cp_locataire = cp_locataire;
	}
	public Locataire( String civilite_locataire,String nom_locataire, String prenom_locataire, String email_locataire, String tel_locataire, String adresse_locataire, String cp_locataire,int nb_reservations) {
	 	this.id_locataire = 0;
		this.civilite_locataire = civilite_locataire;
		this.nom_locataire = nom_locataire;
		this.prenom_locataire = prenom_locataire;
		this.email_locataire = email_locataire;
		this.tel_locataire = tel_locataire;
		this.adresse_locataire = adresse_locataire;
		this.cp_locataire = cp_locataire;
		this.nb_reservations = nb_reservations;
	}
	public Locataire() {
	 	this.id_locataire = 0;
		this.nb_reservations = 0;
		this.civilite_locataire = "";
		this.nom_locataire = "";
		this.prenom_locataire = "";
		this.email_locataire = "";
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
	public int getNb_reservations() {
		return nb_reservations;
	}
	public void setNb_reservations(int nb_reservations) {
		this.nb_reservations = nb_reservations;
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