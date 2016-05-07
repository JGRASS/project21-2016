package model;

import java.io.Serializable;
import java.util.LinkedList;
/**
 * Klasa Student predstavlja djaka koji pohadja privatne casove.
 * Student ima ime i prezime, broj telefona, email,
 * sumu novca koju je uplatio i listu casova koje je pohadjao.
 * 
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * Ime i prezime studenta.
	 */
	private String imePrezime;
	/**
	 * Broj telefona studenta.
	 */
	private String brTel;
	/**
	 * Email studenta.
	 */
	private String email;
	/**
	 * Suma novca koju je student do sad uplatio.
	 */
	private int uplaceno;
	/**
	 * Lista casova koje je pohadjao.
	 */
	private LinkedList<Cas> casovi;
	
	public Student(){
		casovi = new LinkedList<Cas>();

	}
	public Student(String imePrezime, String brTel, String email){
		setImePrezime(imePrezime);
		setBrTel(brTel);
		setEmail(email);
		this.casovi = new LinkedList<>();
		this.uplaceno = 0;
	}
	public Student(String imePrezime, String brTel, String email, int uplaceno, LinkedList<Cas> casovi) {
		setImePrezime(imePrezime);
		setBrTel(brTel);
		setEmail(email);
		this.uplaceno = uplaceno;
		this.casovi = casovi;
	}

	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		if(imePrezime.isEmpty() || imePrezime == null)
			throw new RuntimeException("Polje za ime i prezime ne sme biti prazno.");
		this.imePrezime = imePrezime;
	}
	public String getBrTel() {
		return brTel;
	}
	public void setBrTel(String brTel) {
		if(brTel.isEmpty() || brTel == null)
			throw new RuntimeException("Broj telefona ne sme biti prazan.");
		this.brTel = brTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUplaceno() {
		return uplaceno;
	}
	public void setUplaceno(int uplaceno) {
		this.uplaceno = uplaceno;
	}
	public LinkedList<Cas> getCasovi() {
		return casovi;
	}
	public void setCasovi(LinkedList<Cas> casovi) {
		this.casovi = casovi;
	}
	public void dodajCas(Cas cas){
		if(!casovi.contains(cas))
			casovi.add(cas);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imePrezime == null) ? 0 : imePrezime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (imePrezime == null) {
			if (other.imePrezime != null)
				return false;
		} else if (!imePrezime.equals(other.imePrezime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [imePrezime=" + imePrezime + ", brTel=" + brTel + ", email=" + email + ", uplaceno=" + uplaceno
				+ ", casovi=" + casovi + "]";
	}
	
	
	
}
