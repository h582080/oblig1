package no.hvl.data102;

import no.hvl.data102.adt.FILMarkivADT;
import no.hvl.data102.Film;

public class Filmarkiv implements FILMarkivADT {
	
	private Film [] filmTabell;
	private int antall;
	private int antallAction;
	private int antallDrama;
	private int antallSkrekkfilm;
	private int antallScifi;
	
	
	public Filmarkiv (int antall) {
		filmTabell = new Film[antall];
	}
	
	
	public int getAntall() {
		return antall;
	}
	
	public int getAntallAction() {
		return antallAction;
	}
	
	public int getAntallDrama() {
		return antallDrama;
	}
	
	public int getAntallSkrekkfilm() {
		return antallSkrekkfilm;
	}
	
	public int getAntallScifi() {
		return antallScifi;
	}
	
	private Film[] trimTab(Film[] tab, int n) { // n er antall elementer
		 Film[] filmtab2 = new Film[n];
		 int i = 0;
		 while (i < n) {
		      filmtab2[i] = tab[i];
		      i++;
		 }//while
		 
		 return filmtab2;
		 
	}
	
	@Override
	public Film [] hentFilmTabell() {				
		return filmTabell;
	}
	
	@Override
	public void leggTilFilm(Film nyFilm) {		
		
		boolean funnet = false;	
		int i = 0;
		
		while(!funnet && i<filmTabell.length) {
			if(filmTabell[i] == null) {
				filmTabell[i] = nyFilm;
				funnet = true;
				antall++;
				
				if(nyFilm.getSjanger().equals("ACTION")) {
					antallAction++;
				} else if (nyFilm.getSjanger().equals("DRAMA")) {
					antallDrama++;
				} else if(nyFilm.getSjanger().equals("SKREKKFILM")){
					antallSkrekkfilm++;
			    } else if(nyFilm.getSjanger().equals("SCIFI")) {
			    	antallScifi++;
			    }				
			}
			i++;
		}		
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
	
	
	@Override
	public Film[] soekProdusent (String delstreng) {	
		
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
	
	@Override
    public int antall (Sjanger sjanger) {
		
		int ant = 0;
			
		for(int i = 0; i < filmTabell.length; i++) {
			if(filmTabell[i].getSjanger().equals(sjanger)) {
				ant++;				
			}
		}
		return ant;
	}
} // class
