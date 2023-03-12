package controller;

import java.util.ArrayList;

import model.modeleAppartement;

public class C_Appartement {
	public static void insertAppartement(Appartement unAppartement)
	{
		modeleAppartement.insertAppartement(unAppartement);
	}
	public static ArrayList<Appartement> selectAllAppartements ()
	{
		return modeleAppartement.selectAllAppartement(); 
	}
	public static void deleteAppartement(int idAppartement)
	{
		modeleAppartement.deleteAppartement(idAppartement);
	}
	public static void updateAppartement(Appartement unAppartement)
	{
		modeleAppartement.updateAppartement(unAppartement);
	}
	public static Appartement selectWhereAppartement(int id_appart)
	{
		return modeleAppartement.selectWhereAppartement(id_appart);
	}
	public static Appartement selectWhereAppartement(String statut)
	{
		return modeleAppartement.selectWhereAppartement(statut);
	}
}
