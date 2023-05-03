package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controller.User;

public class modeleUser {

	private static Bdd uneBDD = new Bdd("localhost", "neige_soleil_j","root", "");
	
	 public static ArrayList<User> selectAllUser ()
	    {
	        String requete =" select * from user ;";
	        ArrayList<User> lesUsers = new ArrayList<User>(); 
	        try {
	            uneBDD.seConnecter();
	            Statement unStat = uneBDD.getMaConnexion().createStatement();
	            //recuperation des Contrats resultats 
	            ResultSet desResultats = unStat.executeQuery(requete); 
	            //on parcours les resultats et on instancie les Contrats et enfin on les ajoute 
	            //dans l'ArrayList
	            while (desResultats.next())
	            {
	            	User unUser = new User (
	                            desResultats.getInt("id_user"), 
	                            desResultats.getString("nom_user"),desResultats.getString("prenom_user"),
	                            desResultats.getString("email_user")
	                            		
	                        );
	                //on ajoute le Contrat dans l'ArrayList
	                lesUsers.add(unUser);
	            }
	            unStat.close();
	            uneBDD.seDeconnecter();
	        }
	        catch (SQLException exp) {
	            System.out.println("Erreur d'execution : " +requete);
	        }
	        return lesUsers; 
	    }

}
