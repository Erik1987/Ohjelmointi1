package Viikko5;

import java.util.Scanner;

/**
 * Dominion pelin lopussa lasketaan pistekorteista yhteispisteet. Tee ohjelma Dominion, 
 * joka kysyy pelaajan pistekorttien lukum‰‰r‰t ja kertoo pelaajan saamat yhteispisteet. 
 * Korttien pisteet m‰‰r‰ytyv‰t seuraavasti:

    kirous -1p
    tila 1p
    pit‰j‰ 3p
    l‰‰ni 8p

Tee ohjelman yksi metodi

int laskePisteet(int kirous, int tila, int pitaja, int laani)

metodi laskee yhteispisteet ja palauttaa sen return-lauseella

parametriksi menee kunkin korttityypin lukum‰‰r‰

Example output:
Anna kirouskorttien m‰‰r‰: 0
Anna tilakorttien m‰‰r‰: 3
Anna pit‰j‰korttien m‰‰r‰: 5
Anna l‰‰nikorttien m‰‰r‰: 8
Pisteiden yhteism‰‰r‰ on 95
 *
 */
public class Dominion {

	public static void main(String[] args) {
		Dominion ohjelma = new Dominion();
		
		int kirous, tila, pitaja, laani;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Anna kirouskorttien m‰‰r‰: ");
		kirous = scan.nextInt();
		System.out.print("Anna tilakorttien m‰‰r‰: ");
		tila = scan.nextInt();
		System.out.print("Anna pit‰j‰korttien m‰‰r‰: ");
		pitaja = scan.nextInt();
		System.out.print("Anna l‰‰nikorttien m‰‰r‰: ");
		laani = scan.nextInt();
		int pisteet = ohjelma.laskePisteet(kirous, tila, pitaja, laani);

		System.out.println("Pisteiden yhteism‰‰r‰ on "+ pisteet);
	}

	private int laskePisteet(int kirous, int tila, int pitaja, int laani) {
		int yhteispisteet = (kirous*-1) + (tila*2) + (pitaja*5) + (laani*8);
		return yhteispisteet;
	}

}
