package controller;

import model.modeleAdmin;

public class C_Admin {
	public static Admin selectWhereAdmin(int id_admin) {
		return modeleAdmin.selectWhereAdmin(id_admin);
	}

	public static Admin selectWhereAdmin(String email, String mdp) {
		// TODO Auto-generated method stub
		return modeleAdmin.selectWhereAdmin(email,mdp);
	}
}
