package no.hvl.data102.adt;
import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public interface FILMarkivADT {
	
	Film [] hentFilmTabell ();
	
	void leggTilFilm (Film nyFilm);
	
	boolean slettFilm (int filmnr);
	
	Film[] soekTittel (String delstreng);
	
	Film[] soekProdusent (String delStreng);
	
	int antall (Sjanger sjanger);
	
	int antall();

} //interface

