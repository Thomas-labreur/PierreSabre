package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public void seFaireExtorquer() { // l'énoncé dit de return un int, a voir
		perdreArgent(getArgent());
		parler("J'ai tout perdu ! Le monde est trop injuste...");
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur !");
	}

}
