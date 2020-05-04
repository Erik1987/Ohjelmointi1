package Viikko7;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Tee remonttiluokalle ohjelmaluokka RemonttiOhjelmaMetodeilla,jossa remontti 
 * k‰sitell‰‰n ohjelmaluokan metodeilla. Tee ohjelmaluokkaan (eli tiedostoon, jossa on main) 
 * metodit public void teeRemontti(), public void naytaRemontti() 
 * ja public void muutaRemontti(). RemonttiOhjelmaMetodilla luokkaan laita 
 * ominaisuudeksi eli attribuutiksi Remontti-luokan olio, eli luo olio samalla 
 * tyylill‰ kuin luot vaikka Scanner-luokan olion. Ominaisuuden eteen laitetaan 
 * private sana ja lopussa on sulkeet ().
 *
 */
/*
class Remontti {
	private int vuosi;
	private String kuvaus;
	
	public Remontti() {
		LocalDate date = LocalDate.of(2019, 10, 10);
		int year;
		vuosi = date.getYear();
	}

	public Remontti(int vuosi, String kuvaus) {
		super();
		this.vuosi = vuosi;
		this.kuvaus = kuvaus;
	}

	public int getVuosi() {
		return vuosi;
	}

	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	public boolean testaaVuosi(int vuosi, Remontti remppa) {
		boolean tarkistus;
		if(vuosi <= getVuosi()) {
		tarkistus = true;
		remppa.setVuosi(vuosi);
		}else {
			tarkistus = false;
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
			System.exit(0);
		}
		return tarkistus;
	}
	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	@Override
	public String toString() {
		return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + "]";
	}
	
} */
public class RemonttiOhjelmaMetodeilla {
	
	private static Remontti remppa = new Remontti();
	static Scanner scan = new Scanner(System.in);
	
	public static void teeRemontti() {
		System.out.print("Anna vuosi: ");
		int vuosi = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Anna kuvaus: ");
		String kuvaus = scan.nextLine();
		
		remppa.setVuosi(vuosi);
		remppa.setKuvaus(kuvaus);
		System.out.println("Vuonna "+ remppa.getVuosi() + " tehtiin remontti "
				+ remppa.getKuvaus());
		System.out.print("\n");
	}
	public static void naytaRemontti() {
		System.out.println("Vuosi: " + remppa.getVuosi());
		System.out.println("Kuvaus: " + remppa.getKuvaus());
		System.out.print("\n");
	}
	public static void muutaRemontti() {
		System.out.print("Anna vuosi: ");
		int vuosi = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Anna kuvaus: ");
		String kuvaus = scan.nextLine();
		
		remppa.setVuosi(vuosi);
		remppa.setKuvaus(kuvaus);
		System.out.println("Vuonna "+ remppa.getVuosi() + " tehtiin remontti "
				+ remppa.getKuvaus());
		System.out.print("\n");
	}
	public static void main(String[] args) {
		
		int valinta = 1;
		Scanner scan = new Scanner(System.in);
		
		while (valinta != 0) {
			System.out.println("1. Tee remontti");
			System.out.println("2. N‰yt‰ remonttitiedot");
			System.out.println("3. Muuta remonttia");
			System.out.println("0. Lopetus");
			System.out.print("Anna valintasi (0-3): ");
			valinta = scan.nextInt();
			
			switch (valinta) {
			case 1:
				teeRemontti();
				break;
			case 2:
				naytaRemontti();
				break;
				
			case 3:
				muutaRemontti();
				break;
				
			case 0:
				System.exit(0);
			default:
				break;
			}
		}
	}

}
