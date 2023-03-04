package controller;

public class Appartement {
	private int id_appart, nb_chambres, nb_lits, nb_salles_bain, capacite_appart, id_reservation, id_contrat, id_user, id_materiel_proprio;
	private String statut_appart,intitule_appart,ville_appart,cp_appart, adresse_appart, description_appart, type_appart, superficie_appart, 
					atout_appart1, atout_appart2, atout_appart3, image_1, image_2, image_3, image_4, image_5;
	private float prix_appart;
	public Appartement(int id_appart, int nb_chambres, int nb_lits, int id_reservation, int nb_salles_bain, int capacite_appart, int id_user, float prix_appart,  String statut_appart, String intitule_appart, String ville_appart, String cp_appart, String adresse_appart, String type_appart) {
	 	this.id_appart = id_appart;
	 	this.id_user = id_user;
		this.id_reservation = id_reservation;
	 	this.nb_chambres = nb_chambres;
	 	this.nb_salles_bain = nb_salles_bain;
	 	this.capacite_appart = capacite_appart;
	 	this.prix_appart = prix_appart;
		this.statut_appart = statut_appart;
		this.intitule_appart = intitule_appart;
		this.ville_appart = ville_appart;
		this.cp_appart = cp_appart;
		this.adresse_appart = adresse_appart;
		this.type_appart = type_appart;
	}
	public Appartement(String statut_appart, String intitule_appart, String ville_appart, String cp_appart, String adresse_appart, String type_appart) {
	 	this.id_appart = 0;
		this.id_user = 0;
		this.id_reservation = 0;
		this.nb_chambres = 0;
		this.nb_salles_bain = 0;
		this.capacite_appart = 0;
		this.prix_appart = 0;
		this.statut_appart = statut_appart;
		this.intitule_appart = intitule_appart;
		this.ville_appart = ville_appart;
		this.cp_appart = cp_appart;
		this.adresse_appart = adresse_appart;
		this.type_appart = type_appart;
	}
	public Appartement() {
	 	this.id_appart = 0;
			this.id_user = 0;
			this.nb_chambres = 0;
			this.nb_salles_bain = 0;
			this.capacite_appart = 0;
			this.prix_appart = 0;
			this.statut_appart = "";
			this.intitule_appart = "";
			this.ville_appart = "";
			this.cp_appart = "";
			this.adresse_appart = "";
			this.type_appart = "";
	}
	public int getId_appart() {
		return id_appart;
	}
	public void setId_appart(int id_appart) {
		this.id_appart = id_appart;
	}
	public int getNb_chambres() {
		return nb_chambres;
	}
	public void setNb_chambres(int nb_chambres) {
		this.nb_chambres = nb_chambres;
	}
	public int getNb_lits() {
		return nb_lits;
	}
	public void setNb_lits(int nb_lits) {
		this.nb_lits = nb_lits;
	}
	public int getNb_salles_bain() {
		return nb_salles_bain;
	}
	public void setNb_salles_bain(int nb_salles_bain) {
		this.nb_salles_bain = nb_salles_bain;
	}
	public int getCapacite_appart() {
		return capacite_appart;
	}
	public void setCapacite_appart(int capacite_appart) {
		this.capacite_appart = capacite_appart;
	}
	public int getId_reservation() {
		return id_reservation;
	}
	public void setId_reservation(int id_reservation) {
		this.id_reservation = id_reservation;
	}
	public int getId_contrat() {
		return id_contrat;
	}
	public void setId_contrat(int id_contrat) {
		this.id_contrat = id_contrat;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_materiel_proprio() {
		return id_materiel_proprio;
	}
	public void setId_materiel_proprio(int id_materiel_proprio) {
		this.id_materiel_proprio = id_materiel_proprio;
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
	public String getAtout_appart1() {
		return atout_appart1;
	}
	public void setAtout_appart1(String atout_appart1) {
		this.atout_appart1 = atout_appart1;
	}
	public String getAtout_appart2() {
		return atout_appart2;
	}
	public void setAtout_appart2(String atout_appart2) {
		this.atout_appart2 = atout_appart2;
	}
	public String getAtout_appart3() {
		return atout_appart3;
	}
	public void setAtout_appart3(String atout_appart3) {
		this.atout_appart3 = atout_appart3;
	}
	public String getImage_1() {
		return image_1;
	}
	public void setImage_1(String image_1) {
		this.image_1 = image_1;
	}
	public String getImage_2() {
		return image_2;
	}
	public void setImage_2(String image_2) {
		this.image_2 = image_2;
	}
	public String getImage_3() {
		return image_3;
	}
	public void setImage_3(String image_3) {
		this.image_3 = image_3;
	}
	public String getImage_4() {
		return image_4;
	}
	public void setImage_4(String image_4) {
		this.image_4 = image_4;
	}
	public String getImage_5() {
		return image_5;
	}
	public void setImage_5(String image_5) {
		this.image_5 = image_5;
	}
	public float getPrix_appart() {
		return prix_appart;
	}
	public void setPrix_appart(float prix_appart) {
		this.prix_appart = prix_appart;
	}
	
}
