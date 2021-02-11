package no.hvl.data102;

public enum Sjanger {
	ACTION, 
	DRAMA, 
	SKREKKFILM, 
	SCIFI; 
	
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
