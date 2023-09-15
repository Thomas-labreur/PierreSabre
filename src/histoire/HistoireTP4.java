package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",15);
		Yakuza yaku = new Yakuza("Yaku","whisky",30,"croustillants");
		yaku.direBonjour();
		yaku.extorquer(marco);
	}
}
