package controller;

import javax.swing.AbstractListModel;
import javax.swing.table.AbstractTableModel;

public class Tableau extends AbstractTableModel{

	private Object[][]donnees; 
	private String entetes []; 
	
	public Tableau(Object[][]donnees,String entetes []) {
		// TODO Auto-generated constructor stub
		this.donnees = donnees; 
		this.entetes = entetes;

	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.donnees.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.entetes.length;
	}

	@Override
	public Object getValueAt(int ligne, int colonne) {
		// TODO Auto-generated method stub
		return this.donnees[ligne][colonne];

	}

	public String getColumnName(int colonne) {
		return this.entetes[colonne];
	}
}
