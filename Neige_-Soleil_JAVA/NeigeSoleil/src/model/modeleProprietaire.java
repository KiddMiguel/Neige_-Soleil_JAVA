package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controller.Proprietaire;


public class modeleProprietaire {
	private static Bdd uneBDD = new Bdd("localhost", "neige_soleil","root", "");

    public static void deleteProprietaire (int id_proprietaire) {
        String requete = "delete from proprietaire  where id_proprietaire="+id_proprietaire+";";
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

    public static ArrayList<Proprietaire> selectAllProprietaire  ()
    {
        String requete ="select * from proprietaire ;";
        ArrayList<Proprietaire > lesProprietaires = new ArrayList<Proprietaire >(); 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation des Proprietaire s resultats 
            ResultSet desResultats = unStat.executeQuery(requete); 
            //on parcours les resultats et on instancie les Proprietaire s et enfin on les ajoute 
            //dans l'ArrayList
            while (desResultats.next())
            {
                Proprietaire  unProprietaire  = new Proprietaire  (
                		
                			desResultats.getInt("id_proprietaire"),desResultats.getInt("id_user"),desResultats.getInt("id_appart"),
                            desResultats.getInt("id_contrat"),desResultats.getString("nom_proprio"),
                            desResultats.getString("prenom_proprio"),desResultats.getString("statut_proprio"),
                            desResultats.getString("email_proprio"),desResultats.getString("tel_proprio"),
                            desResultats.getString("adresse_proprio"),desResultats.getString("cp_proprio"),
                            desResultats.getString("ville_proprio"), desResultats.getString("pays_proprio"),
                            desResultats.getString("code_adherent")
                        );
      
                //on ajoute le Proprietaire  dans l'ArrayList
                lesProprietaires.add(unProprietaire );
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return lesProprietaires; 
    }
    public static Proprietaire  selectWhereProprietaire(int id_proprietaire)
    {
        String requete ="select * from proprietaire  where id_proprietaire= "+id_proprietaire+";";
        Proprietaire  unProprietaire  = null; 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation un seul Proprietaire  resultat 
            ResultSet unResultat = unStat.executeQuery(requete); 
            //on teste si on a un seul rÃ©sultat
            if (unResultat.next())
            {
                unProprietaire  = new Proprietaire  (
                		unResultat.getInt("id_proprietaire"),unResultat.getInt("id_user"),unResultat.getInt("id_appart"),
                		unResultat.getInt("id_contrat"),unResultat.getString("nom_proprio"),
                           unResultat.getString("prenom_proprio"),unResultat.getString("statut_proprio"),
                           unResultat.getString("email_proprio "),unResultat.getString("tel_proprio"),
                           unResultat.getString("adresse_proprio "),unResultat.getString("cp_proprio"),
                           unResultat.getString("ville_proprio"), unResultat.getString("pays_proprio"),
                           unResultat.getString("code_adherent")
                        );
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return unProprietaire ; 
    }
    
    public static Proprietaire  selectWhereProprietaire(String email_Proprietaire)
    {
        String requete ="select * from proprietaire  where email_Proprietaire= "+email_Proprietaire+";";
        Proprietaire  unProprietaire  = null; 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation un seul Proprietaire  resultat 
            ResultSet unResultat = unStat.executeQuery(requete); 
            //on teste si on a un seul rÃ©sultat
            if (unResultat.next())
            {
                unProprietaire  = new Proprietaire  (
                		unResultat.getInt("id_proprietaire"),unResultat.getInt("id_user"),unResultat.getInt("id_appart"),
                		unResultat.getInt("id_contrat"),unResultat.getString("nom_proprio"),
                           unResultat.getString("prenom_proprio"),unResultat.getString("statut_proprio"),
                           unResultat.getString("email_proprio"),unResultat.getString("tel_proprio"),
                           unResultat.getString("adresse_proprio"),unResultat.getString("cp_proprio"),
                           unResultat.getString("ville_proprio"), unResultat.getString("pays_proprio"),
                           unResultat.getString("code_adherent")
                        );
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return unProprietaire ; 
    }
}
