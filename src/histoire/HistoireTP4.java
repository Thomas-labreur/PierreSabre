package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",15);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		Ronin roro = new Ronin("Roro", "shochu" , 60);
		roro.provoquer(yaku);
	}
}
