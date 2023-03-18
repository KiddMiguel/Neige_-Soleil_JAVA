package controller;

import java.util.ArrayList;

import model.modeleUser;



public class C_User {

	public static ArrayList<User> selectAllUser ()
	{
		return modeleUser.selectAllUser(); 
	}
}
