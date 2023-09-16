package personnages;
import java.util.Random;

public class GrandMere extends Humain{
	
	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	@Override 
	protected void memoriser(Humain humain) {
		if (nbConnaissance < 5) {
			super.memoriser(humain);
		} else {
			parler("Oh ma tête, je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	private String humainHasard() {
		Random random = new Random();
		return TypeHumain.values()[random.nextInt(TypeHumain.values().length)].toString();
	}
	
	public void radoter() {
		String typeHumainSelonMamie ;
		for(int i = 0 ; i < nbConnaissance ; i++) {
			if (memoire[i] instanceof Traitre) {
				typeHumainSelonMamie = TypeHumain.TRAITRE.toString() + ". Petit Chenapan !" ;
			} else {
				typeHumainSelonMamie = humainHasard() + "."; 
			}
			parler("Je crois que " + memoire[i].getNom() + " est un " + typeHumainSelonMamie);
		}
	}


}
