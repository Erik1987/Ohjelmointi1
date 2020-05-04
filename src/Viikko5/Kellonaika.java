package Viikko5;

import java.util.Scanner;

/**
 * Tee ohjelma Kellonaika, joka kysyy k‰ytt‰j‰lt‰ kellonajan muodossa tt:mm ja kertoo, 
 * onko kellonaika oikea.

Tee kaksi metodia:

String kysyKellonaika()

Metodi kysyy ja palauttaa k‰ytt‰j‰n antaman kellonajan. 
K‰ytt‰j‰n antama kellonaika luetaan merkkijono-muuttujaan.

boolean tarkastaKellonaika(String kellonaika)

Metodi tarkastaa ja palauttaa true, jos kelloaika on kelvollinen. Metodi palauttaa false, 
jos kellonaika on kelvoton. K‰yt‰ tarkastuksessa s‰‰nnˆllisi‰ lausekkeita ja matches metodia. 
Integer.parseInt(merkkijono) muuntaa merkkijonon kokonaisluvuksi.

Metodi saa parametrina k‰ytt‰j‰n antaman kellonajan.

Example output:
Anna kellonaika muodossa tt:mm: aa:12
Kellonaika on v‰‰rin

 *
 */
public class Kellonaika {

	public static void main(String[] args) {
		Kellonaika kello = new Kellonaika();
		
		String kellonaika = kello.kysyKellonaika();
		boolean tarkistus = kello.tarkastaKellonaika(kellonaika);

		if(tarkistus == false) {
			System.out.println("Kellonaika on v‰‰rin");
		}else {
			System.out.println("Kellonaika on oikein");
		}
	}

	private String kysyKellonaika() {
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		Scanner scan = new Scanner(System.in);
		String kello = scan.nextLine();
		scan.close();
		return kello;
	}

	private boolean tarkastaKellonaika(String kellonaika) {
		boolean tarkistus;
		int uusikello1 = 0;
		int uusikello2 = 0;
		
		String kello = kellonaika.substring(0,2);
		String kello2 = kellonaika.substring(3,5);
		if(!kellonaika.startsWith("aa")) {
		uusikello1 = Integer.parseInt(kello);
		uusikello2 = Integer.parseInt(kello2);
		}
		
		if (kellonaika.matches("\\d{2}[:]\\d{2}") && uusikello1 <= 24 && uusikello2 < 60) {
			tarkistus = true;
		}else {
			tarkistus = false;
		}
		return tarkistus;
	}

}
