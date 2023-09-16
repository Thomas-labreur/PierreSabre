package personnages;

public enum TypeHumain {
	COMMERCANT("Commerçant"), YAKUZA("Yakuza"), RONIN("Ronin"), SAMOURAI("Samourai"), TRAITRE("Traitre"), GRANDMERE("Grand Mère");

	private String nom; 
	
	private TypeHumain(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
