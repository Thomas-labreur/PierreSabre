package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("coca");
		roro.boire();
		marco.boire("coca");

	}
}
