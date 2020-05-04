package Viikko9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Tehtäväpohjassa on ohjelma, joka lukee käyttäjältä syötteitä. 
 * Muokkaa ohjelman toimintaa siten, että kun syötteiden lukeminen lopetetaan, 
 * ohjelma tulostaa listalla olevien arvojen lukumäärän.

Huom! Käytä tässä listan valmiiksi tarjoamaa metodia size.

 

Tämä tehtävä on lainattu Helsingin yliopiston ohjelmointikurssilta ja sen on laatinut 
Helsingin yliopiston Agile Education Research -tutkimusryhmä. Tehtävä on lisensoitu 
Creative Commons BY-NC-SA 4.0 -lisenssillä.

Example output:
Syötä sanoja listalle. Tyhjä tai yhdysviiva (-) lopettaa:
Juno
Elizabeth
Mauri
Irene
Outi
Lauri
Iisa
Risto
Markus
Ville
Oskari
-

Yhteensä: 11

 *
 */
public class ListanKoko {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nimi =".";
		System.out.println("Syötä sanoja listalle. Tyhjä tai yhdysviiva (-) lopettaa: ");
		ArrayList<String> lista = new ArrayList<String>();
		
		while (!nimi.equalsIgnoreCase(" ") && !nimi.equalsIgnoreCase("-")) {
			nimi = scan.nextLine();
			if (!nimi.equalsIgnoreCase(" ") && !nimi.equalsIgnoreCase("-")) {
				lista.add(nimi);
			}
		}
		System.out.println("Yhteensä: "+lista.size());
		

	}

}
