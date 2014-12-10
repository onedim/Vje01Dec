
/*
 * ZADATAK: Napisite program koji trazi da se sa tastature unese
 * 			neki znak, a koji ce zatim na ekranu ispisati njegovu
 * 			ASCII sifru, kao i znakove koji prethode unesenom znaku,
 * 			odnosno koji slijede iza njega prema tablici ASCII sifri.
 */

public class Zadatak9 {

	public static void main(String[] args) {

		System.out.println("Unesi broj + prethodnike/sljedbenike): ");
		int uneseniBroj = TextIO.getlnInt();
		
		System.out.printf("Znak koji ima ASCII sifru %d je znak %c.", uneseniBroj, konvertovanje(uneseniBroj));

		System.out.print("\n\nPrethodnici su: \n\n");

		prethodnici(uneseniBroj);
		
		System.out.print("\n\nA sljedbenici su: \n\n");
		
		sljedbenici(uneseniBroj);
	
	}

	private static char konvertovanje(int broj) {
		char sifra = (char) broj;
		return sifra;
	}

	private static void prethodnici(int broj1) {

		for (int i = broj1 - 1; i >= 0; i = i - 1) {
			System.out.print(i + " ==> " + konvertovanje(i) + "   ");
		}
	}
	
	private static void sljedbenici(int broj1) {

		for (int i = broj1 + 1; i <= 127; i++) {
			System.out.print(i + " ==> " + konvertovanje(i) + "   ");
		}
			
	}

}