package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controller.Appartement;
import controller.Reservation;


public class modeleReservation {
	private static Bdd uneBDD = new Bdd("localhost", "neige_soleil","root", "");
	public static void insertReservation(Reservation uneReservation) {
        String requete = "insert into reservation values(null, '"
                + uneReservation.getStatut_reservation()+"','" + uneReservation.getDate_debut_reservation()+"','"
                + uneReservation.getDate_fin_reservation()+"','" + uneReservation.getPrix_reservation()+"','"
                + uneReservation.getNb_personnes()+"','"+uneReservation.getId_user()+"',null,'"
                +uneReservation.getId_appart()+"', null;)";
        
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
    public static void updateReservation(Reservation uneReservation) {
        String requete = "update reservation set statut_reservation = '" + uneReservation.getStatut_reservation() +
        		"',date_debut_reservation = '" + uneReservation.getDate_debut_reservation() +
        		"',date_fin_reservation = '" + uneReservation.getDate_fin_reservation() +
        		"', prix_reservation = '" + uneReservation.getPrix_reservation() +
        		"', nb_personnes = '" + uneReservation.getNb_personnes() +
        		"',id_user = '" + uneReservation.getId_user() + 
        		"',id_appart = '" + uneReservation.getId_appart()+ "' where id_reservation ='" +uneReservation.getId_reservation()+"';";
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            unStat.execute(requete);
            unStat.close();
            uneBDD.seDeconnecter();
        }catch(SQLException exp) {
            System.out.println("Erreur d'execution " + requete);
            }
        }
    public static void deleteReservation (int id_reservation) {
        String requete = "delete from reservation  where id_reservation="+id_reservation+";";
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
    public static ArrayList<Reservation > selectAllReservation  ()
    {
        String requete ="select * from reservation  ;";
        ArrayList<Reservation > lesReservations = new ArrayList<Reservation >(); 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation des Reservation s resultats 
            ResultSet desResultats = unStat.executeQuery(requete); 
            //on parcours les resultats et on instancie les Reservation s et enfin on les ajoute 
            //dans l'ArrayList
            while (desResultats.next())
            {
                Reservation  uneReservation  = new Reservation  (
                            desResultats.getInt("id_reservation"),desResultats.getInt("id_user"),desResultats.getInt("id_appart"), 
                            desResultats.getInt("nb_personnes"),desResultats.getString("statut_reservation"),
                            desResultats.getString("date_debut_reservation"),desResultats.getString("date_fin_reservation"),
                            desResultats.getString("prix_reservation")
                            );
                //on ajoute le Reservation  dans l'ArrayList
                lesReservations.add(uneReservation );
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return lesReservations; 
    }
    public static Reservation selectWhereReservation  (int id_reservation)
    {
        String requete =" select * from reservation  where id_reservation= "+id_reservation+";";
        Reservation  uneReservation  = null; 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation un seul Reservation  resultat 
            ResultSet unResultat = unStat.executeQuery(requete); 
            //on teste si on a un seul rÃ©sultat
            if (unResultat.next())
            {
                uneReservation  = new Reservation  (
                		unResultat.getInt("id_reservation"),unResultat.getInt("id_user"),unResultat.getInt("id_appart"), 
                		unResultat.getInt("nb_personnes"),unResultat.getString("statut_reservation"),
                		unResultat.getString("date_debut_reservation"),unResultat.getString("date_fin_reservation"),
                		unResultat.getString("prix_reservation")
                        );
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return uneReservation ; 
    }
    
    public static Reservation selectWhereReservation  (String statut)
    {
        String requete =" select * from reservation  where id_reservation= "+statut+";";
        Reservation  uneReservation  = null; 
        try {
            uneBDD.seConnecter();
            Statement unStat = uneBDD.getMaConnexion().createStatement();
            //recuperation un seul Reservation  resultat 
            ResultSet unResultat = unStat.executeQuery(requete); 
            //on teste si on a un seul rÃ©sultat
            if (unResultat.next())
            {
                uneReservation  = new Reservation  (
                		unResultat.getInt("id_reservation"),unResultat.getInt("id_user"),unResultat.getInt("id_appart"), 
                		unResultat.getInt("nb_personnes"),unResultat.getString("statut_reservation"),
                		unResultat.getString("date_debut_reservation"),unResultat.getString("date_fin_reservation"),
                		unResultat.getString("prix_reservation")
                        );
            }
            unStat.close();
            uneBDD.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : " +requete);
        }
        return uneReservation ; 
    }
}
