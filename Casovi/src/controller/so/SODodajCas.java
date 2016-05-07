package controller.so;

import java.util.LinkedList;

import model.Cas;
import model.Student;
/**
 * Klasa SODodajCas je klasa sistemske operacije koja dodaje cas u listu casova studenta.
 * 
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class SODodajCas {
/**
 * Funkcija za dodavanje casa u listu casova odredjenog studenta
 * @param cas Cas koji se dodaje
 * @param s Student kome se cas dodaje
 * @param studenti Lista studenata
 */
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
