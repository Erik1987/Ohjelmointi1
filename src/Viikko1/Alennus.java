package Viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alennus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Anna alentamaton hinta: ");
		double alentamaton = input.nextDouble();
		System.out.print("Anna alennusprosentti: ");
		int prosentti = input.nextInt();
		DecimalFormat form = new DecimalFormat("0.00");
		System.out.println("Alennettu hinta on "+form.format((alentamaton * (100.0 - prosentti) / 100.0)));
	}

}
