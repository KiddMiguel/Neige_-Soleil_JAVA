package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.modeleAppartement;
import model.modeleContrat;


public class C_Contrat {
	public static void insertContrat(Contrat unContrat)
	{
		modeleContrat.insertContrat(unContrat);
	}
	public static ArrayList<Contrat> selectAllContrat ()
	{
		return modeleContrat.selectAllContrat(); 
	}
	public static void deleContrat(int id_contrat)
	{
		modeleContrat.deleteContrat(id_contrat);
	}
	public static void updateContrat(Contrat unContrat)
	{
		modeleContrat.updateContrat(unContrat);
	}
	public static Contrat selectWhereContrat(int id_contrat)
	{
		return modeleContrat.selectWhereContrat(id_contrat);
	}
	public static Contrat selectWhereContrat(String statut, String date_fin_contrat)
	{
		return modeleContrat.selectWhereContrat(statut, date_fin_contrat);
	}
}
