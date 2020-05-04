package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Peltipoliisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat muotoilu = new DecimalFormat("0.00");
		double nettokuukausitulo = 0.00;
		int peruskulutusv = 255;
		
		System.out.print("Anna nopeutesi: ");
		int nopeus = input.nextInt();
			if (nopeus > 80 && nopeus < 100) {
				System.out.println("Rikesakko");
			}
			else {
				
				System.out.println("Päiväsakko ");
				System.out.print("Anna nettokuukausitulosi: ");
				nettokuukausitulo = input.nextDouble();
				double paivasakko = (nettokuukausitulo - peruskulutusv) / 60;
				if(paivasakko < 6) paivasakko = 6;
				System.out.println("Päiväsakon määrä on "+muotoilu.format(paivasakko) +" euroa");
			}
		
	}

}
