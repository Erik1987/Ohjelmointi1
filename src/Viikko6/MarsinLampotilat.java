package Viikko6;

import java.util.Scanner;

/**
 * Toteuta ohjelma Mars-planeetan lämpötilamittausten tarkasteluun. 
 * Marsin alin lämpötila (pinnalla) on -140 astetta, korkein lämpötila on 20 astetta. 
 * Ohjelmalle tulee syöttää 10 hyväksyttyä mittaustulosta, jotka ohjelma kerää int[]-tyyppiseen taulukkoon, 
 * jonka pituus on 10. Jos käyttäjä syöttää luvun, joka on pienempi kuin -140 tai suurempi kuin 20, 
 * lukua ei laiteta taulukkoon vaan se pyydetään uudelleen esimerkkisuorituksen mukaisesti.

Lopuksi ohjelman tulee tulostaa lämpötilamittausten keskiarvo sekä minimi- ja maksimiarvot. 

Hyödynnä ratkaisussasi omia yksityisiä metodeja, joihin pilkot toteutuksesi. 
Voit esimerkiksi toteuttaa seuraavanlaiset apumetodit:

private static int[] kysyMittaustulokset() {
    // Luo tyhjä taulukko ja kysy siihen lämpötilat. Lopuksi palauta taulukko.
}

private static double laskeKeskiarvo(int[] tulokset) {
    // Laske keskiarvo parametrina saadusta taulukosta ja palauta se liukulukuna.
}

🚫 Tehtävässä on tarkoitus harjoitella taulukoiden käyttöä, joten listojen käyttäminen on tässä tehtävässä kiellettyä. 🚫

Tässä tehtävässä opit:
✅ täyttämään tyhjän taulukon yksi kerrallaan luettavilla arvoilla
✅ välittämään taulukoita parametriarvoina
✅ palauttamaan taulukoita paluuarvoina

 

Tehtävän perustuu Helsingin Yliopiston ohjelmointikurssin tehtävään, joka on lisensoitu Creative Commons BY-NC-SA-lisenssillä. https://2017-ohjelmointi.github.io/part2/#exercise-16-marsin-lampotilan-keskiarvo 

 *
 */
public class MarsinLampotilat {

	public static void main(String[] args) {
		
		int [] tulokset = kysyMittaustulokset();
		
		double kArvo = laskeKeskiarvo(tulokset);
		
		int min = 0, max = 0;
		for (int i = 0; i < tulokset.length; i++) {
			min = Math.min(tulokset[i] ,min);
			max = Math.max(tulokset[i],max);
		}
		System.out.println("Mittausten keskiarvo: " + kArvo);
		System.out.println("Pienin mittaustulos: "+ min);
		System.out.println("Suurin mittaustulos: "+ max);

	}
	private static int[] kysyMittaustulokset() {
		final int kerrat = 10; int i = 0;
		int [] tulokset = new int [kerrat];
		int tulos = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (i < kerrat) {
			System.out.print("Syötä mittaus "+(i+1) +"/" + kerrat +": ");
			tulos = scan.nextInt();
			if (tulos >= -140 && tulos <= 20) {	
			tulokset[i] = tulos;
			i++;
			}else {
				System.out.println("Anna lämpötila väliltä -140 - +20!\n");
			}
			
		}
			
		return tulokset;
	    // Luo tyhjä taulukko ja kysy siihen lämpötilat. Lopuksi palauta taulukko.
	}

	private static double laskeKeskiarvo(int[] tulokset) {
		double kArvo = 0; double summa = 0;
		int luku;
		for (int i = 0; i < tulokset.length; i++) {
			luku = tulokset[i];
			summa = (summa + luku);
		}
		kArvo = summa/10;
		return kArvo;
	    // Laske keskiarvo parametrina saadusta taulukosta ja palauta se liukulukuna.
	}
}
