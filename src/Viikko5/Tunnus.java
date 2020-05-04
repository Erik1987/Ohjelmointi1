package Viikko5;

import java.util.Scanner;

/**
 * Tee ohjelma Tunnus, joka kertoo k‰ytt‰j‰tunnuksen. 
 * K‰ytt‰j‰tunnus muodostuu siten, ett‰ etu-ja sukunimest‰ otetaan kolme ensimm‰ist‰ 
 * merkki‰ pienell‰ kirjoitettuna. Merkkien ottamiseen voi k‰ytt‰‰ substring metodia.

Tee seuraava metodi:

String teeTunnus(String etu, String suku)

Metodi palauttaa k‰ytt‰j‰tunnuksen

Metodi saa parametrina etu- ja sukunimen

Example output:
Anna sukunimi: Majava
Anna etunimi: Liisa
Tunnus on majlii
 *
 */
public class Tunnus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String etu, suku;
		Tunnus tunnusOhjelma = new Tunnus();
		System.out.print("Anna sukunimi: ");
		suku = scan.next();
		System.out.print("Anna etunimi: ");
		etu = scan.next();
		String tunnus = tunnusOhjelma.teeTunnus(etu, suku);
		
		System.out.println("Tunnus on " + tunnus);

	}

	private String teeTunnus(String etu, String suku) {
		String tunnus = suku.substring(0,3).toLowerCase()+etu.substring(0,3).toLowerCase();
		return tunnus;
	}

}
