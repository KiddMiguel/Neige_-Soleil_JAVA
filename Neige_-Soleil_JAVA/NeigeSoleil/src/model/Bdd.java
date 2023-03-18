package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bdd {
	private String serveur, bdd, user, mdp;
	private Connection maConnexion;
	
	public Bdd(String serveur, String bdd, String user, String mdp) {
		this.maConnexion = null;
		this.serveur = serveur;
		this.bdd = bdd;
		this.user = user;
		this.mdp = mdp;

	}
	
	public void chargerPilote () {
		try {
			Class.forName("com.mysql.jbdc.Driver");
		}catch(ClassNotFoundException exp){
			System.out.println("Absence du driver JDBC");
		}
	}
	
	public void seConnecter () {
		String url = "jdbc:mysql://"+this.serveur+"/"+this.bdd;
		try {
			this.maConnexion = DriverManager.getConnection(url, this.user, this.mdp);
		}catch(SQLException exp) {
			System.out.println("Impossible de se connceter");
		}
	}

	public void seDeconnecter () {
		try{
			if(this.maConnexion != null) {
				this.maConnexion.close();
			}
		}catch(SQLException exp) {
			System.out.println("Fermeture impossible de la cnnexion");
		}
	}

	public Connection getMaConnexion() {
		return maConnexion;
	}

	public void setMaConnexion(Connection maConnexion) {
		this.maConnexion = maConnexion;
	}

}
