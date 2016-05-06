package view.models;

import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import controller.GUIKontroler;
import model.Student;

public class TblModelBanka extends AbstractTableModel {
	private static String [] kolone = new String [] {"Ime i prezime", "Uplaceno"};
	private List<Student> studenti;
	
	public TblModelBanka(){
		studenti = new LinkedList<>();
	}
	
	public TblModelBanka(LinkedList<Student> s){
		if(s == null)
			this.studenti = new LinkedList<>();
		else
			studenti = s;
	}
	
	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public int getRowCount() {
		return studenti.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student s = studenti.get(rowIndex);
		switch (columnIndex) {
		case 0: 
			return s.getImePrezime();
		case 1:	
			return s.getUplaceno();
		default: 
			return "N/A";		
		}
	}
	
	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}
	
	public void staviStudenteUModel(List<Student> studenti) {
		this.studenti = (LinkedList<Student>) studenti;
		fireTableDataChanged();
	}

}
