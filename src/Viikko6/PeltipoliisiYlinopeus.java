package Viikko6;

/**
 * Tee ohjelma PeltipoliisiYlinopeus, joka selvitt‰‰ saaduista tiedoista ne, joissa 80 
 * nopeusrajoitusalueella on ollut nopeus v‰hint‰‰n 84. Alla on taulukko tiedoista.

String [] peltipoliisi = {"ZZZ-321;89", "ABC-123;82", "AAA-123;87", "XYZ-999;85", "CCC-111;83"};

Ohjelma listaa rekisterinumeron ja nopeuden. Tutustu merkkijono metodiin split, 
jolla merkkijonon voi jakaa palasiksi. Nopeus-osan voi muuntaa luvuksi

int nopeus = Integer.parseInt(merkkijono);

Example output:
ZZZ-321 89
AAA-123 87
XYZ-999 85

 *
 */
public class PeltipoliisiYlinopeus {

	public static void main(String[] args) {
		
		String [] peltipoliisi = {"ZZZ-321;89", "ABC-123;82", "AAA-123;87", "XYZ-999;85", "CCC-111;83"};
		String splittaus = "", pilko = null; int luku; String vali = null;
		for (int i = 0; i < peltipoliisi.length; i++) {
			pilko  = peltipoliisi[i];
			vali = pilko.substring(8, 10);
			luku = Integer.parseInt(vali);
			if(luku >= 84) {
			splittaus = splittaus + pilko +" " + luku +"\n";
			}
		}
		String[] rekkarit; int nopeus;
		rekkarit = splittaus.split(";\\d[0-9]");
		
		for (int i = 0; i < rekkarit.length; i++) {
			System.out.println(rekkarit[i]);
		}
	}

}
