package no.hvl.data102;

import no.hvl.data102.Sjanger;

public class Film {
	

	private int filmNr;
	private String filmSkaper;
    private String tittel;
    private int Âr;
    private String filmSelskap;
    private Sjanger sjanger;
    
	/**
	 * Metoden konstruerer et nytt film objekt
	 * @param filmNr 
	 * @param filmSkaper
	 * @param tittel
	 * @param Âr
	 * @param filmSelskap
	 */
    public Film (int filmNr, String filmSkaper, String tittel, int Âr, String filmSelskap, Sjanger sjanger) {
    	
    	this.filmNr = filmNr;
    	this.filmSkaper = filmSkaper;
    	this.tittel = tittel;
    	this.Âr = Âr;
    	this.filmSelskap = filmSelskap;
    	this.sjanger = sjanger; 	
    }
    
    public Film () {
    	
    }

    public int getFilmNr () {
    	return filmNr;
    }
    
    public void setFilmNr (int filmNr) {
    	this.filmNr = filmNr;
    }
    
    public String getFilmSkaper () {
    	return filmSkaper;
    }
    
    public void setFilmSkaper (String filmSkaper) {
    	this.filmSkaper = filmSkaper;
    }
    
    public String getTittel (){
    	return tittel;
    }
    
    public void setTittel (String tittel) {
    	this.tittel = tittel;
    }
    
    public int get≈r () {
    	return Âr;
    }
    
    public void set≈r (int Âr) {
    	this.Âr = Âr;
    }
    
    public String getFilmSelskap() {
    	return filmSelskap;
    }
    
    public void setFilmSelskap(String filmSelskap) {
    	this.filmSelskap = filmSelskap;
    }
    
    public Sjanger getSjanger () {
    	return sjanger;
    }
    
    public void setSjanger (Sjanger sjanger) {
    	this.sjanger = sjanger;
    }

}