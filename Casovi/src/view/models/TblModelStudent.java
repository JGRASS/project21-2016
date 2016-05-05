package view.models;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import model.Student;

public class TblModelStudent extends AbstractTableModel{
	
	private final String [] kol = new String []{ "Ime i prezime", "Broj telefona","E-mail" };
	
	private List<Student> studenti;
	
	
	public TblModelStudent(List<Student> studenti) {
		if(studenti == null)
			this.studenti = new LinkedList<>();
		else
			this.studenti = studenti;
	}

	@Override
	public int getRowCount() {
		return studenti.size();
	}

	@Override
	public int getColumnCount() {
		return kol.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student s = studenti.get(rowIndex);
		switch(columnIndex){
		case 0:
			return s.getImePrezime();
		case 1:
			return s.getBrTel();
		case 2:
			return s.getEmail();
		default:
			return "N/A";
		}
	}

}
