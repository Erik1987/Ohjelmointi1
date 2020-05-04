package Viikko1;

import java.util.Scanner;

/**
 * Tee ohjelma Puoluetuki, joka laskee puolueen puoluetuen m‰‰r‰n vuodessa.
 * Yhden kansanedustajan puoluetuki on 148 175 euroa.
 * 
 * Example output: 
 * Anna kansanedustajien lukum‰‰r‰: 10 
 * Puoluetuen m‰‰r‰ on 1481750 euroa
 *
 * 
 */
public class Puoluetuki {

	public static void main(String[] args) {
		System.out.print("Anna kansanedustajien lukum‰‰r‰: ");
		Scanner scan = new Scanner(System.in);
		int ke = scan.nextInt();
		int puoluetuki = 148175;
		System.out.println("Puoluetuen m‰‰r‰ on "+puoluetuki*ke +" euroa");

	}

}
