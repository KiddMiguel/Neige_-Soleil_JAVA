package controller;

public class Reservation {
	private int id_reservation, nb_personnes, id_user, id_appart, id_materiel_proprio;
	private String statut_reservation,date_debut_reservation,date_fin_reservation,prix_reservation ;
	public Reservation(int id_reservation, int nb_personnes, int id_user, int id_appart,  String statut_reservation, String date_debut_reservation, String date_fin_reservation, String prix_reservation) {
	 	this.id_reservation = id_reservation;
		this.id_user = id_user;
		this.id_appart = id_appart;
		this.nb_personnes = nb_personnes;
		this.statut_reservation = statut_reservation;
		this.date_debut_reservation = date_debut_reservation;
		this.date_fin_reservation = date_fin_reservation;
		this.prix_reservation = prix_reservation;
	}
	public Reservation( String statut_reservation, String date_debut_reservation, String date_fin_reservation, String prix_reservation) {
	 	this.id_reservation = 0;
		this.id_user = 0;
		this.id_appart = 0;
		this.nb_personnes = 0;
		this.statut_reservation = statut_reservation;
		this.date_debut_reservation = date_debut_reservation;
		this.date_fin_reservation = date_fin_reservation;
		this.prix_reservation = prix_reservation;
	}
	public Reservation() {
	 	this.id_reservation = 0;
		this.id_user = 0;
		this.id_appart = 0;
		this.nb_personnes = 0;
		this.statut_reservation = "";
		this.date_debut_reservation = "";
		this.date_fin_reservation = "";
		this.prix_reservation = "";
	}
	public int getId_reservation() {
		return id_reservation;
	}
	public void setId_reservation(int id_reservation) {
		this.id_reservation = id_reservation;
	}
	public int getNb_personnes() {
		return nb_personnes;
	}
	public void setNb_personnes(int nb_personnes) {
		this.nb_personnes = nb_personnes;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_appart() {
		return id_appart;
	}
	public void setId_appart(int id_appart) {
		this.id_appart = id_appart;
	}
	public int getId_materiel_proprio() {
		return id_materiel_proprio;
	}
	public void setId_materiel_proprio(int id_materiel_proprio) {
		this.id_materiel_proprio = id_materiel_proprio;
	}
	public String getStatut_reservation() {
		return statut_reservation;
	}
	public void setStatut_reservation(String statut_reservation) {
		this.statut_reservation = statut_reservation;
	}
	public String getDate_debut_reservation() {
		return date_debut_reservation;
	}
	public void setDate_debut_reservation(String date_debut_reservation) {
		this.date_debut_reservation = date_debut_reservation;
	}
	public String getDate_fin_reservation() {
		return date_fin_reservation;
	}
	public void setDate_fin_reservation(String date_fin_reservation) {
		this.date_fin_reservation = date_fin_reservation;
	}
	public String getPrix_reservation() {
		return prix_reservation;
	}
	public void setPrix_reservation(String prix_reservation) {
		this.prix_reservation = prix_reservation;
	}
	
}
