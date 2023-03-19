package controller;

public class User {
	private int id_user;
	private String nom_user,prenom_user,email_user ;
	public User(int id_user,  String nom_user, String prenom_user, String email_user) {
	 	this.id_user = id_user;
		this.nom_user = nom_user;
		this.prenom_user = prenom_user;
		this.email_user = email_user;
	}
	public User(String nom_user, String prenom_user, String email_user) {
	 	this.id_user = 0;
		this.nom_user = nom_user;
		this.prenom_user = prenom_user;
		this.email_user = email_user;
	}
	public User() {
	 	this.id_user = 0;
		this.nom_user = "";
		this.prenom_user = "";
		this.email_user = "";
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	public String getPrenom_user() {
		return prenom_user;
	}
	public void setPrenom_user(String prenom_user) {
		this.prenom_user = prenom_user;
	}
	public String getEmail_user() {
		return email_user;
	}
	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}
	
	
}
