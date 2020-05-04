package Viikko2;

import java.util.Scanner;

/**
 *	Tee ohjelma Katsastus, jolla voidaan selvittää katsastusasemalla käynnin hinta.

    pelkkä jälkitarkastus maksaa 30. (Tällöin ei mitata päästöjä.)
    katsastus maksaa 50
    jos katsastuksessa mitataan päästö, bensiiniautolla se on 22 ja dieselautolla 31.


Example output:
Onko 1=katsastus, 2=jälkitarkastus: 1
Mitataanko päästöt 0=ei, 1=kyllä: 1
Onko auto 0=bensa, 1=diesel: 1
Hinta on 81

 *
 */
public class Katsastus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
		int eka = scan.nextInt();
		int hinta = 0, summa;
		switch (eka) {
		case 1:
			System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
			eka = scan.nextInt();
			if (eka == 0) {
				hinta = 50;
				summa = hinta;
				System.out.println("Hinta on "+summa);
			}else {
				System.out.print("Onko auto 0=bensa, 1=diesel: ");
				eka = scan.nextInt();
				if (eka == 0) {
					summa = 50 + 22;
				}else {
					summa = 50 + 31;
				}
				System.out.println("Hinta on "+summa);
			}
			break;
		case 2:
			hinta = 30;
			System.out.println("Hinta on "+hinta);
		default:
			break;
		}

	}

}
