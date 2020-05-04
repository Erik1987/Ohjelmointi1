package Viikko3;

import java.text.DecimalFormat;
import java.util.Scanner;



/**
 * Tee ohjelma Kotitalousvahennys, joka laskee käyttäjän saaman kotitalousvähennyksen määrän. 
 * Työkorvausten euromääriä kysytään niin kauan, kunnes käyttäjä antaa korvauksen määräksi nolla. 
 * Kotitalousvähennyksen määrä on 50 % työkorvauksesta. 
 * Kotitalousvähennyksen enimmäismäärä on 2 400 euroa. 
 * Vähennyksen omavastuu on 100 euroa. 
 * Kotitalousvähennys lasketaan työkorvausten summa * 50 / 100.0 - omavastuu.

Example output:
Anna työkorvauksen määrä (0 lopettaa): 2000,0
Anna työkorvauksen määrä (0 lopettaa): 1000,0
Anna työkorvauksen määrä (0 lopettaa): 3000,0
Anna työkorvauksen määrä (0 lopettaa): 0
Kotitalousvähennyksen määrä on 2400,00 euroa

 *
 */
public class Kotitalousvahennys {

	
	public static void main(String[] args) {
		double luku = 1, summa = 0;
		double uusisumma = 0;
		Scanner scan = new Scanner(System.in);
		
		while (luku != 0) {
			System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
			luku = scan.nextDouble();
			if(luku >= 0) {
			summa = summa + luku;
			}
		}
		double ktv = summa*0.5-100;
		
		DecimalFormat form = new DecimalFormat("0.00");
		if (summa > 2400 && summa >= 100) {
			uusisumma = 2400;
		}
		else if(summa >= 100 && summa < 2400) {
		uusisumma = summa*0.5-100;
		}
		else {
			uusisumma = 0.00;
		}
		System.out.println("Kotitalousvähennyksen määrä on "+form.format(uusisumma) + " euroa");
	}

}
