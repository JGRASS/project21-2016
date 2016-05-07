package controller.so;

import java.util.LinkedList;

import model.Cas;
import model.Student;

public class SODodajCas {

	public static void izvrsi(Cas cas, Student s, LinkedList<Student> studenti) {
		if(cas == null || s == null){
			throw new RuntimeException("Cas i student ne smeju biti null!");
		}
		for (Student student : studenti) {
			if(student.equals(s)){
				student.dodajCas(cas);
				return;
			}
		}
	}

}
