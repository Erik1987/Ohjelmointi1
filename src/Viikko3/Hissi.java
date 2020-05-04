package Viikko3;

import java.util.Scanner;

/**
 * Tee ohjelma Hissi, joka kertoo, mahtuuko ihminen hissiin. Hississ‰ olevien ihmisten 
 * maksimipaino on 240 kg. Ohjelma kysyy hissiin tulijoiden painoja, 
 * kunnes yhteispaino ylitt‰‰ hissin maksimipainon tai painoksi annetaan 0. 
 * Jos maksimipaino on ylittym‰ss‰, ohjelma ilmoittaa hissin olevan t‰ysi.

Example output:
Paljonko painat: 90
Tule kyytiin.
Paljonko painat: 80
Tule kyytiin.
Paljonko painat: 90
Hissi on jo t‰ynn‰. Odota seuraavaa hissi‰.

 *
 */
public class Hissi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int paino = 1; final int MAXPAINO = 240; int summa = 0;
		
		while (paino <= MAXPAINO && summa <= MAXPAINO && paino != 0) {
			System.out.print("Paljonko painat: ");
			paino = scan.nextInt();
			summa = summa + paino;
			if(paino != 0 && summa <= MAXPAINO) {
			System.out.println("Tule kyytiin.");
			}
		}
		if(summa >= MAXPAINO) {
			System.out.println("Hissi on jo t‰ynn‰. Odota seuraavaa hissi‰.");
		}
			
	}

}
