package Viikko1;

import java.util.Scanner;

/**
 * Tee ohjelma Juhlat, mill‰ voidaan laskea, montako kuohuviinipulloa juhliin
 * tarvitsee hankkia. Yhdest‰ pullosta saa 7 lasillista. Ohjelma kysyy vieraiden
 * m‰‰r‰n ja kertoo
 * 
 * tarvittavien kuohuviinipullojen m‰‰r‰n kokonaislukuna (vinkkin‰: etsi tietoa
 * ceil-k‰skyst‰) montako lasia j‰‰ yli viimeisest‰ pullosta
 * 
 * 
 * Example output: 
 * Anna juhliin tulevien aikuisten m‰‰r‰: 23 
 * Pulloja tarvitaan 4 kappaletta 
 * Viimeisest‰ pullosta j‰‰ 5 lasia
 *
 * 
 */
public class Juhlat {

	public static void main(String[] args) {
		//Math.ceil();
		System.out.print("Anna juhliin tulevien aikuisten m‰‰r‰: ");
		Scanner scan = new Scanner(System.in);
		int aikuiset = scan.nextInt();
		double aikuiset2 = Math.ceil((double)aikuiset/7);
		System.out.println("Pulloja tarvitaan " +Math.round(aikuiset2)+ " kappaletta");
		aikuiset2 = aikuiset2*7;
		System.out.println("Viimeisest‰ pullosta j‰‰ "+Math.round(aikuiset2-aikuiset) +" lasia");
	}

}
