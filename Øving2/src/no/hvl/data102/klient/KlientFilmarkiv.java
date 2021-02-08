package no.hvl.data102.klient;

import no.hvl.data102.adt.FILMarkivADT;
import no.hvl.data102.klient.Meny;

public class KlientFilmarkiv {
	
	public static void main(String[] args) {
		FILMarkivADT filmSamling = new Filmarkiv(10);
		Meny meny = new Meny(filmSamling);
		meny.start();
	}

}
