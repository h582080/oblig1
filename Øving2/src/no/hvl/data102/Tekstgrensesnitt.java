package no.hvl.data102;

import java.util.Scanner;
import no.hvl.data102.adt.FILMarkivADT;
import no.hvl.data102.klient.Meny;
import no.hvl.data102.Filmarkiv;

public class Tekstgrensesnitt {

	public final static Scanner TAASTATUR = new Scanner(System.in);
	
	// lese opplysningene om en FILM fra tastatur
	 public Film lesFilm(){
		 
	 }
	 
	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	 public void visFilm(Film film){
		 System.out.println("Filmnr: " + film.getFilmNr() + ", produsert av: " + 
	     film.getFilmSkaper() + ", tittel: " + film.getTittel() + ", utgitt i år: " +
	     film.getÅr() + ", sjanger: " + film.getSjanger() + ", utgitt av: " +
	     film.getFilmSelskap());
	 }
	 
	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	 public void skrivUtFilmDelstrengITittel(FILMarkivADT filma, String delstreng) {
		 Film[] tempTab = filma.soekTittel(delstreng);	 
		 for (Film f : tempTab) {
			 visFilm(f);
		 }
	 }
	 
	// Skriver ut alle Filmer av en produsent / en gruppe
	 public void skrivUtFilmProdusent(FILMarkivADT filma, String delstreng) {
		 Film[] tempTab = filma.soekProdusent(delstreng);
		 for (Film f : tempTab) {
			 visFilm(f);
		 }
	 }
	 
	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	 public void skrivUtStatistikk(FILMarkivADT filma){
		 System.out.println("Antall filmer: " + filma.antall() + "Sjangere: " + 
	     filma.antall());
	 }	 
	//… Ev. andre metoder
	 
}//class