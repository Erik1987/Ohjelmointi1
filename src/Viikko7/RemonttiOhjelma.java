package Viikko7;

import java.time.LocalDate;
import java.util.Scanner;



/**
 * Tee luokka Remontti, jolla on attribuutit vuosi (int), kuvaus (String). 
 * Tee luokkaan parametriton konstruktori, joka asettaa vuodeksi nykyisen vuoden. 
 * Nykyisen vuoden saat k‰ytt‰m‰ll‰ LocalDate luokkaa. Tee lis‰ksi set- ja get-metodit ja 
 * toString-metodi. setVuosi metodin tarkastaa, ettei remontin vuosi ole nykyist‰ 
 * vuotta suurempi. Metodi palauttaa true, jos vuosi pystyttiin asettamaan eli sen on 
 * nykyinen tai sit‰ aiempi vuosi muuten metodi palauttaa false eik‰ aseta vuodeksi 
 * annettua vuotta. Tee ohjelmaluokka RemonttiOhjelma, jossa tehd‰‰n yksi olio.

Kun palautat ratkaisun Viopeen, muista laittaa alkuun kaikki import komennot.

Example output:
Anna vuosi: 2030
Vuosi ei voi olla tulevaisuudessa

 *
 */
class Remontti {
	private int vuosi;
	private String kuvaus;
	
	public Remontti() {
		LocalDate date = LocalDate.of(2019, 10, 10);
		int year;
		vuosi = date.getYear();
	}

	public Remontti(int vuosi, String kuvaus) {
		super();
		this.vuosi = vuosi;
		this.kuvaus = kuvaus;
	}

	public int getVuosi() {
		return vuosi;
	}

	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	public boolean testaaVuosi(int vuosi, Remontti remppa) {
		boolean tarkistus;
		if(vuosi <= getVuosi()) {
		tarkistus = true;
		remppa.setVuosi(vuosi);
		}else {
			tarkistus = false;
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
			System.exit(0);
		}
		return tarkistus;
	}
	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	@Override
	public String toString() {
		return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + "]";
	}
	
}
public class RemonttiOhjelma {

	public static void main(String[] args) {
		
		Remontti remppa = new Remontti();
		Scanner scan = new Scanner(System.in);
		System.out.print("Anna vuosi: ");
		int vuosi = scan.nextInt();
		boolean testi = remppa.testaaVuosi(vuosi, remppa);
		//remppa.setVuosi(vuosi);
		scan.nextLine();

		if(testi = true) {
		System.out.print("Anna kuvaus: ");
		String kuvaus = scan.nextLine();
		remppa.setKuvaus(kuvaus);
		System.out.println("Vuonna "+ remppa.getVuosi() + " tehtiin remontti "
				+ remppa.getKuvaus());
		}else {
			System.exit(0);
		}
		
		

	}

}
