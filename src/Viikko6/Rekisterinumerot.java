package Viikko6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Automatkalla laitetaan talteen vastaantulevien autojen rekisterinumeroita taulukkoon 
 * (maksimissaan 20 kappaletta). Rekisterinumeroiden antaminen lopetetaan antamalla -.
 * Tee ohjelma Rekisterinumerot, jolla voidaan antaa ja listata rekisterinumerot.

Example output:
Anna rekisterinumero: AAA-111
Anna rekisterinumero: CCC-333
Anna rekisterinumero: BBB-222
Anna rekisterinumero: DDD-123
Anna rekisterinumero: -
AAA-111 
CCC-333 
BBB-222 
DDD-123 

 *
 */
public class Rekisterinumerot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> rekkarit = new ArrayList<String>();
		String rekkari = ""; int i = 0;
		do {
			System.out.print("Anna rekisterinumero: ");
			rekkari = scan.nextLine();
			if (!rekkari.equals("-")) {
				rekkarit.add(rekkari);
				i++;
			}
		} while (!rekkari.equals("-") && i < rekkari.length());
		
		for (int j = 0; j < rekkarit.size(); j++) {
			System.out.println(rekkarit.get(j));
		}
		
	}

}
