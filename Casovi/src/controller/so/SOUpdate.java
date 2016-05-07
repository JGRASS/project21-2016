package controller.so;

import java.util.LinkedList;

import model.Student;

/**
 * Klasa SOUpdate je klasa sistemske operacije koja azurira Objekte iz liste studenata.
 * 
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class SOUpdate {
	/**
	 * Funkcija za azuriranje objekata iz liste studenata
	 * @param s Student
	 * @param studenti Lista studenata
	 */
	public static void izvrsi(Student s, LinkedList<Student> studenti) {
		if(s == null){
			throw new RuntimeException("Student ne sme biti null!");
		}
		for (int i = 0; i < studenti.size(); i++) {
			if(studenti.get(i).equals(s)){
				studenti.set(i, s);
				return;
			}
		}
	}

}
