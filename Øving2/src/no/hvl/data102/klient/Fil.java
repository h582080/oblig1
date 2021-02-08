package no.hvl.data102.klient;
import no.hvl.data102.adt.FILMarkivADT;
import no.hvl.data102.Filmarkiv;


public class Fil {
	 final String SKILLE = "#"; // Eventuelt ha som parameter i
	 // metodene.
	 // Lese et Filmarkiv fra tekstfil
	 public static void lesFraFil(FILMarkivADT filmarkiv, String filnavn){…}
	Alt: public static FILMarkivADT lesFraFil(String filnavn) {
	 FILMarkivADT filma = null;
	 …;
	 filma = new Filmarkiv(n);
	 …;
	 return filma;
	}
	// Lagre et Filmarkiv til tekstfil
	 public static void skrivTilFil(FILMarkivADT filmarkiv, String filnav){…}

}//class
