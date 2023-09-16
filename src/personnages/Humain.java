package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[30];
	
	
	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom +") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + "sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + "sous.");
		}
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
		
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	private void memoriser(Humain humain) {
		boolean pasConnu=true;
		int i = 0;
		while(i < nbConnaissance && pasConnu) {
			pasConnu = memoire[i] != humain;
			i++;
		}
		if (pasConnu) {
			if (nbConnaissance == memoire.length) {
				memoire[0]=null;
				for (int j=1 ; j<nbConnaissance ; j++) {
					memoire[j-1] = memoire[j] ;
				}
				nbConnaissance --;
			}
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		StringBuilder connaissances  = new StringBuilder();
		for (int i = 0 ; i<nbConnaissance ; i++ ) {
			connaissances.append(memoire[i].getNom());
			if (i+1 != nbConnaissance) {
				connaissances.append(", ");
			}
		}
		parler("Je connais beaucoup de monde dont : " + connaissances.toString());
	}

	public void boire(String boisson) {
	}

}

