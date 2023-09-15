package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant commercant) {
		int don = getArgent() / 10;
		parler(commercant.getNom() + " prend ces " + don + " sous." );
		perdreArgent(don);
		commercant.recevoir(don);
	}

	public void provoquer(Yakuza yakuza) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (2*honneur >= yakuza.getReputation()) {
			parler("Je t'ai eu petit Yakuza !");
			gagnerArgent(yakuza.getArgent());
			yakuza.perdre();
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, ma réputation en a pris un coup !");
			yakuza.gagner(getArgent());
			perdreArgent(getArgent());
			honneur--;
		}
	}
}
