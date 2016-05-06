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
		if(naziv.isEmpty() || naziv == null)
			throw new RuntimeException("Naziv ne sme biti prazan.");
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		if(opis.isEmpty() || opis == null)
			throw new RuntimeException("Opis ne sme biti prazan.");
		this.opis = opis;
	}

	public String getDomaci() {
		return domaci;
	}

	public void setDomaci(String domaci) {
		if(domaci.isEmpty() || domaci == null)
			throw new RuntimeException("Domaci ne sme biti prazan.");
		this.domaci = domaci;
	}
	
	
}
