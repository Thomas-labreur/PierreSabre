package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom,boissonFavorite,argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}


	public void extorquer(Commercant commercant) {
		parler("Tiens, tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(commercant.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		String texte = "J'ai piqué les " + commercant.getArgent() + " sous de " + commercant.getNom() + ", ce qui me fait ";
		gagnerArgent(commercant.getArgent());
		commercant.seFaireExtorquer();
		parler(texte + getArgent() + " sous dans ma poche. Hi ! Hi !");
		reputation ++;
	}
	
	public void perdre() {
		parler("J'ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan " + clan + ".");
		perdreArgent(getArgent());
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan des " + clan + "? Je l'ai dépouillé de ses " + gain + " sous.");
		gagnerArgent(gain);
		reputation++;
	}

}
