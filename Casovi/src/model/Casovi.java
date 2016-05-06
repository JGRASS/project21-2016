package model;

import java.util.LinkedList;

import controller.so.SODodajStudenta;
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
		SODodajStudenta.izvrsi(student,studenti);
		
	}

	@Override
	public void izbrisiStudenta(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serialize(String path) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deserialize(String path) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LinkedList<Student> vratiStudente() {
		return studenti;
	}

	@Override
	public Student pronadjiStudenta(String imePrezime, String brTel) {
		// TODO Auto-generated method stub
		return null;
	}
}
