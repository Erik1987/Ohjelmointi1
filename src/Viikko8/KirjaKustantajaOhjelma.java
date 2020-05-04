package Viikko8;

import java.util.Scanner;

/**
 * Tee luokka Kustantaja, jolla on attribuutit nimi (String), osoite (String) ja puhelin (String). 
 * Tee luokkaan parametriton ja parametrillinen konstruktori, set- ja get-metodit ja toString-metodi.

Lis‰‰ Kirja-luokkaan attribuutti kustantaja. Kirja-luokan kustantaja-attribuutti kertoo kirjan 
yhteyssuhteen Kustantaja-luokkaan. Lis‰‰ Kirja-luokkaan yhteyssuhdetta varten tarvittava koodi/metodit 
(konstruktorit, set-, get- ja toString-metodit).

Tee Kirja-luokalle p‰‰ohjelma KirjaKustantajaOhjelma, jolla luodaan Kustantaja-luokan olio. 
Laita ohjelmaan Kirja-luokan olio valmiina (nimeksi Java-ohjelmointi, isbnn‰ksi, hinnaksi 65.50 ja 
julkaisuvuodeksi 2018).

N‰yt‰ tiedot Kirja-luokan get-metodeilla. 

Example output:
Kustantajan nimi: Alma T
Kustantajan osoite: 00100 Helsinki
Kustantajan puhelin: 010 665 101
Kirjan Java-ohjelmointi kustantaja on Alma T

 *
 */
public class KirjaKustantajaOhjelma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Kustantaja kustantaja = new Kustantaja("Alma T", "00100 Helsinki", "010 665 101");
		Kirja kirja = new Kirja("Java-ohjelmointi", "123-abc", 65.50, 2018, kustantaja);
		
		System.out.println("Kustantajan nimi: "+ kustantaja.getNimi());
		System.out.println("Kustantajan osoite: "+ kustantaja.getOsoite());
		System.out.println("Kustantajan puhelin: " + kustantaja.getPuhelin());
		System.out.println("Kirjan " + kirja.getNimi() + " kustantaja on "+kirja.getKustantaja().getNimi());

	}

}
