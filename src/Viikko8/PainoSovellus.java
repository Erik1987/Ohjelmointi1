package Viikko8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Tee painonhallintasovellus
 * 
 * Tarkoituksena on, ett‰ sovellukseen voi noin p‰ivitt‰in syˆtt‰‰ oman painonsa
 * ja painot tallentuvat myˆs tiedostoon. Painokehityksest‰ saa niin sanotulla
 * ASCII grafiikalla piirretty‰ kuvaajia k‰ytt‰en # merkki‰ piirtosymbolina.
 * Kuvassa uusimmat mittaukset n‰kyv‰t alimpana. P‰iv‰m‰‰r‰t merkit‰‰n muodossa
 * 9.9.2019.
 * 
 * Tee seuraavat luokat:
 * 
 * PainoSovellus Sis‰lt‰‰ ohjelman valikon tulostamisen silmukassa.
 * 
 * PainoMittaus Mallintaa yht‰ painomittausta model-luokka, joka sis‰lt‰‰
 * p‰iv‰m‰‰r‰n ja varsinaisen painon kiloina. P‰iv‰m‰‰r‰ on luettavissa ja
 * tuotettavissa Pvm-luokan avulla.
 * 
 * Pvm Pvm-luokka, jossa on attribuutit paiva, kuukausi ja vuosi. Konstruktorin
 * kautta voidaan luoda p‰iv‰m‰‰r‰, jonka arvoksi tulee automaattisesti
 * t‰ll‰hetkell‰ kuluva p‰iv‰.
 * 
 * Piirturi Luokka, joka kykenee skaalautuvasti tuottamaan n‰yttˆ‰ sopivasti
 * k‰ytt‰v‰n kuvaajan perustuen annettuun tietoon.
 * 
 * TiedostoTyokalut Luokka, joka kykenee kirjoittamaan tiedostoon talteen
 * mitattuja painoja.
 * 
 * Toteuta PainoSovellus-luokkaan metodi: public void tulostaValikko()
 * 
 * Metodi tulostaa numeroilla valittavan valikon.
 * 
 * Toteuta Piirturi-luokkaan metodi: tulostaPainoKuvaaja()
 * 
 * Metodi tulostaa sopivasti skaalatun kuvaajan painon kehityksest‰.
 * 
 * Toteuta TiedostoTyokalut-luokkaan metodi: public PainoMittaus[] lue()
 * 
 * Metodi pystyy lukemaan tiedostosta painotietoja ohjelman ymm‰rt‰m‰‰n muotoon,
 * niin ett‰ ne saadaan osaksi kuvaajaa.
 * 
 * Ohjelmiston tulisi toimia muun muassa kuten seuraavassa.
 *
 */
/*
class PainoMittaus {
	
}
class Pvm {
	
}
class Piirturi {
	tulostaPainoKuvaaja()
}
class TiedostoTyokalut {
	
}*/
public class PainoSovellus {
	
	public static void tulostaValikko() {
		
		System.out.println("Valikko");
		System.out.println("0) Lopeta");
		System.out.println("1) Lis‰‰ painokirjaus menneelle p‰iv‰lle");
		System.out.println("2) Tulosta painokuvaaja");
		System.out.println("3) Lis‰‰ painokirjaus t‰lle p‰iv‰lle");
		System.out.println("Anna valintasi (0, 1, 2 tai 3):");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valinta = 1;
		
		ArrayList<String> lista2 = new ArrayList<String>();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		while (valinta != 0) {
			tulostaValikko();
			valinta = scan.nextInt();
			scan.nextLine();
			switch (valinta) {
			case 1:
				System.out.println("Anna paino (muodossa 9.9.2019,85):");
				String syote = scan.nextLine();
				
				//lista.add(0, syote);
				//PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\John Doe\\eclipse-workspace\\Testi\\painot.txt"));
				//pw.write(syote);
				lista2.add(syote.substring(9,11));
				
				for (int i = 0; i < lista2.size(); i++) {
					lista.add(Integer.parseInt(lista2.get(i)));
					
				}
				break;
			case 2:
				int numero;
				
				for (int i = 0; i < lista.size(); i++) {
					numero = lista.get(i);
					numero = numero - 40;
					
					for (int j = 0; j < numero; j++) {
						System.out.print("#");
					}
					System.out.println();
				}
				break;
			case 3:
				break;
			case 0:
				System.exit(0);
			default:
				break;
			}
			
		}

	}

}
