package controller;

import view.VueConnexion;
import view.VueGenerale;

public class NeigeSoleil {
	private static VueConnexion uneVueConnexion;
	private static VueGenerale uneVueGenerale;
	
	public static void main (String[] args) {
		uneVueConnexion = new VueConnexion();

	}
	
	public static void rendreVisibleVueConnexion(boolean action) {
		uneVueConnexion.setVisible(action);
	}
	public static void rendreVisibleVueGenerale(boolean action) {
		if (uneVueGenerale == null)
		{
			uneVueGenerale = new VueGenerale();
		}
		uneVueGenerale.setVisible(action);	}
}
