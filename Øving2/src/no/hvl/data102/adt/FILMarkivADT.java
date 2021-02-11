package no.hvl.data102.adt;
import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public interface FILMarkivADT {
	
	public int getAntall();
	public int getAntallAction();
	public int getAntallDrama();
	public int getAntallSkrekkfilm();
	public int getAntallScifi();
	
	Film [] hentFilmTabell ();
	
	void leggTilFilm (Film nyFilm);
	
	boolean slettFilm (int filmnr);
	
	Film[] soekTittel (String delstreng);
	
	Film[] soekProdusent (String delStreng);
	
	public int antall (Sjanger sjanger);
	

} //interface

