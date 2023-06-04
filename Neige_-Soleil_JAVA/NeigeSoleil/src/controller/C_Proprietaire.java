package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.modeleLocataire;
import model.modeleProprietaire;



public class C_Proprietaire {
	
	public static void insertProprietaire(Proprietaire unProprietaire)
	{
		modeleProprietaire.insertProprietaire(unProprietaire);
	}
	public static ArrayList<Proprietaire> selectAllProprietaire ()
	{
		return modeleProprietaire.selectAllProprietaire(); 
	}
	public static void deleteProprietaire(int id_proprietaire)
	{
		modeleProprietaire.deleteProprietaire(id_proprietaire);
	}
	public static void updateProprietaire(Proprietaire unProprietaire)
	{
		modeleProprietaire.updateProprietaire(unProprietaire);
	}
	public static Proprietaire selectWhereProprietaire(int id_proprietaire)
	{
		return modeleProprietaire.selectWhereProprietaire(id_proprietaire);
	}
	public static Proprietaire selectWhereProprietaire(String email_proprio)
	{
		return modeleProprietaire.selectWhereProprietaire(email_proprio);
	}
}
