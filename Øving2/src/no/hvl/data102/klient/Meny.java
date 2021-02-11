package no.hvl.data102.klient;

import java.util.Scanner;
import no.hvl.data102.Tekstgrensesnitt;
import no.hvl.data102.adt.FILMarkivADT;

public class Meny{
	 private Tekstgrensesnitt tekstgr;
	 private FILMarkivADT filma;
	 public Meny(FILMarkivADT filma){
	 tekstgr = new Tekstgrensesnitt();
	 this.filma = filma;
	 }
	 

	 public void start() {
		 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
			 System.out.println("\nSkriv inn en kommando...");
			 System.out.println("1: For å legge inn en film");
			 System.out.println("2: Søk film tittel");
			 System.out.println("3: Søk film film skaper");
			 System.out.println("4: Skriv ut Antall filmer og sjangere");
			 System.out.println("5: Avslutt program");
			 
			 
			 switch (sc.nextLine()) {
			 		 
			 case "1":
				 tekstgr.lesFilm();
				 
				 break;
				 
			 case "2":
				 String tittel = sc.next("Skriv inn tittel");
				 tekstgr.skrivUtFilmDelstrengITittel(filma, tittel);
				 
				 break;
				 
			 case "3":
				 String filmskaper = sc.next("Skriv inn film skaper"); 
				 tekstgr.skrivUtFilmProdusent(filma, filmskaper);
				 break;	
				 			 
			 case "4":
				 tekstgr.skrivUtStatistikk(filma);	
				 
				 break;
				 
			 case "5":
				 System.out.println("Avslutter...");
				 sc.close();
				 System.exit(0);
				 break;
				 
		 default:
			 System.out.println("Ugyldig kommando");
			 }
		 }
		
	}
}
