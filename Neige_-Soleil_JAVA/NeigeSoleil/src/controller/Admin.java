package controller;

public class Admin {
	private int id_admin;
	private String nom, prenom, email, mdp, adresse;
	
	public Admin(int id_admin, String nom, String prenom, String email, String mdp, String adresse) {
		this.id_admin = id_admin;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.adresse = adresse;
	}
	
	public Admin(String nom, String prenom, String email, String mdp, String adresse) {
		this.id_admin = 0;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.adresse = adresse;
	}
	public Admin() {
		this.id_admin = 0;
		this.nom = "";
		this.prenom = "";
		this.email = "";
		this.mdp = "";
		this.adresse = "";
	}

	public int getId_admin() {
		return id_admin;
	}

	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
}
