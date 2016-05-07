package controller.so;

import java.util.LinkedList;

import model.Student;
/**
 * Klasa SOPronadjiStudenta je klasa sistemske operacije koja pronalazi studenta u listi.
 * 
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class SOPronadjiStudenta {
	/** 
	 * Funkcija koja pretrazuje listu studenata na osnovu broja telefona
	 * @param brTel Parametar koji predstavlja broj telefona
	 * @param studenti Lista studenata
	 * @return Objekat klase Student
	 */
	public static Student izvrsi(String brTel, LinkedList<Student> studenti) {
		for(int i = 0; i < studenti.size(); i++) {
			if(studenti.get(i).getBrTel().equals(brTel))
				return studenti.get(i);
		}
		return null;
	}
}
