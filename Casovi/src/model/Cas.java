package model;
/**
 * Klasa Cas predstavlja jedan privatni cas.
 * Cas ima svoj naziv, opis i domaci zadatak.
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class Cas {
	/**
	 * Kratak naziv casa.
	 */
	private String naziv;
	/**
	 * Detaljniji opis sta je radjeno na casu.
	 */
	private String opis;
	/**
	 * Tekst domaceg zadatka.
	 */
	private String domaci;
	
	public Cas(){
		
	}

	public Cas(String naziv, String opis, String domaci) {
		this.naziv = naziv;
		this.opis = opis;
		this.domaci = domaci;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getDomaci() {
		return domaci;
	}

	public void setDomaci(String domaci) {
		this.domaci = domaci;
	}
	
	
}
