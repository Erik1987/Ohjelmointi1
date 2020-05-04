package Viikko7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Tee luokka Kirja. Kirja-luokalla on ominaisuudet nimi, isbn, hinta ja julkaisuvuosi. 
 * Tee luokkaan set-, get- ja toString-metodit, parametriton konstruktori ja parametrillinen konstruktori. 
 * K‰yt‰ metodien tekemiseen Eclipsen Source valikosta lˆytyvi‰ Generate toimintoja.

Tee ohjelmaluokka KirjaOhjelma, jossa tehd‰‰n kaksi olioita. Ensimm‰inen olio tehd‰‰n 
parametrillisella konstruktorilla ja n‰ytet‰‰n toString-metodilla. Toinen olio tehd‰‰n 
parametrittomalla konstruktorilla. Tiedot asetetaan set-metodeilla ja n‰ytet‰‰n get-metodeilla.

Example output:
Anna nimi: 97 Things Every Java Programmer Should Know
Anna isbn: ei tietoa
Anna hinta: 26,80
Anna julkaisuvuosi: 2020

Kirja [nimi=97 Things Every Java Programmer Should Know, isbn=ei tietoa, hinta=26.8, vuosi=2020]

Nimi: 97 Things Every Java Programmer Should Know
Isbn: ei tietoa
Hinta: 26,80
Julkaisuvuosi: 2020

 *
 */

class Kirja {

	private String nimi;
	private String isbn;
	private double hinta;
	private int julkaisuvuosi;
	
	// konstruktori
	public Kirja () {
		nimi = "";
		isbn = "";
		hinta = 0.00;
		julkaisuvuosi = 0;
	}
	
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	public int getJulkaisuvuosi() {
		return julkaisuvuosi;
	}
	public void setJulkaisuvuosi(int julkaisuvuosi) {
		this.julkaisuvuosi = julkaisuvuosi;
	}
	@Override
	public String toString() {
		return "Kirja [nimi=" + nimi + ", isbn=" + isbn + ", hinta=" + hinta + ", vuosi=" + julkaisuvuosi + "]";
	}
	
}
public class KirjaOhjelma {
	
	
	//private Kirja kirja = new Kirja();
	
	public static void main(String[] args) {
		
		Kirja kirja = new Kirja();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Anna nimi: ");
		String nimi2 = scan.nextLine();
		System.out.print("Anna isbn: ");
		String isbn2 = scan.nextLine();
		System.out.print("Anna hinta: ");
		double hinta2 = scan.nextDouble();
		System.out.print("Anna julkaisuvuosi: ");
		int julkaisuvuosi2 = scan.nextInt();
		
		kirja.setNimi(nimi2);;
		kirja.setIsbn(isbn2);
		kirja.setHinta(hinta2);
		kirja.setJulkaisuvuosi(julkaisuvuosi2);
		
		System.out.println(kirja.toString());
		
		DecimalFormat form = new DecimalFormat("0.00");
		System.out.println("Nimi: "+ kirja.getNimi());
		System.out.println("Isbn: "+ kirja.getIsbn());
		System.out.println("Hinta: "+ form.format(kirja.getHinta()));
		System.out.println("Julkaisuvuosi: "+ kirja.getJulkaisuvuosi());

	}

}
