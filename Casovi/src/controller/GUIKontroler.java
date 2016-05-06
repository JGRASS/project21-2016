package controller;

import java.awt.EventQueue;
import java.util.LinkedList;
import javax.swing.JOptionPane;

import model.Casovi;
import model.Student;
import model.interfaces.CasoviInterface;
import view.Banka;
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
	
	public static void pokreniMoreInfoProzor(){
		MoreInfo prozor = new MoreInfo();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(null);
	}
	
	public static void pokreniBankaProzor(){
		Banka prozor = new Banka();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(null);
	}
	
	public static void pokreniNoviStudentProzor(){
		NoviStudent prozor = new NoviStudent();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(null);
	}
	
	public static LinkedList<Student> vratiListuStudenata(){
		return casovi.vratiStudente();
	}
	
	public static void upozoriDaBiraRed() {
		JOptionPane.showMessageDialog(glavniProzor.getContentPane(), "Izaberite studenta za brisanje.",
				"Greska", JOptionPane.ERROR_MESSAGE);
	}

	public static void dodajStudenta(String imePrezime,String brTel,String email) {
		promena = true;
	}
}
