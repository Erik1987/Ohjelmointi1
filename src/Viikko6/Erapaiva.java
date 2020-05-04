package Viikko6;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Tee ohjelma Erapaiva, joka kertoo laskun p‰iv‰m‰‰r‰n perusteella er‰p‰iv‰n. 
 * Er‰p‰iv‰ on 14 p‰iv‰n p‰‰st‰ laskun p‰iv‰m‰‰r‰st‰. Tutustu LocalDate luokan plusDays metodiin.

Example output:
Anna laskun p‰iv‰m‰‰r‰ (vvvv-kk-pp): 2019-12-24
Er‰p‰iv‰ on 2020-01-07

 *
 */
public class Erapaiva {

	public static void main(String[] args) {

		LocalDate dateToday = LocalDate.now();
		System.out.print("Anna laskun p‰iv‰m‰‰r‰ (vvvv-kk-pp): ");
		Scanner scan = new Scanner(System.in);
		String date = scan.nextLine();
		dateToday = LocalDate.parse(date);
		LocalDate erapaiva = dateToday.plusDays(14);
		System.out.println("Er‰p‰iv‰ on " +erapaiva);

	}

}
