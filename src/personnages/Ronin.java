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

}
