package Viikko4;

import java.util.Scanner;

/**
 * Tee ohjelma Lumi, joka kysyy nimiä, kunnes nimeksi annetaan LOPPU. 
 * Ohjelma kertoo, montako nimeä annettiin sekä montako kertaa annettiin nimi Lumi. 
 * Käyttäjä voi syöttää nimen suurilla ja pienillä kirjaimilla.

Example output:
Anna nimi: Matti
Anna nimi: LuMI
Anna nimi: Maija
Anna nimi: lumi
Anna nimi: LOPPU
Nimiä oli 4 kappaletta.
Nimi Lumi esiintyi 2 kertaa.

 *
 */
public class Lumi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nimi = "null"; 
		int nimet = 0;
		int lumet = 0;
		
		do {
			System.out.print("Anna nimi: ");
			nimi = scan.next();
			if(!nimi.equals("LOPPU")) {
			nimet = nimet + 1;
			}
			if (nimi.equalsIgnoreCase("lumi")) {
				lumet = lumet + 1;
			}
		} while (!nimi.equals("LOPPU"));
			System.out.println("Nimiä oli "+ nimet +" kappaletta.");
			System.out.println("Nimi Lumi esiintyi "+lumet +" kertaa.");
		}

	

}
