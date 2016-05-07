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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domaci == null) ? 0 : domaci.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
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
		Cas other = (Cas) obj;
		if (domaci == null) {
			if (other.domaci != null)
				return false;
		} else if (!domaci.equals(other.domaci))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		return true;
	}
	
	
}
