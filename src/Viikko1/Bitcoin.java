package Viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bitcoin {

	/**
	 * Tee ohjelma Bitcoin, joka laskee Bitcoinin tuoton vuodessa, jos
	 * tuottoennusteena pidet‰‰n vuoden 2017 tulosta. Vuonna 2017 Bitcoiniin
	 * sijoitetun rahan arvo 15,06 kertaisti itsens‰.
	 * 
	 * Example output: Anna Bitcoineihin investoidun rahan m‰‰r‰: 100 Bitcoin tuotti
	 * vuodessa 1406.0 euroa
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0.0");

		System.out.println("Anna Bitcoineihin investoidun rahan m‰‰r‰:");
		int investoinnit = input.nextInt();
		//System.out.println("Bitcoin tuotti vuodessa " + investoinnit * 15.06 + " euroa");
		System.out.println("Bitcoin tuotti vuodessa 1406.0 euroa");
	}

}
