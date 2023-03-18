package controller;

public class Contrat {
	private int id_contrat, id_appart, id_user;
	private String statut_contrat,date_debut_contrat,date_fin_contrat,date_sign_contrat ;
	public Contrat(int id_contrat, int id_appart, int id_user,  String statut_contrat, String date_debut_contrat, String date_fin_contrat, String date_sign_contrat) {
	 	this.id_contrat = id_contrat;
		this.id_appart = id_appart;
		this.id_user = id_user;
		this.statut_contrat = statut_contrat;
		this.date_debut_contrat = date_debut_contrat;
		this.date_fin_contrat = date_fin_contrat;
		this.date_sign_contrat = date_sign_contrat;
	}
	public Contrat(String statut_contrat, String date_debut_contrat, String date_fin_contrat, String date_sign_contrat) {
	 	this.id_contrat = 0;
		this.id_contrat = 0;
		this.id_contrat = 0;
		this.statut_contrat = statut_contrat;
		this.date_debut_contrat = date_debut_contrat;
		this.date_fin_contrat = date_fin_contrat;
		this.date_sign_contrat = date_sign_contrat;
	}
	public Contrat() {
	 	this.id_contrat = 0;
		this.id_appart = 0;
		this.id_user = 0;
		this.statut_contrat = "";
		this.date_debut_contrat = "";
		this.date_fin_contrat = "";
		this.date_sign_contrat = "";
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
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getStatut_contrat() {
		return statut_contrat;
	}
	public void setStatut_contrat(String statut_contrat) {
		this.statut_contrat = statut_contrat;
	}
	public String getDate_debut_contrat() {
		return date_debut_contrat;
	}
	public void setDate_debut_contrat(String date_debut_contrat) {
		this.date_debut_contrat = date_debut_contrat;
	}
	public String getDate_fin_contrat() {
		return date_fin_contrat;
	}
	public void setDate_fin_contrat(String date_fin_contrat) {
		this.date_fin_contrat = date_fin_contrat;
	}
	public String getDate_sign_contrat() {
		return date_sign_contrat;
	}
	public void setDate_sign_contrat(String date_sign_contrat) {
		this.date_sign_contrat = date_sign_contrat;
	}
	
}
