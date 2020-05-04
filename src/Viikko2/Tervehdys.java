package Viikko2;

import java.util.Scanner;

/**
 * Tee ohjelma Tervehdys, joka tulostaa kellonajasta riippuen erilaisen
 * tervehdyksen. Ohjelma kysyy tunnit ja kertoo sen perusteella tervehdyksen.
 * 
 * Aikaväli Tervehdys
 * 
 * 7:00 - 9:59 Hyvää huomenta! 
 * 10:00 - 16:59 Hyvää päivää! 
 * 17:00 - 21:59 Hyvää iltaa! 
 * 22:00 - 6:59 Hyvää yötä!
 * 
 * Example output: Anna tunnit: 8 Hyvää huomenta!
 *
 * 
 */
public class Tervehdys {

	public static void main(String[] args) {
		// olisihan tämän voinut tehdä Date luokkaakin käyttämällä
		
		System.out.print("Anna tunnit: ");
		Scanner scan = new Scanner(System.in);
		double tunnit = scan.nextDouble();
		if(tunnit >= 7.00 && tunnit <= 9.59) {
			System.out.println("Hyvää huomenta!");
		}else if (tunnit >= 10.00 && tunnit <= 16.59) {
			System.out.println("Hyvää päivää!");
		}else if (tunnit >= 17.00 &tunnit <= 21.59) {
			System.out.println("Hyvää iltaa!");
		}else if (tunnit >= 22.00 && tunnit <= 23.59) {
			System.out.println("Hyvää yötä!");
		}else if (tunnit >= 0.00 && tunnit <= 6.59) {
			System.out.println("Hyvää yötä!");
		}
		else {
			System.out.println("Virthe tuli! Back to basics");
		}

	}

}
