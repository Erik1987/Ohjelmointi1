package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Tee ohjelma Palkka, joka kysy käyttäjältä bruttopalkan, veroprosentin ja iän.
 * Ohjelma laskee käteen jäävän osuuden palkasta sekä verojen,
 * työttömyysvakuutuksen (1.5%) ja työeläkemaksun. Työeläkemaksu on 53-62
 * vuotiaalla 8.25% ja muilla 6.75%.
 * 
 * Veron osuus on palkka * veroprosentti / 100.0
 * 
 * Työeläkevakuutusmaksun osuus on palkka * XX, missä XX on joko 0.0835 tai
 * 0.0675 riippuen iästä
 * 
 * Työttömyysvakuutuksen osuus on palkka * 0.015
 * 
 * Käteen jäävä osuus on palkka - vero - työttömyysvakuutus -
 * työeläkevakuutusmaksu
 * 
 * Example output: Anna palkka: 
 * 3000 Anna veroprosentti: 20 
 * Anna ikä: 25
 * Bruttopalkka 3000 
 * Veron osuus 600,00 
 * Työeläkevakuutusmaksun osuus 202,50
 * Työttömyysvakuutuksen osuus 45,00 
 * Käteen jää 2152,50
 * 
 */
public class Palkka {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0.00");
		double tyel;
		System.out.print("Anna palkka: ");
		int palkka = scan.nextInt();
		System.out.print("Anna veroprosentti: ");
		int veroprosentti = scan.nextInt();
		System.out.print("Anna ikä: ");
		int ika = scan.nextInt();
		System.out.println("Bruttopalkka " + palkka);
		double vero = palkka*veroprosentti/100;
		System.out.println("Veron osuus " + form.format(vero));
		if(ika >= 53 && ika <= 62) {
			tyel = palkka * 0.0835;
		}else {
			tyel = palkka * 0.0675;
		}
		System.out.println("Työeläkevakuutusmaksun osuus " + form.format(tyel));
		double tyot = palkka * 0.015;
		System.out.println("Työttömyysvakuutuksen osuus "+ form.format(tyot));
		System.out.println("Käteen jää "+ form.format(palkka-vero-tyel-tyot));
		
	}

}
