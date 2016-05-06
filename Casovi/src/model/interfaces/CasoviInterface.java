package model.interfaces;

import java.util.LinkedList;

import model.Cas;
import model.Student;
/**
 * Interfejs CasoviInterface koji definise metode
 * za implementaciju u klasi Casovi.
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public interface CasoviInterface {
	/**
	 * Metoda dodaje studenta u listu.
	 * @param student klase Student
	 */
	public void dodajStudenta(Student student);
	/**
	 * Metoda izbacuje studenta iz liste.
	 * @param indeks u listi
	 */
	public void izbrisiStudenta(Student student);
	/**
	 * Metoda koja cuva listu studenata u fajl.
	 * @param path - putanja do fajl-a
	 */
	public void serialize(String path);
	/**
	 * Metoda koja ucitava listu studenata iz fajl-a.
	 * @param path - putanja do fajl-a
	 */
	public void deserialize(String path);
	/**
	 * Metoda koja vraca sve studente iz liste.
	 * @return lista objekata klase Student
	 */
	public LinkedList<Student> vratiStudente();
	/**
	 * Metoda koja vraca trazenog studenta.
	 * @param imePrezime - zadato ime i prezime
	 * @param brTel - zadati broj telefona
	 * @return objekat klase Student
	 */
	public Student pronadjiStudenta(String brTel);
	/**
	 * Metoda koja dodaje novi cas za odredjenog studenta.
	 * @param cas - objekat klase Cas
	 * @param s - objekat klase Student
	 */
	public void dodajCas(Cas cas,Student s);
}
