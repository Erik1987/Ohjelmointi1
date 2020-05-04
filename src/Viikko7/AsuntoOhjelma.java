package Viikko7;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Tee luokka Tee luokka Asunto, jolla on attribuutit tyyppi (String), osoite 
 * (String), pinta-ala (double), hinta (double) ja kuvaus(String). 
 * Tee luokkaan parametriton ja parametrillinen konstruktori, set- ja get-metodit ja toString-metodi. 
 * Tee ohjelmaluokka AsuntoOhjelma, jossa tehd‰‰n yksi olio.

Example output:
Anna asunnon tyyppi: Kerrostalo
Anna osoite: Ivalontie 12, 99800 Inari
Anna pinta-ala: 72,0
Anna hinta: 72000,00
Anna kuvaus: valon keskustassa katutasossa 72 m2:n liikehuoneisto

Tyyppi: Kerrostalo
Osoite: Ivalontie 12, 99800 Inari
Pinta-ala: 72,00
Hinta: 72000,00 euroa
Kuvaus: valon keskustassa katutasossa 72 m2:n liikehuoneisto

 *
 */
class Asunto {
	private String tyyppi;
	private String osoite;
	private double pintaAla;
	private double hinta;
	private String kuvaus;
	
	public Asunto() {
		tyyppi = "";
		osoite = "";
		pintaAla = 0;
		hinta = 0;
		kuvaus = "";
	}
	public Asunto(String tyyppi, String osoite, double pintaAla, double hinta, String kuvaus) {
		super();
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.pintaAla = pintaAla;
		this.hinta = hinta;
		this.kuvaus = kuvaus;
	}
	public String getTyyppi() {
		return tyyppi;
	}
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	public String getOsoite() {
		return osoite;
	}
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	public double getPintaAla() {
		return pintaAla;
	}
	public void setPintaAla(double pintaAla) {
		this.pintaAla = pintaAla;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	public String getKuvaus() {
		return kuvaus;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	@Override
	public String toString() {
		return "Asunto [tyyppi=" + tyyppi + ", osoite=" + osoite + ", pintaAla=" + pintaAla + ", hinta=" + hinta
				+ ", kuvaus=" + kuvaus + "]";
	}
	
	
}
public class AsuntoOhjelma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Asunto asunto = new Asunto();
		
		System.out.print("Anna asunnon tyyppi: ");
		String tyyppi = scan.nextLine();
		asunto.setTyyppi(tyyppi);
		
		System.out.print("Anna osoite: ");
		String osoite = scan.nextLine();
		asunto.setOsoite(osoite);
		
		System.out.print("Anna pinta-ala: ");
		double pintaAla = scan.nextDouble();
		asunto.setPintaAla(pintaAla);
		
		System.out.print("Anna hinta: ");
		double hinta = scan.nextDouble();
		asunto.setHinta(hinta);
		scan.nextLine();
		
		System.out.print("Anna kuvaus: ");
		String kuvaus = scan.nextLine();
		asunto.setKuvaus(kuvaus);
		
		System.out.println("Tyyppi: " + asunto.getTyyppi());
		System.out.println("Osoite: " + asunto.getOsoite());
		DecimalFormat form = new DecimalFormat("0.00");
		
		System.out.println("Pinta-ala: " + form.format(asunto.getPintaAla()));
		System.out.println("Hinta: " + form.format(asunto.getHinta()) + " euroa");
		System.out.println("Kuvaus: "+ asunto.getKuvaus());

	}

}
