package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controller.Appartement;
import controller.Contrat;
import controller.Locataire;


public class modeleLocataire {
	private static Bdd uneBDD = new Bdd("localhost", "neige_soleil_j","root", "");

	public static void insertLocataire(Locataire unLocataire) {
        String requete = "insert into locataire values(null, '"
                +unLocataire.getCivilite_locataire()+"','" + unLocataire.getNom_locataire()+"','"
                +unLocataire.getPrenom_locataire()+"','" + unLocataire.getEmail_locataire()+"','"
                +unLocataire.getMdp_locataire()+"','"+unLocataire.getTel_locataire()+"','"
                +unLocataire.getAdresse_locataire()+"','"+unLocataire.getCp_locataire()+"','"
                +unLocataire.getNb_reservations()+"','"+unLocataire.getId_appart()+"','"
                +unLocataire.getId_proprietaire()+"',null);"
                ;
        
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            unStat.execute(requete);
            unStat.close();
            uneBDD.seDeconnecter();
        }catch(SQLException exp) {
            System.out.println("Erreur d'execution :" + requete);
        }
    }  
    
	 public static void updateLocataire(Locataire unLocataire) {
	        String requete = "update locataire set civilite_locataire = '" + unLocataire.getCivilite_locataire() +
	        		"',nom_locataire = '" + unLocataire.getNom_locataire() +
	        		"',prenom_locataire = '" + unLocataire.getPrenom_locataire() +
	        		"', email_locataire = '" + unLocataire.getEmail_locataire() +
	        		"', mdp_locataire = '" + unLocataire.getMdp_locataire() +
	        		"',tel_locataire = '" + unLocataire.getTel_locataire() + 
	        		"',adresse_locataire = '" + unLocataire.getAdresse_locataire() + 
	        		"', cp_locataire = '" + unLocataire.getCp_locataire() +
	        		"', nb_reservations = " + unLocataire.getNb_reservations() +
	        		", id_appart = " + unLocataire.getId_appart() + 
	        		", id_proprietaire = " + unLocataire.getId_proprietaire() + 
	        		", id_user = " + unLocataire.getId_user()
	        		 + " where id_locataire = "+unLocataire.getId_locataire()+";";
	        try {
	            uneBDD.seConnecter();
	            Statement unStat = uneBDD.getMaConnexion().createStatement();
	            unStat.execute(requete);
	            unStat.close();
	            uneBDD.seDeconnecter();
	            System.out.println("execution " + requete);
	        }catch(SQLException exp) {
	            System.out.println("Erreur d'execution" + requete);
	            }
	        }
	
    public static void deleteLocataire(int id_locataire) {
        String requete = "delete from locataire where id_locataire="+id_locataire+";";
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            unStat.execute(requete);
            unStat.close();
            uneBDD.seDeconnecter();
        }catch(SQLException exp) {
            System.out.println("Erreur d'execution" + requete);
            }
        }
    public static ArrayList<Locataire> selectAllLocataire ()
    {
        String requete ="select * from locataire ;";
        ArrayList<Locataire> lesLocataires = new ArrayList<Locataire>(); 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation des Locataires resultats 
            ResultSet desResultats = unStat.executeQuery(requete); 

            while (desResultats.next())
            {
                Locataire unLocataire = new Locataire (
                            desResultats.getInt("id_locataire"),desResultats.getInt("id_appart"),
                            desResultats.getInt("nb_reservations"),desResultats.getInt("id_proprietaire"),
                            desResultats.getInt("id_user"),desResultats.getString("civilite_locataire"),desResultats.getString("nom_locataire"),
                            desResultats.getString("prenom_locataire"),desResultats.getString("email_locataire"),
                            desResultats.getString("tel_locataire"),
                            desResultats.getString("adresse_locataire"),desResultats.getString("cp_locataire")
                        );
                //on ajoute le Locataire dans l'ArrayList
                lesLocataires.add(unLocataire);
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return lesLocataires; 
    }
    public static Locataire selectWhereLocataire (int id_locataire)
    {
        String requete =" select * from locataire where id_locataire= "+id_locataire+";";
        Locataire unLocataire = null; 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation un seul Locataire resultat 
            ResultSet unResultat = unStat.executeQuery(requete); 
            //on teste si on a un seul rÃ©sultat
            if (unResultat.next())
            {
                unLocataire = new Locataire (
                		unResultat.getInt("id_locataire"),unResultat.getInt("id_appart"),
                		unResultat.getInt("nb_reservations"),unResultat.getInt("id_proprietaire"),
                		unResultat.getInt("id_user"),unResultat.getString("civilite_locataire"),unResultat.getString("nom_locataire"),
                		unResultat.getString("prenom_locataire"),unResultat.getString("email_locataire"),
                         unResultat.getString("tel_locataire"),
                         unResultat.getString("adresse_locataire"),unResultat.getString("cp_locataire")
                        );
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return unLocataire; 
    }
    
    public static Locataire selectWhereLocataire (String email_locataire)
    {
        String requete =" select * from locataire where email_locataire= '"+email_locataire+"';";
        Locataire unLocataire = null; 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation un seul Locataire resultat 
            ResultSet unResultat = unStat.executeQuery(requete); 
            //on teste si on a un seul rÃ©sultat
            if (unResultat.next())
            {
                unLocataire = new Locataire (
                		unResultat.getInt("id_locataire"),unResultat.getInt("id_appart"),
                		unResultat.getInt("nb_reservations"),unResultat.getInt("id_proprietaire"),
                		unResultat.getInt("id_user"),unResultat.getString("civilite_locataire"),unResultat.getString("nom_locataire"),
                		unResultat.getString("prenom_locataire"),unResultat.getString("email_locataire"),
                         unResultat.getString("tel_locataire"),
                         unResultat.getString("adresse_locataire"),unResultat.getString("cp_locataire")
                        );
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return unLocataire; 
    }
}
