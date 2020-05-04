package Viikko1;

import java.util.Scanner;

/**
 * Tee ohjelma Cooper, joka kysyy Cooperissa juostun matkan. Ohjelma kertoo,
 * montako kokonaista 400 metrin kierrosta juostiin. Kierroksien m‰‰r‰n
 * lasketaan matka / 400.
 * 
 * Example output: Anna juostu matka: 2987 Kokonaisia 400 metrin kierroksia oli
 * 7
 *
 */
public class Cooper {

	public static void main(String[] args) {
		
		System.out.print("Anna juostu matka: ");
		Scanner input = new Scanner(System.in);
		int matka = input.nextInt();
		System.out.println("Kokonaisia 400 metrin kierroksia oli "+(matka/400));
	}

}
