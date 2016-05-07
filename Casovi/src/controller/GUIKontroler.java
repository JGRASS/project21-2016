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
import view.Banka;
import view.DodajCas;
import view.GlavniProzor;
import view.MoreInfo;
import view.NoviStudent;

public class GUIKontroler {
	/**
	 * Komunikacija sa view-om.
	 */
	private static GlavniProzor glavniProzor;
	/**
	 * Komunikacija sa modelom.
	 */
	private static CasoviInterface casovi;
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
	
	public static void ugasi(){
		int opcija = JOptionPane.showConfirmDialog(glavniProzor.getContentPane(), "Da li zelite da zatvorite aplikaciju?","Izlaz",JOptionPane.YES_NO_OPTION);
		if(opcija == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
	
	public static void pokreniMoreInfoProzor(Student s){
		MoreInfo prozor = new MoreInfo(s);
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(glavniProzor.getContentPane());
	}
	
	public static void pokreniBankaProzor(){
		Banka prozor = new Banka();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(glavniProzor.getContentPane());
	}
	
	public static void pokreniNoviStudentProzor(){
		NoviStudent prozor = new NoviStudent();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(glavniProzor.getContentPane());
	}
	
	public static LinkedList<Student> vratiListuStudenata(){
		return casovi.vratiStudente();
	}
	
	public static void upozoriDaBiraRed() {
		JOptionPane.showMessageDialog(glavniProzor.getContentPane(), "Izaberite studenta.",
				"Greska", JOptionPane.ERROR_MESSAGE);
	}

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
	
	public static void izbrisiStudenta(Student student){
		casovi.izbrisiStudenta(student);
		glavniProzor.osveziStudentTabelu();
		promena = true;
	}
	
	public static void serijalizuj() {
		casovi.serialize(Utility.getResourcesDir() + "casovi.out");	
		promena = false;
	}
	
	public static void deserijalizuj() {
		casovi.deserialize(Utility.getResourcesDir() + "casovi.out");
		glavniProzor.osveziStudentTabelu();
	}

	public static void pokreniDodajCasProzor(Student s) {
		DodajCas prozor = new DodajCas(s);
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(glavniProzor.getContentPane());
	}

	public static void dodajCas(String naziv, String opis, String domaci,Student s) {
		
		try {
			Cas cas = new Cas();
			cas.setNaziv(naziv);
			cas.setOpis(opis);
			cas.setDomaci(domaci);
			casovi.dodajCas(cas, s);
			glavniProzor.osveziStudentTabelu();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(glavniProzor, e.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void osvezi(Student s) {
		glavniProzor.osveziStudentTabelu();
	}
	
	public static int izracunajUkupanIznos(){
		int suma = 0;
		for(int i = 0; i < casovi.vratiStudente().size(); i++){
			suma += casovi.vratiStudente().get(i).getUplaceno();
		}
		return suma;
	}
}
