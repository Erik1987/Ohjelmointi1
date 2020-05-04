package Viikko4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Tee ohjelma Tuotteet, joka kysyy tuotteen tiedot (numero, nimi, hinta ja kuvaus). 
 * Nimestä poistetaan tyhjät merkit alusta sekä lopusta, ja nimi muunnetaan suurella kirjoitetuksi. 
 * Kuvauksesta poistetaan tyhjät merkit alusta ja lopusta. Jos kuvaus on tyhjä merkkijono, sitä ei näytetä.

Example output:
Annan tuotenumero: 1234
Anna tuotteen nimi:     Porsche
Anna tuotteen hinta:   423000,00
Anna tuotteen kuvaus:  Punainen
Numero: 1234
Nimi: PORSCHE
Hinta: 423000,00
Kuvaus: Punainen

 *
 */
public class Tuotteet {

	public static void main(String[] args) {
		
		int tuoteNumero;
		String tNimi;
		double tHinta;
		String tKuvaus;
		Scanner scan = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0.00");
		
		System.out.print("Annan tuotenumero: ");
		tuoteNumero = scan.nextInt();
		scan.nextLine();
		System.out.print("Anna tuotteen nimi: ");
		tNimi = scan.nextLine();
		System.out.print("Anna tuotteen hinta: ");
		tHinta = scan.nextDouble();
		scan.nextLine();
		System.out.print("Anna tuotteen kuvaus: ");
		tKuvaus = scan.nextLine();
		
		tNimi = tNimi.trim();
		tNimi = tNimi.toUpperCase();
		tKuvaus = tKuvaus.trim();
		
		System.out.println("Numero: "+tuoteNumero);
		System.out.println("Nimi: "+tNimi);
		System.out.println("Hinta: "+ form.format(tHinta));
		if(!tKuvaus.isEmpty()) {
		System.out.println("Kuvaus: " +tKuvaus);
		}
	}

}
