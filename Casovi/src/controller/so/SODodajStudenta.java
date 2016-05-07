package controller.so;

import java.util.LinkedList;

import model.Student;
/**
 * Klasa SODodajStudenta je klasa sistemske operacije koja dodaje studenta u listu.
 * 
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class SODodajStudenta {
/**
 * Funkcija za dodavanje studenta u listu
 * @param student Student koji se dodaje
 * @param studenti Lista studenta
 */
	public static void izvrsi(Student student, LinkedList<Student> studenti) {
		if(student == null) throw new RuntimeException("Student ne sme biti null!");
		if(!studenti.contains(student))
			studenti.add(student);
			
	}

}
