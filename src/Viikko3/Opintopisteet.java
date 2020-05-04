package Viikko3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Tee ohjelma Opintopisteet, joka kysyy, monesko lukukausi opiskelijalla on menossa. T‰m‰n j‰lkeen ohjelma, kuinka monta opintopistett‰ opiskelija on saanut kunakin lukukautena. Lopuksi ohjelma kertoo

    kuinka paljon opiskelijalla pit‰isi olla t‰h‰n menness‰ opintopisteit‰, kun lukukauden tavoite on 30 opintopistett‰,
    opiskelijan yhteenlaskettujen opintopisteiden m‰‰r‰n,
    ilmoituksen, onko j‰ljess‰ tavoitteesta, tavoitteessa vai yli tavoitteen ja
    viel‰ tutkintoon vaadittavien pisteiden m‰‰r‰n, kun tutkinto on 210 opintopistett‰.


Example output:
Anna lukukausien m‰‰r‰: 3
Anna 1. lukukauden opintopisteesi: 40
Anna 2. lukukauden opintopisteesi: 27
Anna 3. lukukauden opintopisteesi: 30
Sinulla pit‰isi olla t‰h‰n menness‰ 90,00 opintopistett‰.
Sinulla on 97,00 opintopistett‰.
Olet edell‰ tavoitteesta.
Tutkinnosta puuttuu viel‰ 113,00 opintopistett‰.

 *
 */
public class Opintopisteet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Anna lukukausien m‰‰r‰: ");
		int lukikset = scan.nextInt();
		int opparit, summa = 0;
		for (int i = 0; i < lukikset; i++) {
			System.out.print("Anna " +(i+1) +". lukukauden opintopisteesi: ");
			opparit = scan.nextInt();
			summa = summa + opparit;
		}
		DecimalFormat form = new DecimalFormat("0.00");
		double pitaisiolla = lukikset *30;
		System.out.println("Sinulla pit‰isi olla t‰h‰n menness‰ "+form.format(pitaisiolla) +" opintopistett‰.");
		System.out.println("Sinulla on "+form.format(summa) +" opintopistett‰.");
		
		if (summa >= pitaisiolla) {
			System.out.println("Olet edell‰ tavoitteesta.");
		}else {
			System.out.println("Olet j‰ljess‰ tavoitteesta.");
		}
		System.out.println("Tutkinnosta puuttuu viel‰ "+form.format((210-summa)) +" opintopistett‰.");
	}

}
