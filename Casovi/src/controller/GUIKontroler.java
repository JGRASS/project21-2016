package controller;

import java.awt.EventQueue;
import java.util.LinkedList;
import javax.swing.JOptionPane;

import controller.so.SODodajStudenta;
import model.Cas;
import model.Casovi;
import model.Student;
import model.interfaces.CasoviInterface;
import util.Utility;
import view.About;
import view.Banka;
import view.DodajCas;
import view.GlavniProzor;
import view.MoreInfo;
import view.NoviStudent;
/**
 * Klasa GUIKontroler koja sluzi za povezivanje logike programa i prezentacionog nivoa programa.
 * 
 * @author @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class GUIKontroler {
	/**
	 * Komunikacija sa view-om.
	 */
	private static GlavniProzor glavniProzor;
	/**
	 * Komunikacija sa modelom.
	 */
	private static CasoviInterface casovi;
	private static MoreInfo mi;
	/**
	 * Promenljiva koja cuva podatak o tome da li je izvrsena neka izmena ili ne.
	 */
	private static boolean promena = false;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					casovi = new Casovi();
					glavniProzor = new GlavniProzor();
					glavniProzor.setVisible(true);
					glavniProzor.setLocationRelativeTo(null);
					deserijalizuj();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Zatvara aplikaciju
	 */
	public static void ugasi(){
		if(promena == false){
			int opcija = JOptionPane.showConfirmDialog(glavniProzor.getContentPane(), "Da li zelite da zatvorite aplikaciju?","Izlaz",JOptionPane.YES_NO_OPTION);
			if(opcija == JOptionPane.YES_OPTION){
				System.exit(0);
			}
		}else {
			int opcija = JOptionPane.showConfirmDialog(glavniProzor.getContentPane(), "Da li zelite da sacuvate izmene pre zatvaranja?","Izlaz",JOptionPane.YES_NO_OPTION);
			if(opcija == JOptionPane.YES_OPTION){
				serijalizuj();	
			}
			System.exit(0);
		}
	}
	
	/**
	 * Funkcija za pokretanje MoreInfo prozora
	 * @param s
	 */
	public static void pokreniMoreInfoProzor(Student s){
		mi = new MoreInfo(s);
		mi.setVisible(true);
		mi.setLocationRelativeTo(glavniProzor.getContentPane());
	}
	
	/**
	 * Funckija za pokretanje Banka prozora
	 */
	public static void pokreniBankaProzor(){
		Banka prozor = new Banka();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(glavniProzor.getContentPane());
	}
	
	/**
	 * Funkcija za pokretanje NoviStudent prozora
	 */
	public static void pokreniNoviStudentProzor(){
		NoviStudent prozor = new NoviStudent();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(glavniProzor.getContentPane());
	}
	
	/**
	 * Funkcija vraca listu studenata
	 * @return
	 */
	public static LinkedList<Student> vratiListuStudenata(){
		return casovi.vratiStudente();
	}
	
	public static void upozoriDaBiraRed() {
		JOptionPane.showMessageDialog(glavniProzor.getContentPane(), "Izaberite studenta.",
				"Greska", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Funkcija za dodavanje Studenta u listu i tabelu
	 * 
	 * @param imePrezime
	 * @param brTel
	 * @param email
	 */
	public static void dodajStudenta(String imePrezime,String brTel,String email) {
		try {
			Student s = new Student(imePrezime,brTel,email);
			casovi.dodajStudenta(s);
			glavniProzor.osveziStudentTabelu();
			promena = true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(glavniProzor, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Funkcija koja brise studenta iz tabele
	 * 
	 * @param student
	 */
	public static void izbrisiStudenta(Student student){
		casovi.izbrisiStudenta(student);
		glavniProzor.osveziStudentTabelu();
		promena = true;
	}
	
	/**
	 * Funkcija koja listu prebacuje u binarni fajl
	 */
	public static void serijalizuj() {
		casovi.serialize(Utility.getResourcesDir() + "casovi.out");	
		promena = false;
	}
	
	/**
	 * Funkcija koja ucitava studente iz binarnog fajla u listu.
	 * Podaci se unose u tabelu.
	 */
	public static void deserijalizuj() {
		casovi.deserialize(Utility.getResourcesDir() + "casovi.out");
		glavniProzor.osveziStudentTabelu();
	}

	/**
	 * Funkcija koja pokrece DodajCas prozor
	 * 
	 * @param s
	 */
	public static void pokreniDodajCasProzor(Student s) {
		DodajCas prozor = new DodajCas(s);
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(glavniProzor.getContentPane());
	}

	/**
	 * Funkcija koja dodaje cas u listu i azurira podatke u tabeli
	 * 
	 * @param naziv
	 * @param opis
	 * @param domaci
	 * @param s
	 */
	public static void dodajCas(String naziv, String opis, String domaci,Student s) {
		
		try {
			Cas cas = new Cas();
			cas.setNaziv(naziv);
			cas.setOpis(opis);
			cas.setDomaci(domaci);
			casovi.dodajCas(cas, s);
			glavniProzor.osveziStudentTabelu();
			promena = true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(glavniProzor, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void osvezi(Student s) {
		casovi.updateStudenta(s);
		glavniProzor.osveziStudentTabelu();
		promena = true;
	}
	
	/**
	 * Funkcija racuna ukupan uplacen iznos od svih studenata.
	 * @return
	 */
	public static int izracunajUkupanIznos(){
		int suma = 0;
		for(int i = 0; i < casovi.vratiStudente().size(); i++){
			suma += casovi.vratiStudente().get(i).getUplaceno();
		}
		return suma;
	}
	
	/**
	 * Funkcija dodaje cas u combo box iz MoreInfo prozora
	 */
	public static void dodajCombo(){
		mi.dodajCombo();
	}
	
	public static void dodatCas(){
		mi.dodatCas();
	}
	
	public static void pokreniAboutProzor(){
		About prozor = new About();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(null);
	}
}
