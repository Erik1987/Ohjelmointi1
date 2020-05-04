package Viikko4;

import java.util.Scanner;

/**
 * Tee ohjelma Rekisteritunnus, joka kertoo, onko auton rekisteritunnus kelvollinen. 
 * Rekisteritunnus alkaa 2-3 kirjaimella, mitä seuraa viiva ja lopussa on 1-3 numeroa. 
 * Ensimmäinen numero ei voi olla nolla.

Example output:
Anna rekisterinumero: abc-123
Rekisterinumero on kelvollinen

 *
 */
public class Rekisteritunnus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Anna rekisterinumero: ");
		String rekkari = scan.nextLine();
		if (rekkari.matches("\\w{2,3}[-]\\d{1,3}")) {
			
			if((rekkari.charAt(4) == '0')) {
			System.out.println("Rekisterinumero ei ole kelvollinen");
			}else {
				System.out.println("Rekisterinumero on kelvollinen");	
			}
			
		}else {
			System.out.println("Rekisterinumero ei ole kelvollinen");	
		}

	}

}
