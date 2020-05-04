package Viikko4;

import java.util.Scanner;

/**
 * Tee ohjelma Lento, jolla voidaan selvittää lennon numerosta, onko kyseessä Finnairin lento. 
 * Jos lennon numeron alussa on AY, kyseessä on Finnairin lento. 
 * Jos kyseessä on Finnairin lento, selvitetään lisäksi, 
 * onko kyseessä kaukolento, kotimaan lento vai Venäjän lento. 
 * Jos lennon numeron kolmas merkki on 1, kyseessä on kaukolento, 2-6 kotimaan lento, 7 Venäjän lento. 
 * Merkkijonon voi muuntaa numeroksi

int numero = Integer.parseInt(merkkijono);

Example output:
Anna lennon numero: AY105
Kaukolento

 *
 */
public class Lento {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		char tyyppi;
		System.out.print("Anna lennon numero: ");
		String lento = scan.nextLine();
		tyyppi = lento.charAt(2);
		
		
		if(lento.startsWith("AY")) {
			
			if(tyyppi == '1') {
				System.out.println("Kaukolento");
			}if (tyyppi >= '2' && tyyppi <= '6') {
				System.out.println("Kotimaan lento");
			}if (tyyppi == '7') {
				System.out.println("Venäjän lento");
			}
		}else {
			System.out.println("Ei ole Finnairin lento");
		}
		
	}
	
}
