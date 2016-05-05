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
	public Student(String imePrezime, String brTel, String email, int uplaceno, LinkedList<Cas> casovi) {
		this.imePrezime = imePrezime;
		this.brTel = brTel;
		this.email = email;
		this.uplaceno = uplaceno;
		this.casovi = casovi;
	}

	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public String getBrTel() {
		return brTel;
	}
	public void setBrTel(String brTel) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brTel == null) ? 0 : brTel.hashCode());
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
		if (brTel == null) {
			if (other.brTel != null)
				return false;
		} else if (!brTel.equals(other.brTel))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [imePrezime=" + imePrezime + ", brTel=" + brTel + ", email=" + email + ", uplaceno=" + uplaceno
				+ ", casovi=" + casovi + "]";
	}
	
	
	
}
