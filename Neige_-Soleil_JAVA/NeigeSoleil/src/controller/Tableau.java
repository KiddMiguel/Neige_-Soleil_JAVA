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
	
	public void insertLigne(Object ligne[])
	{
		Object matrice [][] = new Object[this.donnees.length +1][this.entetes.length];
		for(int i = 0; i<this.donnees.length; i++)
		{
			matrice[i] = this.donnees[i];
		}
		matrice [this.donnees.length] = ligne;
		this.donnees = matrice ; //recopie de matrices.
		this.fireTableDataChanged(); // mise à jour des données. 
	}
	
	public void updateLigne(int numLigne, Object[] ligne)
    {
        Object matrice [][] = new Object[this.donnees.length][this.entetes.length];
        for(int i = 0; i<this.donnees.length; i++) {
            if(i!= numLigne){
                matrice[i] = this.donnees[i];
            }else {
                matrice[i] = ligne;
            }
        }
        this.donnees = matrice ; //recopie de matrices.
        this.fireTableDataChanged(); // mise à jour des données. 
    }
	
	public void deleteLigne (int numLigne)
    {
    Object matrice [][] = new Object[this.donnees.length -1][this.entetes.length];
    int j = 0;
        for(int i = 0; i<this.donnees.length; i++)
        {
            if(i!= numLigne){
                matrice[j] = this.donnees[i];
                j++;
            }

        }
        this.donnees = matrice ; //recopie de matrices.
        this.fireTableDataChanged(); // mise à jour des données.
    }
    public void setDonnees (Object donnees[][])
    {
        this.donnees = donnees ; //recopie de matrices.
        this.fireTableDataChanged(); // mise à jour des données. 
    }
}
