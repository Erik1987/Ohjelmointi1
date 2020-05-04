package Viikko6;

import java.util.Scanner;

/**
 * Kirjoita luokka SanojenVaihtaminen ja lisää siihen main-metodi. Ohjelman tulee kysyä käyttäjältä 
 * lause ja sen jälkeen vaihtaa siitä kahden sanan paikkaa keskenään. Vaihdettavien sanojen indeksit 
 * kysytään käyttäjältä esimerkkisuorituksen mukaisesti ja indeksit alkavat totutusti nollasta.

Ohjelma kannattaa toteuttaa siten, että pilkot lauseen String-taulukoksi välilyöntien kohdalta. 
Sanoja vaihtaessasi tarvitset todennäköisesti tilapäisen muuttujan, johon laitat toisen 
alkuperäisistä sanoista talteen. Lopuksi voit yhdistää String-taulukon takaisin yhdeksi merkkijonoksi 
String-luokan join-metodilla siten, että erottimena käytetään jälleen välilyöntiä.

Jos tehtävän ratkaiseminen osoittautuu kohtuuttoman hankalaksi, voit tutustua tehtävän ratkaisuun 
videotallenteena.

 

Tässä tehtävässä opit:
✅ käyttämään tilapäismuuttujaa tai taulukon kopiota väliaikaisen tiedon tallentamiseksi
✅ käyttämään taulukoiden indeksejä
✅ yhdistämään pilkotun taulukon sisältämät merkkijonot takaisin yhtenäiseksi merkkijonoksi

Example output:
Kirjoita lause: 
Parempi pyy pivossa kuin kymmenen oksalla

Mitkä sanat vaihdetaan keskenään?
2 5

Parempi pyy oksalla kuin kymmenen pivossa

 *
 */
public class SanojenVaihtaminen {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SanojenVaihtaminen vaihto = new SanojenVaihtaminen();
		
		System.out.println("Kirjoita lause:");
		String lause = scan.nextLine();
		String korjattuLause = vaihto.muokkaaLause(lause);
		

	}

	private String muokkaaLause(String lause) {
		Scanner scan = new Scanner(System.in);
		String korjattuLause = null;
		String[] ekaTaulukko =  lause.split(" ");
		int ekaIndex, tokaIndex;
		System.out.println("\nMitkä sanat vaihdetaan keskenään?");
		
		ekaIndex = scan.nextInt();
		tokaIndex = scan.nextInt();
		String a, b;
		a = ekaTaulukko[ekaIndex];
		b = ekaTaulukko[tokaIndex];
		
		ekaTaulukko[ekaIndex] = b;
		ekaTaulukko[tokaIndex] = a;
		
		korjattuLause = String.join(" ", ekaTaulukko);		
		
		
		System.out.println();
		for (int i = 0; i < ekaTaulukko.length; i++) {
			System.out.print(ekaTaulukko[i] +" ");
		}
		
		return korjattuLause;
	}

}
