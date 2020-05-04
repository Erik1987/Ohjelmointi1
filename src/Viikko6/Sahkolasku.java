package Viikko6;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Tee ohjelma Sahkolasku, joka näyttää puolen vuoden ajalta sähkölaskun suuruuden. 
 * Ohjelma kysyy kilowattitunnin hinnan euroina ja kunkin kuukauden kulutuksen kilowattitunteina. 
 * Lopuksi ohjelma näyttää kuukausittaisen sähkönkulutuksen kilowatteina sekä sähkölaskun suuruuden.

Example output:
Anna kilowatin hinta euroina: 0,0590
Anna kuukauden 1 sähkölukema: 120
Anna kuukauden 2 sähkölukema: 200
Anna kuukauden 3 sähkölukema: 180
Anna kuukauden 4 sähkölukema: 190
Anna kuukauden 5 sähkölukema: 210
Anna kuukauden 6 sähkölukema: 200
1. kuukauden kulutus: 120kWh 7,08 euroa
2. kuukauden kulutus: 200kWh 11,80 euroa
3. kuukauden kulutus: 180kWh 10,62 euroa
4. kuukauden kulutus: 190kWh 11,21 euroa
5. kuukauden kulutus: 210kWh 12,39 euroa
6. kuukauden kulutus: 200kWh 11,80 euroa

 *
 */
public class Sahkolasku {

	public static void main(String[] args) {
		double kwHinta; int kw; int i = 0, d = 0; int MAX = 6;
		double [] taulukkoHinta = new double [MAX];
		int [] taulukkoKw = new int [MAX];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Anna kilowatin hinta euroina: ");
		kwHinta = scan.nextDouble();
		
		while (i < MAX) {
			System.out.print("Anna kuukauden "+ (d+1) + " sähkölukema: ");
			kw = scan.nextInt();
			taulukkoHinta[i] = kw * kwHinta;
			taulukkoKw[i] = kw;
			i++;
			d++;
		}
		DecimalFormat form = new DecimalFormat("0.00");
		int k = 0;
		for (int j = 0; j < taulukkoKw.length; j++) {
			System.out.println((k+1)+". kuukauden kulutus: "+ taulukkoKw[j] +"kWh "+form.format(taulukkoHinta[j])+" euroa");
			k++;
		}
	}

}
