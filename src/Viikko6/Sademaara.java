package Viikko6;

import java.text.DecimalFormat;

/**
 * Tee ohjelma Sademaara, joka laskee vuotuisen sadem‰‰r‰n Helsingiss‰ ja n‰ytt‰‰ sen. 
 * Alla on taulukko, miss‰ on kunkin kuukauden sadem‰‰r‰.

double [] sademaarat = {47.0,36.6,34.7,37.0,41.9,47.5,61.7,74.8,65.4,69.7,66.1,54.6};

Example output:
Vuoden sadem‰‰r‰ on 637,00 mm

 *
 */
public class Sademaara {

	public static void main(String[] args) {
		
		double [] sademaarat = {47.0,36.6,34.7,37.0,41.9,47.5,61.7,74.8,65.4,69.7,66.1,54.6};
		double summa = 0;
		
		for (int i = 0; i < sademaarat.length; i++) {
			summa = summa + sademaarat[i];
		}
		DecimalFormat form = new DecimalFormat("0.00");
		System.out.println("Vuoden sadem‰‰r‰ on "+form.format(summa) + " mm");
	}

}
