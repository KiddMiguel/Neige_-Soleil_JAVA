package controller;

public class Appartement {
	private int id_appart, nb_chambre, nb_cuisine, nb_salle_bain, nb_salon, nb_piece, id_user;
	private String statut_appart,intitule_appart,ville_appart,cp_appart, adresse_appart, description_appart, type_appart, superficie_appart;
	private float prix_appart;
	
	public Appartement(int id_appart, int nb_chambre, int nb_cuisine, int nb_salle_bain, int nb_salon, int nb_piece, int id_user,
			float prix_appart,  String statut_appart, String intitule_appart, String ville_appart, String cp_appart, String adresse_appart, String type_appart, String superficie_appart) {
	 	this.id_appart = id_appart;
		this.nb_chambre = nb_chambre;
	 	this.nb_cuisine = nb_cuisine;
	 	this.nb_salle_bain = nb_salle_bain;
	 	this.nb_salon = nb_salon;
	 	this.nb_piece = nb_piece;
		this.id_user = id_user;
		this.prix_appart = prix_appart;		
		this.statut_appart = statut_appart;
		this.intitule_appart = intitule_appart;
		this.ville_appart = ville_appart;	
		this.cp_appart = cp_appart;
		this.adresse_appart = adresse_appart;		
		this.type_appart = type_appart;
		this.superficie_appart = superficie_appart;
	}
	public Appartement(String statut_appart, String intitule_appart, String ville_appart, String cp_appart, String adresse_appart, String type_appart, String superficie_appart,
			int nb_chambre, int nb_cuisine, int nb_salle_bain, int nb_salon, int nb_piece, int id_user,
			float prix_appart) {
	 	this.id_appart = 0;
		this.nb_chambre = nb_chambre;
	 	this.nb_cuisine = nb_cuisine;
	 	this.nb_salle_bain = nb_salle_bain;
	 	this.nb_salon = nb_salon;
	 	this.nb_piece = nb_piece;
		this.id_user = id_user;
		this.prix_appart = prix_appart;		
		this.statut_appart = statut_appart;
		this.intitule_appart = intitule_appart;
		this.ville_appart = ville_appart;
		this.cp_appart = cp_appart;
		this.adresse_appart = adresse_appart;
		this.type_appart = type_appart;
		this.superficie_appart = superficie_appart;
	}
	
	
	public Appartement() {
	 	this.id_appart = 0;
		this.nb_chambre = 0;
	 	this.nb_cuisine = 0;
	 	this.nb_salle_bain = 0;
	 	this.nb_salon = 0;
	 	this.nb_piece = 0;
		this.id_user = 0;
		this.prix_appart = 0;		
		this.statut_appart = "";
		this.intitule_appart = "";
		this.ville_appart = "";	
		this.cp_appart = "";
		this.adresse_appart = "";		
		this.type_appart = "";
		this.superficie_appart = "";
	}
	public int getId_appart() {
		return id_appart;
	}
	public void setId_appart(int id_appart) {
		this.id_appart = id_appart;
	}
	public int getNb_chambre() {
		return nb_chambre;
	}
	public void setNb_chambre(int nb_chambre) {
		this.nb_chambre = nb_chambre;
	}
	public int getNb_cuisine() {
		return nb_cuisine;
	}
	public void setNb_cuisine(int nb_cuisine) {
		this.nb_cuisine = nb_cuisine;
	}
	public int getNb_salle_bain() {
		return nb_salle_bain;
	}
	public void setNb_salle_bain(int nb_salle_bain) {
		this.nb_salle_bain = nb_salle_bain;
	}
	public int getNb_salon() {
		return nb_salon;
	}
	public void setNb_salon(int nb_salon) {
		this.nb_salon = nb_salon;
	}
	public int getNb_piece() {
		return nb_piece;
	}
	public void setNb_piece(int nb_piece) {
		this.nb_piece = nb_piece;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getStatut_appart() {
		return statut_appart;
	}
	public void setStatut_appart(String statut_appart) {
		this.statut_appart = statut_appart;
	}
	public String getIntitule_appart() {
		return intitule_appart;
	}
	public void setIntitule_appart(String intitule_appart) {
		this.intitule_appart = intitule_appart;
	}
	public String getVille_appart() {
		return ville_appart;
	}
	public void setVille_appart(String ville_appart) {
		this.ville_appart = ville_appart;
	}
	public String getCp_appart() {
		return cp_appart;
	}
	public void setCp_appart(String cp_appart) {
		this.cp_appart = cp_appart;
	}
	public String getAdresse_appart() {
		return adresse_appart;
	}
	public void setAdresse_appart(String adresse_appart) {
		this.adresse_appart = adresse_appart;
	}
	public String getDescription_appart() {
		return description_appart;
	}
	public void setDescription_appart(String description_appart) {
		this.description_appart = description_appart;
	}
	public String getType_appart() {
		return type_appart;
	}
	public void setType_appart(String type_appart) {
		this.type_appart = type_appart;
	}
	public String getSuperficie_appart() {
		return superficie_appart;
	}
	public void setSuperficie_appart(String superficie_appart) {
		this.superficie_appart = superficie_appart;
	}
	public float getPrix_appart() {
		return prix_appart;
	}
	public void setPrix_appart(float prix_appart) {
		this.prix_appart = prix_appart;
	}

	
}