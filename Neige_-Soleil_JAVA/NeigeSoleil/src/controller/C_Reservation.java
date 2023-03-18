package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.modeleReservation;

public class C_Reservation {
	public static void insertReservation(Reservation uneReservation)
	{
		modeleReservation.insertReservation(uneReservation);
	}
	public static ArrayList<Reservation> selectAllReservations ()
	{
		return modeleReservation.selectAllReservation(); 
	}
	public static void deleteReservation(int idReservation)
	{
		modeleReservation.deleteReservation(idReservation);
	}
	public static void updateReservation(Reservation unReservation)
	{
		modeleReservation.updateReservation(unReservation);
	}
	public static Reservation selectWhereReservation(int id_reservation)
	{
		return modeleReservation.selectWhereReservation(id_reservation);
	}
	public static Reservation selectWhereReservation(String statut)
	{
		return modeleReservation.selectWhereReservation(statut);
	}
}
