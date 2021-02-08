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
			 System.out.println("\nSkrin inn en kommando...");
			 
			 switch (sc.nextLine()) {
			 
			 case "kommando" :
				 System.out.println("Kommandoer: viser kommando");
				 break;
			
			 case "lesinnfilm":
				 tekstgr.lesFilm(filma);
				 break;
			
				 
			 case "avslutt":
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
