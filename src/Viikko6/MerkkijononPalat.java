package Viikko6;

import java.util.Arrays;
import java.util.Scanner;

public class MerkkijononPalat {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Kirjoita lause: ");
		String lause = scan.nextLine();
		System.out.print("\n");
		
		String[] taulukko = lause.split(" ");
		
		for (int i = 0; i < taulukko.length; i++) {
			System.out.println(taulukko[i]);
		}
		
	}

}
