package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controller.Appartement;

public class modeleAppartement {
	private static Bdd uneBDD = new Bdd("localhost", "neige_soleil","root", "");
	public static void insertAppartement(Appartement unAppartement) {
        String requete = "insert into appartement values(null, '"
                + unAppartement.getStatut_appart()+"','" + unAppartement.getPrix_appart()+"','"
                + unAppartement.getIntitule_appart()+"','" + unAppartement.getVille_appart()+"','"
                + unAppartement.getCp_appart()+"','"+unAppartement.getAdresse_appart()+"','" 
                +unAppartement.getCp_appart()+"','"+ unAppartement.getDescription_appart()+"','" 
                +unAppartement.getType_appart()+"','"+unAppartement.getSuperficie_appart()+"','"
                +unAppartement.getNb_chambres()+"','"+unAppartement.getNb_lits()+"','"
                +unAppartement.getNb_salles_bain()+"','" + unAppartement.getCapacite_appart()+"', null, null, null, null, null, null, null, null,'"
                +unAppartement.getId_reservation()+"','" + unAppartement.getId_contrat()+"','" 
                + unAppartement.getId_user()+"', null');";
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
    public static void updateAppartement(Appartement unAppartement) {
        String requete = "update appartement set statut_appart = '" + unAppartement.getStatut_appart() +
        		"',prix_appart = '" + unAppartement.getPrix_appart() +
        		"',intitule_appart = '" + unAppartement.getIntitule_appart() +
        		"', ville_appart = '" + unAppartement.getVille_appart() +
        		"', cp_appart = '" + unAppartement.getCp_appart() +
        		"',adresse_appart = '" + unAppartement.getAdresse_appart() + 
        		"',description_appart = '" + unAppartement.getDescription_appart() + 
        		"', type_appart = '" + unAppartement.getType_appart() +
        		"', superficie_appart = '" + unAppartement.getSuperficie_appart() +
        		"', nb_chambres = '" + unAppartement.getNb_chambres() + 
        		"', nb_lits = '" + unAppartement.getNb_lits() + 
        		"', nb_salles_bain = '" + unAppartement.getNb_salles_bain() + 
        		"', capacite_appart = '" + unAppartement.getCapacite_appart() + 
        		"', id_reservation = '" + unAppartement.getId_reservation() + 
        		"', id_contrat = '" + unAppartement.getId_contrat() +
        		"', id_user = '" + unAppartement.getId_user() + "';' ";
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
    public static void deleteAppartement (int id_user) {
        String requete = "delete from Appartement  where id_user="+id_user+";";
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
    public static ArrayList<Appartement > selectAllAppartement  ()
    {
        String requete ="select * from Appartement  ;";
        ArrayList<Appartement > lesAppartements = new ArrayList<Appartement >(); 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation des Appartement s resultats 
            ResultSet desResultats = unStat.executeQuery(requete); 
            //on parcours les resultats et on instancie les Appartement s et enfin on les ajoute 
            //dans l'ArrayList
            while (desResultats.next())
            {
                Appartement  unAppartement  = new Appartement  (
                            desResultats.getInt("id_appart"),desResultats.getInt("id_user"),
                            desResultats.getInt("id_reservation"),desResultats.getInt("id_reservation"),
                            desResultats.getInt("nb_chambres "),desResultats.getInt("nb_salles_bain "),
                            desResultats.getInt("capacite_appart "),desResultats.getFloat("prix_appart "),
                            desResultats.getString("statut_appart "),desResultats.getString("intitule_appart "),
                            desResultats.getString("ville_appart "),desResultats.getString("cp_appart "),
                            desResultats.getString("adresse_appart "),desResultats.getString("type_appart ")
                        );
                //on ajoute le Appartement  dans l'ArrayList
                lesAppartements.add(unAppartement );
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return lesAppartements; 
    }
    public static Appartement selectWhereAppartement  (int id_appart)
    {
        String requete =" select * from Appartement  where id_appart= "+id_appart+";";
        Appartement  unAppartement  = null; 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation un seul Appartement  resultat 
            ResultSet unResultat = unStat.executeQuery(requete); 
            //on teste si on a un seul rÃ©sultat
            if (unResultat.next())
            {
                unAppartement  = new Appartement  (
                		unResultat.getInt("id_appart"),unResultat.getInt("id_user"),
                		unResultat.getInt("id_reservation"),unResultat.getInt("id_reservation"),
                		unResultat.getInt("nb_chambres "),unResultat.getInt("nb_salles_bain "),
                		unResultat.getInt("capacite_appart "),unResultat.getFloat("prix_appart "),
                		unResultat.getString("statut_appart "),unResultat.getString("intitule_appart "),
                		unResultat.getString("ville_appart "),unResultat.getString("cp_appart "),
                		unResultat.getString("adresse_appart "),unResultat.getString("type_appart ")
                        );
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return unAppartement ; 
    }
}
