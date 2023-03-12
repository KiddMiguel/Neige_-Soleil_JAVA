package controller;

import java.util.ArrayList;

import model.modeleLocataire;


public class C_Locataire {

	public static ArrayList<Locataire> selectAllLocataire ()
	{
		return modeleLocataire.selectAllLocataire(); 
	}
	public static void deleteLocataire(int id_locataire)
	{
		modeleLocataire.deleteLocataire(id_locataire);
	}

	public static Locataire selectWhereLocataire(int id_locataire)
	{
		return modeleLocataire.selectWhereLocataire(id_locataire);
	}
	public static Locataire selectWhereLocataire(String email_locataire)
	{
		return modeleLocataire.selectWhereLocataire(email_locataire);
	}
}
