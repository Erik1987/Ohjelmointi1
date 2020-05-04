package Viikko3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Tee ohjelma Kilometrikorvaus, joka laskee omalla autolla ajojen kilometrikorvaukset. 
 * Ohjelma kysyy ajokilometrej‰, kunnes k‰ytt‰j‰ antaa nollan. 
 * T‰m‰n j‰lkeen ohjelma n‰ytt‰‰ ajetut kilometrit sek‰ ajoista maksettavan korvauksen. 
 * Korvaus on 0.43 euroa per kilometri.

Example output:
Anna ajetut kilometrit (0 lopettaa): 12
Anna ajetut kilometrit (0 lopettaa): 13
Anna ajetut kilometrit (0 lopettaa): 98
Anna ajetut kilometrit (0 lopettaa): 73
Anna ajetut kilometrit (0 lopettaa): 160
Anna ajetut kilometrit (0 lopettaa):  0
Yhteens‰ 356 kilometri‰
Korvaus on 153,08 euroa

 *
 */
public class Kilometrikorvaus {
	
	private static int[] annaKilometrit(int luku ) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int[] kilsat = new int[10];
		while (luku != 0) {
			System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
			luku = scan.nextInt();
			kilsat[i] = luku;
			i++;
			}		
		return kilsat;
		
	}
	public static void main(String[] args) {
		int i = 0, luku = 1;
		int[] kilsat = new int[i];

		Scanner scan = new Scanner(System.in);
		
		kilsat = annaKilometrit(luku); // olisihan t‰n voinut tehd‰ pelk‰ll‰ for silmukalla
		
		int sum = Arrays.stream(kilsat).sum();
		System.out.println("Yhteens‰ " +sum +" kilometri‰");
		
		double korvaus = sum *0.43;
		DecimalFormat form = new DecimalFormat("0.00");
		System.out.println("Korvaus on "+form.format(korvaus) + " euroa");
	}

}
