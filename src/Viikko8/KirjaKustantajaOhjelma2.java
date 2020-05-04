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
class Kirja {

	private String nimi;
	private String isbn;
	private double hinta;
	private int julkaisuvuosi;
	private Kustantaja kustantaja;
	
	public Kirja() {
		nimi = "";
		isbn = "";
		hinta = 0.00;
		julkaisuvuosi = 0;
		kustantaja = null;
	}

	public Kirja(String nimi, String isbn, double hinta, int julkaisuvuosi, Kustantaja kustantaja) {
		super();
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
		this.julkaisuvuosi = julkaisuvuosi;
		this.kustantaja = kustantaja;
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

	public Kustantaja getKustantaja() {
		return kustantaja;
	}

	public void setKustantaja(Kustantaja kustantaja) {
		this.kustantaja = kustantaja;
	}

	@Override
	public String toString() {
		return "Kirja [nimi=" + nimi + ", isbn=" + isbn + ", hinta=" + hinta + ", julkaisuvuosi=" + julkaisuvuosi
				+ ", kustantaja=" + kustantaja + "]";
	}
	
}

class Kustantaja {

		private String nimi;
		private String osoite;
		private String puhelin;
		
		public Kustantaja() {
			nimi = "";
			osoite = "";
			puhelin = "";
		}

		public Kustantaja(String nimi, String osoite, String puhelin) {
			super();
			this.nimi = nimi;
			this.osoite = osoite;
			this.puhelin = puhelin;
		}

		public String getNimi() {
			return nimi;
		}

		public void setNimi(String nimi) {
			this.nimi = nimi;
		}

		public String getOsoite() {
			return osoite;
		}

		public void setOsoite(String osoite) {
			this.osoite = osoite;
		}

		public String getPuhelin() {
			return puhelin;
		}

		public void setPuhelin(String puhelin) {
			this.puhelin = puhelin;
		}

		@Override
		public String toString() {
			return "Kustantaja [nimi=" + nimi + ", osoite=" + osoite + ", puhelin=" + puhelin + "]";
		}
		
}

public class KirjaKustantajaOhjelma2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Kustantajan nimi: ");
		String nimi = scan.nextLine();
		System.out.println("Kustantajan osoite: ");
		String osoite = scan.nextLine();
		System.out.println("Kustantajan puhelin: ");
		String puhelin = scan.nextLine();
		
		Kustantaja kustantaja = new Kustantaja(nimi, osoite, puhelin);
		Kirja kirja = new Kirja("Java-ohjelmointi", "123-abc", 65.50, 2018, kustantaja);
		
		System.out.println("Kirjan " + kirja.getNimi() + " kustantaja on "+kustantaja.getNimi());

	}

}
