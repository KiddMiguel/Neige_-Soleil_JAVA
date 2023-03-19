package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controller.Contrat;


public class modeleContrat {
	private static Bdd uneBDD = new Bdd("localhost", "neige_soleil","root", "");
	
	    public static void insertContrat(Contrat unContrat) {
	        String requete = "insert into contrat values(null, '"
	                + unContrat.getStatut_contrat()+"','" + unContrat.getDate_debut_contrat()+"','"
	                + unContrat.getDate_fin_contrat()+"','" + unContrat.getDate_sign_contrat()+"', "
	                + unContrat.getId_appart()+"," +unContrat.getId_user()+ ");";
	        try {
	            uneBDD.seConnecter();
	            Statement unStat = uneBDD.getMaConnexion().createStatement();
	            unStat.execute(requete);
	            unStat.close();
	            uneBDD.seDeconnecter();
	            System.out.println("execution: " + requete);
	        }catch(SQLException exp) {
	            System.out.println("Erreur d'execution" + requete);
	        }
	    }   
	    public static void deleteContrat(int id_contrat) {
	        String requete = "delete from Contrat where id_contrat="+id_contrat+";";
	        try {
	            uneBDD.seConnecter();
	            Statement unStat = uneBDD.getMaConnexion().createStatement();
	            unStat.execute(requete);
	            unStat.close();
	            uneBDD.seDeconnecter();
	        }catch(SQLException exp) {
	            System.out.println("Erreur d'execution: " + requete);
	            }
	        }
	    public static void updateContrat(Contrat unContrat) {
	        String requete = "update contrat set statut_contrat='"+ unContrat.getStatut_contrat()+"', date_debut_contrat='"
	        		+ unContrat.getDate_debut_contrat()+"', date_fin_contrat='"
	                + unContrat.getDate_fin_contrat()+"', date_sign_contrat='" + unContrat.getDate_sign_contrat()+"',"
	                +"',id_user='" + unContrat.getId_user()+"','"+"',id_appart='" + unContrat.getId_appart()+
	                "' where id_contrat='"+unContrat.getId_contrat()+"';";
	        try {
	            uneBDD.seConnecter();
	            Statement unStat = uneBDD.getMaConnexion().createStatement();
	            unStat.execute(requete);
	            unStat.close();
	            uneBDD.seDeconnecter();
	        }catch(SQLException exp) {
	            System.out.println("Erreur d'execution: " + requete);
	            }
	        }
	    public static ArrayList<Contrat> selectAllContrat ()
	    {
	        String requete =" select * from contrat ;";
	        ArrayList<Contrat> lesContrats = new ArrayList<Contrat>(); 
	        try {
	            uneBDD.seConnecter();
	            Statement unStat = uneBDD.getMaConnexion().createStatement();
	            //recuperation des Contrats resultats 
	            ResultSet desResultats = unStat.executeQuery(requete); 
	            //on parcours les resultats et on instancie les Contrats et enfin on les ajoute 
	            //dans l'ArrayList
	            while (desResultats.next())
	            {
	                Contrat unContrat = new Contrat (
	                            desResultats.getInt("id_contrat"),desResultats.getInt("id_appart"), 
	                            desResultats.getInt("id_user"),desResultats.getString("statut_contrat"),
	                            desResultats.getString("date_debut_contrat"),desResultats.getString("date_fin_contrat"),
	                            desResultats.getString("date_sign_contrat")
	                            		
	                        );
	                //on ajoute le Contrat dans l'ArrayList
	                lesContrats.add(unContrat);
	            }
	            unStat.close();
	            uneBDD.seDeconnecter();
	        }
	        catch (SQLException exp) {
	            System.out.println("Erreur d'execution : " +requete);
	        }
	        return lesContrats; 
	    }
	    public static Contrat selectWhereContrat (int id_contrat)
	    {
	        String requete =" select * from contrat where id_contrat= "+id_contrat+";";
	        Contrat unContrat = null; 
	        try {
	            uneBDD.seConnecter();
	            Statement unStat = uneBDD.getMaConnexion().createStatement();
	            //recuperation un seul Contrat resultat 
	            ResultSet unResultat = unStat.executeQuery(requete); 
	            //on teste si on a un seul rÃ©sultat
	            if (unResultat.next())
	            {
	                unContrat = new Contrat (
	                		unResultat.getInt("id_contrat"),unResultat.getInt("id_appart"), 
	                		unResultat.getInt("id_user"),unResultat.getString("statut_contrat"),
	                		unResultat.getString("date_debut_contrat"),unResultat.getString("date_fin_contrat"),
	                		unResultat.getString("date_sign_contrat")
	                        );
	            }
	            unStat.close();
	            uneBDD.seDeconnecter();
	        }
	        catch (SQLException exp) {
	            System.out.println("Erreur d'execution : " +requete);
	        }
	        return unContrat; 
	    }
	    public static Contrat selectWhereContrat (String statut, String date_fin_contrat)
	    {
	        String requete =" select * from contrat where statut_contrat= '"+statut+"' and date_sign_contrat = '"+date_fin_contrat+"' ;";
	        Contrat unContrat = null; 
	        try {
	            uneBDD.seConnecter();
	            Statement unStat = uneBDD.getMaConnexion().createStatement();
	            //recuperation un seul Contrat resultat 
	            ResultSet unResultat = unStat.executeQuery(requete); 
	            //on teste si on a un seul rÃ©sultat
	            if (unResultat.next())
	            {
	                unContrat = new Contrat (
	                		unResultat.getInt("id_contrat"),unResultat.getInt("id_appart"), 
	                		unResultat.getInt("id_user"),unResultat.getString("statut_contrat"),
	                		unResultat.getString("date_debut_contrat"),unResultat.getString("date_fin_contrat"),
	                		unResultat.getString("date_sign_contrat")
	                        );
	            }
	            unStat.close();
	            uneBDD.seDeconnecter();
	        }
	        catch (SQLException exp) {
	            System.out.println("Erreur d'execution : " +requete);
	        }
	        return unContrat; 
	    }
}
