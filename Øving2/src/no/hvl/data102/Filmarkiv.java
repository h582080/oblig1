package no.hvl.data102;

import no.hvl.data102.adt.FILMarkivADT;

public class Filmarkiv implements FILMarkivADT {
	private Film[] filmTabell;
	private int antall;
	
	private Film[] trimTab(Film[] tab, int n) { // n er antall elementer
		 Film[] filmtab2 = new Film[n];
		 int i = 0;
		 while (i < n) {
		      filmtab2[i] = tab[i];
		      i++;
		 }//while
		 
		 return filmtab2;
		 
	}
	
	public Film [] hentFilmTabell() {			
		
		return filmTabell;
	}
	
	public void leggTilFilm(Film nyFilm) {		
		
		
	}
	
	
	
	@Override
	public boolean slettFilm(int filmnr) {
		Film tempFilm;
		
		for (int i = 0; i < filmTabell.length; i++) {
			if (filmTabell[i].getFilmNr() == filmnr) {
				tempFilm  = filmTabell[antall - 1];
				filmTabell[antall - 1] = null;
				filmTabell[i] = tempFilm;
				antall --;
				filmTabell = trimTab(filmTabell, antall);
				return true;
			}
		} return false;
		
	}
	
	
	
	@Override
	public Film[] soekTittel (String delstreng) {		
		int antall = 0;
		Film[]tempTab = new Film[filmTabell.length];
		for(int i = 0; i < filmTabell.length; i++) {
			if(filmTabell[i].getTittel().toUpperCase().contains(delstreng.toUpperCase())) {
				
				tempTab[antall] = filmTabell[i];
				antall++;
			}
		}
		trimTab(tempTab, antall);
		return tempTab;
	}
	
	
	
	public Film[] soekProdusent (String delstreng) {	
		int antall = 0;
		
		Film[]tempTab = new Film[filmTabell.length];
		for(int i = 0; i < filmTabell.length; i++) {
			if(filmTabell[i].getFilmSkaper().toUpperCase().contains(delstreng.toUpperCase())) {
				
				tempTab[antall] = filmTabell[i];
				antall++;
			}
		}
		
		trimTab(tempTab, antall);
		return tempTab;	
	}
	
	
	
	public int antall (Sjanger sjanger) {
		
		int antall = 0;
			
		for(int i = 0; i <= filmTabell.length; i++) {
			if(filmTabell[i].getSjanger().equals(sjanger)) {
				antall++;				
			}
		}
		return antall;
	}
	
	
	
	@Override
	public int antall() {
		
		int antall = 0;
		
		for (int i = 0; i <= filmTabell.length; i++) {
			antall++;
		}
		
		return antall;
		
	}
	
	

} // class
