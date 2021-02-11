package no.hvl.data102;
import no.hvl.data102.adt.FILMarkivADT;
import no.hvl.data102.Film;


public class Filmarkiv2 implements FILMarkivADT{
	private int antall;
	private int antallAction;
	private int antallDrama;
	private int antallSkrekkFilm;
	private int antallScifi;
	private LinearNode<Film> start;
	
	
	public Filmarkiv2() {
		start = null;
		antall = 0;
	}
	
	@Override
	public int getAntall() {	
		return antall;
	}
	
	@Override
	public int getAntallAction() {		
		return antallAction;
	}
	@Override
	public int getAntallDrama() {	
		return antallDrama;
	}
	
	@Override
	public int getAntallSkrekkfilm() {	
		return antallSkrekkFilm;
	}
	
	@Override
	public int getAntallScifi() {	
		return antallScifi;
	}
	@Override
	public Film[] hentFilmTabell() {
			
		if(start == null) {
			return null;
		} 
		
		LinearNode<Film> denne = start;
		
		Film[] filmTabell = new Film[antall];
		
		for(int i = 0; i<antall; i++) {
			filmTabell[i] = denne.getElement();
			denne = denne.getNeste();
		}
		
		return filmTabell;
		
		
		
	}
	@Override
	public void leggTilFilm(Film nyFilm) {
		
		LinearNode<Film> nyNode = new LinearNode<Film>(nyFilm);
		
		nyNode.setNeste(start);
		
		start = nyNode;
		
		antall++;
	}
	@Override
	public boolean slettFilm(int filmnr) {
		
		boolean funnet = false;	
		int i = 0;
		
		Film[] filmTabell = new Film[antall];
		
		LinearNode<Film> denne = start;
		
		while(!funnet && i<antall) {
			if (filmTabell[i].getFilmNr() == filmnr) {
				filmTabell[i] = denne.getElement();
				denne = denne.getNeste();
				denne = null;		
				antall--;
				
			}
			i++;
		}
		return funnet;
		
	}


	@Override
	public Film[] soekTittel(String delstreng) {
		
		
		Film[] filmTabell = new Film[antall];
		
		LinearNode<Film> denne = start;
		
		for(int i = 0; i<antall; i++) {
			if(denne.getElement().getTittel().toUpperCase().contains(delstreng.toUpperCase())) {
				filmTabell[antall] = denne.getElement();
				antall++; 
			}
		}
		
		return filmTabell;
		
	
	}
	@Override
	public Film[] soekProdusent(String delStreng) {
		
        Film[] filmTabell = new Film[antall];
		
		LinearNode<Film> denne = start;
		
		for(int i = 0; i<antall; i++) {
			if(denne.getElement().getFilmSkaper().toUpperCase().contains(delStreng.toUpperCase())) {
				filmTabell[antall] = denne.getElement();
				antall++; 
			}
		}
		
		return filmTabell;
	}
	
	public int antall (Sjanger sjanger) {
		
		int ant = 0;
		
		LinearNode<Film> denne = start;
		
		for(int i = 0; i < ant; i++) {
			if(denne.getElement().getSjanger().equals(sjanger)) {
				ant++;				
			}
		}
		return ant;
	}
	
	

}
