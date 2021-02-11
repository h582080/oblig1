package no.hvl.data102.klient;
import no.hvl.data102.adt.FILMarkivADT;
import no.hvl.data102.Filmarkiv;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Fil {
	 final String SKILLE = "#"; // Eventuelt ha som parameter i
	 
	 
     
	 public static void lesFraFil(FILMarkivADT filmarkiv, String filnavn){
		 
		 final String FILM_FIL = "film.txt";
		 
		 FileReader filmFil = null;        
	     BufferedReader innfil = null;
	     
	     try{
	         
	        filmFil = new FileReader(FILM_FIL);
	     }
	     
	     catch(FileNotFoundException unntak){
	         System.out.println("Finner ikke filen " + FILM_FIL);
	         System.exit(1);
	     }
	 }
	 public static FILMarkivADT lesFraFil(String filnavn) {
	 int n = 0;
		 
	 FILMarkivADT filma = null;
	 
	 filma = new Filmarkiv(n);
	 
	 return filma;
	}
	
	 
	 
	 
	 
	
	 // Lagre et Filmarkiv til tekstfil
	 public static void skrivTilFil(FILMarkivADT filmarkiv, String filnavn){
		 
	 }

}//class
