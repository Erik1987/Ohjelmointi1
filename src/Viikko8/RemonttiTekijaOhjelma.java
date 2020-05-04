package Viikko8;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Lis‰‰ Remontti-luokkaan ominaisuus tekija (Henkilo-luokkaa). Viopessa on
 * valmiina Henkilo-luokka. Tee Remontti-luokalle ohjelmaluokka
 * RemonttiTekijaOhjelma, jolla voidaan tehd‰ Remontti-luokan olio. Kysy
 * k‰ytt‰j‰lt‰ sek‰ remontin ett‰ tekij‰n tiedot ja n‰yt‰ ne. Lis‰‰ tekija
 * Remontti luokkaan yhteyssuhteena. K‰yt‰ tekij‰n tietojen n‰ytt‰miseen
 * Remontti-luokan get-metodeja.
 *
 */

class Remontti {
	private int vuosi;
	private String kuvaus;
	private Henkilo tekija;
	
	public Remontti() {
		LocalDate date = LocalDate.of(2019, 10, 10);
		int year;
		vuosi = date.getYear();
		tekija = null;
	}

	public Remontti(int vuosi, String kuvaus) {
		super();
		this.vuosi = vuosi;
		this.kuvaus = kuvaus;
		tekija = null;
	}
	public Remontti(int vuosi, String kuvaus, Henkilo tekija) {
		super();
		this.vuosi = vuosi;
		this.kuvaus = kuvaus;
		this.tekija = tekija;
	}
	
	public Henkilo getTekija() {
		return tekija;
	}

	public void setTekija(Henkilo tekija) {
		this.tekija = tekija;
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
		return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + ", tekija=" + tekija + "]";
	}

	
	
} 
class Henkilo {
private String nimi;
private String osoite;

public Henkilo() {
nimi = "";
osoite = "";
}

public Henkilo(String nimi, String osoite) {
this.nimi = nimi;
this.osoite = osoite;
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

public String toString() {
return "nimi=" + nimi + ", osoite=" + osoite;
}
}
public class RemonttiTekijaOhjelma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Anna vuosi: ");
		int vuosi = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Anna kuvaus: ");
		String kuvaus = scan.nextLine();
		
		System.out.print("Anna tekij‰n nimi: ");
		String nimi = scan.nextLine();
		System.out.print("Anna tekij‰n osoite: ");
		String osoite = scan.nextLine();
		
		Henkilo henkilo = new Henkilo(nimi, osoite);
		Remontti remppa = new Remontti(vuosi, kuvaus, henkilo);
		
		System.out.println("Vuonna "+ remppa.getVuosi() + " tehtiin remontti "
				+ remppa.getKuvaus());
		System.out.println("Remontin teki " + remppa.getTekija().getNimi());

	}

}
