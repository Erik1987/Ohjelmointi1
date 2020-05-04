package Viikko5;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * @author John Doe
 *
 */
public class Lahjavero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("0.00");
		
		Lahjavero lahjis = new Lahjavero();
		
		System.out.print("Anna lahjan suuruus: ");
		double arvo = scan.nextDouble();
		
		double lahjavero = lahjis.laskeVero(arvo);
		System.out.println("Lahjavero on " +form.format(lahjavero)+ " euroa");
	}

	private double laskeVero(double arvo) {
		double vero = 0; int keissi = 0;
		
		if (arvo >= 5000 && arvo < 25000) {
			keissi = 1;
		}else if (arvo >= 25000 && arvo < 55000) {
			keissi = 2;
		}else if (arvo >= 55000 && arvo < 200000) {
			keissi = 3;
		}else if (arvo >= 200000 && arvo < 1000000) {
			keissi = 4;
		}else if (arvo >= 1000000) {
			keissi = 5;
		}
		switch (keissi) {
		case 1:
			vero = (arvo - 5000) * 0.08 + 100; 
			break;
		case 2:
			vero = (arvo - 25000) * 0.1 + 1700;
			break;
		case 3:
			vero = (arvo - 55000) * 0.12 + 4700;
			break;
		case 4:
			vero = (arvo - 20000) * 0.15 + 22100;
			break;
		case 5:
			vero = (arvo - 1000000) * 0.17 + 142100;
			break;
		default:
			break;
		}
		
		return vero;
	}

}
