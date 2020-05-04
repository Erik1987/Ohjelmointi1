package Viikko6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Tee ohjelma Lampotilat, joka kysyy maksimissaan 100 lämpötilaa ja tulostaa ne suuruusjärjestyksessä.

Example output:
Anna lämpötila: -12
Anna lämpötila: 0
Anna lämpötila: 3
Anna lämpötila: -20
Anna lämpötila: -17
Anna lämpötila: -5
Anna lämpötila: -999
Annoit lämpötilat: -20 -17 -12 -5 0 3 
 *
 */
public class Lampotilat {

	public static void main(String[] args) {
		// kysy tunnilla että miten onnistuu sort taulukossa, jonka alustusta ei ole
		// määritelty
		
		int luku = 0; final int MAX = 100;
		int i = 0; int [] taulukko = new int[MAX];
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> taul = new ArrayList<Integer>();
		while (luku != -999 && i < MAX) {
			
			System.out.print("Anna lämpötila: ");
			luku = scan.nextInt();
			if(luku != -999) {
			taul.add(luku);
			taulukko[i] = luku;
			i++;
			}
		}
		System.out.print("Annoit lämpötilat: ");
		Arrays.sort(taulukko);
		Collections.sort(taul);
		
		for (int j = 0; j < taul.size(); j++) {
			System.out.print(taul.get(j) + " ");	
		}
		
		

	}

}
