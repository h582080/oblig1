package no.hvl.data102;

public enum Sjanger {
	ACTION, 
	DRAMA, 
	HISTORY, 
	SCIFI, 
	COMEDY, 
	THRILLER, 
	ROMANCE, 
	MYSTERY, 
	CRIME, 
	ANIMATION, 
	ADEVNTURE, 
	FANTASY;
	
	public static Sjanger finnSjanger(String navn) {
		Sjanger sjang = null;
		for (Sjanger sj : Sjanger.values()) {
			if (sj.toString().equals(navn.toUpperCase())) {
				sjang = sj;
				break;
			}

		}
		return sjang;

	}

}
