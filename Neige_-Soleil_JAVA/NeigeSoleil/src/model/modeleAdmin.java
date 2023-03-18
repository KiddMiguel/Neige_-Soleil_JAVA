package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controller.Admin;


public class modeleAdmin {
	private static Bdd uneBDD = new Bdd("localhost", "neige_soleil","root", "");
	
	//PRIVATE STATIC UPDATE

	 public static Admin selectWhereAdmin (int id_admin)
	    {
	        String requete =" select * from admin  where id_admin= "+id_admin+";";
	        Admin  unAdmin  = null; 
	        try {
	            uneBDD.seConnecter();
	            Statement unStat = uneBDD.getMaConnexion().createStatement();
	            //recuperation un seul Admin  resultat 
	            ResultSet unResultat = unStat.executeQuery(requete); 
	            //on teste si on a un seul rÃ©sultat
	            if (unResultat.next())
	            {
	                unAdmin  = new Admin  (
	                		unResultat.getInt("id_admin"),
	                		unResultat.getString("nom"),unResultat.getString("prenom"),
	                		unResultat.getString("email"),unResultat.getString("mdp"),unResultat.getString("adress")
	                        );
	            }
	            unStat.close();
	            uneBDD.seDeconnecter();
	        }      catch (SQLException exp) {
	            System.out.println("Erreur d'execution : " +requete);
	        }
			return unAdmin;
	    }
	 
	 public static Admin selectWhereAdmin (String email,String mdp)
	    {
	        String requete =" select * from admin  where email= '"+email+"' and mdp = '"+mdp+"';";
	        Admin  unAdmin  = null; 
	        try {
	            uneBDD.seConnecter();
	            Statement unStat = uneBDD.getMaConnexion().createStatement();
	            //recuperation un seul Admin  resultat 
	            ResultSet unResultat = unStat.executeQuery(requete); 
	            //on teste si on a un seul rÃ©sultat
	            if (unResultat.next())
	            {
	                unAdmin  = new Admin  (
	                		unResultat.getInt("id_admin"),
	                		unResultat.getString("nom"),unResultat.getString("prenom"),
	                		unResultat.getString("email"),unResultat.getString("mdp"),unResultat.getString("adress")
	                        );
	            }
	            unStat.close();
	            uneBDD.seDeconnecter();
	        }      catch (SQLException exp) {
	            System.out.println("Erreur d'execution : " +requete);
	        }
			return unAdmin;
	    }
	 
	    
}
