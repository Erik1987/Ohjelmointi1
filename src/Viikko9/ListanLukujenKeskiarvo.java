package Viikko9;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Toteuta ohjelma, joka lukee käyttäjältä lukuja listalle. Syötteiden lukeminen päätetään 
 * kun käyttäjä syöttää luvun -1.

Kun lukujen lukeminen lopetetaan, laske listalla olevien lukujen keskiarvo ja tulosta se. 
Tulostettua keskiarvoa ei tule muotoilla eikä pyöristää. Voit hyödyntää 
tehtävän ratkaisemisessa tehtäväpohjaa.

 

Tämä tehtävä on lainattu Helsingin yliopiston ohjelmointikurssilta ja sen on laatinut Helsingin 
yliopiston Agile Education Research -tutkimusryhmä. Tehtävä on lisensoitu Creative 
Commons BY-NC-SA 4.0 -lisenssillä.

Example output:
Syötä kokonaislukuja listalle (-1 lopettaa):
72
2
8
11
-1

Keskiarvo: 23.25

 *
 */
public class ListanLukujenKeskiarvo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int luku = 0, summa = 0; double keskiarvo;
		System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa): ");
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		while (luku != -1) {
			luku = scan.nextInt();
			if (luku != -1) {
				lista.add(luku);
			}
		}
		for (int d : lista) {
			summa += d;
		}
		keskiarvo = (double)summa/lista.size();
		DecimalFormat form = new DecimalFormat("0.00");
		System.out.println("Keskiarvo: "+form.format(keskiarvo));
		
		

	}

	

}
