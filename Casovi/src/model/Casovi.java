package model;

import java.util.LinkedList;

import controller.so.SODeserialize;
import controller.so.SODodajStudenta;
import controller.so.SOIzbrisiStudenta;
import controller.so.SOPronadjiStudenta;
import controller.so.SOSerialize;
import model.interfaces.CasoviInterface;
/**
 * Klasa Casovi predstavlja glavnu klasu.
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class Casovi implements CasoviInterface{
	/**
	 * Lista studenata kojom se manipulise u aplikaciji.
	 */
	private LinkedList<Student> studenti = new LinkedList<>();

	@Override
	public void dodajStudenta(Student student) {
		SODodajStudenta.izvrsi(student, studenti);
		
	}

	@Override
	public void izbrisiStudenta(Student student) {
		SOIzbrisiStudenta.izvrsi(student, studenti);
		
	}

	@Override
	public void serialize(String path) {
		SOSerialize.izvrsi();
		
	}

	@Override
	public void deserialize(String path) {
		SODeserialize.izvrsi();
		
	}

	@Override
	public LinkedList<Student> vratiStudente() {
		return studenti;
	}

	@Override
	public Student pronadjiStudenta(String imePrezime, String brTel) {
		return SOPronadjiStudenta.izvrsi(imePrezime, brTel);
		
	}
}
