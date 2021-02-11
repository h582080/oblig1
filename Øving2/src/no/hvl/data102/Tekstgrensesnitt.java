package no.hvl.data102;

import java.util.*;
import no.hvl.data102.adt.FILMarkivADT;




public class Tekstgrensesnitt {
	
	public final static Scanner scan = new Scanner(System.in);	
			
	// lese opplysningene om en FILM fra tastatur
	 public Film lesFilm(){
		 
		 System.out.println("Skriv filmnr: ");		 
		 int filmNr = scan.nextInt();
		 
		 System.out.println("Skriv filmskaper: ");
		 String filmSkaper = scan.next();
		 
		 System.out.println("Skriv tittel: ");
		 String tittel = scan.next();
		 
		 System.out.println("Skriv utgivelsesår: ");
		 int år = scan.nextInt();
		 
		 System.out.println("Skriv Filmselskap: ");
		 String filmSelskap = scan.next();
		 
		 System.out.println("Skriv Sjanger: ");
		 String sjStr = scan.nextLine();
		 Sjanger sjanger = Sjanger.finnSjanger(sjStr);
		 return new Film(filmNr, filmSkaper, tittel, år, filmSelskap, sjanger);
		
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
		 System.out.println("Antall filmer: " + filma.getAntall() + " ; "+ "Antall action filmer: " + 
	     filma.getAntallAction() + " ; " + "Antall drama filmer" + filma.getAntallDrama() + " ; " 
		 + "Antall drama filmer: " + filma.getAntallSkrekkfilm() + " ; " + "Antall scifi filmer: " + filma.getAntallScifi());
	 }	 
	//… Ev. andre metoder
	 
}//class