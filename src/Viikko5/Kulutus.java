package Viikko5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Tee ohjelma Kulutus, jolla voidaan laskea bensan kulutus sadalla kilometrill‰. 
 * Ohjelma kysyy ajetut kilometrit ja tankatun m‰‰r‰n.

Tee ohjelmaan nelj‰ metodia.

int kysyKilometrit()

metodi kysyy ajetut kilometrit

double kysyTankkaus()

metodi kysyy tankatun m‰‰r‰n

double laskeKulutus(int kilometrit, double tankattu)

metodi laskee ja palauttaa kulutuksen sadalla kilometrill‰, kulutus lasketaan  tankattu / kilometrit * 100

ensimm‰inen parametri on ajetut kilometrit

toinen parametri on tankattu m‰‰r‰

void naytaKulutus(double kulutus)

metodi n‰ytt‰‰ kulutuksen

Example output:
Anna ajetut kilometrit: 154
Anna tankattu m‰‰r‰: 8,75
Kulutus/100km on 5,68 litraa

 *
 */
public class Kulutus {

	public static void main(String[] args) {
		
		
		Kulutus kilsakorvaus = new Kulutus();
		
		
		int kilometrit = kilsakorvaus.kysyKilometrit();	
		double tankattu = kilsakorvaus.kysyTankkaus();
		double kulutus = kilsakorvaus.laskeKulutus(kilometrit, tankattu);
		naytaKulutus(kulutus);

	}

	private int kysyKilometrit() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Anna ajetut kilometrit: ");
		int kilsat = scan.nextInt();
		return kilsat;
	}

	private double kysyTankkaus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Anna tankattu m‰‰r‰: ");
		double tankattu = scan.nextDouble();
		return tankattu;
	}

	private double laskeKulutus(int kilometrit, double tankattu) {
		double kulutus = tankattu / kilometrit * 100;
		return kulutus;
	}

	private static void naytaKulutus(double kulutus) {
		DecimalFormat form = new DecimalFormat("0.00");
		System.out.println("Kulutus/100km on " + form.format(kulutus) + " litraa");
		
	}

}
