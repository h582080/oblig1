package no.hvl.data102;

import no.hvl.data102.Sjanger;

public class Film {
	

	private int filmNr;
	private String filmSkaper;
    private String tittel;
    private int �r;
    private String filmSelskap;
    private Sjanger sjanger;
    
	/**
	 * Metoden konstruerer et nytt film objekt
	 * @param filmNr 
	 * @param filmSkaper
	 * @param tittel
	 * @param �r
	 * @param filmSelskap
	 */
    public Film (int filmNr, String filmSkaper, String tittel, int �r, String filmSelskap, Sjanger sjanger) {
    	
    	this.filmNr = filmNr;
    	this.filmSkaper = filmSkaper;
    	this.tittel = tittel;
    	this.�r = �r;
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
    
    public int get�r () {
    	return �r;
    }
    
    public void set�r (int �r) {
    	this.�r = �r;
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