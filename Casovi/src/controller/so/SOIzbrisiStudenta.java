package controller.so;

import java.util.LinkedList;

import controller.GUIKontroler;
import model.Student;
/**
 * Klasa SOIzbrisiStudenta je klasa sistemske operacije koja brise studenta iz liste.
 * 
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class SOIzbrisiStudenta {
		/**
		 * Funkcija za brisanje studenta iz liste
		 * @param student Student koji se brise
		 * @param studenti Lista studenata
		 */
	public static void izvrsi(Student student, LinkedList<Student> studenti) {
		studenti.remove(student);
	}
}
