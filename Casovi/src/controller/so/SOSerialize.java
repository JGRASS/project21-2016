package controller.so;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import model.Student;
/**
 * Klasa SOSerialize je klasa sistemske operacije serijalizacije.
 * 
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class SOSerialize {
	/**
	 * Funkcija za deserijalizaciju
	 * @param path Putanja do fajla u koji se vrsi serijalizacija, u vidu Stringa
	 * @param studenti Lista studenata
	 */
	public static void izvrsi(String path, LinkedList<Student> studenti) {
		if(path == null || path.isEmpty()){
			throw new RuntimeException("Putanja ne sme biti null ni prazan string!");
		}
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)))) {
				out.writeObject(studenti);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
