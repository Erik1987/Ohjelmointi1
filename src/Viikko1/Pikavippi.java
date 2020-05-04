package Viikko1;

import java.util.Scanner;

/**
 * Tee ohjelma Pikavippi, joka kertoo paljonko lainatusta rahasta pit‰‰ maksaa.
 * Ohjelmalle kerrotaan yhtiˆn laittama korko ja vuosim‰‰r‰, jonka j‰lkeen
 * maksuja takaisinmaksu vasta teht‰isiin ñ yksi tai kaksi vuotta. Nordax pankki
 * tarjoaa pikavippej‰ 41 prosentin korolla vuodeksi ja Viikinkilaina 37
 * prosentin korolla kahdeksi vuodeksi. N‰iss‰ laskelmissa laskukaavaa on
 * yksinkertaistettu. Yhden vuoden lainakorko on aina 41 prosenttia.
 * 
 * Example output: 
 * Anna pikavipin m‰‰r‰ euroissa: 500 
 * Moneksiko vuodeksi raha halutaan (1 tai 2): 1 
 * Lainakorko kahdesta yleisest‰ (41% tai 37%): 41
 * Lainatut rahat maksavat eli korko 205.0
 *
 */
public class Pikavippi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Anna pikavipin m‰‰r‰ euroissa: ");
		int vippi = scan.nextInt();
		System.out.print("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
		int vuosi = scan.nextInt();
		System.out.print("Lainakorko kahdesta yleisest‰ (41% tai 37%): ");
		int korko = scan.nextInt();
		double rahat = 0;
		switch (vuosi) {
		case 1:
			if (korko ==41) {
				rahat = 1 * (vippi*0.41);
			}else {
				rahat = 1 * (vippi*0.37);
			}
			break;
		case 2:
			if (korko == 41) {
				rahat = 2 * (vippi*0.41);
			}else {
				rahat = 2 * (vippi*0.37);
			}
		default:
			System.out.println("Laita oikeat luvut");
			break;
		}
		System.out.print("Lainatut rahat maksavat eli korko "+rahat);
	}

}
