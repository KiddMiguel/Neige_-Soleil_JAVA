package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.modeleProprietaire;



public class C_Proprietaire {
	public static ArrayList<Proprietaire> selectAllProprietaire ()
	{
		return modeleProprietaire.selectAllProprietaire(); 
	}
	public static void deleteProprietaire(int id_proprietaire)
	{
		modeleProprietaire.deleteProprietaire(id_proprietaire);
	}

	public static Proprietaire selectWhereProprietaire(int id_proprietaire)
	{
		return modeleProprietaire.selectWhereProprietaire(id_proprietaire);
	}
	public static Proprietaire selectWhereProprietaire(String email_Proprietaire)
	{
		return modeleProprietaire.selectWhereProprietaire(email_Proprietaire);
	}
}
